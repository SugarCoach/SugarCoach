package com.sugarcoachpremium.util;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u0010\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00040\u0004H\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0004\b\u0000\u0010\u000bJ\u0018\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u0002H\u000b0\r\"\u0004\b\u0000\u0010\u000bJ\u0018\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u0002H\u000b0\u000f\"\u0004\b\u0000\u0010\u000bJ\u0018\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u0002H\u000b0\u0011\"\u0004\b\u0000\u0010\u000b\u00a8\u0006\u0012"}, d2 = {"Lcom/sugarcoachpremium/util/SchedulerProvider;", "", "()V", "getIOThreadScheduler", "Lio/reactivex/Scheduler;", "getMainThreadScheduler", "kotlin.jvm.PlatformType", "ioToMainCompletableScheduler", "Lio/reactivex/CompletableTransformer;", "ioToMainFlowableScheduler", "Lio/reactivex/FlowableTransformer;", "T", "ioToMainMaybeScheduler", "Lio/reactivex/MaybeTransformer;", "ioToMainObservableScheduler", "Lio/reactivex/ObservableTransformer;", "ioToMainSingleScheduler", "Lio/reactivex/SingleTransformer;", "app_release"})
public final class SchedulerProvider {
    
    public SchedulerProvider() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final <T extends java.lang.Object>io.reactivex.ObservableTransformer<T, T> ioToMainObservableScheduler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final <T extends java.lang.Object>io.reactivex.SingleTransformer<T, T> ioToMainSingleScheduler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.CompletableTransformer ioToMainCompletableScheduler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final <T extends java.lang.Object>io.reactivex.FlowableTransformer<T, T> ioToMainFlowableScheduler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final <T extends java.lang.Object>io.reactivex.MaybeTransformer<T, T> ioToMainMaybeScheduler() {
        return null;
    }
    
    private final io.reactivex.Scheduler getIOThreadScheduler() {
        return null;
    }
    
    private final io.reactivex.Scheduler getMainThreadScheduler() {
        return null;
    }
}