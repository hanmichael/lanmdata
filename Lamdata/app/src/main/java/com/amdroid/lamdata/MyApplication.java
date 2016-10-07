package com.amdroid.lamdata;

import android.app.Application;

import com.amdroid.lamdata.di.AppCompoment;
import com.amdroid.lamdata.di.AppModule;
import com.amdroid.lamdata.di.DaggerAppCompoment;

import javax.inject.Singleton;

/**
 * Created by Administrator on 2016/10/7.
 */
@Singleton
public class MyApplication extends Application


{
    private AppCompoment mAppCompoment;

    @Override
    public void onCreate() {
        super.onCreate();
        // 对某些东西进行初始化
        initDaggerComponent();


    }

    private void initDaggerComponent() {
        mAppCompoment = DaggerAppCompoment.builder().appModule(new AppModule(this)).build();

    }

    public AppCompoment getmAppCompoment() {
        return mAppCompoment;
    }
}
