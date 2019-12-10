package com.example.year2079;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class G1_1_2 extends AppCompatActivity {

    Button home;

    TextView abc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g1_1_2);

        abc=findViewById(R.id.g1_1_2content);
        abc.setMovementMethod(new ScrollingMovementMethod());

        home=findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(G1_1_2.this, StartPage.class);
                startActivity(home);
            }
        });
    }
}
