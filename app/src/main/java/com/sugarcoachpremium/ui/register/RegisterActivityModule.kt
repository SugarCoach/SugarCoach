package com.sugarcoachpremium.ui.register


import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.sugarcoachpremium.ui.register.interactor.RegisterInteractor
import com.sugarcoachpremium.ui.register.interactor.RegisterInteractorImp
import com.sugarcoachpremium.ui.register.presenter.RegisterPresenter
import com.sugarcoachpremium.ui.register.presenter.RegisterPresenterImp
import com.sugarcoachpremium.ui.register.view.CategoryAdapter
import com.sugarcoachpremium.ui.register.view.RegisterActivity
import com.sugarcoachpremium.ui.register.view.ItemAdapter
import com.sugarcoachpremium.ui.register.view.RegisterView

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