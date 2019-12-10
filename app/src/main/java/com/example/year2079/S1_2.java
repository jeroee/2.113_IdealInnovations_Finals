package com.example.year2079;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class S1_2 extends AppCompatActivity {

    TextView abc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s1_2);

        abc=findViewById(R.id.s1_2content);

        abc.setMovementMethod(new ScrollingMovementMethod());
    }
}
