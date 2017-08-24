package com.achalkias.dagger211.dagger;

import com.achalkias.dagger211.App;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjection;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by Apostolos Chalkias on 8/24/2017.
 */

@Singleton
@Component(modules = {
        /* Use AndroidInjectionModule.class if you're not using support library */
        AndroidSupportInjectionModule.class,
        AppModule.class,
        BuilderModule.class})


public interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder applicatoin(App application);
        AppComponent build();
    }

    void inject(App app);
}
