package com.example.year2079;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Governor extends AppCompatActivity {
    TextView context;
    Button governorButton_1_1;
    Button governorButton_1_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_governor);
        context=findViewById(R.id.governor_context);
        context.setMovementMethod(new ScrollingMovementMethod());
        governorButton_1_1=findViewById(R.id.governorButton_1_1);
        governorButton_1_2=findViewById(R.id.governorButton_1_2);

        governorButton_1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Governor.this,Gov_context_1_1.class);
                startActivity(intent);

            }
        });

        governorButton_1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Governor.this, Gov_context_1_2.class);
                startActivity(intent);
            }
        });
    }
}
