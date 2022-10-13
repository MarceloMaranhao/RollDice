package com.deepcode.rolldice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btRoll = findViewById(R.id.btRoll);
        TextView tvCount = findViewById(R.id.tvCount);
        ImageView ivDieFace = findViewById(R.id.ivDieFace);

        ivDieFace.setImageResource(R.drawable.singledie);
        int max = 6;
        int min = 1;

        btRoll.setOnClickListener(view -> {
            int randomDieFace = ThreadLocalRandom.current().nextInt(min, max + 1);

            tvCount.setText(String.valueOf(randomDieFace));
            if(randomDieFace==1){
                ivDieFace.setImageResource(R.drawable.dieface1b);
            } else if (randomDieFace==2){
                ivDieFace.setImageResource(R.drawable.dieface2b);
            } else if (randomDieFace==3){
                ivDieFace.setImageResource(R.drawable.dieface3b);
            } else if (randomDieFace==4){
                ivDieFace.setImageResource(R.drawable.dieface4b);
            } else if (randomDieFace==5){
                ivDieFace.setImageResource(R.drawable.dieface5b);
            } else {
                ivDieFace.setImageResource(R.drawable.dieface6b);
            }
            //ivDieFace.setImageResource(R.drawable);
        });
    }
}