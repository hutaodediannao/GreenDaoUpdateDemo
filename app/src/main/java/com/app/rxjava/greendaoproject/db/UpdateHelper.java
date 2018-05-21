package com.app.rxjava.greendaoproject.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.github.yuweiguocn.library.greendao.MigrationHelper;

import org.greenrobot.greendao.database.Database;

/**
 * 升级工具类，不能放在DaoMaser类里面，因为sync一下，该工具方法会被覆盖失效的哦
 * Created by Administrator on 2018/5/20.
 */

public class UpdateHelper {

    public static class MySQLiteOpenHelper extends DaoMaster.OpenHelper {
        public MySQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory) {
            super(context, name, factory);
        }
        @Override
        public void onUpgrade(Database db, int oldVersion, int newVersion) {
            MigrationHelper.migrate(db, new MigrationHelper.ReCreateAllTableListener() {
                        @Override
                        public void onCreateAllTables(Database db, boolean ifNotExists) {
                            DaoMaster.createAllTables(db, ifNotExists);
                        }
                        @Override
                        public void onDropAllTables(Database db, boolean ifExists) {
                            DaoMaster.dropAllTables(db, ifExists);
                        }
                    },PersonDao.class
//                    , TestData2Dao.class, TestData3Dao.class
            );
        }
    }

}
