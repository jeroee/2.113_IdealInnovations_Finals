package com.example.year2079;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SuperIntelligence extends AppCompatActivity {

    Button s1;
    Button s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_super_intelligence);

        s1=findViewById(R.id.s1);
        s2=findViewById(R.id.s2);

        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1=new Intent(SuperIntelligence.this, S1.class);
                startActivity(s1);
            }
        });
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s2=new Intent(SuperIntelligence.this, S2.class);
                startActivity(s2);
            }
        });
    }
}
