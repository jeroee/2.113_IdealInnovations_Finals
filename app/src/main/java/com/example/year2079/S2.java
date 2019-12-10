package com.example.year2079;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class S2 extends AppCompatActivity {
    Button s2_1;
    Button s2_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s2);

        s2_1 = findViewById(R.id.s21);
        s2_2 = findViewById(R.id.s22);

        s2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s2_1 = new Intent(S2.this, S2_1.class);
                startActivity(s2_1);
            }
        });

        s2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s2_2 = new Intent(S2.this,S2_2.class);
                startActivity(s2_2);
            }
        });
    }
}
