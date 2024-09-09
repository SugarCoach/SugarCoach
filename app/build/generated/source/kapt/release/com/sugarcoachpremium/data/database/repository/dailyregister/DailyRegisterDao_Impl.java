package com.sugarcoachpremium.data.database.repository.dailyregister;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.sugarcoachpremium.util.Converters;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class DailyRegisterDao_Impl implements DailyRegisterDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<DailyRegister> __insertionAdapterOfDailyRegister;

  private final Converters __converters = new Converters();

  private final EntityInsertionAdapter<Category> __insertionAdapterOfCategory;

  private final EntityInsertionAdapter<States> __insertionAdapterOfStates;

  private final EntityInsertionAdapter<Exercises> __insertionAdapterOfExercises;

  private final EntityDeletionOrUpdateAdapter<DailyRegister> __updateAdapterOfDailyRegister;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllRegister;

  private final SharedSQLiteStatement __preparedStmtOfDeleteRegister;

  public DailyRegisterDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDailyRegister = new EntityInsertionAdapter<DailyRegister>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `daily_register` (`id`,`idOnline`,`glucose`,`insulin`,`carbohydrates`,`emotional_state`,`exercise`,`category_id`,`comment`,`photo`,`online`,`created`,`dateS`,`basal`,`colors`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DailyRegister value) {
        stmt.bindLong(1, value.getId());
        if (value.getIdOnline() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getIdOnline());
        }
        if (value.getGlucose() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindDouble(3, value.getGlucose());
        }
        if (value.getInsulin() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindDouble(4, value.getInsulin());
        }
        if (value.getCarbohydrates() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindDouble(5, value.getCarbohydrates());
        }
        if (value.getEmotionalState() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getEmotionalState());
        }
        if (value.getExercise() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getExercise());
        }
        stmt.bindLong(8, value.getCategory_id());
        if (value.getComment() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getComment());
        }
        if (value.getPhoto() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getPhoto());
        }
        final Integer _tmp = value.getOnline() == null ? null : (value.getOnline() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindLong(11, _tmp);
        }
        final String _tmp_1 = __converters.fromOffsetDateTime(value.getCreated());
        if (_tmp_1 == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, _tmp_1);
        }
        if (value.getDateS() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getDateS());
        }
        if (value.getBasal() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindDouble(14, value.getBasal());
        }
        if (value.getColors() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getColors());
        }
      }
    };
    this.__insertionAdapterOfCategory = new EntityInsertionAdapter<Category>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `category` (`cate_id`,`cate_name`) VALUES (nullif(?, 0),?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Category value) {
        stmt.bindLong(1, value.getCate_id());
        if (value.getCate_name() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCate_name());
        }
      }
    };
    this.__insertionAdapterOfStates = new EntityInsertionAdapter<States>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `states` (`state_id`,`state_name`,`state_icono`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, States value) {
        if (value.getState_id() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getState_id());
        }
        if (value.getState_name() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getState_name());
        }
        if (value.getState_icono() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getState_icono());
        }
      }
    };
    this.__insertionAdapterOfExercises = new EntityInsertionAdapter<Exercises>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `exercises` (`exercise_id`,`exercise_name`,`exercise_icono`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Exercises value) {
        if (value.getExercise_id() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getExercise_id());
        }
        if (value.getExercise_name() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getExercise_name());
        }
        if (value.getExercise_icono() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getExercise_icono());
        }
      }
    };
    this.__updateAdapterOfDailyRegister = new EntityDeletionOrUpdateAdapter<DailyRegister>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `daily_register` SET `id` = ?,`idOnline` = ?,`glucose` = ?,`insulin` = ?,`carbohydrates` = ?,`emotional_state` = ?,`exercise` = ?,`category_id` = ?,`comment` = ?,`photo` = ?,`online` = ?,`created` = ?,`dateS` = ?,`basal` = ?,`colors` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DailyRegister value) {
        stmt.bindLong(1, value.getId());
        if (value.getIdOnline() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getIdOnline());
        }
        if (value.getGlucose() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindDouble(3, value.getGlucose());
        }
        if (value.getInsulin() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindDouble(4, value.getInsulin());
        }
        if (value.getCarbohydrates() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindDouble(5, value.getCarbohydrates());
        }
        if (value.getEmotionalState() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getEmotionalState());
        }
        if (value.getExercise() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getExercise());
        }
        stmt.bindLong(8, value.getCategory_id());
        if (value.getComment() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getComment());
        }
        if (value.getPhoto() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getPhoto());
        }
        final Integer _tmp = value.getOnline() == null ? null : (value.getOnline() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindLong(11, _tmp);
        }
        final String _tmp_1 = __converters.fromOffsetDateTime(value.getCreated());
        if (_tmp_1 == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, _tmp_1);
        }
        if (value.getDateS() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getDateS());
        }
        if (value.getBasal() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindDouble(14, value.getBasal());
        }
        if (value.getColors() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getColors());
        }
        stmt.bindLong(16, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAllRegister = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM daily_register";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteRegister = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM daily_register WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public void insert(final DailyRegister dailyRegister) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfDailyRegister.insert(dailyRegister);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(final List<DailyRegister> dailyRegister) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfDailyRegister.insert(dailyRegister);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAllCategories(final List<Category> category) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCategory.insert(category);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAllStates(final List<States> states) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfStates.insert(states);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAllExercices(final List<Exercises> exercises) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfExercises.insert(exercises);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final DailyRegister dailyRegister) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfDailyRegister.handle(dailyRegister);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAllRegister() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllRegister.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllRegister.release(_stmt);
    }
  }

  @Override
  public void deleteRegister(final int id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteRegister.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteRegister.release(_stmt);
    }
  }

  @Override
  public DailyRegisterCategory loadById(final int id) {
    final String _sql = "SELECT * FROM daily_register left join category on daily_register.category_id = category.cate_id WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfIdOnline = CursorUtil.getColumnIndexOrThrow(_cursor, "idOnline");
      final int _cursorIndexOfGlucose = CursorUtil.getColumnIndexOrThrow(_cursor, "glucose");
      final int _cursorIndexOfInsulin = CursorUtil.getColumnIndexOrThrow(_cursor, "insulin");
      final int _cursorIndexOfCarbohydrates = CursorUtil.getColumnIndexOrThrow(_cursor, "carbohydrates");
      final int _cursorIndexOfEmotionalState = CursorUtil.getColumnIndexOrThrow(_cursor, "emotional_state");
      final int _cursorIndexOfExercise = CursorUtil.getColumnIndexOrThrow(_cursor, "exercise");
      final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "category_id");
      final int _cursorIndexOfComment = CursorUtil.getColumnIndexOrThrow(_cursor, "comment");
      final int _cursorIndexOfPhoto = CursorUtil.getColumnIndexOrThrow(_cursor, "photo");
      final int _cursorIndexOfOnline = CursorUtil.getColumnIndexOrThrow(_cursor, "online");
      final int _cursorIndexOfCreated = CursorUtil.getColumnIndexOrThrow(_cursor, "created");
      final int _cursorIndexOfDateS = CursorUtil.getColumnIndexOrThrow(_cursor, "dateS");
      final int _cursorIndexOfBasal = CursorUtil.getColumnIndexOrThrow(_cursor, "basal");
      final int _cursorIndexOfColors = CursorUtil.getColumnIndexOrThrow(_cursor, "colors");
      final int _cursorIndexOfCateId = CursorUtil.getColumnIndexOrThrow(_cursor, "cate_id");
      final int _cursorIndexOfCateName = CursorUtil.getColumnIndexOrThrow(_cursor, "cate_name");
      final DailyRegisterCategory _result;
      if(_cursor.moveToFirst()) {
        final DailyRegister _tmpDailyRegister;
        if (!(_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfIdOnline) && _cursor.isNull(_cursorIndexOfGlucose) && _cursor.isNull(_cursorIndexOfInsulin) && _cursor.isNull(_cursorIndexOfCarbohydrates) && _cursor.isNull(_cursorIndexOfEmotionalState) && _cursor.isNull(_cursorIndexOfExercise) && _cursor.isNull(_cursorIndexOfCategoryId) && _cursor.isNull(_cursorIndexOfComment) && _cursor.isNull(_cursorIndexOfPhoto) && _cursor.isNull(_cursorIndexOfOnline) && _cursor.isNull(_cursorIndexOfCreated) && _cursor.isNull(_cursorIndexOfDateS) && _cursor.isNull(_cursorIndexOfBasal) && _cursor.isNull(_cursorIndexOfColors))) {
          final int _tmpId;
          _tmpId = _cursor.getInt(_cursorIndexOfId);
          final String _tmpIdOnline;
          if (_cursor.isNull(_cursorIndexOfIdOnline)) {
            _tmpIdOnline = null;
          } else {
            _tmpIdOnline = _cursor.getString(_cursorIndexOfIdOnline);
          }
          final Float _tmpGlucose;
          if (_cursor.isNull(_cursorIndexOfGlucose)) {
            _tmpGlucose = null;
          } else {
            _tmpGlucose = _cursor.getFloat(_cursorIndexOfGlucose);
          }
          final Float _tmpInsulin;
          if (_cursor.isNull(_cursorIndexOfInsulin)) {
            _tmpInsulin = null;
          } else {
            _tmpInsulin = _cursor.getFloat(_cursorIndexOfInsulin);
          }
          final Float _tmpCarbohydrates;
          if (_cursor.isNull(_cursorIndexOfCarbohydrates)) {
            _tmpCarbohydrates = null;
          } else {
            _tmpCarbohydrates = _cursor.getFloat(_cursorIndexOfCarbohydrates);
          }
          final String _tmpEmotionalState;
          if (_cursor.isNull(_cursorIndexOfEmotionalState)) {
            _tmpEmotionalState = null;
          } else {
            _tmpEmotionalState = _cursor.getString(_cursorIndexOfEmotionalState);
          }
          final String _tmpExercise;
          if (_cursor.isNull(_cursorIndexOfExercise)) {
            _tmpExercise = null;
          } else {
            _tmpExercise = _cursor.getString(_cursorIndexOfExercise);
          }
          final int _tmpCategory_id;
          _tmpCategory_id = _cursor.getInt(_cursorIndexOfCategoryId);
          final String _tmpComment;
          if (_cursor.isNull(_cursorIndexOfComment)) {
            _tmpComment = null;
          } else {
            _tmpComment = _cursor.getString(_cursorIndexOfComment);
          }
          final String _tmpPhoto;
          if (_cursor.isNull(_cursorIndexOfPhoto)) {
            _tmpPhoto = null;
          } else {
            _tmpPhoto = _cursor.getString(_cursorIndexOfPhoto);
          }
          final Boolean _tmpOnline;
          final Integer _tmp;
          if (_cursor.isNull(_cursorIndexOfOnline)) {
            _tmp = null;
          } else {
            _tmp = _cursor.getInt(_cursorIndexOfOnline);
          }
          _tmpOnline = _tmp == null ? null : _tmp != 0;
          final Date _tmpCreated;
          final String _tmp_1;
          if (_cursor.isNull(_cursorIndexOfCreated)) {
            _tmp_1 = null;
          } else {
            _tmp_1 = _cursor.getString(_cursorIndexOfCreated);
          }
          _tmpCreated = __converters.toOffsetDateTime(_tmp_1);
          final String _tmpDateS;
          if (_cursor.isNull(_cursorIndexOfDateS)) {
            _tmpDateS = null;
          } else {
            _tmpDateS = _cursor.getString(_cursorIndexOfDateS);
          }
          final Float _tmpBasal;
          if (_cursor.isNull(_cursorIndexOfBasal)) {
            _tmpBasal = null;
          } else {
            _tmpBasal = _cursor.getFloat(_cursorIndexOfBasal);
          }
          final String _tmpColors;
          if (_cursor.isNull(_cursorIndexOfColors)) {
            _tmpColors = null;
          } else {
            _tmpColors = _cursor.getString(_cursorIndexOfColors);
          }
          _tmpDailyRegister = new DailyRegister(_tmpId,_tmpIdOnline,_tmpGlucose,_tmpInsulin,_tmpCarbohydrates,_tmpEmotionalState,_tmpExercise,_tmpCategory_id,_tmpComment,_tmpPhoto,_tmpOnline,_tmpCreated,_tmpDateS,_tmpBasal,_tmpColors);
        } else {
          _tmpDailyRegister = null;
        }
        final Category _tmpCategory;
        if (!(_cursor.isNull(_cursorIndexOfCateId) && _cursor.isNull(_cursorIndexOfCateName))) {
          final int _tmpCate_id;
          _tmpCate_id = _cursor.getInt(_cursorIndexOfCateId);
          final String _tmpCate_name;
          if (_cursor.isNull(_cursorIndexOfCateName)) {
            _tmpCate_name = null;
          } else {
            _tmpCate_name = _cursor.getString(_cursorIndexOfCateName);
          }
          _tmpCategory = new Category(_tmpCate_id,_tmpCate_name);
        } else {
          _tmpCategory = null;
        }
        _result = new DailyRegisterCategory();
        _result.setDailyRegister(_tmpDailyRegister);
        _result.setCategory(_tmpCategory);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<DailyRegisterCategory> loadAll() {
    final String _sql = "SELECT * FROM daily_register left join category on daily_register.category_id = category.cate_id ORDER BY category_id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfIdOnline = CursorUtil.getColumnIndexOrThrow(_cursor, "idOnline");
      final int _cursorIndexOfGlucose = CursorUtil.getColumnIndexOrThrow(_cursor, "glucose");
      final int _cursorIndexOfInsulin = CursorUtil.getColumnIndexOrThrow(_cursor, "insulin");
      final int _cursorIndexOfCarbohydrates = CursorUtil.getColumnIndexOrThrow(_cursor, "carbohydrates");
      final int _cursorIndexOfEmotionalState = CursorUtil.getColumnIndexOrThrow(_cursor, "emotional_state");
      final int _cursorIndexOfExercise = CursorUtil.getColumnIndexOrThrow(_cursor, "exercise");
      final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "category_id");
      final int _cursorIndexOfComment = CursorUtil.getColumnIndexOrThrow(_cursor, "comment");
      final int _cursorIndexOfPhoto = CursorUtil.getColumnIndexOrThrow(_cursor, "photo");
      final int _cursorIndexOfOnline = CursorUtil.getColumnIndexOrThrow(_cursor, "online");
      final int _cursorIndexOfCreated = CursorUtil.getColumnIndexOrThrow(_cursor, "created");
      final int _cursorIndexOfDateS = CursorUtil.getColumnIndexOrThrow(_cursor, "dateS");
      final int _cursorIndexOfBasal = CursorUtil.getColumnIndexOrThrow(_cursor, "basal");
      final int _cursorIndexOfColors = CursorUtil.getColumnIndexOrThrow(_cursor, "colors");
      final int _cursorIndexOfCateId = CursorUtil.getColumnIndexOrThrow(_cursor, "cate_id");
      final int _cursorIndexOfCateName = CursorUtil.getColumnIndexOrThrow(_cursor, "cate_name");
      final List<DailyRegisterCategory> _result = new ArrayList<DailyRegisterCategory>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final DailyRegisterCategory _item;
        final DailyRegister _tmpDailyRegister;
        if (!(_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfIdOnline) && _cursor.isNull(_cursorIndexOfGlucose) && _cursor.isNull(_cursorIndexOfInsulin) && _cursor.isNull(_cursorIndexOfCarbohydrates) && _cursor.isNull(_cursorIndexOfEmotionalState) && _cursor.isNull(_cursorIndexOfExercise) && _cursor.isNull(_cursorIndexOfCategoryId) && _cursor.isNull(_cursorIndexOfComment) && _cursor.isNull(_cursorIndexOfPhoto) && _cursor.isNull(_cursorIndexOfOnline) && _cursor.isNull(_cursorIndexOfCreated) && _cursor.isNull(_cursorIndexOfDateS) && _cursor.isNull(_cursorIndexOfBasal) && _cursor.isNull(_cursorIndexOfColors))) {
          final int _tmpId;
          _tmpId = _cursor.getInt(_cursorIndexOfId);
          final String _tmpIdOnline;
          if (_cursor.isNull(_cursorIndexOfIdOnline)) {
            _tmpIdOnline = null;
          } else {
            _tmpIdOnline = _cursor.getString(_cursorIndexOfIdOnline);
          }
          final Float _tmpGlucose;
          if (_cursor.isNull(_cursorIndexOfGlucose)) {
            _tmpGlucose = null;
          } else {
            _tmpGlucose = _cursor.getFloat(_cursorIndexOfGlucose);
          }
          final Float _tmpInsulin;
          if (_cursor.isNull(_cursorIndexOfInsulin)) {
            _tmpInsulin = null;
          } else {
            _tmpInsulin = _cursor.getFloat(_cursorIndexOfInsulin);
          }
          final Float _tmpCarbohydrates;
          if (_cursor.isNull(_cursorIndexOfCarbohydrates)) {
            _tmpCarbohydrates = null;
          } else {
            _tmpCarbohydrates = _cursor.getFloat(_cursorIndexOfCarbohydrates);
          }
          final String _tmpEmotionalState;
          if (_cursor.isNull(_cursorIndexOfEmotionalState)) {
            _tmpEmotionalState = null;
          } else {
            _tmpEmotionalState = _cursor.getString(_cursorIndexOfEmotionalState);
          }
          final String _tmpExercise;
          if (_cursor.isNull(_cursorIndexOfExercise)) {
            _tmpExercise = null;
          } else {
            _tmpExercise = _cursor.getString(_cursorIndexOfExercise);
          }
          final int _tmpCategory_id;
          _tmpCategory_id = _cursor.getInt(_cursorIndexOfCategoryId);
          final String _tmpComment;
          if (_cursor.isNull(_cursorIndexOfComment)) {
            _tmpComment = null;
          } else {
            _tmpComment = _cursor.getString(_cursorIndexOfComment);
          }
          final String _tmpPhoto;
          if (_cursor.isNull(_cursorIndexOfPhoto)) {
            _tmpPhoto = null;
          } else {
            _tmpPhoto = _cursor.getString(_cursorIndexOfPhoto);
          }
          final Boolean _tmpOnline;
          final Integer _tmp;
          if (_cursor.isNull(_cursorIndexOfOnline)) {
            _tmp = null;
          } else {
            _tmp = _cursor.getInt(_cursorIndexOfOnline);
          }
          _tmpOnline = _tmp == null ? null : _tmp != 0;
          final Date _tmpCreated;
          final String _tmp_1;
          if (_cursor.isNull(_cursorIndexOfCreated)) {
            _tmp_1 = null;
          } else {
            _tmp_1 = _cursor.getString(_cursorIndexOfCreated);
          }
          _tmpCreated = __converters.toOffsetDateTime(_tmp_1);
          final String _tmpDateS;
          if (_cursor.isNull(_cursorIndexOfDateS)) {
            _tmpDateS = null;
          } else {
            _tmpDateS = _cursor.getString(_cursorIndexOfDateS);
          }
          final Float _tmpBasal;
          if (_cursor.isNull(_cursorIndexOfBasal)) {
            _tmpBasal = null;
          } else {
            _tmpBasal = _cursor.getFloat(_cursorIndexOfBasal);
          }
          final String _tmpColors;
          if (_cursor.isNull(_cursorIndexOfColors)) {
            _tmpColors = null;
          } else {
            _tmpColors = _cursor.getString(_cursorIndexOfColors);
          }
          _tmpDailyRegister = new DailyRegister(_tmpId,_tmpIdOnline,_tmpGlucose,_tmpInsulin,_tmpCarbohydrates,_tmpEmotionalState,_tmpExercise,_tmpCategory_id,_tmpComment,_tmpPhoto,_tmpOnline,_tmpCreated,_tmpDateS,_tmpBasal,_tmpColors);
        } else {
          _tmpDailyRegister = null;
        }
        final Category _tmpCategory;
        if (!(_cursor.isNull(_cursorIndexOfCateId) && _cursor.isNull(_cursorIndexOfCateName))) {
          final int _tmpCate_id;
          _tmpCate_id = _cursor.getInt(_cursorIndexOfCateId);
          final String _tmpCate_name;
          if (_cursor.isNull(_cursorIndexOfCateName)) {
            _tmpCate_name = null;
          } else {
            _tmpCate_name = _cursor.getString(_cursorIndexOfCateName);
          }
          _tmpCategory = new Category(_tmpCate_id,_tmpCate_name);
        } else {
          _tmpCategory = null;
        }
        _item = new DailyRegisterCategory();
        _item.setDailyRegister(_tmpDailyRegister);
        _item.setCategory(_tmpCategory);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Category> loadAllCategories() {
    final String _sql = "SELECT * FROM category";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfCateId = CursorUtil.getColumnIndexOrThrow(_cursor, "cate_id");
      final int _cursorIndexOfCateName = CursorUtil.getColumnIndexOrThrow(_cursor, "cate_name");
      final List<Category> _result = new ArrayList<Category>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Category _item;
        final int _tmpCate_id;
        _tmpCate_id = _cursor.getInt(_cursorIndexOfCateId);
        final String _tmpCate_name;
        if (_cursor.isNull(_cursorIndexOfCateName)) {
          _tmpCate_name = null;
        } else {
          _tmpCate_name = _cursor.getString(_cursorIndexOfCateName);
        }
        _item = new Category(_tmpCate_id,_tmpCate_name);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<States> loadAllStates() {
    final String _sql = "SELECT * FROM states";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfStateId = CursorUtil.getColumnIndexOrThrow(_cursor, "state_id");
      final int _cursorIndexOfStateName = CursorUtil.getColumnIndexOrThrow(_cursor, "state_name");
      final int _cursorIndexOfStateIcono = CursorUtil.getColumnIndexOrThrow(_cursor, "state_icono");
      final List<States> _result = new ArrayList<States>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final States _item;
        final String _tmpState_id;
        if (_cursor.isNull(_cursorIndexOfStateId)) {
          _tmpState_id = null;
        } else {
          _tmpState_id = _cursor.getString(_cursorIndexOfStateId);
        }
        final String _tmpState_name;
        if (_cursor.isNull(_cursorIndexOfStateName)) {
          _tmpState_name = null;
        } else {
          _tmpState_name = _cursor.getString(_cursorIndexOfStateName);
        }
        final String _tmpState_icono;
        if (_cursor.isNull(_cursorIndexOfStateIcono)) {
          _tmpState_icono = null;
        } else {
          _tmpState_icono = _cursor.getString(_cursorIndexOfStateIcono);
        }
        _item = new States(_tmpState_id,_tmpState_name,_tmpState_icono);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Exercises> loadAllExercises() {
    final String _sql = "SELECT * FROM exercises";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfExerciseId = CursorUtil.getColumnIndexOrThrow(_cursor, "exercise_id");
      final int _cursorIndexOfExerciseName = CursorUtil.getColumnIndexOrThrow(_cursor, "exercise_name");
      final int _cursorIndexOfExerciseIcono = CursorUtil.getColumnIndexOrThrow(_cursor, "exercise_icono");
      final List<Exercises> _result = new ArrayList<Exercises>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Exercises _item;
        final String _tmpExercise_id;
        if (_cursor.isNull(_cursorIndexOfExerciseId)) {
          _tmpExercise_id = null;
        } else {
          _tmpExercise_id = _cursor.getString(_cursorIndexOfExerciseId);
        }
        final String _tmpExercise_name;
        if (_cursor.isNull(_cursorIndexOfExerciseName)) {
          _tmpExercise_name = null;
        } else {
          _tmpExercise_name = _cursor.getString(_cursorIndexOfExerciseName);
        }
        final String _tmpExercise_icono;
        if (_cursor.isNull(_cursorIndexOfExerciseIcono)) {
          _tmpExercise_icono = null;
        } else {
          _tmpExercise_icono = _cursor.getString(_cursorIndexOfExerciseIcono);
        }
        _item = new Exercises(_tmpExercise_id,_tmpExercise_name,_tmpExercise_icono);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public DailyRegisterCategory loadLast() {
    final String _sql = "SELECT * FROM daily_register left join category on daily_register.category_id = category.cate_id ORDER BY date(created) desc, category_id DESC LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfIdOnline = CursorUtil.getColumnIndexOrThrow(_cursor, "idOnline");
      final int _cursorIndexOfGlucose = CursorUtil.getColumnIndexOrThrow(_cursor, "glucose");
      final int _cursorIndexOfInsulin = CursorUtil.getColumnIndexOrThrow(_cursor, "insulin");
      final int _cursorIndexOfCarbohydrates = CursorUtil.getColumnIndexOrThrow(_cursor, "carbohydrates");
      final int _cursorIndexOfEmotionalState = CursorUtil.getColumnIndexOrThrow(_cursor, "emotional_state");
      final int _cursorIndexOfExercise = CursorUtil.getColumnIndexOrThrow(_cursor, "exercise");
      final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "category_id");
      final int _cursorIndexOfComment = CursorUtil.getColumnIndexOrThrow(_cursor, "comment");
      final int _cursorIndexOfPhoto = CursorUtil.getColumnIndexOrThrow(_cursor, "photo");
      final int _cursorIndexOfOnline = CursorUtil.getColumnIndexOrThrow(_cursor, "online");
      final int _cursorIndexOfCreated = CursorUtil.getColumnIndexOrThrow(_cursor, "created");
      final int _cursorIndexOfDateS = CursorUtil.getColumnIndexOrThrow(_cursor, "dateS");
      final int _cursorIndexOfBasal = CursorUtil.getColumnIndexOrThrow(_cursor, "basal");
      final int _cursorIndexOfColors = CursorUtil.getColumnIndexOrThrow(_cursor, "colors");
      final int _cursorIndexOfCateId = CursorUtil.getColumnIndexOrThrow(_cursor, "cate_id");
      final int _cursorIndexOfCateName = CursorUtil.getColumnIndexOrThrow(_cursor, "cate_name");
      final DailyRegisterCategory _result;
      if(_cursor.moveToFirst()) {
        final DailyRegister _tmpDailyRegister;
        if (!(_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfIdOnline) && _cursor.isNull(_cursorIndexOfGlucose) && _cursor.isNull(_cursorIndexOfInsulin) && _cursor.isNull(_cursorIndexOfCarbohydrates) && _cursor.isNull(_cursorIndexOfEmotionalState) && _cursor.isNull(_cursorIndexOfExercise) && _cursor.isNull(_cursorIndexOfCategoryId) && _cursor.isNull(_cursorIndexOfComment) && _cursor.isNull(_cursorIndexOfPhoto) && _cursor.isNull(_cursorIndexOfOnline) && _cursor.isNull(_cursorIndexOfCreated) && _cursor.isNull(_cursorIndexOfDateS) && _cursor.isNull(_cursorIndexOfBasal) && _cursor.isNull(_cursorIndexOfColors))) {
          final int _tmpId;
          _tmpId = _cursor.getInt(_cursorIndexOfId);
          final String _tmpIdOnline;
          if (_cursor.isNull(_cursorIndexOfIdOnline)) {
            _tmpIdOnline = null;
          } else {
            _tmpIdOnline = _cursor.getString(_cursorIndexOfIdOnline);
          }
          final Float _tmpGlucose;
          if (_cursor.isNull(_cursorIndexOfGlucose)) {
            _tmpGlucose = null;
          } else {
            _tmpGlucose = _cursor.getFloat(_cursorIndexOfGlucose);
          }
          final Float _tmpInsulin;
          if (_cursor.isNull(_cursorIndexOfInsulin)) {
            _tmpInsulin = null;
          } else {
            _tmpInsulin = _cursor.getFloat(_cursorIndexOfInsulin);
          }
          final Float _tmpCarbohydrates;
          if (_cursor.isNull(_cursorIndexOfCarbohydrates)) {
            _tmpCarbohydrates = null;
          } else {
            _tmpCarbohydrates = _cursor.getFloat(_cursorIndexOfCarbohydrates);
          }
          final String _tmpEmotionalState;
          if (_cursor.isNull(_cursorIndexOfEmotionalState)) {
            _tmpEmotionalState = null;
          } else {
            _tmpEmotionalState = _cursor.getString(_cursorIndexOfEmotionalState);
          }
          final String _tmpExercise;
          if (_cursor.isNull(_cursorIndexOfExercise)) {
            _tmpExercise = null;
          } else {
            _tmpExercise = _cursor.getString(_cursorIndexOfExercise);
          }
          final int _tmpCategory_id;
          _tmpCategory_id = _cursor.getInt(_cursorIndexOfCategoryId);
          final String _tmpComment;
          if (_cursor.isNull(_cursorIndexOfComment)) {
            _tmpComment = null;
          } else {
            _tmpComment = _cursor.getString(_cursorIndexOfComment);
          }
          final String _tmpPhoto;
          if (_cursor.isNull(_cursorIndexOfPhoto)) {
            _tmpPhoto = null;
          } else {
            _tmpPhoto = _cursor.getString(_cursorIndexOfPhoto);
          }
          final Boolean _tmpOnline;
          final Integer _tmp;
          if (_cursor.isNull(_cursorIndexOfOnline)) {
            _tmp = null;
          } else {
            _tmp = _cursor.getInt(_cursorIndexOfOnline);
          }
          _tmpOnline = _tmp == null ? null : _tmp != 0;
          final Date _tmpCreated;
          final String _tmp_1;
          if (_cursor.isNull(_cursorIndexOfCreated)) {
            _tmp_1 = null;
          } else {
            _tmp_1 = _cursor.getString(_cursorIndexOfCreated);
          }
          _tmpCreated = __converters.toOffsetDateTime(_tmp_1);
          final String _tmpDateS;
          if (_cursor.isNull(_cursorIndexOfDateS)) {
            _tmpDateS = null;
          } else {
            _tmpDateS = _cursor.getString(_cursorIndexOfDateS);
          }
          final Float _tmpBasal;
          if (_cursor.isNull(_cursorIndexOfBasal)) {
            _tmpBasal = null;
          } else {
            _tmpBasal = _cursor.getFloat(_cursorIndexOfBasal);
          }
          final String _tmpColors;
          if (_cursor.isNull(_cursorIndexOfColors)) {
            _tmpColors = null;
          } else {
            _tmpColors = _cursor.getString(_cursorIndexOfColors);
          }
          _tmpDailyRegister = new DailyRegister(_tmpId,_tmpIdOnline,_tmpGlucose,_tmpInsulin,_tmpCarbohydrates,_tmpEmotionalState,_tmpExercise,_tmpCategory_id,_tmpComment,_tmpPhoto,_tmpOnline,_tmpCreated,_tmpDateS,_tmpBasal,_tmpColors);
        } else {
          _tmpDailyRegister = null;
        }
        final Category _tmpCategory;
        if (!(_cursor.isNull(_cursorIndexOfCateId) && _cursor.isNull(_cursorIndexOfCateName))) {
          final int _tmpCate_id;
          _tmpCate_id = _cursor.getInt(_cursorIndexOfCateId);
          final String _tmpCate_name;
          if (_cursor.isNull(_cursorIndexOfCateName)) {
            _tmpCate_name = null;
          } else {
            _tmpCate_name = _cursor.getString(_cursorIndexOfCateName);
          }
          _tmpCategory = new Category(_tmpCate_id,_tmpCate_name);
        } else {
          _tmpCategory = null;
        }
        _result = new DailyRegisterCategory();
        _result.setDailyRegister(_tmpDailyRegister);
        _result.setCategory(_tmpCategory);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public DailyRegisterAverages loadAverages() {
    final String _sql = "SELECT MIN(glucose) as min, MAX(glucose) as max, AVG(glucose) as promedio   FROM daily_register";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfMin = 0;
      final int _cursorIndexOfMax = 1;
      final int _cursorIndexOfPromedio = 2;
      final DailyRegisterAverages _result;
      if(_cursor.moveToFirst()) {
        final float _tmpMin;
        _tmpMin = _cursor.getFloat(_cursorIndexOfMin);
        final float _tmpMax;
        _tmpMax = _cursor.getFloat(_cursorIndexOfMax);
        final float _tmpPromedio;
        _tmpPromedio = _cursor.getFloat(_cursorIndexOfPromedio);
        _result = new DailyRegisterAverages(_tmpMin,_tmpMax,_tmpPromedio);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public DailyRegisterAverages loadAveragesLastDays(final float hypo, final float hyper) {
    final String _sql = "SELECT avg(case when glucose BETWEEN 0 and ? then glucose end) as min, avg(case when glucose > ? and glucose <= ? then glucose end) as promedio, avg(case when glucose > ? then glucose end) as max from daily_register WHERE DATE(created) BETWEEN datetime('now', '-30 days') AND datetime('now')";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 4);
    int _argIndex = 1;
    _statement.bindDouble(_argIndex, hypo);
    _argIndex = 2;
    _statement.bindDouble(_argIndex, hypo);
    _argIndex = 3;
    _statement.bindDouble(_argIndex, hyper);
    _argIndex = 4;
    _statement.bindDouble(_argIndex, hyper);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfMin = 0;
      final int _cursorIndexOfPromedio = 1;
      final int _cursorIndexOfMax = 2;
      final DailyRegisterAverages _result;
      if(_cursor.moveToFirst()) {
        final float _tmpMin;
        _tmpMin = _cursor.getFloat(_cursorIndexOfMin);
        final float _tmpPromedio;
        _tmpPromedio = _cursor.getFloat(_cursorIndexOfPromedio);
        final float _tmpMax;
        _tmpMax = _cursor.getFloat(_cursorIndexOfMax);
        _result = new DailyRegisterAverages(_tmpMin,_tmpMax,_tmpPromedio);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public DailyRegisterAverages loadAveragesWeek(final float hypo, final float hyper,
      final String start, final String end) {
    final String _sql = "SELECT avg(case when glucose BETWEEN 0 and ? then glucose end) as min, avg(case when glucose > ? and glucose <= ? then glucose end) as promedio, avg(case when glucose > ? then glucose end) as max  FROM daily_register WHERE DATE(created) BETWEEN datetime(?) AND datetime(?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 6);
    int _argIndex = 1;
    _statement.bindDouble(_argIndex, hypo);
    _argIndex = 2;
    _statement.bindDouble(_argIndex, hypo);
    _argIndex = 3;
    _statement.bindDouble(_argIndex, hyper);
    _argIndex = 4;
    _statement.bindDouble(_argIndex, hyper);
    _argIndex = 5;
    if (start == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, start);
    }
    _argIndex = 6;
    if (end == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, end);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfMin = 0;
      final int _cursorIndexOfPromedio = 1;
      final int _cursorIndexOfMax = 2;
      final DailyRegisterAverages _result;
      if(_cursor.moveToFirst()) {
        final float _tmpMin;
        _tmpMin = _cursor.getFloat(_cursorIndexOfMin);
        final float _tmpPromedio;
        _tmpPromedio = _cursor.getFloat(_cursorIndexOfPromedio);
        final float _tmpMax;
        _tmpMax = _cursor.getFloat(_cursorIndexOfMax);
        _result = new DailyRegisterAverages(_tmpMin,_tmpMax,_tmpPromedio);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public DailyRegisterInsuline loadInsuline(final int breakfast_id, final int snack_id,
      final int lunch_id, final int dinner_id, final String date) {
    final String _sql = "SELECT avg(case when category_id = ? then insulin end) as breakfast, avg(case when category_id = ? then insulin end) as snack, avg(case when category_id = ? then insulin end) as lunch, avg(case when category_id = ? then insulin end) as dinner FROM daily_register WHERE DATE(created) = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 5);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, breakfast_id);
    _argIndex = 2;
    _statement.bindLong(_argIndex, snack_id);
    _argIndex = 3;
    _statement.bindLong(_argIndex, lunch_id);
    _argIndex = 4;
    _statement.bindLong(_argIndex, dinner_id);
    _argIndex = 5;
    if (date == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, date);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfBreakfast = 0;
      final int _cursorIndexOfSnack = 1;
      final int _cursorIndexOfLunch = 2;
      final int _cursorIndexOfDinner = 3;
      final DailyRegisterInsuline _result;
      if(_cursor.moveToFirst()) {
        final float _tmpBreakfast;
        _tmpBreakfast = _cursor.getFloat(_cursorIndexOfBreakfast);
        final float _tmpSnack;
        _tmpSnack = _cursor.getFloat(_cursorIndexOfSnack);
        final float _tmpLunch;
        _tmpLunch = _cursor.getFloat(_cursorIndexOfLunch);
        final float _tmpDinner;
        _tmpDinner = _cursor.getFloat(_cursorIndexOfDinner);
        _result = new DailyRegisterInsuline(_tmpBreakfast,_tmpSnack,_tmpLunch,_tmpDinner);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public DailyRegisterCar loadCar(final int breakfast_id, final int snack_id, final int lunch_id,
      final int dinner_id, final String date) {
    final String _sql = "SELECT avg(case when category_id = ? then carbohydrates end) as breakfast, avg(case when category_id = ? then carbohydrates end) as snack, avg(case when category_id = ? then carbohydrates end) as lunch, avg(case when category_id = ? then carbohydrates end) as dinner FROM daily_register WHERE DATE(created) = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 5);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, breakfast_id);
    _argIndex = 2;
    _statement.bindLong(_argIndex, snack_id);
    _argIndex = 3;
    _statement.bindLong(_argIndex, lunch_id);
    _argIndex = 4;
    _statement.bindLong(_argIndex, dinner_id);
    _argIndex = 5;
    if (date == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, date);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfBreakfast = 0;
      final int _cursorIndexOfSnack = 1;
      final int _cursorIndexOfLunch = 2;
      final int _cursorIndexOfDinner = 3;
      final DailyRegisterCar _result;
      if(_cursor.moveToFirst()) {
        final float _tmpBreakfast;
        _tmpBreakfast = _cursor.getFloat(_cursorIndexOfBreakfast);
        final float _tmpSnack;
        _tmpSnack = _cursor.getFloat(_cursorIndexOfSnack);
        final float _tmpLunch;
        _tmpLunch = _cursor.getFloat(_cursorIndexOfLunch);
        final float _tmpDinner;
        _tmpDinner = _cursor.getFloat(_cursorIndexOfDinner);
        _result = new DailyRegisterCar(_tmpBreakfast,_tmpSnack,_tmpLunch,_tmpDinner);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public DailyRegisterExercisesStates loadExercisesDays(final String type1, final String type2,
      final String type3, final String type4) {
    final String _sql = "SELECT count(case when exercise = ? then 1 end) as value, count(case when exercise = ? then 1 end) as value2, COUNT(case when exercise = ? then 1 end) as value3, COUNT(case when exercise = ? then 1 end) as value4 from daily_register WHERE DATE(created) BETWEEN datetime('now', '-30 days') AND datetime('now')";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 4);
    int _argIndex = 1;
    if (type1 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, type1);
    }
    _argIndex = 2;
    if (type2 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, type2);
    }
    _argIndex = 3;
    if (type3 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, type3);
    }
    _argIndex = 4;
    if (type4 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, type4);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfValue = 0;
      final int _cursorIndexOfValue2 = 1;
      final int _cursorIndexOfValue3 = 2;
      final int _cursorIndexOfValue4 = 3;
      final DailyRegisterExercisesStates _result;
      if(_cursor.moveToFirst()) {
        final float _tmpValue;
        _tmpValue = _cursor.getFloat(_cursorIndexOfValue);
        final float _tmpValue2;
        _tmpValue2 = _cursor.getFloat(_cursorIndexOfValue2);
        final float _tmpValue3;
        _tmpValue3 = _cursor.getFloat(_cursorIndexOfValue3);
        final float _tmpValue4;
        _tmpValue4 = _cursor.getFloat(_cursorIndexOfValue4);
        _result = new DailyRegisterExercisesStates(_tmpValue,_tmpValue2,_tmpValue3,_tmpValue4);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public DailyRegisterExercisesStates loadExercisesWeek(final String type1, final String type2,
      final String type3, final String type4, final String start, final String end) {
    final String _sql = "SELECT count(case when exercise = ? then 1 end) as value, count(case when exercise = ? then 1 end) as value2, COUNT(case when exercise = ? then 1 end) as value3, COUNT(case when exercise = ? then 1 end) as value4  FROM daily_register WHERE DATE(created) BETWEEN datetime(?) AND datetime(?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 6);
    int _argIndex = 1;
    if (type1 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, type1);
    }
    _argIndex = 2;
    if (type2 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, type2);
    }
    _argIndex = 3;
    if (type3 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, type3);
    }
    _argIndex = 4;
    if (type4 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, type4);
    }
    _argIndex = 5;
    if (start == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, start);
    }
    _argIndex = 6;
    if (end == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, end);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfValue = 0;
      final int _cursorIndexOfValue2 = 1;
      final int _cursorIndexOfValue3 = 2;
      final int _cursorIndexOfValue4 = 3;
      final DailyRegisterExercisesStates _result;
      if(_cursor.moveToFirst()) {
        final float _tmpValue;
        _tmpValue = _cursor.getFloat(_cursorIndexOfValue);
        final float _tmpValue2;
        _tmpValue2 = _cursor.getFloat(_cursorIndexOfValue2);
        final float _tmpValue3;
        _tmpValue3 = _cursor.getFloat(_cursorIndexOfValue3);
        final float _tmpValue4;
        _tmpValue4 = _cursor.getFloat(_cursorIndexOfValue4);
        _result = new DailyRegisterExercisesStates(_tmpValue,_tmpValue2,_tmpValue3,_tmpValue4);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public DailyRegisterExercisesStates loadStatesDays(final String type1, final String type2,
      final String type3, final String type4) {
    final String _sql = "SELECT count(case when emotional_state = ? then 1 end) as value, count(case when emotional_state = ? then 1 end) as value2, COUNT(case when emotional_state = ? then 1 end) as value3, COUNT(case when emotional_state = ? then 1 end) as value4 from daily_register WHERE DATE(created) BETWEEN datetime('now', '-30 days') AND datetime('now')";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 4);
    int _argIndex = 1;
    if (type1 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, type1);
    }
    _argIndex = 2;
    if (type2 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, type2);
    }
    _argIndex = 3;
    if (type3 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, type3);
    }
    _argIndex = 4;
    if (type4 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, type4);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfValue = 0;
      final int _cursorIndexOfValue2 = 1;
      final int _cursorIndexOfValue3 = 2;
      final int _cursorIndexOfValue4 = 3;
      final DailyRegisterExercisesStates _result;
      if(_cursor.moveToFirst()) {
        final float _tmpValue;
        _tmpValue = _cursor.getFloat(_cursorIndexOfValue);
        final float _tmpValue2;
        _tmpValue2 = _cursor.getFloat(_cursorIndexOfValue2);
        final float _tmpValue3;
        _tmpValue3 = _cursor.getFloat(_cursorIndexOfValue3);
        final float _tmpValue4;
        _tmpValue4 = _cursor.getFloat(_cursorIndexOfValue4);
        _result = new DailyRegisterExercisesStates(_tmpValue,_tmpValue2,_tmpValue3,_tmpValue4);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public DailyRegisterExercisesStates loadStatesWeek(final String type1, final String type2,
      final String type3, final String type4, final String start, final String end) {
    final String _sql = "SELECT count(case when emotional_state = ? then 1 end) as value, count(case when emotional_state = ? then 1 end) as value2, COUNT(case when emotional_state = ? then 1 end) as value3, COUNT(case when emotional_state = ? then 1 end) as value4  FROM daily_register WHERE DATE(created) BETWEEN datetime(?) AND datetime(?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 6);
    int _argIndex = 1;
    if (type1 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, type1);
    }
    _argIndex = 2;
    if (type2 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, type2);
    }
    _argIndex = 3;
    if (type3 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, type3);
    }
    _argIndex = 4;
    if (type4 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, type4);
    }
    _argIndex = 5;
    if (start == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, start);
    }
    _argIndex = 6;
    if (end == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, end);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfValue = 0;
      final int _cursorIndexOfValue2 = 1;
      final int _cursorIndexOfValue3 = 2;
      final int _cursorIndexOfValue4 = 3;
      final DailyRegisterExercisesStates _result;
      if(_cursor.moveToFirst()) {
        final float _tmpValue;
        _tmpValue = _cursor.getFloat(_cursorIndexOfValue);
        final float _tmpValue2;
        _tmpValue2 = _cursor.getFloat(_cursorIndexOfValue2);
        final float _tmpValue3;
        _tmpValue3 = _cursor.getFloat(_cursorIndexOfValue3);
        final float _tmpValue4;
        _tmpValue4 = _cursor.getFloat(_cursorIndexOfValue4);
        _result = new DailyRegisterExercisesStates(_tmpValue,_tmpValue2,_tmpValue3,_tmpValue4);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Date> loadDates() {
    final String _sql = "SELECT created as fecha FROM daily_register group by DATE(created) ORDER BY date(created) DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final List<Date> _result = new ArrayList<Date>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Date _item;
        final String _tmp;
        if (_cursor.isNull(0)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(0);
        }
        _item = __converters.toOffsetDateTime(_tmp);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int registersOffline() {
    final String _sql = "SELECT count(id) FROM daily_register where online = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
