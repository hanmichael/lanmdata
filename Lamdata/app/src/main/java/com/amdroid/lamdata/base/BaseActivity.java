package com.amdroid.lamdata.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Administrator on 2016/10/7.
 */

public   abstract  class BaseActivity < T extends BasePresenter> extends AppCompatActivity implements  BaseView{

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);


    }


}
