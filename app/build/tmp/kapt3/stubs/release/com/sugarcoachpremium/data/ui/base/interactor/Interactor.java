package com.sugarcoachpremium.data.ui.base.interactor;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H&\u00a8\u0006\n"}, d2 = {"Lcom/sugarcoachpremium/data/ui/base/interactor/Interactor;", "", "getCurrentId", "", "isUserLogged", "", "perfomLogout", "", "setUserId", "id", "app_release"})
public abstract interface Interactor {
    
    public abstract boolean isUserLogged();
    
    public abstract void perfomLogout();
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.String getCurrentId();
    
    public abstract void setUserId(@org.jetbrains.annotations.NotNull
    java.lang.String id);
}