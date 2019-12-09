package com.example.year2079;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Governor extends AppCompatActivity {
    TextView content;
    Button g1;
    Button g2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_governor);

        content = findViewById(R.id.govcontent);

        content.setMovementMethod(new ScrollingMovementMethod());

        g1=findViewById(R.id.g1);
        g2=findViewById((R.id.g2));

        g1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g1 = new Intent(Governor.this,G1.class);
                startActivity(g1);
            }
        });

        g2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g2 = new Intent(Governor.this, G2.class);
                startActivity(g2);
            }
        });
    }
}
