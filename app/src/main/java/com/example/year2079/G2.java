package com.example.year2079;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class G2 extends AppCompatActivity {

    Button abc;
    Button def;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g2);

        abc=findViewById(R.id.g2_1);
        def=findViewById(R.id.g2_2);

        abc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(G2.this, G2_1.class);
                startActivity(a);
            }
        });

        def.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(G2.this, G2_2.class);
                startActivity(b);
            }
        });
    }
}
