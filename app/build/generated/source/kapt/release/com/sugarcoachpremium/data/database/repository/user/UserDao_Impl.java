package com.sugarcoachpremium.data.database.repository.user;

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
public final class UserDao_Impl implements UserDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<User> __insertionAdapterOfUser;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter<User> __updateAdapterOfUser;

  private final SharedSQLiteStatement __preparedStmtOfDeleteUser;

  public UserDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUser = new EntityInsertionAdapter<User>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `user` (`id`,`username`,`blocked`,`email`,`provider`,`confirmed`,`sex`,`name`,`avatar`,`weight`,`height`,`birthday`,`debut`,`control`,`medico`,`sms`,`geolocalizacion`,`number`,`mirror_id`,`type_account`,`online_id`,`sugar_points`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, User value) {
        stmt.bindLong(1, value.getId());
        if (value.getUsername() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUsername());
        }
        final int _tmp = value.getBlocked() ? 1 : 0;
        stmt.bindLong(3, _tmp);
        if (value.getEmail() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEmail());
        }
        if (value.getProvider() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getProvider());
        }
        final int _tmp_1 = value.getConfirmed() ? 1 : 0;
        stmt.bindLong(6, _tmp_1);
        if (value.getSex() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getSex());
        }
        if (value.getName() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getName());
        }
        if (value.getAvatar() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getAvatar());
        }
        if (value.getWeight() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindDouble(10, value.getWeight());
        }
        if (value.getHeight() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindDouble(11, value.getHeight());
        }
        final String _tmp_2 = __converters.fromOffsetDateTime(value.getBirthday());
        if (_tmp_2 == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, _tmp_2);
        }
        final String _tmp_3 = __converters.fromOffsetDateTime(value.getDebut());
        if (_tmp_3 == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, _tmp_3);
        }
        final Integer _tmp_4 = value.getControl() == null ? null : (value.getControl() ? 1 : 0);
        if (_tmp_4 == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindLong(14, _tmp_4);
        }
        final Integer _tmp_5 = value.getMedico() == null ? null : (value.getMedico() ? 1 : 0);
        if (_tmp_5 == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindLong(15, _tmp_5);
        }
        final Integer _tmp_6 = value.getSms() == null ? null : (value.getSms() ? 1 : 0);
        if (_tmp_6 == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindLong(16, _tmp_6);
        }
        final Integer _tmp_7 = value.getGeolocalizacion() == null ? null : (value.getGeolocalizacion() ? 1 : 0);
        if (_tmp_7 == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindLong(17, _tmp_7);
        }
        if (value.getNumber() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getNumber());
        }
        if (value.getMirror_id() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getMirror_id());
        }
        if (value.getTypeAccount() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.getTypeAccount());
        }
        if (value.getOnlineId() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindLong(21, value.getOnlineId());
        }
        stmt.bindLong(22, value.getPoints());
      }
    };
    this.__updateAdapterOfUser = new EntityDeletionOrUpdateAdapter<User>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `user` SET `id` = ?,`username` = ?,`blocked` = ?,`email` = ?,`provider` = ?,`confirmed` = ?,`sex` = ?,`name` = ?,`avatar` = ?,`weight` = ?,`height` = ?,`birthday` = ?,`debut` = ?,`control` = ?,`medico` = ?,`sms` = ?,`geolocalizacion` = ?,`number` = ?,`mirror_id` = ?,`type_account` = ?,`online_id` = ?,`sugar_points` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, User value) {
        stmt.bindLong(1, value.getId());
        if (value.getUsername() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUsername());
        }
        final int _tmp = value.getBlocked() ? 1 : 0;
        stmt.bindLong(3, _tmp);
        if (value.getEmail() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEmail());
        }
        if (value.getProvider() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getProvider());
        }
        final int _tmp_1 = value.getConfirmed() ? 1 : 0;
        stmt.bindLong(6, _tmp_1);
        if (value.getSex() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getSex());
        }
        if (value.getName() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getName());
        }
        if (value.getAvatar() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getAvatar());
        }
        if (value.getWeight() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindDouble(10, value.getWeight());
        }
        if (value.getHeight() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindDouble(11, value.getHeight());
        }
        final String _tmp_2 = __converters.fromOffsetDateTime(value.getBirthday());
        if (_tmp_2 == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, _tmp_2);
        }
        final String _tmp_3 = __converters.fromOffsetDateTime(value.getDebut());
        if (_tmp_3 == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, _tmp_3);
        }
        final Integer _tmp_4 = value.getControl() == null ? null : (value.getControl() ? 1 : 0);
        if (_tmp_4 == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindLong(14, _tmp_4);
        }
        final Integer _tmp_5 = value.getMedico() == null ? null : (value.getMedico() ? 1 : 0);
        if (_tmp_5 == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindLong(15, _tmp_5);
        }
        final Integer _tmp_6 = value.getSms() == null ? null : (value.getSms() ? 1 : 0);
        if (_tmp_6 == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindLong(16, _tmp_6);
        }
        final Integer _tmp_7 = value.getGeolocalizacion() == null ? null : (value.getGeolocalizacion() ? 1 : 0);
        if (_tmp_7 == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindLong(17, _tmp_7);
        }
        if (value.getNumber() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getNumber());
        }
        if (value.getMirror_id() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getMirror_id());
        }
        if (value.getTypeAccount() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.getTypeAccount());
        }
        if (value.getOnlineId() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindLong(21, value.getOnlineId());
        }
        stmt.bindLong(22, value.getPoints());
        stmt.bindLong(23, value.getId());
      }
    };
    this.__preparedStmtOfDeleteUser = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM user";
        return _query;
      }
    };
  }

  @Override
  public void insert(final User user) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfUser.insert(user);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final User user) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfUser.handle(user);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteUser() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteUser.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteUser.release(_stmt);
    }
  }

  @Override
  public User loadOne() {
    final String _sql = "SELECT * FROM user LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
      final int _cursorIndexOfBlocked = CursorUtil.getColumnIndexOrThrow(_cursor, "blocked");
      final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
      final int _cursorIndexOfProvider = CursorUtil.getColumnIndexOrThrow(_cursor, "provider");
      final int _cursorIndexOfConfirmed = CursorUtil.getColumnIndexOrThrow(_cursor, "confirmed");
      final int _cursorIndexOfSex = CursorUtil.getColumnIndexOrThrow(_cursor, "sex");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfAvatar = CursorUtil.getColumnIndexOrThrow(_cursor, "avatar");
      final int _cursorIndexOfWeight = CursorUtil.getColumnIndexOrThrow(_cursor, "weight");
      final int _cursorIndexOfHeight = CursorUtil.getColumnIndexOrThrow(_cursor, "height");
      final int _cursorIndexOfBirthday = CursorUtil.getColumnIndexOrThrow(_cursor, "birthday");
      final int _cursorIndexOfDebut = CursorUtil.getColumnIndexOrThrow(_cursor, "debut");
      final int _cursorIndexOfControl = CursorUtil.getColumnIndexOrThrow(_cursor, "control");
      final int _cursorIndexOfMedico = CursorUtil.getColumnIndexOrThrow(_cursor, "medico");
      final int _cursorIndexOfSms = CursorUtil.getColumnIndexOrThrow(_cursor, "sms");
      final int _cursorIndexOfGeolocalizacion = CursorUtil.getColumnIndexOrThrow(_cursor, "geolocalizacion");
      final int _cursorIndexOfNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "number");
      final int _cursorIndexOfMirrorId = CursorUtil.getColumnIndexOrThrow(_cursor, "mirror_id");
      final int _cursorIndexOfTypeAccount = CursorUtil.getColumnIndexOrThrow(_cursor, "type_account");
      final int _cursorIndexOfOnlineId = CursorUtil.getColumnIndexOrThrow(_cursor, "online_id");
      final int _cursorIndexOfPoints = CursorUtil.getColumnIndexOrThrow(_cursor, "sugar_points");
      final User _result;
      if(_cursor.moveToFirst()) {
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpUsername;
        if (_cursor.isNull(_cursorIndexOfUsername)) {
          _tmpUsername = null;
        } else {
          _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
        }
        final boolean _tmpBlocked;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfBlocked);
        _tmpBlocked = _tmp != 0;
        final String _tmpEmail;
        if (_cursor.isNull(_cursorIndexOfEmail)) {
          _tmpEmail = null;
        } else {
          _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
        }
        final String _tmpProvider;
        if (_cursor.isNull(_cursorIndexOfProvider)) {
          _tmpProvider = null;
        } else {
          _tmpProvider = _cursor.getString(_cursorIndexOfProvider);
        }
        final boolean _tmpConfirmed;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfConfirmed);
        _tmpConfirmed = _tmp_1 != 0;
        final String _tmpSex;
        if (_cursor.isNull(_cursorIndexOfSex)) {
          _tmpSex = null;
        } else {
          _tmpSex = _cursor.getString(_cursorIndexOfSex);
        }
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpAvatar;
        if (_cursor.isNull(_cursorIndexOfAvatar)) {
          _tmpAvatar = null;
        } else {
          _tmpAvatar = _cursor.getString(_cursorIndexOfAvatar);
        }
        final Float _tmpWeight;
        if (_cursor.isNull(_cursorIndexOfWeight)) {
          _tmpWeight = null;
        } else {
          _tmpWeight = _cursor.getFloat(_cursorIndexOfWeight);
        }
        final Float _tmpHeight;
        if (_cursor.isNull(_cursorIndexOfHeight)) {
          _tmpHeight = null;
        } else {
          _tmpHeight = _cursor.getFloat(_cursorIndexOfHeight);
        }
        final Date _tmpBirthday;
        final String _tmp_2;
        if (_cursor.isNull(_cursorIndexOfBirthday)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getString(_cursorIndexOfBirthday);
        }
        _tmpBirthday = __converters.toOffsetDateTime(_tmp_2);
        final Date _tmpDebut;
        final String _tmp_3;
        if (_cursor.isNull(_cursorIndexOfDebut)) {
          _tmp_3 = null;
        } else {
          _tmp_3 = _cursor.getString(_cursorIndexOfDebut);
        }
        _tmpDebut = __converters.toOffsetDateTime(_tmp_3);
        final Boolean _tmpControl;
        final Integer _tmp_4;
        if (_cursor.isNull(_cursorIndexOfControl)) {
          _tmp_4 = null;
        } else {
          _tmp_4 = _cursor.getInt(_cursorIndexOfControl);
        }
        _tmpControl = _tmp_4 == null ? null : _tmp_4 != 0;
        final Boolean _tmpMedico;
        final Integer _tmp_5;
        if (_cursor.isNull(_cursorIndexOfMedico)) {
          _tmp_5 = null;
        } else {
          _tmp_5 = _cursor.getInt(_cursorIndexOfMedico);
        }
        _tmpMedico = _tmp_5 == null ? null : _tmp_5 != 0;
        final Boolean _tmpSms;
        final Integer _tmp_6;
        if (_cursor.isNull(_cursorIndexOfSms)) {
          _tmp_6 = null;
        } else {
          _tmp_6 = _cursor.getInt(_cursorIndexOfSms);
        }
        _tmpSms = _tmp_6 == null ? null : _tmp_6 != 0;
        final Boolean _tmpGeolocalizacion;
        final Integer _tmp_7;
        if (_cursor.isNull(_cursorIndexOfGeolocalizacion)) {
          _tmp_7 = null;
        } else {
          _tmp_7 = _cursor.getInt(_cursorIndexOfGeolocalizacion);
        }
        _tmpGeolocalizacion = _tmp_7 == null ? null : _tmp_7 != 0;
        final String _tmpNumber;
        if (_cursor.isNull(_cursorIndexOfNumber)) {
          _tmpNumber = null;
        } else {
          _tmpNumber = _cursor.getString(_cursorIndexOfNumber);
        }
        final String _tmpMirror_id;
        if (_cursor.isNull(_cursorIndexOfMirrorId)) {
          _tmpMirror_id = null;
        } else {
          _tmpMirror_id = _cursor.getString(_cursorIndexOfMirrorId);
        }
        final String _tmpTypeAccount;
        if (_cursor.isNull(_cursorIndexOfTypeAccount)) {
          _tmpTypeAccount = null;
        } else {
          _tmpTypeAccount = _cursor.getString(_cursorIndexOfTypeAccount);
        }
        final Integer _tmpOnlineId;
        if (_cursor.isNull(_cursorIndexOfOnlineId)) {
          _tmpOnlineId = null;
        } else {
          _tmpOnlineId = _cursor.getInt(_cursorIndexOfOnlineId);
        }
        final int _tmpPoints;
        _tmpPoints = _cursor.getInt(_cursorIndexOfPoints);
        _result = new User(_tmpId,_tmpUsername,_tmpBlocked,_tmpEmail,_tmpProvider,_tmpConfirmed,_tmpSex,_tmpName,_tmpAvatar,_tmpWeight,_tmpHeight,_tmpBirthday,_tmpDebut,_tmpControl,_tmpMedico,_tmpSms,_tmpGeolocalizacion,_tmpNumber,_tmpMirror_id,_tmpTypeAccount,_tmpOnlineId,_tmpPoints);
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
  public List<User> loadAll() {
    final String _sql = "SELECT * FROM user";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
      final int _cursorIndexOfBlocked = CursorUtil.getColumnIndexOrThrow(_cursor, "blocked");
      final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
      final int _cursorIndexOfProvider = CursorUtil.getColumnIndexOrThrow(_cursor, "provider");
      final int _cursorIndexOfConfirmed = CursorUtil.getColumnIndexOrThrow(_cursor, "confirmed");
      final int _cursorIndexOfSex = CursorUtil.getColumnIndexOrThrow(_cursor, "sex");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfAvatar = CursorUtil.getColumnIndexOrThrow(_cursor, "avatar");
      final int _cursorIndexOfWeight = CursorUtil.getColumnIndexOrThrow(_cursor, "weight");
      final int _cursorIndexOfHeight = CursorUtil.getColumnIndexOrThrow(_cursor, "height");
      final int _cursorIndexOfBirthday = CursorUtil.getColumnIndexOrThrow(_cursor, "birthday");
      final int _cursorIndexOfDebut = CursorUtil.getColumnIndexOrThrow(_cursor, "debut");
      final int _cursorIndexOfControl = CursorUtil.getColumnIndexOrThrow(_cursor, "control");
      final int _cursorIndexOfMedico = CursorUtil.getColumnIndexOrThrow(_cursor, "medico");
      final int _cursorIndexOfSms = CursorUtil.getColumnIndexOrThrow(_cursor, "sms");
      final int _cursorIndexOfGeolocalizacion = CursorUtil.getColumnIndexOrThrow(_cursor, "geolocalizacion");
      final int _cursorIndexOfNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "number");
      final int _cursorIndexOfMirrorId = CursorUtil.getColumnIndexOrThrow(_cursor, "mirror_id");
      final int _cursorIndexOfTypeAccount = CursorUtil.getColumnIndexOrThrow(_cursor, "type_account");
      final int _cursorIndexOfOnlineId = CursorUtil.getColumnIndexOrThrow(_cursor, "online_id");
      final int _cursorIndexOfPoints = CursorUtil.getColumnIndexOrThrow(_cursor, "sugar_points");
      final List<User> _result = new ArrayList<User>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final User _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpUsername;
        if (_cursor.isNull(_cursorIndexOfUsername)) {
          _tmpUsername = null;
        } else {
          _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
        }
        final boolean _tmpBlocked;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfBlocked);
        _tmpBlocked = _tmp != 0;
        final String _tmpEmail;
        if (_cursor.isNull(_cursorIndexOfEmail)) {
          _tmpEmail = null;
        } else {
          _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
        }
        final String _tmpProvider;
        if (_cursor.isNull(_cursorIndexOfProvider)) {
          _tmpProvider = null;
        } else {
          _tmpProvider = _cursor.getString(_cursorIndexOfProvider);
        }
        final boolean _tmpConfirmed;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfConfirmed);
        _tmpConfirmed = _tmp_1 != 0;
        final String _tmpSex;
        if (_cursor.isNull(_cursorIndexOfSex)) {
          _tmpSex = null;
        } else {
          _tmpSex = _cursor.getString(_cursorIndexOfSex);
        }
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpAvatar;
        if (_cursor.isNull(_cursorIndexOfAvatar)) {
          _tmpAvatar = null;
        } else {
          _tmpAvatar = _cursor.getString(_cursorIndexOfAvatar);
        }
        final Float _tmpWeight;
        if (_cursor.isNull(_cursorIndexOfWeight)) {
          _tmpWeight = null;
        } else {
          _tmpWeight = _cursor.getFloat(_cursorIndexOfWeight);
        }
        final Float _tmpHeight;
        if (_cursor.isNull(_cursorIndexOfHeight)) {
          _tmpHeight = null;
        } else {
          _tmpHeight = _cursor.getFloat(_cursorIndexOfHeight);
        }
        final Date _tmpBirthday;
        final String _tmp_2;
        if (_cursor.isNull(_cursorIndexOfBirthday)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getString(_cursorIndexOfBirthday);
        }
        _tmpBirthday = __converters.toOffsetDateTime(_tmp_2);
        final Date _tmpDebut;
        final String _tmp_3;
        if (_cursor.isNull(_cursorIndexOfDebut)) {
          _tmp_3 = null;
        } else {
          _tmp_3 = _cursor.getString(_cursorIndexOfDebut);
        }
        _tmpDebut = __converters.toOffsetDateTime(_tmp_3);
        final Boolean _tmpControl;
        final Integer _tmp_4;
        if (_cursor.isNull(_cursorIndexOfControl)) {
          _tmp_4 = null;
        } else {
          _tmp_4 = _cursor.getInt(_cursorIndexOfControl);
        }
        _tmpControl = _tmp_4 == null ? null : _tmp_4 != 0;
        final Boolean _tmpMedico;
        final Integer _tmp_5;
        if (_cursor.isNull(_cursorIndexOfMedico)) {
          _tmp_5 = null;
        } else {
          _tmp_5 = _cursor.getInt(_cursorIndexOfMedico);
        }
        _tmpMedico = _tmp_5 == null ? null : _tmp_5 != 0;
        final Boolean _tmpSms;
        final Integer _tmp_6;
        if (_cursor.isNull(_cursorIndexOfSms)) {
          _tmp_6 = null;
        } else {
          _tmp_6 = _cursor.getInt(_cursorIndexOfSms);
        }
        _tmpSms = _tmp_6 == null ? null : _tmp_6 != 0;
        final Boolean _tmpGeolocalizacion;
        final Integer _tmp_7;
        if (_cursor.isNull(_cursorIndexOfGeolocalizacion)) {
          _tmp_7 = null;
        } else {
          _tmp_7 = _cursor.getInt(_cursorIndexOfGeolocalizacion);
        }
        _tmpGeolocalizacion = _tmp_7 == null ? null : _tmp_7 != 0;
        final String _tmpNumber;
        if (_cursor.isNull(_cursorIndexOfNumber)) {
          _tmpNumber = null;
        } else {
          _tmpNumber = _cursor.getString(_cursorIndexOfNumber);
        }
        final String _tmpMirror_id;
        if (_cursor.isNull(_cursorIndexOfMirrorId)) {
          _tmpMirror_id = null;
        } else {
          _tmpMirror_id = _cursor.getString(_cursorIndexOfMirrorId);
        }
        final String _tmpTypeAccount;
        if (_cursor.isNull(_cursorIndexOfTypeAccount)) {
          _tmpTypeAccount = null;
        } else {
          _tmpTypeAccount = _cursor.getString(_cursorIndexOfTypeAccount);
        }
        final Integer _tmpOnlineId;
        if (_cursor.isNull(_cursorIndexOfOnlineId)) {
          _tmpOnlineId = null;
        } else {
          _tmpOnlineId = _cursor.getInt(_cursorIndexOfOnlineId);
        }
        final int _tmpPoints;
        _tmpPoints = _cursor.getInt(_cursorIndexOfPoints);
        _item = new User(_tmpId,_tmpUsername,_tmpBlocked,_tmpEmail,_tmpProvider,_tmpConfirmed,_tmpSex,_tmpName,_tmpAvatar,_tmpWeight,_tmpHeight,_tmpBirthday,_tmpDebut,_tmpControl,_tmpMedico,_tmpSms,_tmpGeolocalizacion,_tmpNumber,_tmpMirror_id,_tmpTypeAccount,_tmpOnlineId,_tmpPoints);
        _result.add(_item);
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
