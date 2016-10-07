package com.amdroid.lamdata.di;

import com.amdroid.lamdata.MainActivity;

import dagger.Component;

/**
 * Created by Administrator on 2016/10/7.
 */
@ActivityScope
@Component(modules=ActivityModule.class,dependencies = AppModule.class)
public interface ActivityCompoment {

    MainActivity inject(MainActivity mainActivity);




}
