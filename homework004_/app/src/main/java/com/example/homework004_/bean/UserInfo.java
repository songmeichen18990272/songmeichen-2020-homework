package com.example.homework004_.bean;
public class UserInfo {
    public long rowid;
    public int sn;
    public String name;
    public int age;
    public long height;
    public float weight;
    public boolean Sex;
    public String update_time;
    public String phone;
    public String pwd;

    public UserInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        age = 0;
        height = 0L;
        weight = 0.0f;
        Sex = false;
        update_time = "";
        phone = "";
        pwd = "";
    }
}