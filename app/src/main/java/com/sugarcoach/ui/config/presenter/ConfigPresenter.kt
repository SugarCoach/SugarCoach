package com.sugarcoach.ui.config.presenter

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentManager
import com.google.android.gms.vision.barcode.Barcode
import com.notbytes.barcode_reader.BarcodeReaderActivity
import com.sugarcoach.BuildConfig
import com.sugarcoach.R
import com.sugarcoach.data.database.repository.dailyregister.DailyRegister
import com.sugarcoach.data.database.repository.treament.Treament
import com.sugarcoach.data.database.repository.user.User
import com.sugarcoach.data.network.LoginResponse
import com.sugarcoach.data.network.RegistersResponse
import com.sugarcoach.ui.base.presenter.BasePresenter
import com.sugarcoach.ui.config.interactor.ConfigInteractorImp
import com.sugarcoach.ui.config.view.ConfigView
import com.sugarcoach.ui.daily_detail.interactor.DailyDetailInteractorImp
import com.sugarcoach.ui.daily_detail.presenter.DailyDetailPresenterImp
import com.sugarcoach.ui.daily_detail.view.DailyDetailView
import com.sugarcoach.ui.profile.interactor.ProfileInteractorImp
import com.sugarcoach.ui.profile.view.ProfileView
import com.sugarcoach.util.AppConstants
import com.sugarcoach.util.SchedulerProvider
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog
import com.wdullaer.materialdatetimepicker.time.TimePickerDialog
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import org.joda.time.DateTime
import org.joda.time.LocalDate
import org.joda.time.LocalDateTime
import java.text.SimpleDateFormat
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

    override fun updateType(value: String?) {
        user.typeAccount = "2"
        interactor?.let {
            compositeDisposable.add(it.updateUser(user)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe({ getView()?.createDialogCongratulation()
                }, { throwable ->
                    showException(throwable)
                })
            )
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