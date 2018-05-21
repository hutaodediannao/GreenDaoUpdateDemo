package com.app.rxjava.greendaoproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.app.rxjava.greendaoproject.db.PersonDbhelper;
import com.app.rxjava.greendaoproject.model.Person;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.tv);
    }

    /**
     * 添加一条数据到数据库
     * @param view
     */
    public void add(View view) {
        Person p = new Person();
        p.setName("胡涛");
        p.setAge(28);
        p.setCity("深圳");
        p.setStudyCode(10086);
        p.setExt("这是新添加的字段值哦，傻逼，才第一次弄啊");
        p.setExt2("这个是新字段哦，展示处理了，就表示成功了哦");
        p.setExt3("这个是新字段哦，展示处理了，就表示成功了哦");
        p.setExt4("这个是新字段哦，可以睡觉了哦");
        p.setExt5("666");
        p.setExt5("8888888888888888");

       long insertResult = PersonDbhelper.inserPerson(p);
        Toast.makeText(this, "" + insertResult, Toast.LENGTH_SHORT).show();
    }

    public void queryAll(View view) {
        List<Person> personList = PersonDbhelper.queryAllPersonList();
        textView.setText(personList.toString());
    }
}
