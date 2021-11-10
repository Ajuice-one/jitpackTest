package com.bawei.study1109viewmodel;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.bawei.study1109viewmodel.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //使用databinding初始化视图
        activityMainBinding = (ActivityMainBinding) DataBindingUtil.setContentView(this, R.layout.activity_main);
        //获取viewmodel
        ViewModelMy viewModelMy = new ViewModelProvider(this, new VIewModelFactray("sp或" + 0)).get(ViewModelMy.class);

        //模拟数据
//        Food aaa = new Food();
//        aaa.setRet(999);

        {
            viewModelMy.beanMutableLiveData.setValue(new Bean("aaa",1));
        }

//        viewModelMy.foodMutableLiveData.setValue(aaa);
//
//        viewModelMy.foodMutableLiveData.observe(this, new Observer<Food>() {
//            @Override
//            public void onChanged(Food food) {
                activityMainBinding.setBean(viewModelMy.beanMutableLiveData.getValue());
//            }
//        });


        //绑定点击事件
        activityMainBinding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                //自增
                viewModelMy.beanMutableLiveData.getValue().name.set("aaawww");


            }
        });

    }

}