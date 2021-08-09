package com.sugarcoach.ui.forgot



import com.sugarcoach.ui.forgot.interactor.ForgotInteractor
import com.sugarcoach.ui.forgot.interactor.ForgotInteractorImp
import com.sugarcoach.ui.forgot.presenter.ForgotPresenter
import com.sugarcoach.ui.forgot.presenter.ForgotPresenterImp
import com.sugarcoach.ui.forgot.view.ForgotView
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