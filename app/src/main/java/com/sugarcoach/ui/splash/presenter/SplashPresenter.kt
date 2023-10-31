package com.sugarcoach.ui.splash.presenter

import android.util.Log
import com.sugarcoach.BuildConfig
import com.sugarcoach.R
import com.sugarcoach.data.database.repository.dailyregister.DailyRegister
import com.sugarcoach.data.network.RegistersResponse
import com.sugarcoach.ui.base.presenter.BasePresenter
import com.sugarcoach.ui.login.interactor.LoginInteractorImp
import com.sugarcoach.ui.login.presenter.LoginPresenterImp
import com.sugarcoach.ui.login.view.LoginView
import com.sugarcoach.ui.splash.interactor.SplashInteractorImp
import com.sugarcoach.ui.splash.view.SplashView
import com.sugarcoach.util.SchedulerProvider
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import org.joda.time.DateTime
import org.joda.time.LocalDateTime
import org.joda.time.format.DateTimeFormat
import java.io.File
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.util.*
import javax.inject.Inject
import kotlin.collections.ArrayList


class SplashPresenter<V : SplashView, I : SplashInteractorImp> @Inject internal constructor(interactor: I, schedulerProvider: SchedulerProvider, disposable: CompositeDisposable) : BasePresenter<V, I>(interactor = interactor, schedulerProvider = schedulerProvider, compositeDisposable = disposable), SplashPresenterImp<V, I> {

    override fun onAttach(view: V?) {
        super.onAttach(view)
        decideActivityToOpen()
    }

    override fun decideActivityToOpen() {
        interactor?.let {
            compositeDisposable.add(it.getUser()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ user ->
                    if (!user){
                        getView()?.openMainActivity()
                    }else {
                        getView()?.openBoardingActivity()
                    }

                }, { throwable ->
                    getView()?.showErrorToast()
                })
            )
        }
    }


    fun getRegisters() {
        interactor?.let {
            compositeDisposable.add(it.getRegistersCall()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ response ->
                    saveRegisters(response)

                }, { throwable ->
                    getView()?.showErrorToast()
                })
            )
        }

    }



    fun saveRegisters(registers: List<RegistersResponse>) {

        val parser =  SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault())
        val parser2 =  SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
        var dailyRegisters: List<DailyRegister> = registers.map { register ->
            DailyRegister(0, register.id.toString(), register.glucose, register.insulin, register.carbohydrates, register.emotional_state, register.exercise, 1, "", register.photo?.let { BuildConfig.BASE_URL + it.url }?: "" , true , parser.parse(register.createdAt), parser2.format(parser.parse(register.createdAt)),0f,"")
        }

        interactor?.let {
            compositeDisposable.add(it.saveRegisters(dailyRegisters)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    if (it) {
                        getView()?.openMainActivity()
                    }else
                        getView()?.showErrorToast()
                }, { throwable ->
                    getView()?.hideProgress()
                    showException(throwable)
                })
            )
        }

    }



}
