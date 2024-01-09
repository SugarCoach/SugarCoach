package com.sugarcoachpremium.ui.daily_detail


import androidx.recyclerview.widget.LinearLayoutManager
import com.sugarcoachpremium.ui.daily_detail.interactor.DailyDetailInteractorImp
import com.sugarcoachpremium.ui.daily_detail.interactor.DailyDetailInterador
import com.sugarcoachpremium.ui.daily_detail.presenter.DailyDetailPresenter
import com.sugarcoachpremium.ui.daily_detail.presenter.DailyDetailPresenterImp
import com.sugarcoachpremium.ui.daily_detail.view.CategoryAdapter
import com.sugarcoachpremium.ui.daily_detail.view.DailyDetailActivity
import com.sugarcoachpremium.ui.daily_detail.view.DailyDetailView
import com.sugarcoachpremium.ui.daily_detail.view.ItemAdapter

import dagger.Module
import dagger.Provides

@Module
class DailyDetailActivityModule {

    @Provides
    internal fun provideDailyDetailInteractor(dailyDetailInterador: DailyDetailInterador): DailyDetailInteractorImp =
        dailyDetailInterador

    @Provides
    internal fun provideDailyDetailPresenter(dailyDetailPresenter: DailyDetailPresenter<DailyDetailView, DailyDetailInteractorImp>)
            : DailyDetailPresenterImp<DailyDetailView, DailyDetailInteractorImp> = dailyDetailPresenter

    @Provides
    internal fun provideItemAdapter(context: DailyDetailActivity): ItemAdapter = ItemAdapter(context)

    @Provides
    internal fun provideCategoryAdapter(context: DailyDetailActivity): CategoryAdapter = CategoryAdapter(context)


    @Provides
    internal fun provideLinearLayoutManager(context: DailyDetailActivity): LinearLayoutManager = LinearLayoutManager(context)


}