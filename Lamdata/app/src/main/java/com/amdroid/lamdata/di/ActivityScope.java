package com.amdroid.lamdata.di;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by Administrator on 2016/10/7.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ActivityScope{
}
