package com.amdroid.lamdata.di;

import android.app.Activity;

import com.amdroid.lamdata.MainActivity;
import com.amdroid.lamdata.ui.fragment.ActivirtyPresenter;

import dagger.Component;

/**
 * Created by Administrator on 2016/10/7.
 */
@ActivityScope
@Component(modules=ActivityModule.class,dependencies = AppModule.class)
public interface ActivityCompoment {
    Activity getActivity();
    MainActivity inject(MainActivity mainActivity);

    ActivirtyPresenter presenter();



}
