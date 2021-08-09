package com.sugarcoach.ui.profile



import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.sugarcoach.ui.profile.interactor.ProfileInteractor
import com.sugarcoach.ui.profile.interactor.ProfileInteractorImp
import com.sugarcoach.ui.profile.presenter.ProfilePresenter
import com.sugarcoach.ui.profile.presenter.ProfilePresenterImp
import com.sugarcoach.ui.profile.view.ProfileActivity
import com.sugarcoach.ui.profile.view.ProfileAdapter
import com.sugarcoach.ui.profile.view.ProfileView
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