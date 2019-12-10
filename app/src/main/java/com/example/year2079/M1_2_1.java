package com.example.year2079;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class M1_2_1 extends AppCompatActivity {
    TextView abc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m1_2_1);

        abc=findViewById(R.id.m1_2_1content);

        abc.setMovementMethod(new ScrollingMovementMethod());
    }
}
