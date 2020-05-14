package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.*;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final Button askbutton = findViewById(R.id.askbutton);
       final ImageView balls = findViewById(R.id.image_eightBall);

       final int[] ballarray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

       askbutton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               System.out.println("Button Pressed");

               Random randomnummbergenerator = new Random();
               int num = randomnummbergenerator.nextInt(6);
                balls.setImageResource(ballarray[num]);

           }
       });



    }
}
