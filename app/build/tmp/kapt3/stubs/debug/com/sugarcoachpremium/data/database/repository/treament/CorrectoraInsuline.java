package com.sugarcoachpremium.data.database.repository.treament;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0018"}, d2 = {"Lcom/sugarcoachpremium/data/database/repository/treament/CorrectoraInsuline;", "", "cid", "", "cname", "", "<init>", "(ILjava/lang/String;)V", "getCid", "()I", "setCid", "(I)V", "getCname", "()Ljava/lang/String;", "setCname", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
@androidx.room.Entity(tableName = "correctora_insuline")
public final class CorrectoraInsuline {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int cid;
    @com.google.gson.annotations.Expose()
    @androidx.room.ColumnInfo(name = "cname")
    @org.jetbrains.annotations.NotNull()
    private java.lang.String cname;
    
    public CorrectoraInsuline(int cid, @org.jetbrains.annotations.NotNull()
    java.lang.String cname) {
        super();
    }
    
    public final int getCid() {
        return 0;
    }
    
    public final void setCid(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCname() {
        return null;
    }
    
    public final void setCname(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.data.database.repository.treament.CorrectoraInsuline copy(int cid, @org.jetbrains.annotations.NotNull()
    java.lang.String cname) {
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