package com.sugarcoach.ui.sign



import com.sugarcoach.ui.sign.interactor.SignInteractor
import com.sugarcoach.ui.sign.interactor.SignInteractorImp
import com.sugarcoach.ui.sign.presenter.SignPresenter
import com.sugarcoach.ui.sign.presenter.SignPresenterImp
import com.sugarcoach.ui.sign.view.SignView

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