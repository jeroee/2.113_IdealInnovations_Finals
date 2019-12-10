package com.example.year2079;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import org.w3c.dom.Text;

public class G1_2 extends AppCompatActivity {

    TextView abc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g1_2);

        abc=findViewById(R.id.g1_2content);

        abc.setMovementMethod(new ScrollingMovementMethod());
    }
}
