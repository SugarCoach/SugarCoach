package com.sugarcoachpremium.ui.config.presenter

import android.app.Activity
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.sugarcoachpremium.R
import com.sugarcoachpremium.data.database.repository.user.User
import com.sugarcoachpremium.ui.base.presenter.BasePresenter
import com.sugarcoachpremium.ui.config.interactor.ConfigInteractorImp
import com.sugarcoachpremium.ui.config.view.ConfigView
import com.sugarcoachpremium.util.AppConstants
import com.sugarcoachpremium.util.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import java.util.*
import javax.inject.Inject
import kotlin.collections.ArrayList

class ConfigPresenter <V : ConfigView, I : ConfigInteractorImp> @Inject internal constructor(interactor: I, schedulerProvider: SchedulerProvider, disposable: CompositeDisposable) : BasePresenter<V, I>(interactor = interactor, schedulerProvider = schedulerProvider, compositeDisposable = disposable),
    ConfigPresenterImp<V, I> {

    lateinit var user: User
    val permissionRequest = 101
    lateinit var permision: String

    override fun onAttach(view: V?) {
        super.onAttach(view)
        getUser()
    }


    override fun updateControlMedico(value: Boolean?) {
        user.medico = value!!
        interactor?.let {
            compositeDisposable.add(it.updateUser(user)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe({ getView()?.setControlMedico(value)
                }, { throwable ->
                    showException(throwable)
                })
            )
        }
    }

    override fun updateControl(value: Boolean?) {
        user.control = value!!
        interactor?.let {
            compositeDisposable.add(it.updateUser(user)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe({ getView()?.setControl(value)
                }, { throwable ->
                    showException(throwable)
                })
            )
        }
    }


    override fun updateSms(context: Activity, value: Boolean?) {
        user.sms = value!!
        interactor?.let {
            compositeDisposable.add(it.updateUser(user)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe({ getView()?.showSuccessToast()
                   // checkAndRequestPermissions(context,Manifest.permission.ACCESS_FINE_LOCATION)
                }, { throwable ->
                    showException(throwable)
                })
            )
        }
    }

    override fun updateGeo(context: Activity,value: Boolean?) {
        user.geolocalizacion = value!!
        interactor?.let {
            compositeDisposable.add(it.updateUser(user)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe({ getView()?.showSuccessToast()

                }, { throwable ->
                    showException(throwable)
                })
            )
        }
    }
    override fun updateNumber(value: String?) {
        when {
            !isPhonelValid(value!!) -> getView()?.showValidationMessage(AppConstants.EMPTY_PHONE_ERROR)
            else -> {
                user.number = value!!
                interactor?.let {
                    compositeDisposable.add(
                        it.updateUser(user)
                            .compose(schedulerProvider.ioToMainObservableScheduler())
                            .subscribe({
                                getView()?.showSuccessToast()
                            }, { throwable ->
                                showException(throwable)
                            })
                    )
                }
            }
        }
    }

    override fun updateType(promoCode: String?) {
        val validPromoCode = "SPECIAL_CODE"

        if (promoCode == validPromoCode) {
            user.typeAccount = "2"
            interactor?.let {
                compositeDisposable.add(it.updateUser(user)
                    .compose(schedulerProvider.ioToMainObservableScheduler())
                    .subscribe(
                        { getView()?.createDialogCongratulation() },
                        { throwable -> showException(throwable) }
                    ))
            }
        } else {
            getView()?.showInvalidPromoCodeMessage()
        }
    }


    private fun getUser() = interactor?.let {
        compositeDisposable.add(it.getUser()
            .compose(schedulerProvider.ioToMainSingleScheduler())
            .subscribe({ userData ->
                getView()?.let {
                    user = userData
                    getView()?.getUserData(userData)
                }
            }, { err -> println(err) }))
    }
    override fun goToActivityDaily() {
        getView()?.openDailyActivity()
    }

    override fun goToActivityMain() {
        getView()?.openMainActivity()
    }

    override fun goToActivityStatistic() {
        getView()?.openStatisticActivity()
    }

    override fun goToActivityTreament() {
        getView()?.openTreatmentActivity()
    }

    override fun onRequestPermissionsResult(context: Activity, requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        when (requestCode) {
            permissionRequest -> {

                val perms = HashMap<String, Int>()
                // Fill with actual results from user
                if (grantResults.size > 0) {
                    for (i in permissions.indices) {
                        perms[permissions[i]] = grantResults[i]
                    }
                    val listPermissionsNeeded = ArrayList<Int>()
                    for (i in perms.keys)
                    {
                        if (perms[i] == PackageManager.PERMISSION_GRANTED) {
                            listPermissionsNeeded.add(perms[i]!!)
                        }
                    }
                    if (listPermissionsNeeded.size != permissions.size) {
                        getView()?.explain(R.string.daily_detail_permission)
                    }
                }
            }
        }
    }

    override fun checkAndRequestPermissions(context: Activity, permission: ArrayList<String>) {
        val listPermissionsNeeded = ArrayList<String>()
        for (i in permission.indices){
            val readpermission = ContextCompat.checkSelfPermission(context, permission[i])
            if (readpermission != PackageManager.PERMISSION_GRANTED) {
                listPermissionsNeeded.add(permission[i])
            }
        }

        if (listPermissionsNeeded.isNotEmpty()) {
            ActivityCompat.requestPermissions(context, listPermissionsNeeded.toTypedArray(), permissionRequest)
        }
    }



}