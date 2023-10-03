package com.sugarcoach.ui.sign.view

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.sugarcoach.R
import com.sugarcoach.databinding.ActivitySigninBinding
import com.sugarcoach.ui.base.view.BaseActivity
import com.sugarcoach.ui.main.view.MainActivity
import com.sugarcoach.ui.sign.interactor.SignInteractorImp
import com.sugarcoach.ui.sign.presenter.SignPresenterImp
import com.sugarcoach.ui.signEmail.view.SignEmailActivity
import javax.inject.Inject
class SignActivity: BaseActivity(), SignView {
    @Inject
    lateinit var presenter: SignPresenterImp<SignView,SignInteractorImp>

    lateinit var binding: ActivitySigninBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySigninBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.onAttach(this)
        setOnClickListeners()
    }

    override fun onDestroy() {
        presenter.onDetach()
        super.onDestroy()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        presenter.activityResult(requestCode, resultCode, data)
    }

    override fun showSuccessToast() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showErrorToast() {
        Toast.makeText(this, getString(R.string.sign_failure), Toast.LENGTH_LONG).show()
    }
    override fun onGoogleLogin() {
        Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show()

//        val intent = Intent(this, MainActivity::class.java)
//        startActivity(intent)
//        finish()
    }

    override fun googleSignIntent(mGoogleSignInClient: GoogleSignInClient, RC_SIGN_IN: Int) {
        val intent: Intent = mGoogleSignInClient.signInIntent
        startActivityForResult(intent, RC_SIGN_IN)
    }


    override fun onFacebookLogin() {
        Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show()
//        val intent = Intent(this, MainActivity::class.java)
//        startActivity(intent)
//        finish()
    }


    override fun onEmailSign() {
        val intent = Intent(this, SignEmailActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun setOnClickListeners() {
        binding.signGoogle.setOnClickListener { presenter.googleLogin(getString(R.string.google_id)) }
        binding.signFacebook.setOnClickListener { presenter.facebookLogin() }
        binding.signEmail.setOnClickListener { presenter.emailSign() }
    }
}