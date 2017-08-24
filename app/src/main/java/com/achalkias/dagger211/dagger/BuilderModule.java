package com.achalkias.dagger211.dagger;

import com.achalkias.dagger211.main.MainActivity;
import com.achalkias.dagger211.main.MainFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Apostolos Chalkias on 8/24/2017.
 */
@Module
public abstract class BuilderModule {

    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity bindMainActivity();

    @ContributesAndroidInjector(modules = MainFragmentModule.class)
    // or gain access to lobby activity dependencies from fragment via
    // @ContributesAndroidInjector(modules = {LobbyFragmentModule.class, LobbyActivityModule.class})
    abstract MainFragment bindMainFragment();


    //Add all your binding for other sub-components here


}
