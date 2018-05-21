package com.app.rxjava.greendaoproject;

import android.app.Application;
import android.content.Context;

import com.app.rxjava.greendaoproject.db.DaoMaster;
import com.app.rxjava.greendaoproject.db.DaoSession;

/**
 * Created by Administrator on 2018/5/20.
 */

public class GreenDaoApplication extends Application {

    public static final String DB_NAME = "myData.db";
    public static Context instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static DaoSession getDaoSession() {
        return DaoMaster.newDevSession(instance, DB_NAME);
    }
}
