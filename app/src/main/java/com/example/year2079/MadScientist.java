package com.example.year2079;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MadScientist extends AppCompatActivity {

    TextView scicontent;
    Button m1;
    Button m2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad_scientist);

        scicontent = findViewById(R.id.scicontent);
        scicontent.setMovementMethod(new ScrollingMovementMethod());

        m1 = findViewById(R.id.m1);
        m2 = findViewById(R.id.m2);

        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m1 = new Intent(MadScientist.this, M1.class);
                startActivity(m1);
            }
        });
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m2 = new Intent(MadScientist.this, M2.class);
                startActivity(m2);
            }
        });
    }
}
