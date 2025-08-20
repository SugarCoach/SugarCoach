package com.sugarcoach.ui.register


import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.sugarcoach.ui.register.interactor.RegisterInteractor
import com.sugarcoach.ui.register.interactor.RegisterInteractorImp
import com.sugarcoach.ui.register.presenter.RegisterPresenter
import com.sugarcoach.ui.register.presenter.RegisterPresenterImp
import com.sugarcoach.ui.register.view.CategoryAdapter
import com.sugarcoach.ui.register.view.RegisterActivity
import com.sugarcoach.ui.register.view.ItemAdapter
import com.sugarcoach.ui.register.view.RegisterView

import dagger.Module
import dagger.Provides
import org.joda.time.LocalDateTime

@Module
class RegisterActivityModule {

    @Provides
    internal fun provideRegisterInteractor(registerInteractor: RegisterInteractor): RegisterInteractorImp =
        registerInteractor

    @Provides
    internal fun provideRegisterPresenter(registerPresenter: RegisterPresenter<RegisterView, RegisterInteractorImp>)
            : RegisterPresenterImp<RegisterView, RegisterInteractorImp> = registerPresenter

    @Provides
    internal fun provideItemAdapter(context: RegisterActivity): ItemAdapter = ItemAdapter(context)

    @Provides
    internal fun provideCategoryAdapter(context: RegisterActivity): CategoryAdapter = CategoryAdapter(context)


    @Provides
    internal fun provideLinearLayoutManager(context: RegisterActivity): LinearLayoutManager = LinearLayoutManager(context)
    @Provides
    internal fun provideCurrentDate(): LocalDateTime {
        Log.i("OnRegisterModule", "La date fue: ${LocalDateTime()}")
        return LocalDateTime()
    }

}