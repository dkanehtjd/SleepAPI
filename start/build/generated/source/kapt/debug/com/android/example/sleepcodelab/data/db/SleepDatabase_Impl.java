package com.android.example.sleepcodelab.data.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class SleepDatabase_Impl extends SleepDatabase {
  private volatile SleepSegmentEventDao _sleepSegmentEventDao;

  private volatile SleepClassifyEventDao _sleepClassifyEventDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(3) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `sleep_segment_events_table` (`start_time_millis` INTEGER NOT NULL, `end_time_millis` INTEGER NOT NULL, `status` INTEGER NOT NULL, PRIMARY KEY(`start_time_millis`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `sleep_classify_events_table` (`time_stamp_seconds` INTEGER NOT NULL, `confidence` INTEGER NOT NULL, `motion` INTEGER NOT NULL, `light` INTEGER NOT NULL, PRIMARY KEY(`time_stamp_seconds`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '4dced49307e85b95d630699c003cd1e4')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `sleep_segment_events_table`");
        _db.execSQL("DROP TABLE IF EXISTS `sleep_classify_events_table`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
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
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsSleepSegmentEventsTable = new HashMap<String, TableInfo.Column>(3);
        _columnsSleepSegmentEventsTable.put("start_time_millis", new TableInfo.Column("start_time_millis", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSleepSegmentEventsTable.put("end_time_millis", new TableInfo.Column("end_time_millis", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSleepSegmentEventsTable.put("status", new TableInfo.Column("status", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSleepSegmentEventsTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSleepSegmentEventsTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSleepSegmentEventsTable = new TableInfo("sleep_segment_events_table", _columnsSleepSegmentEventsTable, _foreignKeysSleepSegmentEventsTable, _indicesSleepSegmentEventsTable);
        final TableInfo _existingSleepSegmentEventsTable = TableInfo.read(_db, "sleep_segment_events_table");
        if (! _infoSleepSegmentEventsTable.equals(_existingSleepSegmentEventsTable)) {
          return new RoomOpenHelper.ValidationResult(false, "sleep_segment_events_table(com.android.example.sleepcodelab.data.db.SleepSegmentEventEntity).\n"
                  + " Expected:\n" + _infoSleepSegmentEventsTable + "\n"
                  + " Found:\n" + _existingSleepSegmentEventsTable);
        }
        final HashMap<String, TableInfo.Column> _columnsSleepClassifyEventsTable = new HashMap<String, TableInfo.Column>(4);
        _columnsSleepClassifyEventsTable.put("time_stamp_seconds", new TableInfo.Column("time_stamp_seconds", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSleepClassifyEventsTable.put("confidence", new TableInfo.Column("confidence", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSleepClassifyEventsTable.put("motion", new TableInfo.Column("motion", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSleepClassifyEventsTable.put("light", new TableInfo.Column("light", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSleepClassifyEventsTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSleepClassifyEventsTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSleepClassifyEventsTable = new TableInfo("sleep_classify_events_table", _columnsSleepClassifyEventsTable, _foreignKeysSleepClassifyEventsTable, _indicesSleepClassifyEventsTable);
        final TableInfo _existingSleepClassifyEventsTable = TableInfo.read(_db, "sleep_classify_events_table");
        if (! _infoSleepClassifyEventsTable.equals(_existingSleepClassifyEventsTable)) {
          return new RoomOpenHelper.ValidationResult(false, "sleep_classify_events_table(com.android.example.sleepcodelab.data.db.SleepClassifyEventEntity).\n"
                  + " Expected:\n" + _infoSleepClassifyEventsTable + "\n"
                  + " Found:\n" + _existingSleepClassifyEventsTable);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "4dced49307e85b95d630699c003cd1e4", "c36bc562168f44a382693f4c44e97982");
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
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "sleep_segment_events_table","sleep_classify_events_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `sleep_segment_events_table`");
      _db.execSQL("DELETE FROM `sleep_classify_events_table`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public SleepSegmentEventDao sleepSegmentEventDao() {
    if (_sleepSegmentEventDao != null) {
      return _sleepSegmentEventDao;
    } else {
      synchronized(this) {
        if(_sleepSegmentEventDao == null) {
          _sleepSegmentEventDao = new SleepSegmentEventDao_Impl(this);
        }
        return _sleepSegmentEventDao;
      }
    }
  }

  @Override
  public SleepClassifyEventDao sleepClassifyEventDao() {
    if (_sleepClassifyEventDao != null) {
      return _sleepClassifyEventDao;
    } else {
      synchronized(this) {
        if(_sleepClassifyEventDao == null) {
          _sleepClassifyEventDao = new SleepClassifyEventDao_Impl(this);
        }
        return _sleepClassifyEventDao;
      }
    }
  }
}
