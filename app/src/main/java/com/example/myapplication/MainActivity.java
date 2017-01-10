package com.example.myapplication;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface buttonFont = Typeface.createFromAsset(getAssets(), "fonts/Cuprum-Regular.ttf");
        Typeface textFont = Typeface.createFromAsset(getAssets(), "fonts/Arial.ttf");

        Button visualizerButton = (Button)findViewById(R.id.selectButton);
        Button requestButton = (Button)findViewById(R.id.requestButton);
        Button tutorialButton = (Button)findViewById(R.id.tutorialButton);
        Button contactButton = (Button)findViewById(R.id.contactButton);
        TextView bottomView = (TextView)findViewById(R.id.bottomBar);

        visualizerButton.setTypeface(buttonFont);
        requestButton.setTypeface(buttonFont);
        tutorialButton.setTypeface(buttonFont);
        contactButton.setTypeface(buttonFont);
        bottomView.setTypeface(textFont);
    }
    public void contact(View view) {
        Intent intent = new Intent(this, contactUs.class);
        startActivity(intent);
    }
    public void request(View view) {
        Intent intent = new Intent(this, sampleRequest.class);
        startActivity(intent);
    }
}
