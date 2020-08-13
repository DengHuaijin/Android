package com.example.myapplication2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.app.Activity;
import android.widget.TextView;
import android.widget.Toast;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {
    private Button record_btn;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = MainActivity.this;
        record_btn = (Button) findViewById(R.id.record_btn);
        record_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                midToast("Recording...", Toast.LENGTH_SHORT);
            }
        });
    }

    private void midToast(String str, int showTime) {
        TextView toast_msg = (TextView) findViewById(R.id.toast_msg);
        toast_msg.setText(str);
        toast_msg.setTextColor((Color.RED));
        Toast toast = Toast.makeText(mContext, str, showTime);
        toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();
    }
}