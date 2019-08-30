package com.example.databinddemo;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.Observable;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.databinddemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    UserObserable user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //    setContentView(R.layout.activity_main);
        ActivityMainBinding viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new UserObserable("mike", "women", "23");
        viewDataBinding.setUser(user);
        viewDataBinding.setHandle(new UserHandle());
        user.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable sender, int propertyId) {
                switch (propertyId) {
                    case BR.name:
                        Log.d("asd", "name");
                        break;
                    case BR.sex:
                        Log.d("asd", "sex");
                        break;
                    case BR._all:
                        Log.d("asd", "_all");
                        break;
                    default:
                        Log.d("asd", "no");
                        break;
                }
            }
        });
    }

    public class UserHandle {
        public void changeName() {
            user.setName("lucy123");
            user.setAge("45");
        }

        public void changeAll() {
            user.setSex("men123");
            user.setAge("56");
        }

        public void gotoSecond(){
            startActivity(new Intent(MainActivity.this,SecondActivity.class));
        }
    }
}
