package com.example.wxx.fast13;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);

        Button button_tele=findViewById(R.id.button_1);
        button_tele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FirstActivity.this, TeleActivity.class);
                startActivity(intent);
            }
        });

        Button button_introFAST=findViewById(R.id.button_2);
        button_introFAST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FirstActivity.this, IntroFASTActivity.class);
                startActivity(intent);
            }
        });

        Button button_introSTAR=findViewById(R.id.button_3);
        button_introSTAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FirstActivity.this, IntroStarActivity.class);
                startActivity(intent);
            }
        });

        Button button_introNAN=findViewById(R.id.button_4);
        button_introNAN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FirstActivity.this, NanAllActivity.class);
                startActivity(intent);
            }
        });
    }
}
