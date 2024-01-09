package com.sugarcoachpremium.ui.daily


import androidx.recyclerview.widget.LinearLayoutManager
import com.sugarcoachpremium.ui.daily.interactor.DailyInteractor
import com.sugarcoachpremium.ui.daily.interactor.DailyInteractorImp
import com.sugarcoachpremium.ui.daily.presenter.DailyPresenter
import com.sugarcoachpremium.ui.daily.presenter.DailyPresenterImp
import com.sugarcoachpremium.ui.daily.view.DailyActivity
import com.sugarcoachpremium.ui.daily.view.DailyView

import dagger.Module
import dagger.Provides

@Module
class DailyActivityModule {

    @Provides
    internal fun provideDailyInteractor(dailyInteractor: DailyInteractor): DailyInteractorImp =
        dailyInteractor

    @Provides
    internal fun provideDailyPresenter(dailyPresenter: DailyPresenter<DailyView, DailyInteractorImp>)
            : DailyPresenterImp<DailyView, DailyInteractorImp> = dailyPresenter


    @Provides
    internal fun provideLinearLayoutManager(context: DailyActivity): LinearLayoutManager = LinearLayoutManager(context)

}