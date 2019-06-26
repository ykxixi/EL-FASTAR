package com.example.wxx.fast13;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.wxx.fast13.R;

public class intro_f4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_f4);

        TextView textView=findViewById(R.id.text_view);
        textView.setMovementMethod(ScrollingMovementMethod.getInstance());
    }
}
