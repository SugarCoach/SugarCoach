package com.sugarcoachpremium.data.database.repository.treament;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0004\b\t\u0010\nJ\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\t\u0010\u001f\u001a\u00020\bH\u00c6\u0003J8\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001\u00a2\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020\u0003H\u00d6\u0001J\t\u0010&\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006\'"}, d2 = {"Lcom/sugarcoachpremium/data/database/repository/treament/TreamentBasalHora;", "", "id", "", "time", "", "treatment_id", "units", "", "<init>", "(ILjava/lang/String;Ljava/lang/Integer;F)V", "getId", "()I", "setId", "(I)V", "getTime", "()Ljava/lang/String;", "setTime", "(Ljava/lang/String;)V", "getTreatment_id", "()Ljava/lang/Integer;", "setTreatment_id", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getUnits", "()F", "setUnits", "(F)V", "component1", "component2", "component3", "component4", "copy", "(ILjava/lang/String;Ljava/lang/Integer;F)Lcom/sugarcoachpremium/data/database/repository/treament/TreamentBasalHora;", "equals", "", "other", "hashCode", "toString", "app_debug"})
@androidx.room.Entity(tableName = "treament_basal_hora", foreignKeys = {@androidx.room.ForeignKey(entity = com.sugarcoachpremium.data.database.repository.treament.Treament.class, parentColumns = {"id"}, childColumns = {"treatment_id"}, onDelete = 3)})
public final class TreamentBasalHora {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id;
    @com.google.gson.annotations.Expose()
    @androidx.room.ColumnInfo(name = "time", index = true)
    @org.jetbrains.annotations.NotNull()
    private java.lang.String time;
    @com.google.gson.annotations.Expose()
    @androidx.room.ColumnInfo(name = "treatment_id", index = true)
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer treatment_id;
    @com.google.gson.annotations.Expose()
    @androidx.room.ColumnInfo(name = "units")
    private float units;
    
    public TreamentBasalHora(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String time, @org.jetbrains.annotations.Nullable()
    java.lang.Integer treatment_id, float units) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTime() {
        return null;
    }
    
    public final void setTime(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTreatment_id() {
        return null;
    }
    
    public final void setTreatment_id(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public final float getUnits() {
        return 0.0F;
    }
    
    public final void setUnits(float p0) {
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    public final float component4() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.data.database.repository.treament.TreamentBasalHora copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String time, @org.jetbrains.annotations.Nullable()
    java.lang.Integer treatment_id, float units) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}