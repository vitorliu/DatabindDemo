package com.example.databinddemo;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableArrayMap;
import android.databinding.ObservableList;
import android.databinding.ObservableMap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.databinddemo.databinding.ActivitySecondBinding;
import com.example.databinddemo.databinding.ActivityThreeBinding;

public class ThreeActivity extends AppCompatActivity {
    ObservableList<String>list;
    ObservableMap<String,String> map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityThreeBinding viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_three);
        list=new ObservableArrayList<>();
        list.add("vitor");
        list.add("mike");
        list.add("lucy");
        viewDataBinding.setList(list);
        map=new ObservableArrayMap<>();
        map.put("1","111");
        map.put("2","222");
        map.put("3","333");
        viewDataBinding.setMap(map);
        viewDataBinding.setIndex(0);
        viewDataBinding.setKey("1");
        viewDataBinding.setHandle(new ThreeHandle());
    }

    public class ThreeHandle{
        public void changeList(){
            list.add(0,"oooo");
        }
        public void changeMap(){
            map.put("1","55555");
        }

    }
}
