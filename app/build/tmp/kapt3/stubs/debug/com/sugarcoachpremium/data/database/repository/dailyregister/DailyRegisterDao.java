package com.sugarcoachpremium.data.database.repository.dailyregister;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\'J\u0016\u0010\n\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\'J\u0016\u0010\f\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\'J\u0016\u0010\u000f\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bH\'J\u0016\u0010\u0012\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000bH\'J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bH\'J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\'J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bH\'J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u000bH\'J\b\u0010\u001a\u001a\u00020\u001bH\'J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\'J(\u0010 \u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\'J\u0010\u0010$\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0006H\'J0\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\"H\'J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u000bH\'J(\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\"2\u0006\u00101\u001a\u00020\"2\u0006\u00102\u001a\u00020\"2\u0006\u00103\u001a\u00020\"H\'J8\u00104\u001a\u00020/2\u0006\u00100\u001a\u00020\"2\u0006\u00101\u001a\u00020\"2\u0006\u00102\u001a\u00020\"2\u0006\u00103\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\'J0\u00105\u001a\u0002062\u0006\u0010\'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\"H\'J\b\u00107\u001a\u00020\u0016H\'J(\u00108\u001a\u00020/2\u0006\u00100\u001a\u00020\"2\u0006\u00101\u001a\u00020\"2\u0006\u00102\u001a\u00020\"2\u0006\u00103\u001a\u00020\"H\'J8\u00109\u001a\u00020/2\u0006\u00100\u001a\u00020\"2\u0006\u00101\u001a\u00020\"2\u0006\u00102\u001a\u00020\"2\u0006\u00103\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\'J\b\u0010:\u001a\u00020\u0006H\'J\u0010\u0010;\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\'\u00a8\u0006<"}, d2 = {"Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterDao;", "", "deleteAllRegister", "", "deleteRegister", "id", "", "insert", "dailyRegister", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegister;", "insertAll", "", "insertAllCategories", "category", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/Category;", "insertAllExercices", "exercises", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/Exercises;", "insertAllStates", "states", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/States;", "loadAll", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterCategory;", "loadAllCategories", "loadAllExercises", "loadAllStates", "loadAverages", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterAverages;", "loadAveragesLastDays", "hypo", "", "hyper", "loadAveragesWeek", "start", "", "end", "loadById", "loadCar", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterCar;", "breakfast_id", "snack_id", "lunch_id", "dinner_id", "date", "loadDates", "Ljava/util/Date;", "loadExercisesDays", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterExercisesStates;", "type1", "type2", "type3", "type4", "loadExercisesWeek", "loadInsuline", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterInsuline;", "loadLast", "loadStatesDays", "loadStatesWeek", "registersOffline", "update", "app_debug"})
@androidx.room.Dao
public abstract interface DailyRegisterDao {
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insert(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister dailyRegister);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister> dailyRegister);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertAllCategories(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Category> category);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertAllStates(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.States> states);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertAllExercices(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Exercises> exercises);
    
    @androidx.room.Query(value = "SELECT * FROM daily_register left join category on daily_register.category_id = category.cate_id WHERE id = :id")
    @org.jetbrains.annotations.NotNull
    public abstract com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterCategory loadById(int id);
    
    @androidx.room.Query(value = "SELECT * FROM daily_register left join category on daily_register.category_id = category.cate_id ORDER BY category_id DESC")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterCategory> loadAll();
    
    @androidx.room.Query(value = "SELECT * FROM category")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Category> loadAllCategories();
    
    @androidx.room.Query(value = "SELECT * FROM states")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.States> loadAllStates();
    
    @androidx.room.Query(value = "SELECT * FROM exercises")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Exercises> loadAllExercises();
    
    @androidx.room.Query(value = "SELECT * FROM daily_register left join category on daily_register.category_id = category.cate_id ORDER BY date(created) desc, category_id DESC LIMIT 1")
    @org.jetbrains.annotations.NotNull
    public abstract com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterCategory loadLast();
    
    @androidx.room.Query(value = "SELECT MIN(glucose) as min, MAX(glucose) as max, AVG(glucose) as promedio   FROM daily_register")
    @org.jetbrains.annotations.NotNull
    public abstract com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterAverages loadAverages();
    
    @androidx.room.Query(value = "SELECT avg(case when glucose BETWEEN 0 and :hypo then glucose end) as min, avg(case when glucose > :hypo and glucose <= :hyper then glucose end) as promedio, avg(case when glucose > :hyper then glucose end) as max from daily_register WHERE DATE(created) BETWEEN datetime(\'now\', \'-30 days\') AND datetime(\'now\')")
    @org.jetbrains.annotations.NotNull
    public abstract com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterAverages loadAveragesLastDays(float hypo, float hyper);
    
    @androidx.room.Query(value = "SELECT avg(case when glucose BETWEEN 0 and :hypo then glucose end) as min, avg(case when glucose > :hypo and glucose <= :hyper then glucose end) as promedio, avg(case when glucose > :hyper then glucose end) as max  FROM daily_register WHERE DATE(created) BETWEEN datetime(:start) AND datetime(:end)")
    @org.jetbrains.annotations.NotNull
    public abstract com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterAverages loadAveragesWeek(float hypo, float hyper, @org.jetbrains.annotations.NotNull
    java.lang.String start, @org.jetbrains.annotations.NotNull
    java.lang.String end);
    
    @androidx.room.Query(value = "SELECT avg(case when category_id = :breakfast_id then insulin end) as breakfast, avg(case when category_id = :snack_id then insulin end) as snack, avg(case when category_id = :lunch_id then insulin end) as lunch, avg(case when category_id = :dinner_id then insulin end) as dinner FROM daily_register WHERE DATE(created) = :date")
    @org.jetbrains.annotations.NotNull
    public abstract com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterInsuline loadInsuline(int breakfast_id, int snack_id, int lunch_id, int dinner_id, @org.jetbrains.annotations.NotNull
    java.lang.String date);
    
    @androidx.room.Query(value = "SELECT avg(case when category_id = :breakfast_id then carbohydrates end) as breakfast, avg(case when category_id = :snack_id then carbohydrates end) as snack, avg(case when category_id = :lunch_id then carbohydrates end) as lunch, avg(case when category_id = :dinner_id then carbohydrates end) as dinner FROM daily_register WHERE DATE(created) = :date")
    @org.jetbrains.annotations.NotNull
    public abstract com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterCar loadCar(int breakfast_id, int snack_id, int lunch_id, int dinner_id, @org.jetbrains.annotations.NotNull
    java.lang.String date);
    
    @androidx.room.Query(value = "SELECT count(case when exercise = :type1 then 1 end) as value, count(case when exercise = :type2 then 1 end) as value2, COUNT(case when exercise = :type3 then 1 end) as value3, COUNT(case when exercise = :type4 then 1 end) as value4 from daily_register WHERE DATE(created) BETWEEN datetime(\'now\', \'-30 days\') AND datetime(\'now\')")
    @org.jetbrains.annotations.NotNull
    public abstract com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterExercisesStates loadExercisesDays(@org.jetbrains.annotations.NotNull
    java.lang.String type1, @org.jetbrains.annotations.NotNull
    java.lang.String type2, @org.jetbrains.annotations.NotNull
    java.lang.String type3, @org.jetbrains.annotations.NotNull
    java.lang.String type4);
    
    @androidx.room.Query(value = "SELECT count(case when exercise = :type1 then 1 end) as value, count(case when exercise = :type2 then 1 end) as value2, COUNT(case when exercise = :type3 then 1 end) as value3, COUNT(case when exercise = :type4 then 1 end) as value4  FROM daily_register WHERE DATE(created) BETWEEN datetime(:start) AND datetime(:end)")
    @org.jetbrains.annotations.NotNull
    public abstract com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterExercisesStates loadExercisesWeek(@org.jetbrains.annotations.NotNull
    java.lang.String type1, @org.jetbrains.annotations.NotNull
    java.lang.String type2, @org.jetbrains.annotations.NotNull
    java.lang.String type3, @org.jetbrains.annotations.NotNull
    java.lang.String type4, @org.jetbrains.annotations.NotNull
    java.lang.String start, @org.jetbrains.annotations.NotNull
    java.lang.String end);
    
    @androidx.room.Query(value = "SELECT count(case when emotional_state = :type1 then 1 end) as value, count(case when emotional_state = :type2 then 1 end) as value2, COUNT(case when emotional_state = :type3 then 1 end) as value3, COUNT(case when emotional_state = :type4 then 1 end) as value4 from daily_register WHERE DATE(created) BETWEEN datetime(\'now\', \'-30 days\') AND datetime(\'now\')")
    @org.jetbrains.annotations.NotNull
    public abstract com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterExercisesStates loadStatesDays(@org.jetbrains.annotations.NotNull
    java.lang.String type1, @org.jetbrains.annotations.NotNull
    java.lang.String type2, @org.jetbrains.annotations.NotNull
    java.lang.String type3, @org.jetbrains.annotations.NotNull
    java.lang.String type4);
    
    @androidx.room.Query(value = "SELECT count(case when emotional_state = :type1 then 1 end) as value, count(case when emotional_state = :type2 then 1 end) as value2, COUNT(case when emotional_state = :type3 then 1 end) as value3, COUNT(case when emotional_state = :type4 then 1 end) as value4  FROM daily_register WHERE DATE(created) BETWEEN datetime(:start) AND datetime(:end)")
    @org.jetbrains.annotations.NotNull
    public abstract com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterExercisesStates loadStatesWeek(@org.jetbrains.annotations.NotNull
    java.lang.String type1, @org.jetbrains.annotations.NotNull
    java.lang.String type2, @org.jetbrains.annotations.NotNull
    java.lang.String type3, @org.jetbrains.annotations.NotNull
    java.lang.String type4, @org.jetbrains.annotations.NotNull
    java.lang.String start, @org.jetbrains.annotations.NotNull
    java.lang.String end);
    
    @androidx.room.Query(value = "SELECT created as fecha FROM daily_register group by DATE(created) ORDER BY date(created) DESC")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<java.util.Date> loadDates();
    
    @androidx.room.Query(value = "SELECT count(id) FROM daily_register where online = 0")
    public abstract int registersOffline();
    
    @androidx.room.Query(value = "DELETE FROM daily_register")
    public abstract void deleteAllRegister();
    
    @androidx.room.Update
    public abstract void update(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister dailyRegister);
    
    @androidx.room.Query(value = "DELETE FROM daily_register WHERE id = :id")
    public abstract void deleteRegister(int id);
}