package com.example.year2079;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class G1_1 extends AppCompatActivity {

    Button g1_1_1;
    Button g1_1_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g1_1);

        g1_1_1=findViewById(R.id.g1_1_1);
        g1_1_2=findViewById(R.id.g1_1_2);

        g1_1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g1_1_1 = new Intent(G1_1.this, G1_1_1.class);
                startActivity(g1_1_1);
            }
        });
        g1_1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g1_1_2 = new Intent(G1_1.this, G1_1_2.class);
                startActivity(g1_1_2);
            }
        });
    }
}
