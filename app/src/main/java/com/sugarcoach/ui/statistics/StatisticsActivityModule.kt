package com.sugarcoach.ui.statistics


import androidx.recyclerview.widget.LinearLayoutManager
import com.sugarcoach.ui.statistics.interactor.StatisticsInteractor
import com.sugarcoach.ui.statistics.interactor.StatisticsInteractorImp
import com.sugarcoach.ui.statistics.presenter.StatisticsPresenter
import com.sugarcoach.ui.statistics.presenter.StatisticsPresenterImp
import com.sugarcoach.ui.statistics.view.StatisticsActivity
import com.sugarcoach.ui.statistics.view.StatisticsAdapter
import com.sugarcoach.ui.statistics.view.StatisticsView

import dagger.Module
import dagger.Provides
import ro.andreidobrescu.emojilike.EmojiLikeTouchDetector

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