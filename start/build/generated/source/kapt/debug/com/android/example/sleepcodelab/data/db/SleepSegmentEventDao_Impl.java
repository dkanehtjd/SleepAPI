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
public final class SleepSegmentEventDao_Impl implements SleepSegmentEventDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<SleepSegmentEventEntity> __insertionAdapterOfSleepSegmentEventEntity;

  private final EntityDeletionOrUpdateAdapter<SleepSegmentEventEntity> __deletionAdapterOfSleepSegmentEventEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public SleepSegmentEventDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSleepSegmentEventEntity = new EntityInsertionAdapter<SleepSegmentEventEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `sleep_segment_events_table` (`start_time_millis`,`end_time_millis`,`status`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SleepSegmentEventEntity value) {
        stmt.bindLong(1, value.getStartTimeMillis());
        stmt.bindLong(2, value.getEndTimeMillis());
        stmt.bindLong(3, value.getStatus());
      }
    };
    this.__deletionAdapterOfSleepSegmentEventEntity = new EntityDeletionOrUpdateAdapter<SleepSegmentEventEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `sleep_segment_events_table` WHERE `start_time_millis` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SleepSegmentEventEntity value) {
        stmt.bindLong(1, value.getStartTimeMillis());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM sleep_segment_events_table";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final SleepSegmentEventEntity sleepSegmentEventEntity,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfSleepSegmentEventEntity.insert(sleepSegmentEventEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertAll(final List<SleepSegmentEventEntity> sleepSegmentEventEntities,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfSleepSegmentEventEntity.insert(sleepSegmentEventEntities);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object delete(final SleepSegmentEventEntity sleepSegmentEventEntity,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfSleepSegmentEventEntity.handle(sleepSegmentEventEntity);
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
  public Flow<List<SleepSegmentEventEntity>> getAll() {
    final String _sql = "SELECT * FROM sleep_segment_events_table ORDER BY start_time_millis DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"sleep_segment_events_table"}, new Callable<List<SleepSegmentEventEntity>>() {
      @Override
      public List<SleepSegmentEventEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfStartTimeMillis = CursorUtil.getColumnIndexOrThrow(_cursor, "start_time_millis");
          final int _cursorIndexOfEndTimeMillis = CursorUtil.getColumnIndexOrThrow(_cursor, "end_time_millis");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final List<SleepSegmentEventEntity> _result = new ArrayList<SleepSegmentEventEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SleepSegmentEventEntity _item;
            final long _tmpStartTimeMillis;
            _tmpStartTimeMillis = _cursor.getLong(_cursorIndexOfStartTimeMillis);
            final long _tmpEndTimeMillis;
            _tmpEndTimeMillis = _cursor.getLong(_cursorIndexOfEndTimeMillis);
            final int _tmpStatus;
            _tmpStatus = _cursor.getInt(_cursorIndexOfStatus);
            _item = new SleepSegmentEventEntity(_tmpStartTimeMillis,_tmpEndTimeMillis,_tmpStatus);
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
