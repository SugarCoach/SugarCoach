package com.sugarcoachpremium.util;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u0006J\u0018\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00060\b\"\u0004\b\u0000\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00060\f\"\u0004\b\u0000\u0010\u0006J\u0018\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00060\u000e\"\u0004\b\u0000\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\n \u0012*\u0004\u0018\u00010\u00100\u0010H\u0002\u00a8\u0006\u0013"}, d2 = {"Lcom/sugarcoachpremium/util/SchedulerProvider;", "", "<init>", "()V", "ioToMainObservableScheduler", "Lio/reactivex/ObservableTransformer;", "T", "ioToMainSingleScheduler", "Lio/reactivex/SingleTransformer;", "ioToMainCompletableScheduler", "Lio/reactivex/CompletableTransformer;", "ioToMainFlowableScheduler", "Lio/reactivex/FlowableTransformer;", "ioToMainMaybeScheduler", "Lio/reactivex/MaybeTransformer;", "getIOThreadScheduler", "Lio/reactivex/Scheduler;", "getMainThreadScheduler", "kotlin.jvm.PlatformType", "app_debug"})
public final class SchedulerProvider {
    
    public SchedulerProvider() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>io.reactivex.ObservableTransformer<T, T> ioToMainObservableScheduler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>io.reactivex.SingleTransformer<T, T> ioToMainSingleScheduler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.CompletableTransformer ioToMainCompletableScheduler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>io.reactivex.FlowableTransformer<T, T> ioToMainFlowableScheduler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
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