package com.sugarcoachpremium.ui.signEmail.presenter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00052\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0006B\u001f\b\u0001\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u001dH\u0002J\b\u0010\"\u001a\u00020\u001dH\u0002J\b\u0010#\u001a\u00020\u001dH\u0002J\b\u0010$\u001a\u00020\u001dH\u0002J\b\u0010%\u001a\u00020\u001dH\u0002J\b\u0010&\u001a\u00020\u001dH\u0002J \u0010\'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u000f\u0010,\u001a\u0004\u0018\u00010-H\u0002\u00a2\u0006\u0002\u0010.J\u0018\u0010/\u001a\u00020\u001d2\u0006\u00100\u001a\u0002012\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0014\u00102\u001a\u00020\u001d2\f\u00103\u001a\b\u0012\u0004\u0012\u0002040\u0014J(\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u00152\u0006\u00107\u001a\u00020\u00152\u0006\u00108\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0018\u00109\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020;2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0012\u0010<\u001a\u00020\u001d2\b\u0010=\u001a\u0004\u0018\u00010\u0017H\u0002R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006>"}, d2 = {"Lcom/sugarcoachpremium/ui/signEmail/presenter/SignEmailPresenter;", "V", "Lcom/sugarcoachpremium/ui/signEmail/view/SignEmailView;", "I", "Lcom/sugarcoachpremium/ui/signEmail/interactor/SignEmailInteractorImp;", "Lcom/sugarcoachpremium/ui/base/presenter/BasePresenter;", "Lcom/sugarcoachpremium/ui/signEmail/presenter/SignEmailPresenterImp;", "interactor", "schedulerProvider", "Lcom/sugarcoachpremium/util/SchedulerProvider;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "(Lcom/sugarcoachpremium/ui/signEmail/interactor/SignEmailInteractorImp;Lcom/sugarcoachpremium/util/SchedulerProvider;Lio/reactivex/disposables/CompositeDisposable;)V", "RC_SIGN_IN", "", "getRC_SIGN_IN", "()I", "setRC_SIGN_IN", "(I)V", "permissionNeeds", "", "", "user", "Lcom/google/firebase/auth/FirebaseUser;", "getUser", "()Lcom/google/firebase/auth/FirebaseUser;", "setUser", "(Lcom/google/firebase/auth/FirebaseUser;)V", "authWithFirebase", "", "idToken", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "createdCategories", "createdExercises", "createdStates", "createdTreament", "createdTreatmentBasalHora", "createdTreatmentHorarios", "facebookLogin", "binding", "Lcom/sugarcoachpremium/databinding/ActivitySignEmailBinding;", "callbackManager", "Lcom/facebook/CallbackManager;", "feedInDatabase", "", "()Ljava/lang/Boolean;", "handleFacebookAccessToken", "token", "Lcom/facebook/AccessToken;", "saveRegisters", "registers", "Lcom/sugarcoachpremium/data/network/RegistersResponse;", "signIn", "username", "email", "password", "signWithLinkCredential", "credential", "Lcom/google/firebase/auth/AuthCredential;", "updateUser", "signResponse", "app_release"})
public final class SignEmailPresenter<V extends com.sugarcoachpremium.ui.signEmail.view.SignEmailView, I extends com.sugarcoachpremium.ui.signEmail.interactor.SignEmailInteractorImp> extends com.sugarcoachpremium.ui.base.presenter.BasePresenter<V, I> implements com.sugarcoachpremium.ui.signEmail.presenter.SignEmailPresenterImp<V, I> {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> permissionNeeds = null;
    public com.google.firebase.auth.FirebaseUser user;
    private int RC_SIGN_IN = 123;
    
    @javax.inject.Inject
    public SignEmailPresenter(@org.jetbrains.annotations.NotNull
    I interactor, @org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.util.SchedulerProvider schedulerProvider, @org.jetbrains.annotations.NotNull
    io.reactivex.disposables.CompositeDisposable disposable) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.firebase.auth.FirebaseUser getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.NotNull
    com.google.firebase.auth.FirebaseUser p0) {
    }
    
    public final int getRC_SIGN_IN() {
        return 0;
    }
    
    public final void setRC_SIGN_IN(int p0) {
    }
    
    @java.lang.Override
    public void facebookLogin(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.databinding.ActivitySignEmailBinding binding, @org.jetbrains.annotations.NotNull
    com.facebook.CallbackManager callbackManager, @org.jetbrains.annotations.NotNull
    com.google.firebase.auth.FirebaseAuth auth) {
    }
    
    @java.lang.Override
    public void authWithFirebase(@org.jetbrains.annotations.NotNull
    java.lang.String idToken, @org.jetbrains.annotations.NotNull
    com.google.firebase.auth.FirebaseAuth auth) {
    }
    
    @java.lang.Override
    public void handleFacebookAccessToken(@org.jetbrains.annotations.NotNull
    com.facebook.AccessToken token, @org.jetbrains.annotations.NotNull
    com.google.firebase.auth.FirebaseAuth auth) {
    }
    
    private final void signWithLinkCredential(com.google.firebase.auth.AuthCredential credential, com.google.firebase.auth.FirebaseAuth auth) {
    }
    
    @java.lang.Override
    public void signIn(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    com.google.firebase.auth.FirebaseAuth auth) {
    }
    
    private final java.lang.Boolean feedInDatabase() {
        return null;
    }
    
    private final void createdTreament() {
    }
    
    private final void createdCategories() {
    }
    
    private final void createdExercises() {
    }
    
    private final void createdStates() {
    }
    
    private final void createdTreatmentHorarios() {
    }
    
    private final void createdTreatmentBasalHora() {
    }
    
    private final void updateUser(com.google.firebase.auth.FirebaseUser signResponse) {
    }
    
    public final void saveRegisters(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.data.network.RegistersResponse> registers) {
    }
}