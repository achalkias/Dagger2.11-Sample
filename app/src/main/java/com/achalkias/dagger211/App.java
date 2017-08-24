package com.achalkias.dagger211;

import android.app.Activity;
import android.app.Application;

import com.achalkias.dagger211.dagger.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Created by Apostolos Chalkias on 8/24/2017.
 */

public class App extends Application implements HasActivityInjector {


    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();

       // TODO : Add dagger component

        DaggerAppComponent
                .builder()
                .applicatoin(this)
                .build()
                .inject(this);

    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }
}
