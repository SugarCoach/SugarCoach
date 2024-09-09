package com.sugarcoachpremium.data.database.repository.user;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\'J\b\u0010\t\u001a\u00020\u0006H\'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u000b"}, d2 = {"Lcom/sugarcoachpremium/data/database/repository/user/UserDao;", "", "deleteUser", "", "insert", "user", "Lcom/sugarcoachpremium/data/database/repository/user/User;", "loadAll", "", "loadOne", "update", "app_release"})
@androidx.room.Dao
public abstract interface UserDao {
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insert(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.user.User user);
    
    @androidx.room.Query(value = "SELECT * FROM user LIMIT 1")
    @org.jetbrains.annotations.NotNull
    public abstract com.sugarcoachpremium.data.database.repository.user.User loadOne();
    
    @androidx.room.Query(value = "SELECT * FROM user")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.sugarcoachpremium.data.database.repository.user.User> loadAll();
    
    @androidx.room.Query(value = "DELETE FROM user")
    public abstract void deleteUser();
    
    @androidx.room.Update
    public abstract void update(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.user.User user);
}