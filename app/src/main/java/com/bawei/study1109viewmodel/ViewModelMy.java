//作者：游戏学院 1904A 王天傲

package com.bawei.study1109viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * 作者： 1904A 王天傲
 * 编写时间: 2021/11/9 15:16
 * 用途：voiewmodel
 */
public class ViewModelMy extends ViewModel {

    public ViewModelMy(String a) {
        this.stringLiveData.setValue(a);
    }

    MutableLiveData<String> stringLiveData = new MutableLiveData<>();
    MutableLiveData<Food> foodMutableLiveData = new MutableLiveData<>();
    MutableLiveData<Bean> beanMutableLiveData = new MutableLiveData<>();

    int a = 0;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
