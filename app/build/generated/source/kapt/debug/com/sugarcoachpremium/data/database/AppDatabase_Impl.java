package com.sugarcoachpremium.data.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterDao;
import com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterDao_Impl;
import com.sugarcoachpremium.data.database.repository.treament.TreamentDao;
import com.sugarcoachpremium.data.database.repository.treament.TreamentDao_Impl;
import com.sugarcoachpremium.data.database.repository.user.UserDao;
import com.sugarcoachpremium.data.database.repository.user.UserDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile TreamentDao _treamentDao;

  private volatile UserDao _userDao;

  private volatile DailyRegisterDao _dailyRegisterDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(49) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `daily_register` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `idOnline` TEXT, `glucose` REAL, `insulin` REAL, `carbohydrates` REAL, `emotional_state` TEXT, `exercise` TEXT, `category_id` INTEGER NOT NULL, `comment` TEXT, `photo` TEXT, `online` INTEGER, `created` TEXT NOT NULL, `dateS` TEXT NOT NULL, `basal` REAL, `colors` TEXT NOT NULL, FOREIGN KEY(`category_id`) REFERENCES `category`(`cate_id`) ON UPDATE NO ACTION ON DELETE SET NULL , FOREIGN KEY(`emotional_state`) REFERENCES `states`(`state_id`) ON UPDATE NO ACTION ON DELETE SET NULL , FOREIGN KEY(`exercise`) REFERENCES `exercises`(`exercise_id`) ON UPDATE NO ACTION ON DELETE SET NULL )");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_daily_register_emotional_state` ON `daily_register` (`emotional_state`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_daily_register_exercise` ON `daily_register` (`exercise`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_daily_register_category_id` ON `daily_register` (`category_id`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `user` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `username` TEXT NOT NULL, `blocked` INTEGER NOT NULL, `email` TEXT NOT NULL, `provider` TEXT NOT NULL, `confirmed` INTEGER NOT NULL, `sex` TEXT, `name` TEXT, `avatar` TEXT, `weight` REAL, `height` REAL, `birthday` TEXT, `debut` TEXT, `control` INTEGER, `medico` INTEGER, `sms` INTEGER, `geolocalizacion` INTEGER, `number` TEXT, `mirror_id` TEXT, `type_account` TEXT, `online_id` INTEGER, `sugar_points` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `treament` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `bomb` INTEGER, `object_glucose` REAL NOT NULL, `correctora_unit` REAL NOT NULL, `hipoglucose` REAL NOT NULL, `hyperglucose` REAL NOT NULL, `basal_id` INTEGER, `medidor_id` INTEGER, `bomba_id` INTEGER, `correctora_id` INTEGER, `correctora` REAL NOT NULL, `insulina_unit` REAL NOT NULL, `carbono` REAL NOT NULL, `created` TEXT NOT NULL, FOREIGN KEY(`basal_id`) REFERENCES `basal_insuline`(`bid`) ON UPDATE NO ACTION ON DELETE SET NULL , FOREIGN KEY(`medidor_id`) REFERENCES `medidor`(`mid`) ON UPDATE NO ACTION ON DELETE SET NULL , FOREIGN KEY(`bomba_id`) REFERENCES `bomba_infusora`(`boid`) ON UPDATE NO ACTION ON DELETE SET NULL , FOREIGN KEY(`correctora_id`) REFERENCES `correctora_insuline`(`cid`) ON UPDATE NO ACTION ON DELETE SET NULL )");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_treament_basal_id` ON `treament` (`basal_id`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_treament_medidor_id` ON `treament` (`medidor_id`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_treament_bomba_id` ON `treament` (`bomba_id`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_treament_correctora_id` ON `treament` (`correctora_id`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `treamentHorarios` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `category_id` INTEGER NOT NULL, `selected` INTEGER NOT NULL, `treatment_id` INTEGER, `units` REAL NOT NULL, FOREIGN KEY(`treatment_id`) REFERENCES `treament`(`id`) ON UPDATE NO ACTION ON DELETE SET NULL , FOREIGN KEY(`category_id`) REFERENCES `category`(`cate_id`) ON UPDATE NO ACTION ON DELETE SET NULL )");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_treamentHorarios_category_id` ON `treamentHorarios` (`category_id`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_treamentHorarios_treatment_id` ON `treamentHorarios` (`treatment_id`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `treamentCorrectoraHorarios` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `category_id` INTEGER NOT NULL, `treatment_id` INTEGER, `selected` INTEGER NOT NULL, FOREIGN KEY(`treatment_id`) REFERENCES `treament`(`id`) ON UPDATE NO ACTION ON DELETE SET NULL , FOREIGN KEY(`category_id`) REFERENCES `category`(`cate_id`) ON UPDATE NO ACTION ON DELETE SET NULL )");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_treamentCorrectoraHorarios_category_id` ON `treamentCorrectoraHorarios` (`category_id`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_treamentCorrectoraHorarios_treatment_id` ON `treamentCorrectoraHorarios` (`treatment_id`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `basal_insuline` (`bid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `correctora_insuline` (`cid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `cname` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `category` (`cate_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `cate_name` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `states` (`state_id` TEXT NOT NULL, `state_name` TEXT NOT NULL, `state_icono` TEXT NOT NULL, PRIMARY KEY(`state_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `exercises` (`exercise_id` TEXT NOT NULL, `exercise_name` TEXT NOT NULL, `exercise_icono` TEXT NOT NULL, PRIMARY KEY(`exercise_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `treament_basal_hora` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `time` TEXT NOT NULL, `treatment_id` INTEGER, `units` REAL NOT NULL, FOREIGN KEY(`treatment_id`) REFERENCES `treament`(`id`) ON UPDATE NO ACTION ON DELETE SET NULL )");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_treament_basal_hora_time` ON `treament_basal_hora` (`time`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_treament_basal_hora_treatment_id` ON `treament_basal_hora` (`treatment_id`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `medidor` (`mid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `bomba_infusora` (`boid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5666e873ba6f716ac0d3c8ee56bcec09')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `daily_register`");
        _db.execSQL("DROP TABLE IF EXISTS `user`");
        _db.execSQL("DROP TABLE IF EXISTS `treament`");
        _db.execSQL("DROP TABLE IF EXISTS `treamentHorarios`");
        _db.execSQL("DROP TABLE IF EXISTS `treamentCorrectoraHorarios`");
        _db.execSQL("DROP TABLE IF EXISTS `basal_insuline`");
        _db.execSQL("DROP TABLE IF EXISTS `correctora_insuline`");
        _db.execSQL("DROP TABLE IF EXISTS `category`");
        _db.execSQL("DROP TABLE IF EXISTS `states`");
        _db.execSQL("DROP TABLE IF EXISTS `exercises`");
        _db.execSQL("DROP TABLE IF EXISTS `treament_basal_hora`");
        _db.execSQL("DROP TABLE IF EXISTS `medidor`");
        _db.execSQL("DROP TABLE IF EXISTS `bomba_infusora`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      public void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        _db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsDailyRegister = new HashMap<String, TableInfo.Column>(15);
        _columnsDailyRegister.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDailyRegister.put("idOnline", new TableInfo.Column("idOnline", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDailyRegister.put("glucose", new TableInfo.Column("glucose", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDailyRegister.put("insulin", new TableInfo.Column("insulin", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDailyRegister.put("carbohydrates", new TableInfo.Column("carbohydrates", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDailyRegister.put("emotional_state", new TableInfo.Column("emotional_state", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDailyRegister.put("exercise", new TableInfo.Column("exercise", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDailyRegister.put("category_id", new TableInfo.Column("category_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDailyRegister.put("comment", new TableInfo.Column("comment", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDailyRegister.put("photo", new TableInfo.Column("photo", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDailyRegister.put("online", new TableInfo.Column("online", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDailyRegister.put("created", new TableInfo.Column("created", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDailyRegister.put("dateS", new TableInfo.Column("dateS", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDailyRegister.put("basal", new TableInfo.Column("basal", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDailyRegister.put("colors", new TableInfo.Column("colors", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDailyRegister = new HashSet<TableInfo.ForeignKey>(3);
        _foreignKeysDailyRegister.add(new TableInfo.ForeignKey("category", "SET NULL", "NO ACTION",Arrays.asList("category_id"), Arrays.asList("cate_id")));
        _foreignKeysDailyRegister.add(new TableInfo.ForeignKey("states", "SET NULL", "NO ACTION",Arrays.asList("emotional_state"), Arrays.asList("state_id")));
        _foreignKeysDailyRegister.add(new TableInfo.ForeignKey("exercises", "SET NULL", "NO ACTION",Arrays.asList("exercise"), Arrays.asList("exercise_id")));
        final HashSet<TableInfo.Index> _indicesDailyRegister = new HashSet<TableInfo.Index>(3);
        _indicesDailyRegister.add(new TableInfo.Index("index_daily_register_emotional_state", false, Arrays.asList("emotional_state"), Arrays.asList("ASC")));
        _indicesDailyRegister.add(new TableInfo.Index("index_daily_register_exercise", false, Arrays.asList("exercise"), Arrays.asList("ASC")));
        _indicesDailyRegister.add(new TableInfo.Index("index_daily_register_category_id", false, Arrays.asList("category_id"), Arrays.asList("ASC")));
        final TableInfo _infoDailyRegister = new TableInfo("daily_register", _columnsDailyRegister, _foreignKeysDailyRegister, _indicesDailyRegister);
        final TableInfo _existingDailyRegister = TableInfo.read(_db, "daily_register");
        if (! _infoDailyRegister.equals(_existingDailyRegister)) {
          return new RoomOpenHelper.ValidationResult(false, "daily_register(com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister).\n"
                  + " Expected:\n" + _infoDailyRegister + "\n"
                  + " Found:\n" + _existingDailyRegister);
        }
        final HashMap<String, TableInfo.Column> _columnsUser = new HashMap<String, TableInfo.Column>(22);
        _columnsUser.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("username", new TableInfo.Column("username", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("blocked", new TableInfo.Column("blocked", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("email", new TableInfo.Column("email", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("provider", new TableInfo.Column("provider", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("confirmed", new TableInfo.Column("confirmed", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("sex", new TableInfo.Column("sex", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("avatar", new TableInfo.Column("avatar", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("weight", new TableInfo.Column("weight", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("height", new TableInfo.Column("height", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("birthday", new TableInfo.Column("birthday", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("debut", new TableInfo.Column("debut", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("control", new TableInfo.Column("control", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("medico", new TableInfo.Column("medico", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("sms", new TableInfo.Column("sms", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("geolocalizacion", new TableInfo.Column("geolocalizacion", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("number", new TableInfo.Column("number", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("mirror_id", new TableInfo.Column("mirror_id", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("type_account", new TableInfo.Column("type_account", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("online_id", new TableInfo.Column("online_id", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("sugar_points", new TableInfo.Column("sugar_points", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUser = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUser = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUser = new TableInfo("user", _columnsUser, _foreignKeysUser, _indicesUser);
        final TableInfo _existingUser = TableInfo.read(_db, "user");
        if (! _infoUser.equals(_existingUser)) {
          return new RoomOpenHelper.ValidationResult(false, "user(com.sugarcoachpremium.data.database.repository.user.User).\n"
                  + " Expected:\n" + _infoUser + "\n"
                  + " Found:\n" + _existingUser);
        }
        final HashMap<String, TableInfo.Column> _columnsTreament = new HashMap<String, TableInfo.Column>(14);
        _columnsTreament.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTreament.put("bomb", new TableInfo.Column("bomb", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTreament.put("object_glucose", new TableInfo.Column("object_glucose", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTreament.put("correctora_unit", new TableInfo.Column("correctora_unit", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTreament.put("hipoglucose", new TableInfo.Column("hipoglucose", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTreament.put("hyperglucose", new TableInfo.Column("hyperglucose", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTreament.put("basal_id", new TableInfo.Column("basal_id", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTreament.put("medidor_id", new TableInfo.Column("medidor_id", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTreament.put("bomba_id", new TableInfo.Column("bomba_id", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTreament.put("correctora_id", new TableInfo.Column("correctora_id", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTreament.put("correctora", new TableInfo.Column("correctora", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTreament.put("insulina_unit", new TableInfo.Column("insulina_unit", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTreament.put("carbono", new TableInfo.Column("carbono", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTreament.put("created", new TableInfo.Column("created", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTreament = new HashSet<TableInfo.ForeignKey>(4);
        _foreignKeysTreament.add(new TableInfo.ForeignKey("basal_insuline", "SET NULL", "NO ACTION",Arrays.asList("basal_id"), Arrays.asList("bid")));
        _foreignKeysTreament.add(new TableInfo.ForeignKey("medidor", "SET NULL", "NO ACTION",Arrays.asList("medidor_id"), Arrays.asList("mid")));
        _foreignKeysTreament.add(new TableInfo.ForeignKey("bomba_infusora", "SET NULL", "NO ACTION",Arrays.asList("bomba_id"), Arrays.asList("boid")));
        _foreignKeysTreament.add(new TableInfo.ForeignKey("correctora_insuline", "SET NULL", "NO ACTION",Arrays.asList("correctora_id"), Arrays.asList("cid")));
        final HashSet<TableInfo.Index> _indicesTreament = new HashSet<TableInfo.Index>(4);
        _indicesTreament.add(new TableInfo.Index("index_treament_basal_id", false, Arrays.asList("basal_id"), Arrays.asList("ASC")));
        _indicesTreament.add(new TableInfo.Index("index_treament_medidor_id", false, Arrays.asList("medidor_id"), Arrays.asList("ASC")));
        _indicesTreament.add(new TableInfo.Index("index_treament_bomba_id", false, Arrays.asList("bomba_id"), Arrays.asList("ASC")));
        _indicesTreament.add(new TableInfo.Index("index_treament_correctora_id", false, Arrays.asList("correctora_id"), Arrays.asList("ASC")));
        final TableInfo _infoTreament = new TableInfo("treament", _columnsTreament, _foreignKeysTreament, _indicesTreament);
        final TableInfo _existingTreament = TableInfo.read(_db, "treament");
        if (! _infoTreament.equals(_existingTreament)) {
          return new RoomOpenHelper.ValidationResult(false, "treament(com.sugarcoachpremium.data.database.repository.treament.Treament).\n"
                  + " Expected:\n" + _infoTreament + "\n"
                  + " Found:\n" + _existingTreament);
        }
        final HashMap<String, TableInfo.Column> _columnsTreamentHorarios = new HashMap<String, TableInfo.Column>(5);
        _columnsTreamentHorarios.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTreamentHorarios.put("category_id", new TableInfo.Column("category_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTreamentHorarios.put("selected", new TableInfo.Column("selected", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTreamentHorarios.put("treatment_id", new TableInfo.Column("treatment_id", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTreamentHorarios.put("units", new TableInfo.Column("units", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTreamentHorarios = new HashSet<TableInfo.ForeignKey>(2);
        _foreignKeysTreamentHorarios.add(new TableInfo.ForeignKey("treament", "SET NULL", "NO ACTION",Arrays.asList("treatment_id"), Arrays.asList("id")));
        _foreignKeysTreamentHorarios.add(new TableInfo.ForeignKey("category", "SET NULL", "NO ACTION",Arrays.asList("category_id"), Arrays.asList("cate_id")));
        final HashSet<TableInfo.Index> _indicesTreamentHorarios = new HashSet<TableInfo.Index>(2);
        _indicesTreamentHorarios.add(new TableInfo.Index("index_treamentHorarios_category_id", false, Arrays.asList("category_id"), Arrays.asList("ASC")));
        _indicesTreamentHorarios.add(new TableInfo.Index("index_treamentHorarios_treatment_id", false, Arrays.asList("treatment_id"), Arrays.asList("ASC")));
        final TableInfo _infoTreamentHorarios = new TableInfo("treamentHorarios", _columnsTreamentHorarios, _foreignKeysTreamentHorarios, _indicesTreamentHorarios);
        final TableInfo _existingTreamentHorarios = TableInfo.read(_db, "treamentHorarios");
        if (! _infoTreamentHorarios.equals(_existingTreamentHorarios)) {
          return new RoomOpenHelper.ValidationResult(false, "treamentHorarios(com.sugarcoachpremium.data.database.repository.treament.TreamentHorarios).\n"
                  + " Expected:\n" + _infoTreamentHorarios + "\n"
                  + " Found:\n" + _existingTreamentHorarios);
        }
        final HashMap<String, TableInfo.Column> _columnsTreamentCorrectoraHorarios = new HashMap<String, TableInfo.Column>(4);
        _columnsTreamentCorrectoraHorarios.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTreamentCorrectoraHorarios.put("category_id", new TableInfo.Column("category_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTreamentCorrectoraHorarios.put("treatment_id", new TableInfo.Column("treatment_id", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTreamentCorrectoraHorarios.put("selected", new TableInfo.Column("selected", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTreamentCorrectoraHorarios = new HashSet<TableInfo.ForeignKey>(2);
        _foreignKeysTreamentCorrectoraHorarios.add(new TableInfo.ForeignKey("treament", "SET NULL", "NO ACTION",Arrays.asList("treatment_id"), Arrays.asList("id")));
        _foreignKeysTreamentCorrectoraHorarios.add(new TableInfo.ForeignKey("category", "SET NULL", "NO ACTION",Arrays.asList("category_id"), Arrays.asList("cate_id")));
        final HashSet<TableInfo.Index> _indicesTreamentCorrectoraHorarios = new HashSet<TableInfo.Index>(2);
        _indicesTreamentCorrectoraHorarios.add(new TableInfo.Index("index_treamentCorrectoraHorarios_category_id", false, Arrays.asList("category_id"), Arrays.asList("ASC")));
        _indicesTreamentCorrectoraHorarios.add(new TableInfo.Index("index_treamentCorrectoraHorarios_treatment_id", false, Arrays.asList("treatment_id"), Arrays.asList("ASC")));
        final TableInfo _infoTreamentCorrectoraHorarios = new TableInfo("treamentCorrectoraHorarios", _columnsTreamentCorrectoraHorarios, _foreignKeysTreamentCorrectoraHorarios, _indicesTreamentCorrectoraHorarios);
        final TableInfo _existingTreamentCorrectoraHorarios = TableInfo.read(_db, "treamentCorrectoraHorarios");
        if (! _infoTreamentCorrectoraHorarios.equals(_existingTreamentCorrectoraHorarios)) {
          return new RoomOpenHelper.ValidationResult(false, "treamentCorrectoraHorarios(com.sugarcoachpremium.data.database.repository.treament.TreamentCorrectoraHorarios).\n"
                  + " Expected:\n" + _infoTreamentCorrectoraHorarios + "\n"
                  + " Found:\n" + _existingTreamentCorrectoraHorarios);
        }
        final HashMap<String, TableInfo.Column> _columnsBasalInsuline = new HashMap<String, TableInfo.Column>(2);
        _columnsBasalInsuline.put("bid", new TableInfo.Column("bid", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBasalInsuline.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysBasalInsuline = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesBasalInsuline = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoBasalInsuline = new TableInfo("basal_insuline", _columnsBasalInsuline, _foreignKeysBasalInsuline, _indicesBasalInsuline);
        final TableInfo _existingBasalInsuline = TableInfo.read(_db, "basal_insuline");
        if (! _infoBasalInsuline.equals(_existingBasalInsuline)) {
          return new RoomOpenHelper.ValidationResult(false, "basal_insuline(com.sugarcoachpremium.data.database.repository.treament.BasalInsuline).\n"
                  + " Expected:\n" + _infoBasalInsuline + "\n"
                  + " Found:\n" + _existingBasalInsuline);
        }
        final HashMap<String, TableInfo.Column> _columnsCorrectoraInsuline = new HashMap<String, TableInfo.Column>(2);
        _columnsCorrectoraInsuline.put("cid", new TableInfo.Column("cid", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCorrectoraInsuline.put("cname", new TableInfo.Column("cname", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCorrectoraInsuline = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCorrectoraInsuline = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCorrectoraInsuline = new TableInfo("correctora_insuline", _columnsCorrectoraInsuline, _foreignKeysCorrectoraInsuline, _indicesCorrectoraInsuline);
        final TableInfo _existingCorrectoraInsuline = TableInfo.read(_db, "correctora_insuline");
        if (! _infoCorrectoraInsuline.equals(_existingCorrectoraInsuline)) {
          return new RoomOpenHelper.ValidationResult(false, "correctora_insuline(com.sugarcoachpremium.data.database.repository.treament.CorrectoraInsuline).\n"
                  + " Expected:\n" + _infoCorrectoraInsuline + "\n"
                  + " Found:\n" + _existingCorrectoraInsuline);
        }
        final HashMap<String, TableInfo.Column> _columnsCategory = new HashMap<String, TableInfo.Column>(2);
        _columnsCategory.put("cate_id", new TableInfo.Column("cate_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCategory.put("cate_name", new TableInfo.Column("cate_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCategory = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCategory = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCategory = new TableInfo("category", _columnsCategory, _foreignKeysCategory, _indicesCategory);
        final TableInfo _existingCategory = TableInfo.read(_db, "category");
        if (! _infoCategory.equals(_existingCategory)) {
          return new RoomOpenHelper.ValidationResult(false, "category(com.sugarcoachpremium.data.database.repository.dailyregister.Category).\n"
                  + " Expected:\n" + _infoCategory + "\n"
                  + " Found:\n" + _existingCategory);
        }
        final HashMap<String, TableInfo.Column> _columnsStates = new HashMap<String, TableInfo.Column>(3);
        _columnsStates.put("state_id", new TableInfo.Column("state_id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStates.put("state_name", new TableInfo.Column("state_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStates.put("state_icono", new TableInfo.Column("state_icono", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysStates = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesStates = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoStates = new TableInfo("states", _columnsStates, _foreignKeysStates, _indicesStates);
        final TableInfo _existingStates = TableInfo.read(_db, "states");
        if (! _infoStates.equals(_existingStates)) {
          return new RoomOpenHelper.ValidationResult(false, "states(com.sugarcoachpremium.data.database.repository.dailyregister.States).\n"
                  + " Expected:\n" + _infoStates + "\n"
                  + " Found:\n" + _existingStates);
        }
        final HashMap<String, TableInfo.Column> _columnsExercises = new HashMap<String, TableInfo.Column>(3);
        _columnsExercises.put("exercise_id", new TableInfo.Column("exercise_id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExercises.put("exercise_name", new TableInfo.Column("exercise_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExercises.put("exercise_icono", new TableInfo.Column("exercise_icono", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysExercises = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesExercises = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoExercises = new TableInfo("exercises", _columnsExercises, _foreignKeysExercises, _indicesExercises);
        final TableInfo _existingExercises = TableInfo.read(_db, "exercises");
        if (! _infoExercises.equals(_existingExercises)) {
          return new RoomOpenHelper.ValidationResult(false, "exercises(com.sugarcoachpremium.data.database.repository.dailyregister.Exercises).\n"
                  + " Expected:\n" + _infoExercises + "\n"
                  + " Found:\n" + _existingExercises);
        }
        final HashMap<String, TableInfo.Column> _columnsTreamentBasalHora = new HashMap<String, TableInfo.Column>(4);
        _columnsTreamentBasalHora.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTreamentBasalHora.put("time", new TableInfo.Column("time", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTreamentBasalHora.put("treatment_id", new TableInfo.Column("treatment_id", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTreamentBasalHora.put("units", new TableInfo.Column("units", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTreamentBasalHora = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysTreamentBasalHora.add(new TableInfo.ForeignKey("treament", "SET NULL", "NO ACTION",Arrays.asList("treatment_id"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesTreamentBasalHora = new HashSet<TableInfo.Index>(2);
        _indicesTreamentBasalHora.add(new TableInfo.Index("index_treament_basal_hora_time", false, Arrays.asList("time"), Arrays.asList("ASC")));
        _indicesTreamentBasalHora.add(new TableInfo.Index("index_treament_basal_hora_treatment_id", false, Arrays.asList("treatment_id"), Arrays.asList("ASC")));
        final TableInfo _infoTreamentBasalHora = new TableInfo("treament_basal_hora", _columnsTreamentBasalHora, _foreignKeysTreamentBasalHora, _indicesTreamentBasalHora);
        final TableInfo _existingTreamentBasalHora = TableInfo.read(_db, "treament_basal_hora");
        if (! _infoTreamentBasalHora.equals(_existingTreamentBasalHora)) {
          return new RoomOpenHelper.ValidationResult(false, "treament_basal_hora(com.sugarcoachpremium.data.database.repository.treament.TreamentBasalHora).\n"
                  + " Expected:\n" + _infoTreamentBasalHora + "\n"
                  + " Found:\n" + _existingTreamentBasalHora);
        }
        final HashMap<String, TableInfo.Column> _columnsMedidor = new HashMap<String, TableInfo.Column>(2);
        _columnsMedidor.put("mid", new TableInfo.Column("mid", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMedidor.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMedidor = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMedidor = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMedidor = new TableInfo("medidor", _columnsMedidor, _foreignKeysMedidor, _indicesMedidor);
        final TableInfo _existingMedidor = TableInfo.read(_db, "medidor");
        if (! _infoMedidor.equals(_existingMedidor)) {
          return new RoomOpenHelper.ValidationResult(false, "medidor(com.sugarcoachpremium.data.database.repository.treament.Medidor).\n"
                  + " Expected:\n" + _infoMedidor + "\n"
                  + " Found:\n" + _existingMedidor);
        }
        final HashMap<String, TableInfo.Column> _columnsBombaInfusora = new HashMap<String, TableInfo.Column>(2);
        _columnsBombaInfusora.put("boid", new TableInfo.Column("boid", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBombaInfusora.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysBombaInfusora = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesBombaInfusora = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoBombaInfusora = new TableInfo("bomba_infusora", _columnsBombaInfusora, _foreignKeysBombaInfusora, _indicesBombaInfusora);
        final TableInfo _existingBombaInfusora = TableInfo.read(_db, "bomba_infusora");
        if (! _infoBombaInfusora.equals(_existingBombaInfusora)) {
          return new RoomOpenHelper.ValidationResult(false, "bomba_infusora(com.sugarcoachpremium.data.database.repository.treament.BombaInfusora).\n"
                  + " Expected:\n" + _infoBombaInfusora + "\n"
                  + " Found:\n" + _existingBombaInfusora);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "5666e873ba6f716ac0d3c8ee56bcec09", "7e724b6ef4e4289cf7b2c59a8c34d3d5");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "daily_register","user","treament","treamentHorarios","treamentCorrectoraHorarios","basal_insuline","correctora_insuline","category","states","exercises","treament_basal_hora","medidor","bomba_infusora");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `daily_register`");
      _db.execSQL("DELETE FROM `user`");
      _db.execSQL("DELETE FROM `treament`");
      _db.execSQL("DELETE FROM `treamentHorarios`");
      _db.execSQL("DELETE FROM `treamentCorrectoraHorarios`");
      _db.execSQL("DELETE FROM `basal_insuline`");
      _db.execSQL("DELETE FROM `correctora_insuline`");
      _db.execSQL("DELETE FROM `category`");
      _db.execSQL("DELETE FROM `states`");
      _db.execSQL("DELETE FROM `exercises`");
      _db.execSQL("DELETE FROM `treament_basal_hora`");
      _db.execSQL("DELETE FROM `medidor`");
      _db.execSQL("DELETE FROM `bomba_infusora`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(TreamentDao.class, TreamentDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(UserDao.class, UserDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(DailyRegisterDao.class, DailyRegisterDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public TreamentDao treamentDao() {
    if (_treamentDao != null) {
      return _treamentDao;
    } else {
      synchronized(this) {
        if(_treamentDao == null) {
          _treamentDao = new TreamentDao_Impl(this);
        }
        return _treamentDao;
      }
    }
  }

  @Override
  public UserDao userDao() {
    if (_userDao != null) {
      return _userDao;
    } else {
      synchronized(this) {
        if(_userDao == null) {
          _userDao = new UserDao_Impl(this);
        }
        return _userDao;
      }
    }
  }

  @Override
  public DailyRegisterDao dailyRegisterDao() {
    if (_dailyRegisterDao != null) {
      return _dailyRegisterDao;
    } else {
      synchronized(this) {
        if(_dailyRegisterDao == null) {
          _dailyRegisterDao = new DailyRegisterDao_Impl(this);
        }
        return _dailyRegisterDao;
      }
    }
  }
}
