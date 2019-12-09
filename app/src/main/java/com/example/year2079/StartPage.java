package com.example.year2079;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartPage extends AppCompatActivity {

    Button start;
    Button checklist;
    Button us;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        start=findViewById(R.id.start);
        checklist=findViewById(R.id.checklist);
        us=findViewById(R.id.us);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go = new Intent(StartPage.this, Year2079.class);
                startActivity(go);
            }
        });

        checklist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent list = new Intent(StartPage.this, Scope.class);
                startActivity(list);
            }
        });

        us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent us = new Intent(StartPage.this, Members.class);
                startActivity(us);
            }
        });
    }
}
