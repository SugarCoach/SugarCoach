package com.sugarcoachpremium.ui.sign



import com.sugarcoachpremium.ui.sign.interactor.SignInteractor
import com.sugarcoachpremium.ui.sign.interactor.SignInteractorImp
import com.sugarcoachpremium.ui.sign.presenter.SignPresenter
import com.sugarcoachpremium.ui.sign.presenter.SignPresenterImp
import com.sugarcoachpremium.ui.sign.view.SignView

import dagger.Module
import dagger.Provides

@Module
class SignActivityModule {

    @Provides
    internal fun providesignInteractor(signInteractor: SignInteractor): SignInteractorImp = signInteractor

    @Provides
    internal fun providesignPresenter(signPresenter: SignPresenter<SignView, SignInteractorImp>)
            : SignPresenterImp<SignView, SignInteractorImp> = signPresenter
}