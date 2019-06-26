package com.example.wxx.fast13;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.wxx.fast13.R;

import java.util.ArrayList;
import java.util.List;

public class IntroStarActivity extends AppCompatActivity {
    private List<Star> starList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introstar);

//        ImageButton button1=findViewById(R.id.button_1);
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(IntroStarActivity.this, Cons1Activity.class);
//                startActivity(intent);
//            }
//        });
//
//        ImageButton button2=findViewById(R.id.button_2);
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(IntroStarActivity.this, Cons2Activity.class);
//                startActivity(intent);
//            }
//        });
//
//        ImageButton button3=findViewById(R.id.button_3);
//        button3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(IntroStarActivity.this, Cons3Activity.class);
//                startActivity(intent);
//            }
//        });
//
//        ImageButton button4=findViewById(R.id.button_4);
//        button4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(IntroStarActivity.this, Cons4Activity.class);
//                startActivity(intent);
//            }
//        });
//
//        ImageButton button5=findViewById(R.id.button_5);
//        button5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(IntroStarActivity.this, Cons5Activity.class);
//                startActivity(intent);
//            }
//        });
//
//        ImageButton button6=findViewById(R.id.button_6);
//        button6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(IntroStarActivity.this, Cons1Activity.class);
//                startActivity(intent);
//            }
//        });
//
//        ImageButton button7=findViewById(R.id.button_7);
//        button7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(IntroStarActivity.this, Cons1Activity.class);
//                startActivity(intent);
//            }
//        });
//
//        ImageButton button8=findViewById(R.id.button_8);
//        button8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(IntroStarActivity.this, Cons1Activity.class);
//                startActivity(intent);
//            }
//        });
//
//        ImageButton button9=findViewById(R.id.button_9);
//        button9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(IntroStarActivity.this, Cons1Activity.class);
//                startActivity(intent);
//            }
//        });
//
//        ImageButton button10=findViewById(R.id.button_10);
//        button10.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(IntroStarActivity.this, Cons1Activity.class);
//                startActivity(intent);
//            }
//        });
//
//        ImageButton button11=findViewById(R.id.button_11);
//        button11.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(IntroStarActivity.this, Cons1Activity.class);
//                startActivity(intent);
//            }
//        });
//
//        ImageButton button12=findViewById(R.id.button_12);
//        button12.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(IntroStarActivity.this, Cons1Activity.class);
//                startActivity(intent);
//            }
//        });

        initStars();
        final RecyclerView recyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation((LinearLayoutManager.HORIZONTAL));
        recyclerView.setLayoutManager(layoutManager);
        StarAdapter adapter = new StarAdapter(starList);
        recyclerView.setAdapter(adapter);

        adapter.setItemClickListener(new OnRecyclerViewClickListener() {
            @Override
            public void onItemClickListener(View view) {
                int position = recyclerView.getChildAdapterPosition(view);
                switch (position){
                    case 0:
                        startActivity(new Intent(IntroStarActivity.this,Cons1Activity.class));
                        break;
                    case 1:
                        startActivity(new Intent(IntroStarActivity.this,Cons2Activity.class));
                        break;
                    case 2:
                        startActivity(new Intent(IntroStarActivity.this,Cons3Activity.class));
                        break;
                    case 3:
                        startActivity(new Intent(IntroStarActivity.this,Cons4Activity.class));
                        break;
                    case 4:
                        startActivity(new Intent(IntroStarActivity.this,Cons5Activity.class));
                        break;
                    case 5:
                        startActivity(new Intent(IntroStarActivity.this,Cons6Activity.class));
                        break;
                    case 6:
                        startActivity(new Intent(IntroStarActivity.this,Cons7Activity.class));
                        break;
                    case 7:
                        startActivity(new Intent(IntroStarActivity.this,Cons8Activity.class));
                        break;
                    case 8:
                        startActivity(new Intent(IntroStarActivity.this,Cons9Activity.class));
                        break;
                    case 9:
                        startActivity(new Intent(IntroStarActivity.this,Cons10Activity.class));
                        break;
                    case 10:
                        startActivity(new Intent(IntroStarActivity.this,Cons11Activity.class));
                        break;
                    case 11:
                        startActivity(new Intent(IntroStarActivity.this,Cons12Activity.class));
                        break;
                }
            }

            @Override
            public void onItemLongClickListener(View view) {

            }
        });
//        View view=new View();
//        final StarAdapter.ViewHolder holder = new StarAdapter.ViewHolder(view);
//        holder.starView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int position = holder.getAdapterPosition();
//                Star star = starList.get(position);
//                switch (star.getName()) {
//                    case "南冕座":
//                        Intent intent1 = new Intent(IntroStarActivity.this, Cons1Activity.class);
//                        startActivity(intent1);
//                        break;
//                    case "北冕座":
//                        Intent intent2 = new Intent(IntroStarActivity.this, Cons2Activity.class);
//                        startActivity(intent2);
//                        break;
//                    case "豺狼座":
//                        Intent intent3 = new Intent(IntroStarActivity.this, Cons3Activity.class);
//                        startActivity(intent3);
//                        break;
//                    case "仙王座":
//                        Intent intent4 = new Intent(IntroStarActivity.this, Cons4Activity.class);
//                        startActivity(intent4);
//                        break;
//                    case "仙后座":
//                        Intent intent5 = new Intent(IntroStarActivity.this, Cons5Activity.class);
//                        startActivity(intent5);
//                        break;
//                    case "鹿豹座":
//                        Intent intent6 = new Intent(IntroStarActivity.this, Cons6Activity.class);
//                        startActivity(intent6);
//                        break;
//                    case "蛇夫座":
//                        Intent intent7 = new Intent(IntroStarActivity.this, Cons7Activity.class);
//                        startActivity(intent7);
//                        break;
//                    case "双鱼座":
//                        Intent intent8 = new Intent(IntroStarActivity.this, Cons8Activity.class);
//                        startActivity(intent8);
//                        break;
//                    case "天蝎座":
//                        Intent intent9 = new Intent(IntroStarActivity.this, Cons9Activity.class);
//                        startActivity(intent9);
//                        break;
//                    case "摩羯座":
//                        Intent intent10 = new Intent(IntroStarActivity.this, Cons10Activity.class);
//                        startActivity(intent10);
//                        break;
//                    case "宝瓶座":
//                        Intent intent11 = new Intent(IntroStarActivity.this, Cons11Activity.class);
//                        startActivity(intent11);
//                        break;
//                    case "人马座":
//                        Intent intent12 = new Intent(IntroStarActivity.this, Cons12Activity.class);
//                        startActivity(intent12);
//                        break;
//                }
//
//            }
//        });
    }

    private void initStars() {
        Star star_1 = new Star("南冕座", R.drawable.cons1);
        starList.add(star_1);
        Star star_2 = new Star("北冕座", R.drawable.cons2);
        starList.add(star_2);
        Star star_3 = new Star("豺狼座", R.drawable.cons3);
        starList.add(star_3);
        Star star_4 = new Star("仙王座", R.drawable.cons4);
        starList.add(star_4);
        Star star_5 = new Star("仙后座", R.drawable.cons5);
        starList.add(star_5);
        Star star_6 = new Star("鹿豹座", R.drawable.cons6);
        starList.add(star_6);
        Star star_7 = new Star("蛇夫座", R.drawable.cons7);
        starList.add(star_7);
        Star star_8 = new Star("双鱼座", R.drawable.cons8);
        starList.add(star_8);
        Star star_9 = new Star("天蝎座", R.drawable.cons9);
        starList.add(star_9);
        Star star_10 = new Star("摩羯座", R.drawable.cons10);
        starList.add(star_10);
        Star star_11 = new Star("宝瓶座", R.drawable.cons11);
        starList.add(star_11);
        Star star_12 = new Star("人马座", R.drawable.cons12);
        starList.add(star_12);

    }
}
