package com.example.android.dequizapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class Science extends AppCompatActivity {

    // A global Variable keeps track of the user score throughout the Activities
    public static int gotIt = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science);

       /* ArrayList<word> words = new ArrayList<>();
        words.add(new word("1. This is the first Question","Answer1","Answer2","Answer3","Answer4"));

        wordAdapter wordAd = new wordAdapter(this,words);
        ListView li = (ListView)findViewById(R.id.list1);
        li.setAdapter(wordAd);
       */

        Submit();


    }

    /**
     * Method invokes when the start button is clicked and make a toast with an image before
     * moving to the next Activity
     **/

    public void Submit() {


        Button bt = (Button) findViewById(R.id.nextid);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random generator = new Random();
                int number = generator.nextInt(5) + 1;
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
                isAnswer();
                Intent intent = new Intent(getBaseContext(), activity);
                startActivity(intent);

            }


        });

    }

    // method updates the user score based on his or her selection on the Radio Button
    public void isAnswer() {

        RadioButton rb = (RadioButton) findViewById(R.id.radio2);
        if (rb.isChecked()) {
            gotIt = gotIt + 1;
            Toast toast = new Toast(Science.this);
            View view1 = getLayoutInflater().inflate(R.layout.toast3, (ViewGroup) findViewById(R.id.toastView));
            toast.setView(view1);
            toast.show();
            toast.setDuration(Toast.LENGTH_SHORT);
        } else {
            gotIt = gotIt + 0;
            // A toast image shown when user makes the wrong selection
            Toast toast = new Toast(Science.this);
            View view1 = getLayoutInflater().inflate(R.layout.toast1, (ViewGroup) findViewById(R.id.toastView));
            toast.setView(view1);
            toast.show();
            toast.setDuration(Toast.LENGTH_SHORT);
        }

        String currentScore = "you current Score is " + gotIt;


// Displays current Score to user as a Toast message
        Toast.makeText(Science.this, currentScore, Toast.LENGTH_LONG).show();
    }

    /**
     * Take care of popping the fragment back stack or finishing the activity
     * as appropriate.
     */
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Science.this, MainActivity.class);
        startActivity(intent);
        gotIt = 0;
    }
}
