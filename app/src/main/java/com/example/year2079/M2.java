package com.example.year2079;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class M2 extends AppCompatActivity {

    Button m2_1;
    Button m2_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m2);

        m2_1=findViewById(R.id.m2_1);
        m2_2=findViewById(R.id.m2_2);

        m2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(M2.this, M2_1.class);
                startActivity(a);
            }
        });

        m2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(M2.this,M2_2.class);
                startActivity(b);
            }
        });
    }
}
