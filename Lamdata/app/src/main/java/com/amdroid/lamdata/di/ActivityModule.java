package com.amdroid.lamdata.di;

import android.content.Context;

import com.amdroid.lamdata.MainActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2016/10/7.
 */
@Module
public class ActivityModule  {
    private Context mainATyContext;

    public ActivityModule(Context mainATyContext) {
        this.mainATyContext = mainATyContext;
    }

    @ActivityScope
    @Provides
    public MainActivity providerMainActivity(){
        return (MainActivity) mainATyContext;


    }


}
