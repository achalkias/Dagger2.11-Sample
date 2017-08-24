package com.achalkias.dagger211.dagger;

import android.content.Context;

import com.achalkias.dagger211.App;
import com.achalkias.dagger211.service.CommonHelloService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Apostolos Chalkias on 8/24/2017.
 */

@Module
public class AppModule {



    @Provides
    Context provideContext(App application) {
        return application.getApplicationContext();
    }


    @Singleton
    @Provides
    CommonHelloService providesCommonHelloService() {
        return new CommonHelloService();
    }

}
