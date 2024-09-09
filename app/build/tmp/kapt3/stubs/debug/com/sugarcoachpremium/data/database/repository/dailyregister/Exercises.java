package com.sugarcoachpremium.data.database.repository.dailyregister;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n\u00a8\u0006\u0019"}, d2 = {"Lcom/sugarcoachpremium/data/database/repository/dailyregister/Exercises;", "", "exercise_id", "", "exercise_name", "exercise_icono", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getExercise_icono", "()Ljava/lang/String;", "setExercise_icono", "(Ljava/lang/String;)V", "getExercise_id", "setExercise_id", "getExercise_name", "setExercise_name", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
@androidx.room.Entity(tableName = "exercises")
public final class Exercises {
    @com.google.gson.annotations.Expose
    @androidx.room.PrimaryKey
    @androidx.room.ColumnInfo(name = "exercise_id")
    @org.jetbrains.annotations.NotNull
    private java.lang.String exercise_id;
    @com.google.gson.annotations.Expose
    @androidx.room.ColumnInfo(name = "exercise_name")
    @org.jetbrains.annotations.NotNull
    private java.lang.String exercise_name;
    @com.google.gson.annotations.Expose
    @androidx.room.ColumnInfo(name = "exercise_icono")
    @org.jetbrains.annotations.NotNull
    private java.lang.String exercise_icono;
    
    public Exercises(@org.jetbrains.annotations.NotNull
    java.lang.String exercise_id, @org.jetbrains.annotations.NotNull
    java.lang.String exercise_name, @org.jetbrains.annotations.NotNull
    java.lang.String exercise_icono) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getExercise_id() {
        return null;
    }
    
    public final void setExercise_id(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getExercise_name() {
        return null;
    }
    
    public final void setExercise_name(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getExercise_icono() {
        return null;
    }
    
    public final void setExercise_icono(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.data.database.repository.dailyregister.Exercises copy(@org.jetbrains.annotations.NotNull
    java.lang.String exercise_id, @org.jetbrains.annotations.NotNull
    java.lang.String exercise_name, @org.jetbrains.annotations.NotNull
    java.lang.String exercise_icono) {
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