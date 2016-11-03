package com.example.flthiebl.drawcanvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by flthiebl on 03/11/2016.
 */
public class DrawCanvas extends View {

    private Paint paint = null;
    private Path path = null;
    private int paintColor = 0xFF660000;

    public DrawCanvas(Context context) {
        paint = new Paint();
        path = new Path();

        paint.setColor(paintColor);

        paint.setAntiAlias(true);
        paint.setStrokeWidth(20);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    protected void reset(){

    }

    protected void onDraw(Canvas canvas){
        canvas.drawPath(this.path, this.paint);
    }

    private class mTouch implements View.OnTouchListener{
        public boolean onTouch(View v, MotionEvent event){

            return true;
        }
    }
}
