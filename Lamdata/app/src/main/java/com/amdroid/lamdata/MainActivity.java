package com.amdroid.lamdata;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button butget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butget= (Button) findViewById(R.id.butget);
        butget.setOnClickListener(v -> {    // 使用啦la lambda表达式
            Toast.makeText(MainActivity.this,"你好啊", Toast.LENGTH_LONG);
            getview();
        });


}

    private void getview() {
        new Thread(() -> {   //  使用啦Lambda 表达式 ， 主要是替换的是匿名内部类的做法，这样更加简洁
            Log.e("tag","haha");
        }).start();
    }

}
