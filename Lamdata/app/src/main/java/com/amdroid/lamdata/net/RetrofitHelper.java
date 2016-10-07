package com.amdroid.lamdata.net;

import android.util.Log;

import com.amdroid.lamdata.api.YnetApi;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 封装网络请求的基类
 */

public class RetrofitHelper {
    private  YnetApi  ynetAPI= null;

    public RetrofitHelper() {
        init();
         ynetAPI =getYnetAPI();
    }


    private  void  init(){
        initOkhttp();
    }
    private static File cacheDir;
    private static long defaultCacheSize = 10 * 1024;
    private static OkHttpClient mHttpClient;

    /**
     * okhttp 的初始化
     *
     */

    private  void initOkhttp() {


        final Cache simplecache= new Cache(cacheDir,defaultCacheSize);

        OkHttpClient.Builder builder= new OkHttpClient.Builder();
        builder.addInterceptor(LoggerInterceptor.create())
                .readTimeout(10000, TimeUnit.MICROSECONDS)
                .connectTimeout(15000,TimeUnit.MICROSECONDS)
                .cache(simplecache)
                .build();
         mHttpClient=builder.build();

    }
    public static class  LoggerInterceptor implements Interceptor{


        private static final String TAG=">>>REQUAL:";

       public  static LoggerInterceptor create(){
           return  new LoggerInterceptor();
       }

        @Override
        public Response intercept(Chain chain) throws IOException {
            Log.d(TAG, chain.request().toString());


            return chain.proceed(chain.request());
        }
    }

    /**
     * 创建 ynetapi 的请求
     * @return
     */

    private  static  YnetApi getYnetAPI() {
        Retrofit ynetRetrofit= new Retrofit.Builder().baseUrl(YnetApi.HOST)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return ynetRetrofit.create(YnetApi.class);


    }

}
