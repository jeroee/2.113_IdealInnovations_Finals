package com.example.year2079;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class S1 extends AppCompatActivity {
    TextView s1;
    Button s1_1;
    Button s1_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s1);
        s1=findViewById(R.id.s1content);
        s1.setMovementMethod(new ScrollingMovementMethod());
        s1_1=findViewById(R.id.s11);
        s1_2=findViewById(R.id.s12);


        s1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1_1 = new Intent(S1.this,S1_1.class);
                startActivity(s1_1);
            }
        });
        s1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1_2 = new Intent(S1.this, S1_2.class);
                startActivity(s1_2);
            }
        });

    }

}
