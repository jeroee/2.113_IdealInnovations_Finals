package com.example.year2079;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;

public class Year2079 extends AppCompatActivity {
    ImageView fade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year2079);

        fade = findViewById(R.id.fader);
        Animation fadeIn = new AlphaAnimation(0, 1);
        fadeIn.setInterpolator(new DecelerateInterpolator());
        fadeIn.setDuration(1500);

        Animation fadeOut = new AlphaAnimation(1, 0);
        fadeOut.setInterpolator(new AccelerateInterpolator());
        fadeOut.setStartOffset(2000);
        fadeOut.setDuration(1500);

        AnimationSet animation = new AnimationSet(false);
        animation.addAnimation(fadeIn);
        animation.addAnimation(fadeOut);
        fade.setAnimation(animation);

        Intent intent = new Intent(Year2079.this, StorySetting.class);
        startActivity(intent);




    }
}