package com.amdroid.lamdata.base;

/**
 * Created by Administrator on 2016/10/7.
 */

public interface BasePresenter <T extends BaseView>{
    void attchview(T view);
    void deattacview(T view);
    void oncreate();
    void onstart();
    void onpause();
    void onstop();

}
