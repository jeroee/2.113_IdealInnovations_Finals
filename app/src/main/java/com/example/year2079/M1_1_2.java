package com.example.year2079;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import org.w3c.dom.Text;

public class M1_1_2 extends AppCompatActivity {

    TextView m1_1_2content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m1_1_2);

        m1_1_2content=findViewById(R.id.m1_1_2content);

        m1_1_2content.setMovementMethod(new ScrollingMovementMethod());
    }
}
