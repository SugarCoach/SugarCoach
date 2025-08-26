package com.sugarcoachpremium.data.database.repository.dailyregister;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\bD\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0016J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0002\u0010;J\t\u0010D\u001a\u00020\u0012H\u00c6\u0003J\t\u0010E\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010F\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\t\u0010G\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010I\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\u0010\u0010J\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\u0010\u0010K\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\u000b\u0010L\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010N\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u00b8\u0001\u0010P\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010QJ\u0013\u0010R\u001a\u00020\u00102\b\u0010S\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010T\u001a\u00020\u0003H\u00d6\u0001J\t\u0010U\u001a\u00020\u0005H\u00d6\u0001R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\u0015\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R \u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010#\"\u0004\b\'\u0010%R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010\u0013\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010#\"\u0004\b-\u0010%R \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010#\"\u0004\b/\u0010%R \u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010#\"\u0004\b1\u0010%R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b2\u0010\u0018\"\u0004\b3\u0010\u001aR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001f\"\u0004\b5\u0010!R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010#\"\u0004\b7\u0010%R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b8\u0010\u0018\"\u0004\b9\u0010\u001aR\"\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010>\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R \u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010#\"\u0004\b@\u0010%\u00a8\u0006V"}, d2 = {"Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegister;", "", "id", "", "idOnline", "", "glucose", "", "insulin", "carbohydrates", "emotionalState", "exercise", "category_id", "comment", "photo", "online", "", "created", "Ljava/util/Date;", "dateS", "basal", "colors", "(ILjava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;)V", "getBasal", "()Ljava/lang/Float;", "setBasal", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getCarbohydrates", "setCarbohydrates", "getCategory_id", "()I", "setCategory_id", "(I)V", "getColors", "()Ljava/lang/String;", "setColors", "(Ljava/lang/String;)V", "getComment", "setComment", "getCreated", "()Ljava/util/Date;", "setCreated", "(Ljava/util/Date;)V", "getDateS", "setDateS", "getEmotionalState", "setEmotionalState", "getExercise", "setExercise", "getGlucose", "setGlucose", "getId", "setId", "getIdOnline", "setIdOnline", "getInsulin", "setInsulin", "getOnline", "()Ljava/lang/Boolean;", "setOnline", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getPhoto", "setPhoto", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;)Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegister;", "equals", "other", "hashCode", "toString", "app_release"})
@androidx.room.Entity(tableName = "daily_register", foreignKeys = {@androidx.room.ForeignKey(entity = com.sugarcoachpremium.data.database.repository.dailyregister.Category.class, parentColumns = {"cate_id"}, childColumns = {"category_id"}, onDelete = 3), @androidx.room.ForeignKey(entity = com.sugarcoachpremium.data.database.repository.dailyregister.States.class, parentColumns = {"state_id"}, childColumns = {"emotional_state"}, onDelete = 3), @androidx.room.ForeignKey(entity = com.sugarcoachpremium.data.database.repository.dailyregister.Exercises.class, parentColumns = {"exercise_id"}, childColumns = {"exercise"}, onDelete = 3)})
public final class DailyRegister {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id;
    @androidx.room.ColumnInfo(name = "idOnline")
    @org.jetbrains.annotations.Nullable
    private java.lang.String idOnline;
    @androidx.room.ColumnInfo(name = "glucose")
    @org.jetbrains.annotations.Nullable
    private java.lang.Float glucose;
    @androidx.room.ColumnInfo(name = "insulin")
    @org.jetbrains.annotations.Nullable
    private java.lang.Float insulin;
    @androidx.room.ColumnInfo(name = "carbohydrates")
    @org.jetbrains.annotations.Nullable
    private java.lang.Float carbohydrates;
    @androidx.room.ColumnInfo(name = "emotional_state", index = true)
    @org.jetbrains.annotations.Nullable
    private java.lang.String emotionalState;
    @androidx.room.ColumnInfo(name = "exercise", index = true)
    @org.jetbrains.annotations.Nullable
    private java.lang.String exercise;
    @androidx.room.ColumnInfo(name = "category_id", index = true)
    private int category_id;
    @androidx.room.ColumnInfo(name = "comment")
    @org.jetbrains.annotations.Nullable
    private java.lang.String comment;
    @androidx.room.ColumnInfo(name = "photo")
    @org.jetbrains.annotations.Nullable
    private java.lang.String photo;
    @androidx.room.ColumnInfo(name = "online")
    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean online;
    @androidx.room.ColumnInfo(name = "created")
    @org.jetbrains.annotations.NotNull
    private java.util.Date created;
    @androidx.room.ColumnInfo(name = "dateS")
    @org.jetbrains.annotations.NotNull
    private java.lang.String dateS;
    @androidx.room.ColumnInfo(name = "basal")
    @org.jetbrains.annotations.Nullable
    private java.lang.Float basal;
    @androidx.room.ColumnInfo(name = "colors")
    @org.jetbrains.annotations.NotNull
    private java.lang.String colors;
    
    public DailyRegister(int id, @org.jetbrains.annotations.Nullable
    java.lang.String idOnline, @org.jetbrains.annotations.Nullable
    java.lang.Float glucose, @org.jetbrains.annotations.Nullable
    java.lang.Float insulin, @org.jetbrains.annotations.Nullable
    java.lang.Float carbohydrates, @org.jetbrains.annotations.Nullable
    java.lang.String emotionalState, @org.jetbrains.annotations.Nullable
    java.lang.String exercise, int category_id, @org.jetbrains.annotations.Nullable
    java.lang.String comment, @org.jetbrains.annotations.Nullable
    java.lang.String photo, @org.jetbrains.annotations.Nullable
    java.lang.Boolean online, @org.jetbrains.annotations.NotNull
    java.util.Date created, @org.jetbrains.annotations.NotNull
    java.lang.String dateS, @org.jetbrains.annotations.Nullable
    java.lang.Float basal, @org.jetbrains.annotations.NotNull
    java.lang.String colors) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getIdOnline() {
        return null;
    }
    
    public final void setIdOnline(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Float getGlucose() {
        return null;
    }
    
    public final void setGlucose(@org.jetbrains.annotations.Nullable
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Float getInsulin() {
        return null;
    }
    
    public final void setInsulin(@org.jetbrains.annotations.Nullable
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Float getCarbohydrates() {
        return null;
    }
    
    public final void setCarbohydrates(@org.jetbrains.annotations.Nullable
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getEmotionalState() {
        return null;
    }
    
    public final void setEmotionalState(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getExercise() {
        return null;
    }
    
    public final void setExercise(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    public final int getCategory_id() {
        return 0;
    }
    
    public final void setCategory_id(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getComment() {
        return null;
    }
    
    public final void setComment(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPhoto() {
        return null;
    }
    
    public final void setPhoto(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getOnline() {
        return null;
    }
    
    public final void setOnline(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date getCreated() {
        return null;
    }
    
    public final void setCreated(@org.jetbrains.annotations.NotNull
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDateS() {
        return null;
    }
    
    public final void setDateS(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Float getBasal() {
        return null;
    }
    
    public final void setBasal(@org.jetbrains.annotations.Nullable
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getColors() {
        return null;
    }
    
    public final void setColors(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Float component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Float component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Float component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Float component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component7() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister copy(int id, @org.jetbrains.annotations.Nullable
    java.lang.String idOnline, @org.jetbrains.annotations.Nullable
    java.lang.Float glucose, @org.jetbrains.annotations.Nullable
    java.lang.Float insulin, @org.jetbrains.annotations.Nullable
    java.lang.Float carbohydrates, @org.jetbrains.annotations.Nullable
    java.lang.String emotionalState, @org.jetbrains.annotations.Nullable
    java.lang.String exercise, int category_id, @org.jetbrains.annotations.Nullable
    java.lang.String comment, @org.jetbrains.annotations.Nullable
    java.lang.String photo, @org.jetbrains.annotations.Nullable
    java.lang.Boolean online, @org.jetbrains.annotations.NotNull
    java.util.Date created, @org.jetbrains.annotations.NotNull
    java.lang.String dateS, @org.jetbrains.annotations.Nullable
    java.lang.Float basal, @org.jetbrains.annotations.NotNull
    java.lang.String colors) {
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