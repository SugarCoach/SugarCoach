package com.sugarcoachpremium.ui.splash.presenter

import com.sugarcoachpremium.BuildConfig
import com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister
import com.sugarcoachpremium.data.network.RegistersResponse
import com.sugarcoachpremium.ui.base.presenter.BasePresenter
import com.sugarcoachpremium.ui.splash.interactor.SplashInteractorImp
import com.sugarcoachpremium.ui.splash.view.SplashView
import com.sugarcoachpremium.util.SchedulerProvider
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject


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
