package com.example.myapplication2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.view.View;

public class MeiZiView extends View{
    public float bitmapX;
    public float bitmapY;
    public MeiZiView(Context context){
        super(context);
        bitmapX = 0;
        bitmapY = 200;
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        Paint paint = new Paint();
        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(), R.drawable.s_jump);
        canvas.drawBitmap(bitmap, bitmapX, bitmapY, paint);
        if (bitmap.isRecycled()){
            bitmap.recycle();;
        }
    }
}
