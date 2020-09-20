package com.example.viewdraw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

public class MyView extends View {
    Paint p1 = new Paint();
    Paint p2 = new Paint();
    Paint p3 = new Paint();

    //매개변수가 1개인 생성자를 만듦
    MyView(Context context){
        super(context);
        p1.setTextSize(50);
        p1.setColor(Color.BLUE); //색상 지정 방법

        p2.setColor(0xff990085);    //색상 16진수로 지정하기: 투명도, RED, GREEN, BlUE
        p1.setStrokeWidth(8);   //선 두꼐 지정
        p3.setARGB(100,153,0,133); //색상 10진수로 지정자기
    }

    public void onDraw(Canvas canvas){
        canvas.drawARGB(100, 150,50,50);    //캔버스 바탁생 지정하기

        canvas.drawRect(0,0,200,200,p1);    //사각형 그리기
        canvas.drawRect(200,0,400,200,p2);
        canvas.drawRect(400,0,600,200,p3);
        canvas.drawCircle(100,300,100,p1);  //원그리기
        canvas.drawLine(200,1100,600,1100,p1);//라인 그리기

        //rect 사각형 안에 원을 그린다.
        RectF rect = new RectF(200,600,600,1000);
        canvas.drawArc(rect,0,320,true,p1); // false:호 true:부채꼴모양

    }

}
