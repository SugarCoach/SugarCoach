package com.sugarcoach.ui.treatment


import androidx.recyclerview.widget.LinearLayoutManager
import com.skydoves.powerspinner.PowerSpinnerView
import com.sugarcoach.ui.treatment.interactor.TreatmentInteractor
import com.sugarcoach.ui.treatment.interactor.TreatmentInteractorImp
import com.sugarcoach.ui.treatment.presenter.TreatmentPresenter
import com.sugarcoach.ui.treatment.presenter.TreatmentPresenterImp
import com.sugarcoach.ui.treatment.view.*

import dagger.Module
import dagger.Provides

@Module
class TreatmentActivityModule {

    @Provides
    internal fun provideTreatmentInteractor(registerInteractor: TreatmentInteractor): TreatmentInteractorImp = registerInteractor

    @Provides
    internal fun provideTreatmentPresenter(registerPresenter: TreatmentPresenter<TreatmentView, TreatmentInteractorImp>)
            : TreatmentPresenterImp<TreatmentView, TreatmentInteractorImp> = registerPresenter


    @Provides
    internal fun provideBasalAdapter(context: TreatmentActivity): BasalAdapter = BasalAdapter(context)


    @Provides
    internal fun provideTreatmentAdapter(context: TreatmentActivity): TreatmentAdapter = TreatmentAdapter(context)

    @Provides
    internal fun provideTreatmentBasalHoraAdapter(context: TreatmentActivity): TreatmentBasalHoraAdapter = TreatmentBasalHoraAdapter(context)

    @Provides
    internal fun provideMedidorAdapter(context: TreatmentActivity): MedidorAdapter = MedidorAdapter(context)

    @Provides
    internal fun provideBombaAdapter(context: TreatmentActivity): BombaAdapter = BombaAdapter(context)

    @Provides
    internal fun provideTreatmentCorrectoraAdapter(context: TreatmentActivity): TreatmentCorrectoraAdapter = TreatmentCorrectoraAdapter(context)


    @Provides
    internal fun provideLinearLayoutManager(context: TreatmentActivity): LinearLayoutManager = LinearLayoutManager(context)
}