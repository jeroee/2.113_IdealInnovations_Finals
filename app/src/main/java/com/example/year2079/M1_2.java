package com.example.year2079;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class M1_2 extends AppCompatActivity {
    TextView abc;
    Button m1_2_1;
    Button m1_2_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m1_2);

        abc=findViewById(R.id.textView7);
        m1_2_1=findViewById(R.id.m1_2_1);
        m1_2_2=findViewById(R.id.m1_2_2);

        m1_2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(M1_2.this, M1_2_1.class);
                startActivity(a);
            }
        });

        m1_2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(M1_2.this, M1_2_2.class);
                startActivity(b);
            }
        });
        abc.setMovementMethod(new ScrollingMovementMethod());
    }
}
