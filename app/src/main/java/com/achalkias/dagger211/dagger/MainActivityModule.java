package com.achalkias.dagger211.dagger;

import com.achalkias.dagger211.service.MainHelloService;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Apostolos Chalkias on 8/24/2017.
 */
@Module
public class MainActivityModule {

    @Provides
    MainHelloService provideMainHelloService() {
        return new MainHelloService();
    }
}
