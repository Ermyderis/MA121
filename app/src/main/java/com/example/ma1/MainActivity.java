package com.example.ma1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    Button btn;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.textView);
        btn = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
                                   @SuppressLint("SetTextI18n")
                                   @Override
                                   public void onClick(View v){
                                       txt.setText("Button was clicked");
                                   }

                               }
        );
        btn2.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v){
                                       Random rnd = new Random();
                                       int randomcolor = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                                       txt.setTextColor(randomcolor);


                                   }

                               }
        );
    }
}