//作者：游戏学院 1904A 王天傲

package com.bawei.study1109viewmodel;

import androidx.databinding.ObservableField;

/**
 * 作者： 1904A 王天傲
 * 编写时间: 2021/11/10 9:08
 * 用途：实体类
 */
public class Bean {
    public ObservableField<String> name;
    public ObservableField<Integer> a;


    public ObservableField<String> getName() {
        return name;
    }

    public void setName(ObservableField<String> name) {
        this.name = name;
    }

    public ObservableField<Integer> getA() {
        return a;
    }

    public void setA(ObservableField<Integer> a) {
        this.a = a;
    }

    public Bean(String name, int a) {
        this.name = new ObservableField<>(name);
        this.a = new ObservableField<>(a);
    }

}
