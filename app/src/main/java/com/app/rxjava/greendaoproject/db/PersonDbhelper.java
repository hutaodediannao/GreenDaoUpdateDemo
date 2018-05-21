package com.app.rxjava.greendaoproject.db;
import com.app.rxjava.greendaoproject.GreenDaoApplication;
import com.app.rxjava.greendaoproject.model.Person;

import java.util.List;

/**
 * Created by Administrator on 2018/5/20.
 */

public class PersonDbhelper {

    public static String DB_NAME = "myData.db";

    public static long inserPerson(Person person) {
       return GreenDaoApplication.getDaoSession().getPersonDao().insert(person);
    }


    public static List<Person> queryAllPersonList() {
       return GreenDaoApplication.getDaoSession().getPersonDao().loadAll();
    }


}
