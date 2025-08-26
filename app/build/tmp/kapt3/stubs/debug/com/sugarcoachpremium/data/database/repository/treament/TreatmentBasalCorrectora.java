package com.sugarcoachpremium.data.database.repository.treament;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J-\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006 "}, d2 = {"Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentBasalCorrectora;", "", "treament", "Lcom/sugarcoachpremium/data/database/repository/treament/Treament;", "basalInsuline", "Lcom/sugarcoachpremium/data/database/repository/treament/BasalInsuline;", "correctoraInsuline", "Lcom/sugarcoachpremium/data/database/repository/treament/CorrectoraInsuline;", "(Lcom/sugarcoachpremium/data/database/repository/treament/Treament;Lcom/sugarcoachpremium/data/database/repository/treament/BasalInsuline;Lcom/sugarcoachpremium/data/database/repository/treament/CorrectoraInsuline;)V", "getBasalInsuline", "()Lcom/sugarcoachpremium/data/database/repository/treament/BasalInsuline;", "setBasalInsuline", "(Lcom/sugarcoachpremium/data/database/repository/treament/BasalInsuline;)V", "getCorrectoraInsuline", "()Lcom/sugarcoachpremium/data/database/repository/treament/CorrectoraInsuline;", "setCorrectoraInsuline", "(Lcom/sugarcoachpremium/data/database/repository/treament/CorrectoraInsuline;)V", "getTreament", "()Lcom/sugarcoachpremium/data/database/repository/treament/Treament;", "setTreament", "(Lcom/sugarcoachpremium/data/database/repository/treament/Treament;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class TreatmentBasalCorrectora {
    @androidx.room.Embedded
    @org.jetbrains.annotations.Nullable
    private com.sugarcoachpremium.data.database.repository.treament.Treament treament;
    @androidx.room.Embedded
    @org.jetbrains.annotations.Nullable
    private com.sugarcoachpremium.data.database.repository.treament.BasalInsuline basalInsuline;
    @androidx.room.Embedded
    @org.jetbrains.annotations.Nullable
    private com.sugarcoachpremium.data.database.repository.treament.CorrectoraInsuline correctoraInsuline;
    
    public TreatmentBasalCorrectora(@org.jetbrains.annotations.Nullable
    com.sugarcoachpremium.data.database.repository.treament.Treament treament, @org.jetbrains.annotations.Nullable
    com.sugarcoachpremium.data.database.repository.treament.BasalInsuline basalInsuline, @org.jetbrains.annotations.Nullable
    com.sugarcoachpremium.data.database.repository.treament.CorrectoraInsuline correctoraInsuline) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sugarcoachpremium.data.database.repository.treament.Treament getTreament() {
        return null;
    }
    
    public final void setTreament(@org.jetbrains.annotations.Nullable
    com.sugarcoachpremium.data.database.repository.treament.Treament p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sugarcoachpremium.data.database.repository.treament.BasalInsuline getBasalInsuline() {
        return null;
    }
    
    public final void setBasalInsuline(@org.jetbrains.annotations.Nullable
    com.sugarcoachpremium.data.database.repository.treament.BasalInsuline p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sugarcoachpremium.data.database.repository.treament.CorrectoraInsuline getCorrectoraInsuline() {
        return null;
    }
    
    public final void setCorrectoraInsuline(@org.jetbrains.annotations.Nullable
    com.sugarcoachpremium.data.database.repository.treament.CorrectoraInsuline p0) {
    }
    
    public TreatmentBasalCorrectora() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sugarcoachpremium.data.database.repository.treament.Treament component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sugarcoachpremium.data.database.repository.treament.BasalInsuline component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sugarcoachpremium.data.database.repository.treament.CorrectoraInsuline component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.data.database.repository.treament.TreatmentBasalCorrectora copy(@org.jetbrains.annotations.Nullable
    com.sugarcoachpremium.data.database.repository.treament.Treament treament, @org.jetbrains.annotations.Nullable
    com.sugarcoachpremium.data.database.repository.treament.BasalInsuline basalInsuline, @org.jetbrains.annotations.Nullable
    com.sugarcoachpremium.data.database.repository.treament.CorrectoraInsuline correctoraInsuline) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}