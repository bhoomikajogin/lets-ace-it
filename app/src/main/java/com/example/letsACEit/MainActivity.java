package com.example.letsACEit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.letsACEit.R;

public class MainActivity extends AppCompatActivity {

    ImageView petal2,petal3, petal4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        petal2 = findViewById(R.id.petal2);
        petal3 = findViewById(R.id.petal3);
        petal4 = findViewById(R.id.petal4);
        Animation turnA = AnimationUtils.loadAnimation(this, R.anim.turn);
        petal2.setAnimation(turnA);
        Animation turnB = AnimationUtils.loadAnimation(this, R.anim.turn_3);
        petal3.setAnimation(turnB);
        Animation turnC = AnimationUtils.loadAnimation(this, R.anim.turn_4);
        petal4.setAnimation(turnC);

        Intent iHome = new Intent(MainActivity.this, HomeScreen.class);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(iHome);
                finish();
            }
        }, 2500);
    }
}