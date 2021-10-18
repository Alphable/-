package com.example.bbking;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class IntroductoryActivity extends AppCompatActivity {
    ImageView appName,splashImg;
    LottieAnimationView lottieAnimationView;

    private static final int NUM_PAGES =3;
    private ViewPager viewPager;//翻页器
    private ScreenSlidePagerAdapter screenSlidePagerAdapter;//屏幕幻灯片页面适配器

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_introductory);

        appName=findViewById(R.id.app_name);
        splashImg=findViewById(R.id.img);
        lottieAnimationView=findViewById(R.id.lottie);

        viewPager = findViewById(R.id.pager);//获取翻页控件
        screenSlidePagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(screenSlidePagerAdapter);

        splashImg.animate().translationY(-3000).setDuration(1000).setStartDelay(4000);//沿y轴向上滑，1000=1s
        appName.animate().translationY(3000).setDuration(1000).setStartDelay(4000);
        lottieAnimationView.animate().translationY(1600).setDuration(1000).setStartDelay(4000);

    }
    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter{
        public ScreenSlidePagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
        switch (position){
            case 0:
                OnBoardingFragment1 tab1=new OnBoardingFragment1();
                return tab1;
            case 1:
                OnBoardingFragment2 tab2=new OnBoardingFragment2();
                return tab2;
            case 2:
                OnBoardingFragment3 tab3=new OnBoardingFragment3();
                return tab3;
}
            return null;
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }

    }
}
