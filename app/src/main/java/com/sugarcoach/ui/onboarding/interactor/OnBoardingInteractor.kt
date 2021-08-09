package com.sugarcoach.ui.onboarding.interactor

import com.sugarcoach.data.database.repository.user.UserRepo
import com.sugarcoach.data.network.ApiHelper
import com.sugarcoach.data.ui.base.interactor.BaseInteractor
import com.sugarcoach.di.preferences.PreferenceHelper
import javax.inject.Inject


class OnBoardingInteractor @Inject constructor(userRepoHelper: UserRepo, preferenceHelper: PreferenceHelper, apiHelper: ApiHelper) : BaseInteractor(userRepoHelper,preferenceHelper,apiHelper),
    OnBoardingInteractorImp {

}