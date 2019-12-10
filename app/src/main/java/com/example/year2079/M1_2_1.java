package com.example.year2079;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class M1_2_1 extends AppCompatActivity {
    Button home;
    TextView abc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m1_2_1);

        abc=findViewById(R.id.m1_2_1content);

        abc.setMovementMethod(new ScrollingMovementMethod());

        home=findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(M1_2_1.this, StartPage.class);
                startActivity(home);
            }
        });
    }
}
