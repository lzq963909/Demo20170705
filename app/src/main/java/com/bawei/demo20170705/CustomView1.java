package com.bawei.demo20170705;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * date: 2017/7/5
 * author: 李志强
 * function:
 */

public class CustomView1 extends View {

    public CustomView1(Context context) {
        super(context);
    }

    public CustomView1(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setTextSize(10);
        paint.setColor(Color.BLACK);


        // 画矩形(Rect)
        Rect rect = new Rect(0, 80, 100, 160);
        canvas.drawRect(rect, paint);
        // 画矩形(RectF)
        RectF rectf = new RectF(150, 80, 250, 160);
        canvas.drawRect(rectf, paint);
        // 画矩形(坐标)
        canvas.drawRect(300, 80, 400, 160, paint);

    }
}
