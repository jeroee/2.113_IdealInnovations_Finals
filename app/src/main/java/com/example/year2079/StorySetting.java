package com.example.year2079;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.MovementMethod;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StorySetting extends AppCompatActivity {

    Button Governor;
    Button MadScientist;
    Button SI;
    TextView content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_setting);

        content = findViewById(R.id.storycontent);
        Governor = findViewById(R.id.GovernorButton);
        MadScientist = findViewById(R.id.MadScientistButton);
        SI= findViewById(R.id.SuperintelligenceButton);

        content.setMovementMethod(new ScrollingMovementMethod());

        Governor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g = new Intent(StorySetting.this, Governor.class);
                startActivity(g);
            }
        });
        MadScientist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent(StorySetting.this, MadScientist.class);
                startActivity(m);
            }
        });
        SI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s = new Intent(StorySetting.this, SuperIntelligence.class);
                startActivity(s);
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent start = new Intent(StorySetting.this, StartPage.class);
        startActivity(start);
    }
}
