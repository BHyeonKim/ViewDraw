package com.example.viewdraw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //뷰객체 생성시 매개변수로 this를 넣어줘야 한다.
        MyView view = new MyView(this);
        //커스텀뷰 객체를 매개변수로 넘겨준다. XML파일 대신에 커스텀뷰가 화면에 제시된다.
        setContentView(view);
    }
}