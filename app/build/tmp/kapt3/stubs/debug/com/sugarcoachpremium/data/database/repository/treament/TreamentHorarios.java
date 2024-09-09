package com.sugarcoachpremium.data.database.repository.treament;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001f\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0006H\u00c6\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\t\u0010\"\u001a\u00020\tH\u00c6\u0003JB\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001\u00a2\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00d6\u0001J\t\u0010(\u001a\u00020)H\u00d6\u0001R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006*"}, d2 = {"Lcom/sugarcoachpremium/data/database/repository/treament/TreamentHorarios;", "", "id", "", "category_id", "selected", "", "treatment_id", "units", "", "(IIZLjava/lang/Integer;F)V", "getCategory_id", "()I", "setCategory_id", "(I)V", "getId", "setId", "getSelected", "()Z", "setSelected", "(Z)V", "getTreatment_id", "()Ljava/lang/Integer;", "setTreatment_id", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getUnits", "()F", "setUnits", "(F)V", "component1", "component2", "component3", "component4", "component5", "copy", "(IIZLjava/lang/Integer;F)Lcom/sugarcoachpremium/data/database/repository/treament/TreamentHorarios;", "equals", "other", "hashCode", "toString", "", "app_debug"})
@androidx.room.Entity(tableName = "treamentHorarios", foreignKeys = {@androidx.room.ForeignKey(entity = com.sugarcoachpremium.data.database.repository.treament.Treament.class, parentColumns = {"id"}, childColumns = {"treatment_id"}, onDelete = 3), @androidx.room.ForeignKey(entity = com.sugarcoachpremium.data.database.repository.dailyregister.Category.class, parentColumns = {"cate_id"}, childColumns = {"category_id"}, onDelete = 3)})
public final class TreamentHorarios {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id;
    @com.google.gson.annotations.Expose
    @androidx.room.ColumnInfo(name = "category_id", index = true)
    private int category_id;
    @com.google.gson.annotations.Expose
    @androidx.room.ColumnInfo(name = "selected")
    private boolean selected;
    @com.google.gson.annotations.Expose
    @androidx.room.ColumnInfo(name = "treatment_id", index = true)
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer treatment_id;
    @com.google.gson.annotations.Expose
    @androidx.room.ColumnInfo(name = "units")
    private float units;
    
    public TreamentHorarios(int id, int category_id, boolean selected, @org.jetbrains.annotations.Nullable
    java.lang.Integer treatment_id, float units) {
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
    
    public final boolean getSelected() {
        return false;
    }
    
    public final void setSelected(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getTreatment_id() {
        return null;
    }
    
    public final void setTreatment_id(@org.jetbrains.annotations.Nullable
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
    
    public final int component2() {
        return 0;
    }
    
    public final boolean component3() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component4() {
        return null;
    }
    
    public final float component5() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.data.database.repository.treament.TreamentHorarios copy(int id, int category_id, boolean selected, @org.jetbrains.annotations.Nullable
    java.lang.Integer treatment_id, float units) {
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