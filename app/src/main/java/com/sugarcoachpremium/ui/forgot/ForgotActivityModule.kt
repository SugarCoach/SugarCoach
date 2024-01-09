package com.sugarcoachpremium.ui.forgot



import com.sugarcoachpremium.ui.forgot.interactor.ForgotInteractor
import com.sugarcoachpremium.ui.forgot.interactor.ForgotInteractorImp
import com.sugarcoachpremium.ui.forgot.presenter.ForgotPresenter
import com.sugarcoachpremium.ui.forgot.presenter.ForgotPresenterImp
import com.sugarcoachpremium.ui.forgot.view.ForgotView
import dagger.Module
import dagger.Provides

@Module
class ForgotActivityModule {

    @Provides
    internal fun provideforgotInteractor(forgotInteractor: ForgotInteractor): ForgotInteractorImp = forgotInteractor

    @Provides
    internal fun provideforgotPresenter(forgotPresenter: ForgotPresenter<ForgotView, ForgotInteractorImp>)
            : ForgotPresenterImp<ForgotView, ForgotInteractorImp> = forgotPresenter
}