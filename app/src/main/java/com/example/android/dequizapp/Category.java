package com.example.android.dequizapp;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Random;

public class Category extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        goScienece();
        goComputer();
        goGeneralKnowlege();
    }

    // method to go to Science question Activity

    public void  goScienece(){
        
        Button bt =(Button) findViewById(R.id.science);
        bt.setOnClickListener( new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Random generator = new Random();
                int number = generator.nextInt(5);
                // The '5' is the number of activities

                Class activity = null;

                // Here, we are checking to see what the output of the random was
                switch(number) {
                    case 1:
                        // E.g., if the output is 1, the activity we will open is ActivityOne.class
                        activity = Science.class;
                        break;
                    case 2:
                        activity = Science2.class;
                        break;
                    case 3:
                        activity = Science3.class;
                        break;
                    case 4:
                        activity = Science4.class;
                        break;
                    default:
                        activity = Science5.class;
                        break;
                }

                // We use intents to start activities
                Intent intent = new Intent(getBaseContext(), activity);
                startActivity(intent);
            }

        });
    }


    // Method that starts up General knowledge quiz
    public void goGeneralKnowlege(){



    }


    // method that Starts up computer quiz
    public void goComputer(){



    }
}
