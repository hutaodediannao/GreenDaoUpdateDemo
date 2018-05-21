package com.app.rxjava.greendaoproject.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/5/20.
 */

@Entity
public class Person {

    @Id(autoincrement = true)//表明id是否自增
    private Long id;
    @NotNull//非空
    private String name;
    private Integer age;
    private Integer studyCode;
    private Integer sex;
//    @Transient//标识这个字段是自定义的不会创建到数据库表里
    private String city;

    //开始模拟添加新字段
    private String ext;//新字段
    private String ext2;//新字段2
    private String ext3;//新字段3
    private String ext4;//新字段4
    private String ext5;//新字段5
    private String ext6;//新字段5

    public Person() {}

    @Generated(hash = 1543170186)
    public Person(Long id, @NotNull String name, Integer age, Integer studyCode,
            Integer sex, String city, String ext, String ext2, String ext3,
            String ext4, String ext5, String ext6) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.studyCode = studyCode;
        this.sex = sex;
        this.city = city;
        this.ext = ext;
        this.ext2 = ext2;
        this.ext3 = ext3;
        this.ext4 = ext4;
        this.ext5 = ext5;
        this.ext6 = ext6;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getStudyCode() {
        return studyCode;
    }

    public void setStudyCode(Integer studyCode) {
        this.studyCode = studyCode;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2;
    }

    public String getExt3() {
        return ext3;
    }

    public void setExt3(String ext3) {
        this.ext3 = ext3;
    }

    public String getExt4() {
        return ext4;
    }

    public void setExt4(String ext4) {
        this.ext4 = ext4;
    }

    public String getExt5() {
        return ext5;
    }

    public void setExt5(String ext5) {
        this.ext5 = ext5;
    }

    public String getExt6() {
        return ext6;
    }

    public void setExt6(String ext6) {
        this.ext6 = ext6;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", studyCode=" + studyCode +
                ", sex=" + sex +
                ", city='" + city + '\'' +
                ", ext='" + ext + '\'' +
                ", ext2='" + ext2 + '\'' +
                ", ext3='" + ext3 + '\'' +
                ", ext4='" + ext4 + '\'' +
                ", ext5='" + ext5 + '\'' +
                ", ext6='" + ext6 + '\'' +
                '}';
    }
}
