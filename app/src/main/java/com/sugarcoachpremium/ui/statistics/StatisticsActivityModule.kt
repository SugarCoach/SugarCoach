package com.sugarcoachpremium.ui.statistics


import androidx.recyclerview.widget.LinearLayoutManager
import com.sugarcoachpremium.ui.statistics.interactor.StatisticsInteractor
import com.sugarcoachpremium.ui.statistics.interactor.StatisticsInteractorImp
import com.sugarcoachpremium.ui.statistics.presenter.StatisticsPresenter
import com.sugarcoachpremium.ui.statistics.presenter.StatisticsPresenterImp
import com.sugarcoachpremium.ui.statistics.view.StatisticsActivity
import com.sugarcoachpremium.ui.statistics.view.StatisticsAdapter
import com.sugarcoachpremium.ui.statistics.view.StatisticsView

import dagger.Module
import dagger.Provides

@Module
class StatisticsActivityModule {

    @Provides
    internal fun provideStatisticsInteractor(statisticsInteractor: StatisticsInteractor): StatisticsInteractorImp =
        statisticsInteractor

    @Provides
    internal fun provideStatisticsPresenter(statisticsPresenter: StatisticsPresenter<StatisticsView, StatisticsInteractorImp>)
            : StatisticsPresenterImp<StatisticsView, StatisticsInteractorImp> = statisticsPresenter

    @Provides
    internal fun provideStatisticsAdapter(context: StatisticsActivity): StatisticsAdapter = StatisticsAdapter(context)

    @Provides
    internal fun provideLinearLayoutManager(context: StatisticsActivity): LinearLayoutManager = LinearLayoutManager(context)
}