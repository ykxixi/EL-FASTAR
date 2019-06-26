package com.example.wxx.fast13;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class NanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nan);

        TextView textView=findViewById(R.id.text_view);
        textView.setMovementMethod(ScrollingMovementMethod.getInstance());
    }
}
