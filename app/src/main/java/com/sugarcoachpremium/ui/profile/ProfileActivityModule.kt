package com.sugarcoachpremium.ui.profile



import androidx.recyclerview.widget.GridLayoutManager
import com.sugarcoachpremium.ui.profile.interactor.ProfileInteractor
import com.sugarcoachpremium.ui.profile.interactor.ProfileInteractorImp
import com.sugarcoachpremium.ui.profile.presenter.ProfilePresenter
import com.sugarcoachpremium.ui.profile.presenter.ProfilePresenterImp
import com.sugarcoachpremium.ui.profile.view.ProfileActivity
import com.sugarcoachpremium.ui.profile.view.ProfileAdapter
import com.sugarcoachpremium.ui.profile.view.ProfileView
import dagger.Module
import dagger.Provides

@Module
class ProfileActivityModule {

    @Provides
    internal fun provideProfileInteractor(profileInteractor: ProfileInteractor): ProfileInteractorImp = profileInteractor

    @Provides
    internal fun provideProfilePresenter(profilePresenter: ProfilePresenter<ProfileView, ProfileInteractorImp>)
            : ProfilePresenterImp<ProfileView, ProfileInteractorImp> = profilePresenter

    @Provides
    internal fun provideProfileAdapter(context: ProfileActivity): ProfileAdapter = ProfileAdapter(context)


    @Provides
    internal fun provideGridLayoutManager(context: ProfileActivity): GridLayoutManager = GridLayoutManager(context,3)
}