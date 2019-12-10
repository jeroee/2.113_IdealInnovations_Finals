package com.example.year2079;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class M1_1_1 extends AppCompatActivity {

    TextView m1_1_1content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m1_1_1);

        m1_1_1content=findViewById(R.id.m1_1_1content);
        m1_1_1content.setMovementMethod(new ScrollingMovementMethod());
    }
}
