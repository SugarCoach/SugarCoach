package com.sugarcoachpremium.data.database.repository.treament;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b>\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0004\b\u0014\u0010\u0015J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\t\u0010@\u001a\u00020\u0007H\u00c6\u0003J\t\u0010A\u001a\u00020\u0007H\u00c6\u0003J\t\u0010B\u001a\u00020\u0007H\u00c6\u0003J\t\u0010C\u001a\u00020\u0007H\u00c6\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010*J\u0010\u0010E\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010*J\u0010\u0010F\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010*J\u0010\u0010G\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010*J\t\u0010H\u001a\u00020\u0007H\u00c6\u0003J\t\u0010I\u001a\u00020\u0007H\u00c6\u0003J\t\u0010J\u001a\u00020\u0007H\u00c6\u0003J\t\u0010K\u001a\u00020\u0013H\u00c6\u0003J\u00a4\u0001\u0010L\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u00c6\u0001\u00a2\u0006\u0002\u0010MJ\u0013\u0010N\u001a\u00020\u00052\b\u0010O\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010P\u001a\u00020\u0003H\u00d6\u0001J\t\u0010Q\u001a\u00020RH\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\u001e\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R\u001e\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010 \"\u0004\b(\u0010\"R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010-\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010-\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R\"\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010-\u001a\u0004\b0\u0010*\"\u0004\b1\u0010,R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010-\u001a\u0004\b2\u0010*\"\u0004\b3\u0010,R\u001e\u0010\u000f\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010 \"\u0004\b5\u0010\"R\u001e\u0010\u0010\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010 \"\u0004\b7\u0010\"R\u001e\u0010\u0011\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010 \"\u0004\b9\u0010\"R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=\u00a8\u0006S"}, d2 = {"Lcom/sugarcoachpremium/data/database/repository/treament/Treament;", "", "id", "", "bomb", "", "object_glucose", "", "correctora_unit", "hipoglucose", "hyperglucose", "basal_id", "medidor_id", "bomba_id", "correctora_id", "correctora", "insulina_unit", "carbono", "created", "Ljava/util/Date;", "<init>", "(ILjava/lang/Boolean;FFFFLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;FFFLjava/util/Date;)V", "getId", "()I", "setId", "(I)V", "getBomb", "()Ljava/lang/Boolean;", "setBomb", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getObject_glucose", "()F", "setObject_glucose", "(F)V", "getCorrectora_unit", "setCorrectora_unit", "getHipoglucose", "setHipoglucose", "getHyperglucose", "setHyperglucose", "getBasal_id", "()Ljava/lang/Integer;", "setBasal_id", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getMedidor_id", "setMedidor_id", "getBomba_id", "setBomba_id", "getCorrectora_id", "setCorrectora_id", "getCorrectora", "setCorrectora", "getInsulina_unit", "setInsulina_unit", "getCarbono", "setCarbono", "getCreated", "()Ljava/util/Date;", "setCreated", "(Ljava/util/Date;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(ILjava/lang/Boolean;FFFFLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;FFFLjava/util/Date;)Lcom/sugarcoachpremium/data/database/repository/treament/Treament;", "equals", "other", "hashCode", "toString", "", "app_debug"})
@androidx.room.Entity(tableName = "treament", foreignKeys = {@androidx.room.ForeignKey(entity = com.sugarcoachpremium.data.database.repository.treament.BasalInsuline.class, parentColumns = {"bid"}, childColumns = {"basal_id"}, onDelete = 3), @androidx.room.ForeignKey(entity = com.sugarcoachpremium.data.database.repository.treament.Medidor.class, parentColumns = {"mid"}, childColumns = {"medidor_id"}, onDelete = 3), @androidx.room.ForeignKey(entity = com.sugarcoachpremium.data.database.repository.treament.BombaInfusora.class, parentColumns = {"boid"}, childColumns = {"bomba_id"}, onDelete = 3), @androidx.room.ForeignKey(entity = com.sugarcoachpremium.data.database.repository.treament.CorrectoraInsuline.class, parentColumns = {"cid"}, childColumns = {"correctora_id"}, onDelete = 3)})
public final class Treament {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id;
    @androidx.room.ColumnInfo(name = "bomb")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean bomb;
    @androidx.room.ColumnInfo(name = "object_glucose")
    private float object_glucose;
    @androidx.room.ColumnInfo(name = "correctora_unit")
    private float correctora_unit;
    @androidx.room.ColumnInfo(name = "hipoglucose")
    private float hipoglucose;
    @androidx.room.ColumnInfo(name = "hyperglucose")
    private float hyperglucose;
    @androidx.room.ColumnInfo(name = "basal_id", index = true)
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer basal_id;
    @androidx.room.ColumnInfo(name = "medidor_id", index = true)
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer medidor_id;
    @androidx.room.ColumnInfo(name = "bomba_id", index = true)
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer bomba_id;
    @androidx.room.ColumnInfo(name = "correctora_id", index = true)
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer correctora_id;
    @androidx.room.ColumnInfo(name = "correctora")
    private float correctora;
    @androidx.room.ColumnInfo(name = "insulina_unit")
    private float insulina_unit;
    @androidx.room.ColumnInfo(name = "carbono")
    private float carbono;
    @androidx.room.ColumnInfo(name = "created")
    @org.jetbrains.annotations.NotNull()
    private java.util.Date created;
    
    public Treament(int id, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean bomb, float object_glucose, float correctora_unit, float hipoglucose, float hyperglucose, @org.jetbrains.annotations.Nullable()
    java.lang.Integer basal_id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer medidor_id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer bomba_id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer correctora_id, float correctora, float insulina_unit, float carbono, @org.jetbrains.annotations.NotNull()
    java.util.Date created) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getBomb() {
        return null;
    }
    
    public final void setBomb(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    public final float getObject_glucose() {
        return 0.0F;
    }
    
    public final void setObject_glucose(float p0) {
    }
    
    public final float getCorrectora_unit() {
        return 0.0F;
    }
    
    public final void setCorrectora_unit(float p0) {
    }
    
    public final float getHipoglucose() {
        return 0.0F;
    }
    
    public final void setHipoglucose(float p0) {
    }
    
    public final float getHyperglucose() {
        return 0.0F;
    }
    
    public final void setHyperglucose(float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getBasal_id() {
        return null;
    }
    
    public final void setBasal_id(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMedidor_id() {
        return null;
    }
    
    public final void setMedidor_id(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getBomba_id() {
        return null;
    }
    
    public final void setBomba_id(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCorrectora_id() {
        return null;
    }
    
    public final void setCorrectora_id(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public final float getCorrectora() {
        return 0.0F;
    }
    
    public final void setCorrectora(float p0) {
    }
    
    public final float getInsulina_unit() {
        return 0.0F;
    }
    
    public final void setInsulina_unit(float p0) {
    }
    
    public final float getCarbono() {
        return 0.0F;
    }
    
    public final void setCarbono(float p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getCreated() {
        return null;
    }
    
    public final void setCreated(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component10() {
        return null;
    }
    
    public final float component11() {
        return 0.0F;
    }
    
    public final float component12() {
        return 0.0F;
    }
    
    public final float component13() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component2() {
        return null;
    }
    
    public final float component3() {
        return 0.0F;
    }
    
    public final float component4() {
        return 0.0F;
    }
    
    public final float component5() {
        return 0.0F;
    }
    
    public final float component6() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.data.database.repository.treament.Treament copy(int id, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean bomb, float object_glucose, float correctora_unit, float hipoglucose, float hyperglucose, @org.jetbrains.annotations.Nullable()
    java.lang.Integer basal_id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer medidor_id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer bomba_id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer correctora_id, float correctora, float insulina_unit, float carbono, @org.jetbrains.annotations.NotNull()
    java.util.Date created) {
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