package com.example.year2079;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Governor extends AppCompatActivity {
    TextView content;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_governor);

        content = findViewById(R.id.govcontent);

        content.setMovementMethod(new ScrollingMovementMethod());
    }
}
