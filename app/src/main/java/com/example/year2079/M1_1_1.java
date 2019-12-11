package com.example.year2079;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class M1_1_1 extends AppCompatActivity {

    Button home;

    TextView m1_1_1content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m1_1_1);

        m1_1_1content=findViewById(R.id.m1_1_1content);
        m1_1_1content.setMovementMethod(new ScrollingMovementMethod());

        home=findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(M1_1_1.this, StartPage.class);
                startActivity(home);
            }
        });
    }
}
