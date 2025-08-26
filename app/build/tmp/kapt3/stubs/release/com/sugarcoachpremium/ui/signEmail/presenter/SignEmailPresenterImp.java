package com.sugarcoachpremium.ui.signEmail.presenter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J \u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000bH&J(\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\u0017"}, d2 = {"Lcom/sugarcoachpremium/ui/signEmail/presenter/SignEmailPresenterImp;", "V", "Lcom/sugarcoachpremium/ui/signEmail/view/SignEmailView;", "I", "Lcom/sugarcoachpremium/ui/signEmail/interactor/SignEmailInteractorImp;", "Lcom/sugarcoachpremium/ui/base/presenter/Presenter;", "authWithFirebase", "", "idToken", "", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "facebookLogin", "binding", "Lcom/sugarcoachpremium/databinding/ActivitySignEmailBinding;", "callbackManager", "Lcom/facebook/CallbackManager;", "handleFacebookAccessToken", "Lcom/facebook/AccessToken;", "signIn", "username", "email", "password", "app_release"})
public abstract interface SignEmailPresenterImp<V extends com.sugarcoachpremium.ui.signEmail.view.SignEmailView, I extends com.sugarcoachpremium.ui.signEmail.interactor.SignEmailInteractorImp> extends com.sugarcoachpremium.ui.base.presenter.Presenter<V, I> {
    
    public abstract void signIn(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    com.google.firebase.auth.FirebaseAuth auth);
    
    public abstract void facebookLogin(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.databinding.ActivitySignEmailBinding binding, @org.jetbrains.annotations.NotNull
    com.facebook.CallbackManager callbackManager, @org.jetbrains.annotations.NotNull
    com.google.firebase.auth.FirebaseAuth auth);
    
    public abstract void authWithFirebase(@org.jetbrains.annotations.NotNull
    java.lang.String idToken, @org.jetbrains.annotations.NotNull
    com.google.firebase.auth.FirebaseAuth auth);
    
    public abstract void handleFacebookAccessToken(@org.jetbrains.annotations.NotNull
    com.facebook.AccessToken idToken, @org.jetbrains.annotations.NotNull
    com.google.firebase.auth.FirebaseAuth auth);
}