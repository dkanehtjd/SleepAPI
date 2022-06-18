package com.android.example.sleepcodelab.data.db;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class SleepClassifyEventDao_Impl implements SleepClassifyEventDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<SleepClassifyEventEntity> __insertionAdapterOfSleepClassifyEventEntity;

  private final EntityDeletionOrUpdateAdapter<SleepClassifyEventEntity> __deletionAdapterOfSleepClassifyEventEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public SleepClassifyEventDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSleepClassifyEventEntity = new EntityInsertionAdapter<SleepClassifyEventEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `sleep_classify_events_table` (`time_stamp_seconds`,`confidence`,`motion`,`light`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SleepClassifyEventEntity value) {
        stmt.bindLong(1, value.getTimestampSeconds());
        stmt.bindLong(2, value.getConfidence());
        stmt.bindLong(3, value.getMotion());
        stmt.bindLong(4, value.getLight());
      }
    };
    this.__deletionAdapterOfSleepClassifyEventEntity = new EntityDeletionOrUpdateAdapter<SleepClassifyEventEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `sleep_classify_events_table` WHERE `time_stamp_seconds` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SleepClassifyEventEntity value) {
        stmt.bindLong(1, value.getTimestampSeconds());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM sleep_classify_events_table";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final SleepClassifyEventEntity sleepClassifyEventEntity,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfSleepClassifyEventEntity.insert(sleepClassifyEventEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertAll(final List<SleepClassifyEventEntity> sleepClassifyEventEntities,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfSleepClassifyEventEntity.insert(sleepClassifyEventEntities);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object delete(final SleepClassifyEventEntity sleepClassifyEventEntity,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfSleepClassifyEventEntity.handle(sleepClassifyEventEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteAll(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAll.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public Flow<List<SleepClassifyEventEntity>> getAll() {
    final String _sql = "SELECT * FROM sleep_classify_events_table ORDER BY time_stamp_seconds DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"sleep_classify_events_table"}, new Callable<List<SleepClassifyEventEntity>>() {
      @Override
      public List<SleepClassifyEventEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTimestampSeconds = CursorUtil.getColumnIndexOrThrow(_cursor, "time_stamp_seconds");
          final int _cursorIndexOfConfidence = CursorUtil.getColumnIndexOrThrow(_cursor, "confidence");
          final int _cursorIndexOfMotion = CursorUtil.getColumnIndexOrThrow(_cursor, "motion");
          final int _cursorIndexOfLight = CursorUtil.getColumnIndexOrThrow(_cursor, "light");
          final List<SleepClassifyEventEntity> _result = new ArrayList<SleepClassifyEventEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SleepClassifyEventEntity _item;
            final int _tmpTimestampSeconds;
            _tmpTimestampSeconds = _cursor.getInt(_cursorIndexOfTimestampSeconds);
            final int _tmpConfidence;
            _tmpConfidence = _cursor.getInt(_cursorIndexOfConfidence);
            final int _tmpMotion;
            _tmpMotion = _cursor.getInt(_cursorIndexOfMotion);
            final int _tmpLight;
            _tmpLight = _cursor.getInt(_cursorIndexOfLight);
            _item = new SleepClassifyEventEntity(_tmpTimestampSeconds,_tmpConfidence,_tmpMotion,_tmpLight);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
