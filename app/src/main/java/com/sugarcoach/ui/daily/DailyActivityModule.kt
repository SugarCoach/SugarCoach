package com.sugarcoach.ui.daily


import androidx.recyclerview.widget.LinearLayoutManager
import com.sugarcoach.ui.daily.interactor.DailyInteractor
import com.sugarcoach.ui.daily.interactor.DailyInteractorImp
import com.sugarcoach.ui.daily.presenter.DailyPresenter
import com.sugarcoach.ui.daily.presenter.DailyPresenterImp
import com.sugarcoach.ui.daily.view.DailyActivity
import com.sugarcoach.ui.daily.view.DailyView
import com.sugarcoach.ui.daily.view.DailyAdapter

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