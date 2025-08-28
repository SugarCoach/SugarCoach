package com.sugarcoachpremium.ui.forgot.view

import android.os.Bundle
import android.widget.Toast
import com.sugarcoachpremium.R
import com.sugarcoachpremium.databinding.ActivityForgotBinding
import com.sugarcoachpremium.ui.base.view.BaseActivity
import com.sugarcoachpremium.ui.forgot.interactor.ForgotInteractorImp
import com.sugarcoachpremium.ui.forgot.presenter.ForgotPresenterImp
import com.sugarcoachpremium.util.AppConstants
import javax.inject.Inject

// Activity para la funcionalidad "Olvidé mi contraseña"
class ForgotActivity: BaseActivity(), ForgotView {

    // 🔹 Presenter de la pantalla, inyectado mediante Dagger/Hilt
    @Inject
    lateinit var presenter: ForgotPresenterImp<ForgotView,ForgotInteractorImp>

    // 🔹 View binding para acceder a los elementos del XML de forma segura
    lateinit var binding: ActivityForgotBinding

    // 🔹 Método que se llama al crear la Activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 🔹 Inicializa el binding para poder usar los elementos del layout
        binding = ActivityForgotBinding.inflate(layoutInflater)

        // 🔹 Establece la vista principal
        setContentView(binding.root)

        // 🔹 Conecta la Activity con el presenter
        presenter.onAttach(this)

        // 🔹 Configura los botones y eventos de la UI
        setOnClickListeners()
    }

    // 🔹 Método que se llama al destruir la Activity
    override fun onDestroy() {
        // 🔹 Desconecta la Activity del presenter para evitar memory leaks
        presenter.onDetach()
        super.onDestroy()
    }

    // 🔹 Muestra mensajes de validación según el código de error
    override fun showValidationMessage(errorCode: Int) {
        hideProgress()                   // 🔹 Oculta el loader si estaba activo
        binding.forgotBt.isEnabled = true // 🔹 Habilita el botón si estaba deshabilitado

        when (errorCode) {
            AppConstants.EMPTY_EMAIL_ERROR ->
                Toast.makeText(
                    this,
                    getString(R.string.empty_email_error_message),
                    Toast.LENGTH_LONG
                ).show() // 🔹 Mensaje si el email está vacío

            AppConstants.INVALID_EMAIL_ERROR ->
                Toast.makeText(
                    this,
                    getString(R.string.invalid_email_error_message),
                    Toast.LENGTH_LONG
                ).show() // 🔹 Mensaje si el email no es válido

            else ->
                Toast.makeText(
                    this,
                    getString(R.string.login_failure),
                    Toast.LENGTH_LONG
                ).show() // 🔹 Mensaje genérico para otros errores
        }
    }

    // 🔹 Muestra un Toast con mensaje de error genérico
    override fun showErrorToast(msg: String) {
        hideProgress()                   // 🔹 Oculta loader
        binding.forgotBt.isEnabled = true // 🔹 Habilita el botón
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show() // 🔹 Muestra mensaje
    }

    // 🔹 Método que se llama cuando el mail de recuperación se envió correctamente
    override fun onForgot() {
        hideProgress()                   // 🔹 Oculta loader
        binding.forgotBt.isEnabled = true // 🔹 Habilita botón
        Toast.makeText(this, getString(R.string.update_success), Toast.LENGTH_LONG).show() // 🔹 Mensaje éxito
        finish() // 🔹 Cierra la Activity y vuelve a la anterior
    }

    // 🔹 Configura los listeners de los botones
    private fun setOnClickListeners() {
        binding.forgotBt.setOnClickListener {

            // 🔹 Obtiene el email ingresado y elimina espacios al inicio/final
            val email = binding.forgotMail.text.toString().trim()

            // 🔹 Validación: si el campo está vacío, muestra mensaje y detiene ejecución
            if (email.isEmpty()) {
                showValidationMessage(AppConstants.EMPTY_EMAIL_ERROR)
                return@setOnClickListener // 🔹 Evita que se siga ejecutando, previene loop
            }

            // 🔹 Si la validación pasa, muestra loader y deshabilita el botón
            showProgress()
            binding.forgotBt.isEnabled = false

            // 🔹 Llama al presenter para enviar el mail de recuperación
            presenter.onForgot(email)
        }
    }
}
