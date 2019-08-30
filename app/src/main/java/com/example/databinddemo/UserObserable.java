package com.example.databinddemo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class UserObserable extends BaseObservable {
    @Bindable
    public String name;
    @Bindable
    public String sex;
    public String age;

    public UserObserable(String name, String sex, String age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(com.example.databinddemo.BR.name);
    }

    public void setSex(String sex) {
        this.sex = sex;
        notifyChange();
    }

    public void setAge(String age) {
        this.age = age;
    }
}
