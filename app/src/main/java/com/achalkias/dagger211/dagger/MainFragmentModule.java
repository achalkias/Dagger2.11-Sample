package com.achalkias.dagger211.dagger;

import com.achalkias.dagger211.service.MainFragmentHelloService;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Apostolos Chalkias on 8/24/2017.
 */
@Module
public class MainFragmentModule {

    @Provides
    MainFragmentHelloService providesMainFragmentHelloService() {
        return new MainFragmentHelloService();
    }

}
