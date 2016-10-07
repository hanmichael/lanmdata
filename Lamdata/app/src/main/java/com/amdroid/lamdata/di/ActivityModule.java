package com.amdroid.lamdata.di;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2016/10/7.
 */
@Module
public class ActivityModule  {

    private Activity mActivity;

    public ActivityModule(Activity mActivity) {
        this.mActivity = mActivity;
    }
    @ActivityScope
    @Provides
    public Activity providerActivity(){

        return mActivity;


    }


}
