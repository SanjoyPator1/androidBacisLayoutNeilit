package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declare
        TextView textView = findViewById(R.id.textView01);
        Button clickMeButton = findViewById(R.id.button);

        //array
        String welcomeSentences[] = new String[]{"yoo", "Howdy",
                                    "Hit me up", "nice top meet you",
                                "Button is clicked. Welcome to Android development"} ;

        //change the text if clicked
        clickMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int rnd = new Random().nextInt(welcomeSentences.length);
                textView.setText(welcomeSentences[rnd]);
            }
        });


    }
}