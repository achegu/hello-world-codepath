package com.example.firstmobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = ((TextView) findViewById(R.id.text));

        //user can tap on a button to change text color
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //change the text color of the label
                textView.setTextColor( getResources().getColor(R.color.purple_200));
            }
        });

        //user can tap on button to change background color
        findViewById(R.id.changeBackgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.parent).setBackgroundColor( getResources().getColor(R.color.white));
            }
        });

        //user can change text
        findViewById(R.id.changeTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Code Path rocks");
            }
        });

        //user can tap on background to reset all views to default
        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //reset text
                textView.setText("Hello Anusha!");
                //reset color
                textView.setTextColor(getResources().getColor(R.color.black));
                //reset background
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.blue_green));
            }
        });

    }
}