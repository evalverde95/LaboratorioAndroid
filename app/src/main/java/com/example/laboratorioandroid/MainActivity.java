package com.example.laboratorioandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alarm(View view){
        // Convert view to button
        Button button = (Button) view;
        // Set random button color
        buttonColor(button);
        // Create media player element and play
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.caralarm);
        mp.start();
    }

    public void iloveyou(View view){
        // Convert view to button
        Button button = (Button) view;
        // Set random button color
        buttonColor(button);
        // Create media player element and play
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.iloveu);
        mp.start();
    }

    public void laugh(View view){
        // Convert view to button
        Button button = (Button) view;
        // Set random button color
        buttonColor(button);
        // Create media player element and play
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.risa);
        mp.start();
    }

    public void sh(View view){
        // Convert view to button
        Button button = (Button) view;
        // Set random button color
        buttonColor(button);
        // Create media player element and play
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.shsound);
        mp.start();
    }

    public void cough(View view){
        // Convert view to button
        Button button = (Button) view;
        // Set random button color
        buttonColor(button);
        // Create media player element and play
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.tos);
        mp.start();
    }

    public void siren(View view){
        // Convert view to button
        Button button = (Button) view;
        // Set random button color
        buttonColor(button);
        // Create media player element and play
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.sirena);
        mp.start();
    }


    public void buttonColor(Button button) {
        // Declare color and random variable
        Random random = new Random();
        int red,green,blue,color;

        // Generate random color components
        red = random.nextInt(256);
        green = random.nextInt(256);
        blue = random.nextInt(256);
        // Color is bright
        if (red+green+blue>=255){
            // Set text color to black
            button.setTextColor(Color.BLACK);
        }else {
            // Set text color to white
            button.setTextColor(Color.WHITE);
        }
        // Create random color with the rgb components
        color = Color.argb(255,red,green,blue);

        // Assign random color to button background
        button.setBackgroundColor(color);
    }
}