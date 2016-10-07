package com.amdroid.lamdata.di;

import android.app.Application;

import com.amdroid.lamdata.MyApplication;
import com.amdroid.lamdata.net.RetrofitHelper;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * 提供主要的实例构造
 */
@Module
public class AppModule {
    private MyApplication myApplication;



    public AppModule(MyApplication myApplication) {
        this.myApplication = myApplication;
    }
    @Singleton
    @Provides
    Application prpoviderApplication(){
        return myApplication;
    }

    @Singleton
    @Provides
    RetrofitHelper prividerRetrofitHelpter(){
        return new RetrofitHelper();
    }



}
