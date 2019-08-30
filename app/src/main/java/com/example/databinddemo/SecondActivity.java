package com.example.databinddemo;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableField;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.databinddemo.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    ObservableUser user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySecondBinding viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_second);
        user=new ObservableUser("uuu","men456",55);
        viewDataBinding.setUser(user);
        viewDataBinding.setHandle(new SecondHandle());
    }

    public class SecondHandle{
        public void changeName(){
            user.name.set("name4564");
        }
        public void changeSex(){
            user.sex.set("men8888");
        }
        public void lanuch(){
            startActivity(new Intent(SecondActivity.this,ThreeActivity.class));
        }
    }
}
