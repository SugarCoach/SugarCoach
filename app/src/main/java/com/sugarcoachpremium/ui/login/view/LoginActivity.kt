package com.sugarcoachpremium.ui.login.view

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.notbytes.barcode_reader.BarcodeReaderActivity
import com.sugarcoachpremium.R
import com.sugarcoachpremium.databinding.ActivityLoginBinding
import com.sugarcoachpremium.ui.base.view.BaseActivity
import com.sugarcoachpremium.ui.forgot.view.ForgotActivity
import com.sugarcoachpremium.ui.login.interactor.LoginInteractorImp
import com.sugarcoachpremium.ui.login.presenter.LoginPresenterImp
import com.sugarcoachpremium.ui.main.view.MainActivity
import com.sugarcoachpremium.ui.signEmail.view.SignEmailActivity
import com.sugarcoachpremium.util.AppConstants
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class LoginActivity: BaseActivity(), LoginView {
    @Inject
    lateinit var presenter: LoginPresenterImp<LoginView, LoginInteractorImp>
    lateinit var binding: ActivityLoginBinding


    private var loginExecuted = false // 🔹 bandera para controlar login

    override fun onLogin() {
        if (loginExecuted) return  // 🔹 si ya se ejecutó, no hacer nada
        loginExecuted = true

        hideProgress()                 // 🔹 ocultar loader
        binding.loginBt.isEnabled = true // 🔹 habilitar botón
        val intent = Intent(this, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(intent)
        finish()
    }

    // Variable para guardar el estado
    private var isPasswordVisible = false

    private fun setupPasswordToggle() {
        binding.togglePassword.setOnClickListener {
            isPasswordVisible = !isPasswordVisible

            if (isPasswordVisible) {
                // Mostrar texto normal
                binding.loginPass.transformationMethod = null
                binding.togglePassword.setImageResource(R.drawable.ic_eye_open)
            } else {
                // Ocultar texto como contraseña
                binding.loginPass.transformationMethod =
                    android.text.method.PasswordTransformationMethod.getInstance()
                binding.togglePassword.setImageResource(R.drawable.ic_eye_closed)
            }

            // Mantener el cursor al final
            binding.loginPass.setSelection(binding.loginPass.text?.length ?: 0)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.onAttach(this)
        setOnClickListeners()
        setupPasswordToggle()
    }

    override fun feedDatabase() {
        CoroutineScope(Dispatchers.IO).launch {
            presenter.feedInDatabase()
        }
    }

    override fun onDestroy() {
        presenter.onDetach()
        super.onDestroy()
    }

    // 🔹 Este método ahora oculta el loader y habilita el botón en cualquier error
    override fun showValidationMessage(errorCode: Int) {
        hideProgress()
        binding.loginBt.isEnabled = true
        when (errorCode) {
            AppConstants.EMPTY_EMAIL_ERROR -> Toast.makeText(this, getString(R.string.empty_email_error_message), Toast.LENGTH_LONG).show()
            AppConstants.INVALID_EMAIL_ERROR -> Toast.makeText(this, getString(R.string.invalid_email_error_message), Toast.LENGTH_LONG).show()
            AppConstants.EMPTY_PASSWORD_ERROR -> Toast.makeText(this, getString(R.string.empty_password_error_message), Toast.LENGTH_LONG).show()
            AppConstants.LOGIN_FAILURE -> Toast.makeText(this, getString(R.string.login_failure), Toast.LENGTH_LONG).show()
        }
    }

    override fun showErrorToast(msg: String) {
        hideProgress() // 🔹 Oculta el loader o spinner que se mostraba mientras se procesaba el login.
        binding.loginBt.isEnabled = true // 🔹 Habilita nuevamente el botón de login.
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
    }



    private fun setOnClickListeners() {

        binding.loginBt.setOnClickListener {
            val email = binding.loginMail.text.toString().trim()
            val password = binding.loginPass.text.toString().trim()

            // Validaciones antes de llamar al presenter
            if (email.isEmpty()) {
                Toast.makeText(this, getString(R.string.empty_email_error_message), Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if (password.isEmpty()) {
                Toast.makeText(this, getString(R.string.empty_password_error_message), Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            // Mostrar loader y deshabilitar botón
            showProgress()
            binding.loginBt.isEnabled = false

            // Llamada al presenter
            presenter.onLogin(email, password, false, false)
        }

        binding.loginSignin.setOnClickListener { presenter.emailSign() }
        binding.loginForgot.setOnClickListener { presenter.forgot() }

        // Comentados QR scan
        //binding.loginScan.setOnClickListener{ scanQR() }
        //binding.loginMedicoScan.setOnClickListener{ scanQR() }
    }

    override fun onEmailSign() {
        val intent = Intent(this, SignEmailActivity::class.java)
        startActivity(intent)
    }

    override fun onForgot() {
        val intent = Intent(this, ForgotActivity::class.java)
        startActivity(intent)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        // 🔹 Lanzar en un scope de UI para no bloquear el hilo principal
        CoroutineScope(Dispatchers.Main).launch {
            presenter.activityResult(requestCode, resultCode, data)
        }
    }

    fun scanQR(){
        val launchIntent = BarcodeReaderActivity.getLaunchIntent(this, true, false)
        startActivityForResult(launchIntent, presenter.getBarcode())
    }
}
