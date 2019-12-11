package com.example.year2079;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class M1_1 extends AppCompatActivity {

    Button m1_1_1;
    Button m1_1_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m1_1);

        m1_1_1=findViewById(R.id.m1_1_1);
        m1_1_2=findViewById(R.id.m1_1_2);

        m1_1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(M1_1.this, M1_1_1.class);
                startActivity(a);
            }
        });

        m1_1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(M1_1.this, M1_1_2.class);
                startActivity(b);
            }
        });
    }
}
