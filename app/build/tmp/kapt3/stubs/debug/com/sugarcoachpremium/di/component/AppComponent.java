package com.sugarcoachpremium.di.component;

@javax.inject.Singleton()
@dagger.Component(modules = {dagger.android.AndroidInjectionModule.class, com.sugarcoachpremium.di.module.AppModule.class, com.sugarcoachpremium.di.builder.ActivityBuilder.class})
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007\u00c0\u0006\u0003"}, d2 = {"Lcom/sugarcoachpremium/di/component/AppComponent;", "", "inject", "", "app", "Lcom/sugarcoachpremium/SugarApp;", "Builder", "app_debug"})
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.SugarApp app);
    
    @dagger.Component.Builder()
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006\u00c0\u0006\u0003"}, d2 = {"Lcom/sugarcoachpremium/di/component/AppComponent$Builder;", "", "application", "Landroid/app/Application;", "build", "Lcom/sugarcoachpremium/di/component/AppComponent;", "app_debug"})
    public static abstract interface Builder {
        
        @dagger.BindsInstance()
        @org.jetbrains.annotations.NotNull()
        public abstract com.sugarcoachpremium.di.component.AppComponent.Builder application(@org.jetbrains.annotations.NotNull()
        android.app.Application application);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.sugarcoachpremium.di.component.AppComponent build();
    }
}