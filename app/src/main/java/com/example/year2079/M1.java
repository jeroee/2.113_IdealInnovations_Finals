package com.example.year2079;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class M1 extends AppCompatActivity {

    TextView m1content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m1);

        m1content=findViewById(R.id.m1content);
        m1content.setMovementMethod(new ScrollingMovementMethod());
    }
}
