package com.sugarcoachpremium.data.database.repository.treament;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\t\u0010\u001b\u001a\u00020\u0007H\u00c6\u0003J8\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001J\t\u0010!\u001a\u00020\"H\u00d6\u0001R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006#"}, d2 = {"Lcom/sugarcoachpremium/data/database/repository/treament/TreamentCorrectoraHorarios;", "", "id", "", "category_id", "treatment_id", "selected", "", "(IILjava/lang/Integer;Z)V", "getCategory_id", "()I", "setCategory_id", "(I)V", "getId", "setId", "getSelected", "()Z", "setSelected", "(Z)V", "getTreatment_id", "()Ljava/lang/Integer;", "setTreatment_id", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(IILjava/lang/Integer;Z)Lcom/sugarcoachpremium/data/database/repository/treament/TreamentCorrectoraHorarios;", "equals", "other", "hashCode", "toString", "", "app_debug"})
@androidx.room.Entity(tableName = "treamentCorrectoraHorarios", foreignKeys = {@androidx.room.ForeignKey(entity = com.sugarcoachpremium.data.database.repository.treament.Treament.class, parentColumns = {"id"}, childColumns = {"treatment_id"}, onDelete = 3), @androidx.room.ForeignKey(entity = com.sugarcoachpremium.data.database.repository.dailyregister.Category.class, parentColumns = {"cate_id"}, childColumns = {"category_id"}, onDelete = 3)})
public final class TreamentCorrectoraHorarios {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id;
    @com.google.gson.annotations.Expose
    @androidx.room.ColumnInfo(name = "category_id", index = true)
    private int category_id;
    @com.google.gson.annotations.Expose
    @androidx.room.ColumnInfo(name = "treatment_id", index = true)
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer treatment_id;
    @com.google.gson.annotations.Expose
    @androidx.room.ColumnInfo(name = "selected")
    private boolean selected;
    
    public TreamentCorrectoraHorarios(int id, int category_id, @org.jetbrains.annotations.Nullable
    java.lang.Integer treatment_id, boolean selected) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    public final int getCategory_id() {
        return 0;
    }
    
    public final void setCategory_id(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getTreatment_id() {
        return null;
    }
    
    public final void setTreatment_id(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    public final boolean getSelected() {
        return false;
    }
    
    public final void setSelected(boolean p0) {
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component3() {
        return null;
    }
    
    public final boolean component4() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.data.database.repository.treament.TreamentCorrectoraHorarios copy(int id, int category_id, @org.jetbrains.annotations.Nullable
    java.lang.Integer treatment_id, boolean selected) {
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