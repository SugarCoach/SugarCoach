package com.sugarcoachpremium.data.database.repository.treament;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.sugarcoachpremium.data.database.repository.dailyregister.Category;
import com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterInsuline;
import com.sugarcoachpremium.util.Converters;
import java.lang.Boolean;
import java.lang.Class;
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
public final class TreamentDao_Impl implements TreamentDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Treament> __insertionAdapterOfTreament;

  private final Converters __converters = new Converters();

  private final EntityInsertionAdapter<TreamentHorarios> __insertionAdapterOfTreamentHorarios;

  private final EntityInsertionAdapter<TreamentBasalHora> __insertionAdapterOfTreamentBasalHora;

  private final EntityInsertionAdapter<TreamentCorrectoraHorarios> __insertionAdapterOfTreamentCorrectoraHorarios;

  private final EntityInsertionAdapter<BasalInsuline> __insertionAdapterOfBasalInsuline;

  private final EntityInsertionAdapter<Medidor> __insertionAdapterOfMedidor;

  private final EntityInsertionAdapter<BombaInfusora> __insertionAdapterOfBombaInfusora;

  private final EntityInsertionAdapter<CorrectoraInsuline> __insertionAdapterOfCorrectoraInsuline;

  private final EntityDeletionOrUpdateAdapter<Treament> __updateAdapterOfTreament;

  private final EntityDeletionOrUpdateAdapter<TreamentHorarios> __updateAdapterOfTreamentHorarios;

  private final EntityDeletionOrUpdateAdapter<TreamentBasalHora> __updateAdapterOfTreamentBasalHora;

  private final EntityDeletionOrUpdateAdapter<TreamentCorrectoraHorarios> __updateAdapterOfTreamentCorrectoraHorarios;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllCategoryCorrectora;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllCategory;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllTreatment;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllTreatmentBasalHora;

  public TreamentDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTreament = new EntityInsertionAdapter<Treament>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `treament` (`id`,`bomb`,`object_glucose`,`correctora_unit`,`hipoglucose`,`hyperglucose`,`basal_id`,`medidor_id`,`bomba_id`,`correctora_id`,`correctora`,`insulina_unit`,`carbono`,`created`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Treament value) {
        stmt.bindLong(1, value.getId());
        final Integer _tmp = value.getBomb() == null ? null : (value.getBomb() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, _tmp);
        }
        stmt.bindDouble(3, value.getObject_glucose());
        stmt.bindDouble(4, value.getCorrectora_unit());
        stmt.bindDouble(5, value.getHipoglucose());
        stmt.bindDouble(6, value.getHyperglucose());
        if (value.getBasal_id() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, value.getBasal_id());
        }
        if (value.getMedidor_id() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.getMedidor_id());
        }
        if (value.getBomba_id() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.getBomba_id());
        }
        if (value.getCorrectora_id() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindLong(10, value.getCorrectora_id());
        }
        stmt.bindDouble(11, value.getCorrectora());
        stmt.bindDouble(12, value.getInsulina_unit());
        stmt.bindDouble(13, value.getCarbono());
        final String _tmp_1 = __converters.fromOffsetDateTime(value.getCreated());
        if (_tmp_1 == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, _tmp_1);
        }
      }
    };
    this.__insertionAdapterOfTreamentHorarios = new EntityInsertionAdapter<TreamentHorarios>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `treamentHorarios` (`id`,`category_id`,`selected`,`treatment_id`,`units`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TreamentHorarios value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getCategory_id());
        final int _tmp = value.getSelected() ? 1 : 0;
        stmt.bindLong(3, _tmp);
        if (value.getTreatment_id() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getTreatment_id());
        }
        stmt.bindDouble(5, value.getUnits());
      }
    };
    this.__insertionAdapterOfTreamentBasalHora = new EntityInsertionAdapter<TreamentBasalHora>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `treament_basal_hora` (`id`,`time`,`treatment_id`,`units`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TreamentBasalHora value) {
        stmt.bindLong(1, value.getId());
        if (value.getTime() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTime());
        }
        if (value.getTreatment_id() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getTreatment_id());
        }
        stmt.bindDouble(4, value.getUnits());
      }
    };
    this.__insertionAdapterOfTreamentCorrectoraHorarios = new EntityInsertionAdapter<TreamentCorrectoraHorarios>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `treamentCorrectoraHorarios` (`id`,`category_id`,`treatment_id`,`selected`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TreamentCorrectoraHorarios value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getCategory_id());
        if (value.getTreatment_id() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getTreatment_id());
        }
        final int _tmp = value.getSelected() ? 1 : 0;
        stmt.bindLong(4, _tmp);
      }
    };
    this.__insertionAdapterOfBasalInsuline = new EntityInsertionAdapter<BasalInsuline>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `basal_insuline` (`bid`,`name`) VALUES (nullif(?, 0),?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, BasalInsuline value) {
        stmt.bindLong(1, value.getBid());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
      }
    };
    this.__insertionAdapterOfMedidor = new EntityInsertionAdapter<Medidor>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `medidor` (`mid`,`name`) VALUES (nullif(?, 0),?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Medidor value) {
        stmt.bindLong(1, value.getMid());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
      }
    };
    this.__insertionAdapterOfBombaInfusora = new EntityInsertionAdapter<BombaInfusora>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `bomba_infusora` (`boid`,`name`) VALUES (nullif(?, 0),?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, BombaInfusora value) {
        stmt.bindLong(1, value.getBoid());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
      }
    };
    this.__insertionAdapterOfCorrectoraInsuline = new EntityInsertionAdapter<CorrectoraInsuline>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `correctora_insuline` (`cid`,`cname`) VALUES (nullif(?, 0),?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CorrectoraInsuline value) {
        stmt.bindLong(1, value.getCid());
        if (value.getCname() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCname());
        }
      }
    };
    this.__updateAdapterOfTreament = new EntityDeletionOrUpdateAdapter<Treament>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `treament` SET `id` = ?,`bomb` = ?,`object_glucose` = ?,`correctora_unit` = ?,`hipoglucose` = ?,`hyperglucose` = ?,`basal_id` = ?,`medidor_id` = ?,`bomba_id` = ?,`correctora_id` = ?,`correctora` = ?,`insulina_unit` = ?,`carbono` = ?,`created` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Treament value) {
        stmt.bindLong(1, value.getId());
        final Integer _tmp = value.getBomb() == null ? null : (value.getBomb() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, _tmp);
        }
        stmt.bindDouble(3, value.getObject_glucose());
        stmt.bindDouble(4, value.getCorrectora_unit());
        stmt.bindDouble(5, value.getHipoglucose());
        stmt.bindDouble(6, value.getHyperglucose());
        if (value.getBasal_id() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, value.getBasal_id());
        }
        if (value.getMedidor_id() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.getMedidor_id());
        }
        if (value.getBomba_id() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.getBomba_id());
        }
        if (value.getCorrectora_id() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindLong(10, value.getCorrectora_id());
        }
        stmt.bindDouble(11, value.getCorrectora());
        stmt.bindDouble(12, value.getInsulina_unit());
        stmt.bindDouble(13, value.getCarbono());
        final String _tmp_1 = __converters.fromOffsetDateTime(value.getCreated());
        if (_tmp_1 == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, _tmp_1);
        }
        stmt.bindLong(15, value.getId());
      }
    };
    this.__updateAdapterOfTreamentHorarios = new EntityDeletionOrUpdateAdapter<TreamentHorarios>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `treamentHorarios` SET `id` = ?,`category_id` = ?,`selected` = ?,`treatment_id` = ?,`units` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TreamentHorarios value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getCategory_id());
        final int _tmp = value.getSelected() ? 1 : 0;
        stmt.bindLong(3, _tmp);
        if (value.getTreatment_id() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getTreatment_id());
        }
        stmt.bindDouble(5, value.getUnits());
        stmt.bindLong(6, value.getId());
      }
    };
    this.__updateAdapterOfTreamentBasalHora = new EntityDeletionOrUpdateAdapter<TreamentBasalHora>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `treament_basal_hora` SET `id` = ?,`time` = ?,`treatment_id` = ?,`units` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TreamentBasalHora value) {
        stmt.bindLong(1, value.getId());
        if (value.getTime() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTime());
        }
        if (value.getTreatment_id() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getTreatment_id());
        }
        stmt.bindDouble(4, value.getUnits());
        stmt.bindLong(5, value.getId());
      }
    };
    this.__updateAdapterOfTreamentCorrectoraHorarios = new EntityDeletionOrUpdateAdapter<TreamentCorrectoraHorarios>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `treamentCorrectoraHorarios` SET `id` = ?,`category_id` = ?,`treatment_id` = ?,`selected` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TreamentCorrectoraHorarios value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getCategory_id());
        if (value.getTreatment_id() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getTreatment_id());
        }
        final int _tmp = value.getSelected() ? 1 : 0;
        stmt.bindLong(4, _tmp);
        stmt.bindLong(5, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAllCategoryCorrectora = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM treamentCorrectoraHorarios";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAllCategory = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM treamentHorarios";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAllTreatment = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM treament";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAllTreatmentBasalHora = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM treament_basal_hora";
        return _query;
      }
    };
  }

  @Override
  public void insert(final Treament treament) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfTreament.insert(treament);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertCategory(final List<TreamentHorarios> horarios) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfTreamentHorarios.insert(horarios);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertBasalHora(final List<TreamentBasalHora> horas) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfTreamentBasalHora.insert(horas);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertCategoryCorrectora(final List<TreamentCorrectoraHorarios> horarios) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfTreamentCorrectoraHorarios.insert(horarios);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertBasal(final List<BasalInsuline> basal) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfBasalInsuline.insert(basal);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertMedidor(final List<Medidor> medidor) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfMedidor.insert(medidor);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertBombas(final List<BombaInfusora> bombas) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfBombaInfusora.insert(bombas);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertCorrectora(final List<CorrectoraInsuline> correctora) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCorrectoraInsuline.insert(correctora);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void editTreatment(final Treament treament) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfTreament.handle(treament);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void editBasalCategory(final TreamentHorarios horarios) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfTreamentHorarios.handle(horarios);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void editBasalHora(final TreamentBasalHora hora) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfTreamentBasalHora.handle(hora);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void editCorrectoraCategory(final TreamentCorrectoraHorarios horarios) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfTreamentCorrectoraHorarios.handle(horarios);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAllCategoryCorrectora() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllCategoryCorrectora.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllCategoryCorrectora.release(_stmt);
    }
  }

  @Override
  public void deleteAllCategory() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllCategory.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllCategory.release(_stmt);
    }
  }

  @Override
  public void deleteAllTreatment() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllTreatment.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllTreatment.release(_stmt);
    }
  }

  @Override
  public void deleteAllTreatmentBasalHora() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllTreatmentBasalHora.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllTreatmentBasalHora.release(_stmt);
    }
  }

  @Override
  public List<Treament> loadAll() {
    final String _sql = "SELECT * FROM treament ORDER BY created";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfBomb = CursorUtil.getColumnIndexOrThrow(_cursor, "bomb");
      final int _cursorIndexOfObjectGlucose = CursorUtil.getColumnIndexOrThrow(_cursor, "object_glucose");
      final int _cursorIndexOfCorrectoraUnit = CursorUtil.getColumnIndexOrThrow(_cursor, "correctora_unit");
      final int _cursorIndexOfHipoglucose = CursorUtil.getColumnIndexOrThrow(_cursor, "hipoglucose");
      final int _cursorIndexOfHyperglucose = CursorUtil.getColumnIndexOrThrow(_cursor, "hyperglucose");
      final int _cursorIndexOfBasalId = CursorUtil.getColumnIndexOrThrow(_cursor, "basal_id");
      final int _cursorIndexOfMedidorId = CursorUtil.getColumnIndexOrThrow(_cursor, "medidor_id");
      final int _cursorIndexOfBombaId = CursorUtil.getColumnIndexOrThrow(_cursor, "bomba_id");
      final int _cursorIndexOfCorrectoraId = CursorUtil.getColumnIndexOrThrow(_cursor, "correctora_id");
      final int _cursorIndexOfCorrectora = CursorUtil.getColumnIndexOrThrow(_cursor, "correctora");
      final int _cursorIndexOfInsulinaUnit = CursorUtil.getColumnIndexOrThrow(_cursor, "insulina_unit");
      final int _cursorIndexOfCarbono = CursorUtil.getColumnIndexOrThrow(_cursor, "carbono");
      final int _cursorIndexOfCreated = CursorUtil.getColumnIndexOrThrow(_cursor, "created");
      final List<Treament> _result = new ArrayList<Treament>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Treament _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final Boolean _tmpBomb;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfBomb)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfBomb);
        }
        _tmpBomb = _tmp == null ? null : _tmp != 0;
        final float _tmpObject_glucose;
        _tmpObject_glucose = _cursor.getFloat(_cursorIndexOfObjectGlucose);
        final float _tmpCorrectora_unit;
        _tmpCorrectora_unit = _cursor.getFloat(_cursorIndexOfCorrectoraUnit);
        final float _tmpHipoglucose;
        _tmpHipoglucose = _cursor.getFloat(_cursorIndexOfHipoglucose);
        final float _tmpHyperglucose;
        _tmpHyperglucose = _cursor.getFloat(_cursorIndexOfHyperglucose);
        final Integer _tmpBasal_id;
        if (_cursor.isNull(_cursorIndexOfBasalId)) {
          _tmpBasal_id = null;
        } else {
          _tmpBasal_id = _cursor.getInt(_cursorIndexOfBasalId);
        }
        final Integer _tmpMedidor_id;
        if (_cursor.isNull(_cursorIndexOfMedidorId)) {
          _tmpMedidor_id = null;
        } else {
          _tmpMedidor_id = _cursor.getInt(_cursorIndexOfMedidorId);
        }
        final Integer _tmpBomba_id;
        if (_cursor.isNull(_cursorIndexOfBombaId)) {
          _tmpBomba_id = null;
        } else {
          _tmpBomba_id = _cursor.getInt(_cursorIndexOfBombaId);
        }
        final Integer _tmpCorrectora_id;
        if (_cursor.isNull(_cursorIndexOfCorrectoraId)) {
          _tmpCorrectora_id = null;
        } else {
          _tmpCorrectora_id = _cursor.getInt(_cursorIndexOfCorrectoraId);
        }
        final float _tmpCorrectora;
        _tmpCorrectora = _cursor.getFloat(_cursorIndexOfCorrectora);
        final float _tmpInsulina_unit;
        _tmpInsulina_unit = _cursor.getFloat(_cursorIndexOfInsulinaUnit);
        final float _tmpCarbono;
        _tmpCarbono = _cursor.getFloat(_cursorIndexOfCarbono);
        final Date _tmpCreated;
        final String _tmp_1;
        if (_cursor.isNull(_cursorIndexOfCreated)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getString(_cursorIndexOfCreated);
        }
        _tmpCreated = __converters.toOffsetDateTime(_tmp_1);
        _item = new Treament(_tmpId,_tmpBomb,_tmpObject_glucose,_tmpCorrectora_unit,_tmpHipoglucose,_tmpHyperglucose,_tmpBasal_id,_tmpMedidor_id,_tmpBomba_id,_tmpCorrectora_id,_tmpCorrectora,_tmpInsulina_unit,_tmpCarbono,_tmpCreated);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public TreatmentBasalCorrectora loadById(final int id) {
    final String _sql = "SELECT *  FROM treament left join basal_insuline on treament.basal_id = basal_insuline.bid left join correctora_insuline on treament.correctora_id = correctora_insuline.cid  WHERE treament.id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfBomb = CursorUtil.getColumnIndexOrThrow(_cursor, "bomb");
      final int _cursorIndexOfObjectGlucose = CursorUtil.getColumnIndexOrThrow(_cursor, "object_glucose");
      final int _cursorIndexOfCorrectoraUnit = CursorUtil.getColumnIndexOrThrow(_cursor, "correctora_unit");
      final int _cursorIndexOfHipoglucose = CursorUtil.getColumnIndexOrThrow(_cursor, "hipoglucose");
      final int _cursorIndexOfHyperglucose = CursorUtil.getColumnIndexOrThrow(_cursor, "hyperglucose");
      final int _cursorIndexOfBasalId = CursorUtil.getColumnIndexOrThrow(_cursor, "basal_id");
      final int _cursorIndexOfMedidorId = CursorUtil.getColumnIndexOrThrow(_cursor, "medidor_id");
      final int _cursorIndexOfBombaId = CursorUtil.getColumnIndexOrThrow(_cursor, "bomba_id");
      final int _cursorIndexOfCorrectoraId = CursorUtil.getColumnIndexOrThrow(_cursor, "correctora_id");
      final int _cursorIndexOfCorrectora = CursorUtil.getColumnIndexOrThrow(_cursor, "correctora");
      final int _cursorIndexOfInsulinaUnit = CursorUtil.getColumnIndexOrThrow(_cursor, "insulina_unit");
      final int _cursorIndexOfCarbono = CursorUtil.getColumnIndexOrThrow(_cursor, "carbono");
      final int _cursorIndexOfCreated = CursorUtil.getColumnIndexOrThrow(_cursor, "created");
      final int _cursorIndexOfBid = CursorUtil.getColumnIndexOrThrow(_cursor, "bid");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfCid = CursorUtil.getColumnIndexOrThrow(_cursor, "cid");
      final int _cursorIndexOfCname = CursorUtil.getColumnIndexOrThrow(_cursor, "cname");
      final TreatmentBasalCorrectora _result;
      if(_cursor.moveToFirst()) {
        final Treament _tmpTreament;
        if (!(_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfBomb) && _cursor.isNull(_cursorIndexOfObjectGlucose) && _cursor.isNull(_cursorIndexOfCorrectoraUnit) && _cursor.isNull(_cursorIndexOfHipoglucose) && _cursor.isNull(_cursorIndexOfHyperglucose) && _cursor.isNull(_cursorIndexOfBasalId) && _cursor.isNull(_cursorIndexOfMedidorId) && _cursor.isNull(_cursorIndexOfBombaId) && _cursor.isNull(_cursorIndexOfCorrectoraId) && _cursor.isNull(_cursorIndexOfCorrectora) && _cursor.isNull(_cursorIndexOfInsulinaUnit) && _cursor.isNull(_cursorIndexOfCarbono) && _cursor.isNull(_cursorIndexOfCreated))) {
          final int _tmpId;
          _tmpId = _cursor.getInt(_cursorIndexOfId);
          final Boolean _tmpBomb;
          final Integer _tmp;
          if (_cursor.isNull(_cursorIndexOfBomb)) {
            _tmp = null;
          } else {
            _tmp = _cursor.getInt(_cursorIndexOfBomb);
          }
          _tmpBomb = _tmp == null ? null : _tmp != 0;
          final float _tmpObject_glucose;
          _tmpObject_glucose = _cursor.getFloat(_cursorIndexOfObjectGlucose);
          final float _tmpCorrectora_unit;
          _tmpCorrectora_unit = _cursor.getFloat(_cursorIndexOfCorrectoraUnit);
          final float _tmpHipoglucose;
          _tmpHipoglucose = _cursor.getFloat(_cursorIndexOfHipoglucose);
          final float _tmpHyperglucose;
          _tmpHyperglucose = _cursor.getFloat(_cursorIndexOfHyperglucose);
          final Integer _tmpBasal_id;
          if (_cursor.isNull(_cursorIndexOfBasalId)) {
            _tmpBasal_id = null;
          } else {
            _tmpBasal_id = _cursor.getInt(_cursorIndexOfBasalId);
          }
          final Integer _tmpMedidor_id;
          if (_cursor.isNull(_cursorIndexOfMedidorId)) {
            _tmpMedidor_id = null;
          } else {
            _tmpMedidor_id = _cursor.getInt(_cursorIndexOfMedidorId);
          }
          final Integer _tmpBomba_id;
          if (_cursor.isNull(_cursorIndexOfBombaId)) {
            _tmpBomba_id = null;
          } else {
            _tmpBomba_id = _cursor.getInt(_cursorIndexOfBombaId);
          }
          final Integer _tmpCorrectora_id;
          if (_cursor.isNull(_cursorIndexOfCorrectoraId)) {
            _tmpCorrectora_id = null;
          } else {
            _tmpCorrectora_id = _cursor.getInt(_cursorIndexOfCorrectoraId);
          }
          final float _tmpCorrectora;
          _tmpCorrectora = _cursor.getFloat(_cursorIndexOfCorrectora);
          final float _tmpInsulina_unit;
          _tmpInsulina_unit = _cursor.getFloat(_cursorIndexOfInsulinaUnit);
          final float _tmpCarbono;
          _tmpCarbono = _cursor.getFloat(_cursorIndexOfCarbono);
          final Date _tmpCreated;
          final String _tmp_1;
          if (_cursor.isNull(_cursorIndexOfCreated)) {
            _tmp_1 = null;
          } else {
            _tmp_1 = _cursor.getString(_cursorIndexOfCreated);
          }
          _tmpCreated = __converters.toOffsetDateTime(_tmp_1);
          _tmpTreament = new Treament(_tmpId,_tmpBomb,_tmpObject_glucose,_tmpCorrectora_unit,_tmpHipoglucose,_tmpHyperglucose,_tmpBasal_id,_tmpMedidor_id,_tmpBomba_id,_tmpCorrectora_id,_tmpCorrectora,_tmpInsulina_unit,_tmpCarbono,_tmpCreated);
        } else {
          _tmpTreament = null;
        }
        final BasalInsuline _tmpBasalInsuline;
        if (!(_cursor.isNull(_cursorIndexOfBid) && _cursor.isNull(_cursorIndexOfName))) {
          final int _tmpBid;
          _tmpBid = _cursor.getInt(_cursorIndexOfBid);
          final String _tmpName;
          if (_cursor.isNull(_cursorIndexOfName)) {
            _tmpName = null;
          } else {
            _tmpName = _cursor.getString(_cursorIndexOfName);
          }
          _tmpBasalInsuline = new BasalInsuline(_tmpBid,_tmpName);
        } else {
          _tmpBasalInsuline = null;
        }
        final CorrectoraInsuline _tmpCorrectoraInsuline;
        if (!(_cursor.isNull(_cursorIndexOfCid) && _cursor.isNull(_cursorIndexOfCname))) {
          final int _tmpCid;
          _tmpCid = _cursor.getInt(_cursorIndexOfCid);
          final String _tmpCname;
          if (_cursor.isNull(_cursorIndexOfCname)) {
            _tmpCname = null;
          } else {
            _tmpCname = _cursor.getString(_cursorIndexOfCname);
          }
          _tmpCorrectoraInsuline = new CorrectoraInsuline(_tmpCid,_tmpCname);
        } else {
          _tmpCorrectoraInsuline = null;
        }
        _result = new TreatmentBasalCorrectora();
        _result.setTreament(_tmpTreament);
        _result.setBasalInsuline(_tmpBasalInsuline);
        _result.setCorrectoraInsuline(_tmpCorrectoraInsuline);
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
  public List<TreatmentHorariosCategory> loadAllCategory() {
    final String _sql = "SELECT * FROM treamentHorarios inner join category on treamentHorarios.category_id = category.cate_id ORDER BY id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "category_id");
      final int _cursorIndexOfSelected = CursorUtil.getColumnIndexOrThrow(_cursor, "selected");
      final int _cursorIndexOfTreatmentId = CursorUtil.getColumnIndexOrThrow(_cursor, "treatment_id");
      final int _cursorIndexOfUnits = CursorUtil.getColumnIndexOrThrow(_cursor, "units");
      final int _cursorIndexOfCateId = CursorUtil.getColumnIndexOrThrow(_cursor, "cate_id");
      final int _cursorIndexOfCateName = CursorUtil.getColumnIndexOrThrow(_cursor, "cate_name");
      final List<TreatmentHorariosCategory> _result = new ArrayList<TreatmentHorariosCategory>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final TreatmentHorariosCategory _item;
        final TreamentHorarios _tmpTreamentHorarios;
        if (!(_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfCategoryId) && _cursor.isNull(_cursorIndexOfSelected) && _cursor.isNull(_cursorIndexOfTreatmentId) && _cursor.isNull(_cursorIndexOfUnits))) {
          final int _tmpId;
          _tmpId = _cursor.getInt(_cursorIndexOfId);
          final int _tmpCategory_id;
          _tmpCategory_id = _cursor.getInt(_cursorIndexOfCategoryId);
          final boolean _tmpSelected;
          final int _tmp;
          _tmp = _cursor.getInt(_cursorIndexOfSelected);
          _tmpSelected = _tmp != 0;
          final Integer _tmpTreatment_id;
          if (_cursor.isNull(_cursorIndexOfTreatmentId)) {
            _tmpTreatment_id = null;
          } else {
            _tmpTreatment_id = _cursor.getInt(_cursorIndexOfTreatmentId);
          }
          final float _tmpUnits;
          _tmpUnits = _cursor.getFloat(_cursorIndexOfUnits);
          _tmpTreamentHorarios = new TreamentHorarios(_tmpId,_tmpCategory_id,_tmpSelected,_tmpTreatment_id,_tmpUnits);
        } else {
          _tmpTreamentHorarios = null;
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
        _item = new TreatmentHorariosCategory();
        _item.setTreamentHorarios(_tmpTreamentHorarios);
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
  public TreamentHorarios loadTreatmentByCategory(final int id) {
    final String _sql = "SELECT * FROM treamentHorarios WHERE category_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "category_id");
      final int _cursorIndexOfSelected = CursorUtil.getColumnIndexOrThrow(_cursor, "selected");
      final int _cursorIndexOfTreatmentId = CursorUtil.getColumnIndexOrThrow(_cursor, "treatment_id");
      final int _cursorIndexOfUnits = CursorUtil.getColumnIndexOrThrow(_cursor, "units");
      final TreamentHorarios _result;
      if(_cursor.moveToFirst()) {
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final int _tmpCategory_id;
        _tmpCategory_id = _cursor.getInt(_cursorIndexOfCategoryId);
        final boolean _tmpSelected;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfSelected);
        _tmpSelected = _tmp != 0;
        final Integer _tmpTreatment_id;
        if (_cursor.isNull(_cursorIndexOfTreatmentId)) {
          _tmpTreatment_id = null;
        } else {
          _tmpTreatment_id = _cursor.getInt(_cursorIndexOfTreatmentId);
        }
        final float _tmpUnits;
        _tmpUnits = _cursor.getFloat(_cursorIndexOfUnits);
        _result = new TreamentHorarios(_tmpId,_tmpCategory_id,_tmpSelected,_tmpTreatment_id,_tmpUnits);
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
      final int lunch_id, final int dinner_id) {
    final String _sql = "SELECT avg(case when category_id = ? then units end) as breakfast, avg(case when category_id = ? then units end) as snack, avg(case when category_id = ? then units end) as lunch, avg(case when category_id = ? then units end) as dinner FROM TreamentHorarios";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 4);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, breakfast_id);
    _argIndex = 2;
    _statement.bindLong(_argIndex, snack_id);
    _argIndex = 3;
    _statement.bindLong(_argIndex, lunch_id);
    _argIndex = 4;
    _statement.bindLong(_argIndex, dinner_id);
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
  public List<TreamentBasalHora> loadAllBasalHora() {
    final String _sql = "SELECT * FROM treament_basal_hora ORDER BY id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
      final int _cursorIndexOfTreatmentId = CursorUtil.getColumnIndexOrThrow(_cursor, "treatment_id");
      final int _cursorIndexOfUnits = CursorUtil.getColumnIndexOrThrow(_cursor, "units");
      final List<TreamentBasalHora> _result = new ArrayList<TreamentBasalHora>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final TreamentBasalHora _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpTime;
        if (_cursor.isNull(_cursorIndexOfTime)) {
          _tmpTime = null;
        } else {
          _tmpTime = _cursor.getString(_cursorIndexOfTime);
        }
        final Integer _tmpTreatment_id;
        if (_cursor.isNull(_cursorIndexOfTreatmentId)) {
          _tmpTreatment_id = null;
        } else {
          _tmpTreatment_id = _cursor.getInt(_cursorIndexOfTreatmentId);
        }
        final float _tmpUnits;
        _tmpUnits = _cursor.getFloat(_cursorIndexOfUnits);
        _item = new TreamentBasalHora(_tmpId,_tmpTime,_tmpTreatment_id,_tmpUnits);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<TreatmentHCorrectoraCategory> loadAllCategoryCorrectora() {
    final String _sql = "SELECT * FROM treamentCorrectoraHorarios inner join category on treamentCorrectoraHorarios.category_id = category.cate_id ORDER BY id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "category_id");
      final int _cursorIndexOfTreatmentId = CursorUtil.getColumnIndexOrThrow(_cursor, "treatment_id");
      final int _cursorIndexOfSelected = CursorUtil.getColumnIndexOrThrow(_cursor, "selected");
      final int _cursorIndexOfCateId = CursorUtil.getColumnIndexOrThrow(_cursor, "cate_id");
      final int _cursorIndexOfCateName = CursorUtil.getColumnIndexOrThrow(_cursor, "cate_name");
      final List<TreatmentHCorrectoraCategory> _result = new ArrayList<TreatmentHCorrectoraCategory>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final TreatmentHCorrectoraCategory _item;
        final TreamentCorrectoraHorarios _tmpTreamentCorrectoraHorarios;
        if (!(_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfCategoryId) && _cursor.isNull(_cursorIndexOfTreatmentId) && _cursor.isNull(_cursorIndexOfSelected))) {
          final int _tmpId;
          _tmpId = _cursor.getInt(_cursorIndexOfId);
          final int _tmpCategory_id;
          _tmpCategory_id = _cursor.getInt(_cursorIndexOfCategoryId);
          final Integer _tmpTreatment_id;
          if (_cursor.isNull(_cursorIndexOfTreatmentId)) {
            _tmpTreatment_id = null;
          } else {
            _tmpTreatment_id = _cursor.getInt(_cursorIndexOfTreatmentId);
          }
          final boolean _tmpSelected;
          final int _tmp;
          _tmp = _cursor.getInt(_cursorIndexOfSelected);
          _tmpSelected = _tmp != 0;
          _tmpTreamentCorrectoraHorarios = new TreamentCorrectoraHorarios(_tmpId,_tmpCategory_id,_tmpTreatment_id,_tmpSelected);
        } else {
          _tmpTreamentCorrectoraHorarios = null;
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
        _item = new TreatmentHCorrectoraCategory();
        _item.setTreamentCorrectoraHorarios(_tmpTreamentCorrectoraHorarios);
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
  public List<BasalInsuline> loadAllBasal() {
    final String _sql = "SELECT * FROM basal_insuline ORDER BY bid";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfBid = CursorUtil.getColumnIndexOrThrow(_cursor, "bid");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final List<BasalInsuline> _result = new ArrayList<BasalInsuline>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final BasalInsuline _item;
        final int _tmpBid;
        _tmpBid = _cursor.getInt(_cursorIndexOfBid);
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        _item = new BasalInsuline(_tmpBid,_tmpName);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Medidor> loadAllMedidor() {
    final String _sql = "SELECT * FROM medidor ORDER BY mid";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfMid = CursorUtil.getColumnIndexOrThrow(_cursor, "mid");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final List<Medidor> _result = new ArrayList<Medidor>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Medidor _item;
        final int _tmpMid;
        _tmpMid = _cursor.getInt(_cursorIndexOfMid);
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        _item = new Medidor(_tmpMid,_tmpName);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<BombaInfusora> loadAllBombas() {
    final String _sql = "SELECT * FROM bomba_infusora ORDER BY boid";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfBoid = CursorUtil.getColumnIndexOrThrow(_cursor, "boid");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final List<BombaInfusora> _result = new ArrayList<BombaInfusora>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final BombaInfusora _item;
        final int _tmpBoid;
        _tmpBoid = _cursor.getInt(_cursorIndexOfBoid);
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        _item = new BombaInfusora(_tmpBoid,_tmpName);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<CorrectoraInsuline> loadAllCorrectora() {
    final String _sql = "SELECT * FROM correctora_insuline ORDER BY cid";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfCid = CursorUtil.getColumnIndexOrThrow(_cursor, "cid");
      final int _cursorIndexOfCname = CursorUtil.getColumnIndexOrThrow(_cursor, "cname");
      final List<CorrectoraInsuline> _result = new ArrayList<CorrectoraInsuline>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final CorrectoraInsuline _item;
        final int _tmpCid;
        _tmpCid = _cursor.getInt(_cursorIndexOfCid);
        final String _tmpCname;
        if (_cursor.isNull(_cursorIndexOfCname)) {
          _tmpCname = null;
        } else {
          _tmpCname = _cursor.getString(_cursorIndexOfCname);
        }
        _item = new CorrectoraInsuline(_tmpCid,_tmpCname);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public TreatmentAverage loadAverage() {
    final String _sql = "SELECT sum(units) as total FROM treamentHorarios";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfTotal = 0;
      final TreatmentAverage _result;
      if(_cursor.moveToFirst()) {
        final float _tmpTotal;
        _tmpTotal = _cursor.getFloat(_cursorIndexOfTotal);
        _result = new TreatmentAverage(_tmpTotal);
      } else {
        _result = null;
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
