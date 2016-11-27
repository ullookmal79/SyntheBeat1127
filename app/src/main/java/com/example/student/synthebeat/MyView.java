package com.example.student.synthebeat;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by student on 2016-11-25.
 */

public class MyView extends LinearLayout implements View.OnTouchListener{
    Context context;
    String TAG = this.getClass().getName();

    int width;
    int height;

    final int id_line6 = 6;

    LinearLayout back;
    LinearLayout line1;
    LinearLayout line2;
    LinearLayout line3;
    LinearLayout line4;
    LinearLayout line5;
    LinearLayout line6;

    public MyView(Context context) {
        super(context);
        this.context = context;
        this.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        this.setOrientation(LinearLayout.VERTICAL);
        init();
    }

    public void init(){
        DisplayMetrics dm = context.getResources().getDisplayMetrics();

        width = dm.widthPixels;
        height = dm.heightPixels;

        back = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams0 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, (int)(height*0.5));
        layoutParams0.topMargin = (int)(height*0.3);
        back.setLayoutParams(layoutParams0);
        back.setOrientation(LinearLayout.VERTICAL);
        back.setBackgroundColor(Color.RED);
        back.setOnTouchListener(this);
        this.addView(back);
        line1 = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams1 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, (int)(height*0.01));
        layoutParams1.topMargin = (int)(height*0.06);
        line1.setLayoutParams(layoutParams1);
        line1.setBackgroundColor(Color.BLACK);
        line1.setOnTouchListener(this);
        back.addView(line1);
        line2 = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, (int)(height*0.012));
        layoutParams2.topMargin = (int)(height*0.06);
        line2.setLayoutParams(layoutParams2);
        line2.setBackgroundColor(Color.BLACK);
        line2.setOnTouchListener(this);
        back.addView(line2);
        line3 = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, (int)(height*0.014));
        layoutParams3.topMargin = (int)(height*0.06);
        line3.setLayoutParams(layoutParams3);
        line3.setBackgroundColor(Color.BLACK);
        line3.setOnTouchListener(this);
        back.addView(line3);
        line4 = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, (int)(height*0.016));
        layoutParams4.topMargin = (int)(height*0.06);
        line4.setLayoutParams(layoutParams4);
        line4.setBackgroundColor(Color.BLACK);
        line4.setOnTouchListener(this);
        back.addView(line4);
        line5 = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, (int)(height*0.018));
        layoutParams5.topMargin = (int)(height*0.06);
        line5.setLayoutParams(layoutParams5);
        line5.setBackgroundColor(Color.BLACK);
        line5.setOnTouchListener(this);
        back.addView(line5);
        line6 = new LinearLayout(context);
       // line6.setId(6);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, (int)(height*0.020));
        layoutParams6.topMargin = (int)(height*0.06);
        line6.setLayoutParams(layoutParams6);
        line6.setBackgroundColor(Color.BLACK);
        line6.setOnTouchListener(this);
        back.addView(line6);

        Toast.makeText(context, "높이:"+height+" 너비:"+width, Toast.LENGTH_SHORT).show();
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Toast.makeText(context, "x:"+event.getRawX()+"y:"+event.getRawY(), Toast.LENGTH_SHORT).show();
        return super.onTouchEvent(event);
    }

    public boolean isTouchInside(View view, int x, int y) {
        int location[] = new int[2];

        final int realRight = location[0] + view.getWidth();
        final int realBottom = location[1] + view.getHeight();
        final boolean result = ((x >= location[0] && x <= realRight) && (y >= location[1] && y <= realBottom));

        return result;
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if(motionEvent.getAction() == MotionEvent.ACTION_MOVE || motionEvent.getAction() == MotionEvent.ACTION_DOWN){
            Toast.makeText(context, "line Touch", Toast.LENGTH_SHORT).show();
            switch (view.getId()){

            }

        }

        return false;
    }
}
