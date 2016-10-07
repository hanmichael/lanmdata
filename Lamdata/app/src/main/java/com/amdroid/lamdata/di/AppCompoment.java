package com.amdroid.lamdata.di;

import android.app.Application;

import com.amdroid.lamdata.net.RetrofitHelper;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Administrator on 2016/10/7.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppCompoment   {


    //MainActivity injectActivity(MainActivity activity);
    Application getapplication();
    RetrofitHelper retrofitHelpter();

}
