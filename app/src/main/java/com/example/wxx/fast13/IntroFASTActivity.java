package com.example.wxx.fast13;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.wxx.fast13.R;

public class IntroFASTActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introfast);

        Button button4=findViewById(R.id.button_1);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(IntroFASTActivity.this, intro_f1Activity.class);
                startActivity(intent);
            }
        });

        Button button5=findViewById(R.id.button_2);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(IntroFASTActivity.this, intro_f2Activity.class);
                startActivity(intent);
            }
        });

        Button button6=findViewById(R.id.button_3);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(IntroFASTActivity.this, intro_f3Activity.class);
                startActivity(intent);
            }
        });

        Button button7=findViewById(R.id.button_4);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(IntroFASTActivity.this, intro_f4Activity.class);
                startActivity(intent);
            }
        });

        Button button8=findViewById(R.id.button_5);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(IntroFASTActivity.this, intro_f5Activity.class);
                startActivity(intent);
            }
        });
    }

}
