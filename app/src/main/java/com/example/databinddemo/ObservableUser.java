package com.example.databinddemo;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

public class ObservableUser {
    public ObservableField<String>name;
    public ObservableField<String>sex;
    public  ObservableInt age;

    public ObservableUser(String name, String sex, int age) {
        this.name = new ObservableField<>(name);
        this.sex = new ObservableField<>(sex);
        this.age = new ObservableInt(age);
    }
}
