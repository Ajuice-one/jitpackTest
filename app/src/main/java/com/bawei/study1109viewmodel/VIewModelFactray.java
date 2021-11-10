//作者：游戏学院 1904A 王天傲

package com.bawei.study1109viewmodel;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

/**
 * 作者： 1904A 王天傲
 * 编写时间: 2021/11/9 15:38
 * 用途：viewmdoel工厂
 */
public class VIewModelFactray implements ViewModelProvider.Factory {
    private String a;

    public VIewModelFactray(String a) {
        this.a = a;
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public <T extends ViewModel> T create(@NonNull @org.jetbrains.annotations.NotNull Class<T> modelClass) {
        return (T) new ViewModelMy(a);
    }
}
