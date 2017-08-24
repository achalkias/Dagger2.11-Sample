package com.achalkias.dagger211.main;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.achalkias.dagger211.R;
import com.achalkias.dagger211.service.CommonHelloService;
import com.achalkias.dagger211.service.MainHelloService;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

public class MainActivity extends AppCompatActivity implements HasSupportFragmentInjector {


    @Inject
    DispatchingAndroidInjector<Fragment> fragmentDispatchingAndroidInjector;

    @Inject
    CommonHelloService commonHelloService;

    @Inject
    MainHelloService mainHelloService;


    private TextView mCommonHello;

    private TextView mMainHello;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Inject
        AndroidInjection.inject(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initView();
        sayCommonHello();
        sayMainHello();
    }

    private void initView() {
        mCommonHello = (TextView) findViewById(R.id.common_hello);
        mMainHello = (TextView) findViewById(R.id.main_hello);
    }


    private void sayCommonHello() {
        mCommonHello.setText(commonHelloService.sayHello());
    }


    private void sayMainHello() {
        mMainHello.setText(mainHelloService.sayHello());
    }

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return fragmentDispatchingAndroidInjector;
    }
}
