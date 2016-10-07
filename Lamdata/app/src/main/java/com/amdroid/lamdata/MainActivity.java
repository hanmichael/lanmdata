package com.amdroid.lamdata;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import com.amdroid.lamdata.di.ActivityCompoment;


public class MainActivity extends AppCompatActivity{


    private Button butget;
    private ActivityCompoment mActivityCompoment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDaggerActivity();
        butget= (Button) findViewById(R.id.butget);
        butget.setOnClickListener(v -> {    // 使用啦la lambda表达式
            Toast.makeText(MainActivity.this,"你好啊", Toast.LENGTH_LONG);

        });


}

    private void initDaggerActivity() {

      //
        //  mActivityCompoment= DaggerActivityCompoment.builder().activityModule(new ActivityModule(this)).build().inject(this);

//        mActivityCompoment= DaggerActivityCompoment.builder()
//                .
//                activityModule(new ActivityModule(this)).build();
//        mActivityCompoment.inject(this);
    }

//    private void getview() {
//        new Thread(() -> {   //  使用啦Lambda 表达式 ， 主要是替换的是匿名内部类的做法，这样更加简洁
//            Log.e("tag","haha");
//        }).start();
//    }

}
