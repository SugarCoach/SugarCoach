package com.sugarcoachpremium.data.database.repository.user;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bf\b\u0087\b\u0018\u00002\u00020\u0001B\u00d5\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\\\u001a\u00020\u0003H\u00c6\u0003J\t\u0010]\u001a\u00020\u0005H\u00c6\u0003J\t\u0010^\u001a\u00020\u0007H\u00c6\u0003J\t\u0010_\u001a\u00020\u0005H\u00c6\u0003J\t\u0010`\u001a\u00020\u0005H\u00c6\u0003J\t\u0010a\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010e\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u00108J\u0010\u0010f\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u00108J\u000b\u0010g\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u0010\u0010i\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010EJ\u0010\u0010j\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010EJ\u0010\u0010k\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010EJ\u0010\u0010l\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010EJ\u000b\u0010m\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010p\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010VJ\t\u0010q\u001a\u00020\u0003H\u00c6\u0003J\u0088\u0002\u0010r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010sJ\u0013\u0010t\u001a\u00020\u00072\b\u0010u\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010v\u001a\u00020\u0003H\u00d6\u0001J\t\u0010w\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&R\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010$\"\u0004\b.\u0010&R\u001e\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010(\"\u0004\b0\u0010*R \u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010$\"\u0004\b2\u0010&R \u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010$\"\u0004\b4\u0010&R \u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010$\"\u0004\b6\u0010&R\"\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010;\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010;\u001a\u0004\b<\u00108\"\u0004\b=\u0010:R \u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR \u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010?\"\u0004\bC\u0010AR\"\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010H\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010H\u001a\u0004\bI\u0010E\"\u0004\bJ\u0010GR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010H\u001a\u0004\bK\u0010E\"\u0004\bL\u0010GR\"\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010H\u001a\u0004\bM\u0010E\"\u0004\bN\u0010GR \u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010$\"\u0004\bP\u0010&R \u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010$\"\u0004\bR\u0010&R \u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010$\"\u0004\bT\u0010&R\"\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010Y\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001e\u0010\u001c\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010 \"\u0004\b[\u0010\"\u00a8\u0006x"}, d2 = {"Lcom/sugarcoachpremium/data/database/repository/user/User;", "", "id", "", "username", "", "blocked", "", "email", "provider", "confirmed", "sex", "name", "avatar", "weight", "", "height", "birthday", "Ljava/util/Date;", "debut", "control", "medico", "sms", "geolocalizacion", "number", "mirror_id", "typeAccount", "onlineId", "points", "<init>", "(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/util/Date;Ljava/util/Date;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;I)V", "getId", "()I", "setId", "(I)V", "getUsername", "()Ljava/lang/String;", "setUsername", "(Ljava/lang/String;)V", "getBlocked", "()Z", "setBlocked", "(Z)V", "getEmail", "setEmail", "getProvider", "setProvider", "getConfirmed", "setConfirmed", "getSex", "setSex", "getName", "setName", "getAvatar", "setAvatar", "getWeight", "()Ljava/lang/Float;", "setWeight", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getHeight", "setHeight", "getBirthday", "()Ljava/util/Date;", "setBirthday", "(Ljava/util/Date;)V", "getDebut", "setDebut", "getControl", "()Ljava/lang/Boolean;", "setControl", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getMedico", "setMedico", "getSms", "setSms", "getGeolocalizacion", "setGeolocalizacion", "getNumber", "setNumber", "getMirror_id", "setMirror_id", "getTypeAccount", "setTypeAccount", "getOnlineId", "()Ljava/lang/Integer;", "setOnlineId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getPoints", "setPoints", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/util/Date;Ljava/util/Date;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;I)Lcom/sugarcoachpremium/data/database/repository/user/User;", "equals", "other", "hashCode", "toString", "app_debug"})
@androidx.room.Entity(tableName = "user")
public final class User {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id;
    @com.google.gson.annotations.Expose()
    @androidx.room.ColumnInfo(name = "username")
    @org.jetbrains.annotations.NotNull()
    private java.lang.String username;
    @com.google.gson.annotations.Expose()
    @androidx.room.ColumnInfo(name = "blocked")
    private boolean blocked;
    @com.google.gson.annotations.Expose()
    @androidx.room.ColumnInfo(name = "email")
    @org.jetbrains.annotations.NotNull()
    private java.lang.String email;
    @com.google.gson.annotations.Expose()
    @androidx.room.ColumnInfo(name = "provider")
    @org.jetbrains.annotations.NotNull()
    private java.lang.String provider;
    @com.google.gson.annotations.Expose()
    @androidx.room.ColumnInfo(name = "confirmed")
    private boolean confirmed;
    @androidx.room.ColumnInfo(name = "sex")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String sex;
    @androidx.room.ColumnInfo(name = "name")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String name;
    @androidx.room.ColumnInfo(name = "avatar")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String avatar;
    @androidx.room.ColumnInfo(name = "weight")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float weight;
    @androidx.room.ColumnInfo(name = "height")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float height;
    @androidx.room.ColumnInfo(name = "birthday")
    @org.jetbrains.annotations.Nullable()
    private java.util.Date birthday;
    @androidx.room.ColumnInfo(name = "debut")
    @org.jetbrains.annotations.Nullable()
    private java.util.Date debut;
    @androidx.room.ColumnInfo(name = "control")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean control;
    @androidx.room.ColumnInfo(name = "medico")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean medico;
    @androidx.room.ColumnInfo(name = "sms")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean sms;
    @androidx.room.ColumnInfo(name = "geolocalizacion")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean geolocalizacion;
    @androidx.room.ColumnInfo(name = "number")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String number;
    @com.google.gson.annotations.Expose()
    @androidx.room.ColumnInfo(name = "mirror_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String mirror_id;
    @androidx.room.ColumnInfo(name = "type_account")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String typeAccount;
    @androidx.room.ColumnInfo(name = "online_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer onlineId;
    @androidx.room.ColumnInfo(name = "sugar_points")
    private int points;
    
    public User(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String username, boolean blocked, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String provider, boolean confirmed, @org.jetbrains.annotations.Nullable()
    java.lang.String sex, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String avatar, @org.jetbrains.annotations.Nullable()
    java.lang.Float weight, @org.jetbrains.annotations.Nullable()
    java.lang.Float height, @org.jetbrains.annotations.Nullable()
    java.util.Date birthday, @org.jetbrains.annotations.Nullable()
    java.util.Date debut, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean control, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean medico, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean sms, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean geolocalizacion, @org.jetbrains.annotations.Nullable()
    java.lang.String number, @org.jetbrains.annotations.Nullable()
    java.lang.String mirror_id, @org.jetbrains.annotations.Nullable()
    java.lang.String typeAccount, @org.jetbrains.annotations.Nullable()
    java.lang.Integer onlineId, int points) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUsername() {
        return null;
    }
    
    public final void setUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getBlocked() {
        return false;
    }
    
    public final void setBlocked(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProvider() {
        return null;
    }
    
    public final void setProvider(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getConfirmed() {
        return false;
    }
    
    public final void setConfirmed(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSex() {
        return null;
    }
    
    public final void setSex(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAvatar() {
        return null;
    }
    
    public final void setAvatar(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getWeight() {
        return null;
    }
    
    public final void setWeight(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getHeight() {
        return null;
    }
    
    public final void setHeight(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getBirthday() {
        return null;
    }
    
    public final void setBirthday(@org.jetbrains.annotations.Nullable()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getDebut() {
        return null;
    }
    
    public final void setDebut(@org.jetbrains.annotations.Nullable()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getControl() {
        return null;
    }
    
    public final void setControl(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getMedico() {
        return null;
    }
    
    public final void setMedico(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getSms() {
        return null;
    }
    
    public final void setSms(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getGeolocalizacion() {
        return null;
    }
    
    public final void setGeolocalizacion(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNumber() {
        return null;
    }
    
    public final void setNumber(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMirror_id() {
        return null;
    }
    
    public final void setMirror_id(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTypeAccount() {
        return null;
    }
    
    public final void setTypeAccount(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getOnlineId() {
        return null;
    }
    
    public final void setOnlineId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public final int getPoints() {
        return 0;
    }
    
    public final void setPoints(int p0) {
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component21() {
        return null;
    }
    
    public final int component22() {
        return 0;
    }
    
    public final boolean component3() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    public final boolean component6() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.data.database.repository.user.User copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String username, boolean blocked, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String provider, boolean confirmed, @org.jetbrains.annotations.Nullable()
    java.lang.String sex, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String avatar, @org.jetbrains.annotations.Nullable()
    java.lang.Float weight, @org.jetbrains.annotations.Nullable()
    java.lang.Float height, @org.jetbrains.annotations.Nullable()
    java.util.Date birthday, @org.jetbrains.annotations.Nullable()
    java.util.Date debut, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean control, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean medico, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean sms, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean geolocalizacion, @org.jetbrains.annotations.Nullable()
    java.lang.String number, @org.jetbrains.annotations.Nullable()
    java.lang.String mirror_id, @org.jetbrains.annotations.Nullable()
    java.lang.String typeAccount, @org.jetbrains.annotations.Nullable()
    java.lang.Integer onlineId, int points) {
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