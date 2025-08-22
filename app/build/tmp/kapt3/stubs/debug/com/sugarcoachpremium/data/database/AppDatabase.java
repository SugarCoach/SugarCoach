package com.sugarcoachpremium.data.database;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/sugarcoachpremium/data/database/AppDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "treamentDao", "Lcom/sugarcoachpremium/data/database/repository/treament/TreamentDao;", "userDao", "Lcom/sugarcoachpremium/data/database/repository/user/UserDao;", "dailyRegisterDao", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterDao;", "app_debug"})
@androidx.room.Database(entities = {com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister.class, com.sugarcoachpremium.data.database.repository.user.User.class, com.sugarcoachpremium.data.database.repository.treament.Treament.class, com.sugarcoachpremium.data.database.repository.treament.TreamentHorarios.class, com.sugarcoachpremium.data.database.repository.treament.TreamentCorrectoraHorarios.class, com.sugarcoachpremium.data.database.repository.treament.BasalInsuline.class, com.sugarcoachpremium.data.database.repository.treament.CorrectoraInsuline.class, com.sugarcoachpremium.data.database.repository.dailyregister.Category.class, com.sugarcoachpremium.data.database.repository.dailyregister.States.class, com.sugarcoachpremium.data.database.repository.dailyregister.Exercises.class, com.sugarcoachpremium.data.database.repository.treament.TreamentBasalHora.class, com.sugarcoachpremium.data.database.repository.treament.Medidor.class, com.sugarcoachpremium.data.database.repository.treament.BombaInfusora.class}, version = 49, exportSchema = false)
@androidx.room.TypeConverters(value = {com.sugarcoachpremium.util.Converters.class})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.sugarcoachpremium.data.database.repository.treament.TreamentDao treamentDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.sugarcoachpremium.data.database.repository.user.UserDao userDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterDao dailyRegisterDao();
}