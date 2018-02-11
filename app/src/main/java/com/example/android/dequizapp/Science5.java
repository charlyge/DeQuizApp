package com.example.android.dequizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

import static com.example.android.dequizapp.Science.gotIt;

public class Science5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science5);
        Submit();
    }


    public void Submit() {


        Button bt = (Button) findViewById(R.id.nextid);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random generator = new Random();
                int number = generator.nextInt(10);
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
                    case 5:
                        activity = Science5.class;
                        break;
                    case 6:
                        activity = Science6.class;
                        break;
                    case 7:
                        activity = Science7.class;
                        break;
                    case 8:
                        activity = Science8.class;
                        break;
                    case 9:
                        activity = Science9.class;
                        break;
                    default:
                        activity = Science10.class;
                        break;
                }
                isAnswer();
                // We use intents to start activities
                Intent intent = new Intent(getBaseContext(), activity);
                startActivity(intent);


            }
        });

    }


    public void isAnswer(){

        RadioButton rb = (RadioButton)findViewById(R.id.radio4);
        if(rb.isChecked()){
            gotIt=gotIt+1;
            Toast toast = new Toast(Science5.this);
            View view1 =getLayoutInflater().inflate(R.layout.toast4,(ViewGroup)findViewById(R.id.toastView));
            toast.setView(view1);
            toast.show();
            toast.setDuration(Toast.LENGTH_SHORT);

        }else{
            gotIt = gotIt + 0;

            Toast toast = new Toast(Science5.this);
            View view1 =getLayoutInflater().inflate(R.layout.toast1,(ViewGroup)findViewById(R.id.toastView));
            toast.setView(view1);
            toast.show();
            toast.setDuration(Toast.LENGTH_SHORT);
        }

        String currentScore = "you current Score is "+ gotIt;



        Toast.makeText(Science5.this,currentScore,Toast.LENGTH_LONG).show();
    }

    /**
     * Take care of popping the fragment back stack or finishing the activity
     * as appropriate.
     */
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Science5.this,MainActivity.class);
        startActivity(intent);
        gotIt=0;
    }


}
//Answer b4