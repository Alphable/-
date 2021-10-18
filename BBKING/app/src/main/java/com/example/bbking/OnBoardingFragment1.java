package com.example.bbking;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class OnBoardingFragment1 extends Fragment {//OnBoardingFragment向初次使用者展示
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root=(ViewGroup)inflater.inflate(R.layout.fragment_on_boarding1,container,false);
//把UI放进容器。第一个参数，要填充的内容；第二个参数，填充到哪去，默认container；第三个，是否和主界面进行同步，一般false
//  inflate方法返回一个View类
        return root;
    }
}
