package com.example.android.dequizapp;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DELL PC on 2/7/2018.
 */

public class wordAdapter extends ArrayAdapter<word> {


    public wordAdapter(Activity context, ArrayList<word> words){

        super(context,0,words);
    }


    @NonNull
    @Override

    public View getView(int position,  View convertView, @NonNull ViewGroup parent) {
 View ListItemView = convertView;

        if(ListItemView==null){

            ListItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_science,parent,false);
        }
     word currentWord = getItem(position);

        TextView tv = (TextView) ListItemView.findViewById(R.id.textV);
        assert currentWord != null;
        tv.setText(currentWord.getTextview());

        RadioButton rb1 = (RadioButton)ListItemView.findViewById(R.id.radio1);
        rb1.setText(currentWord.getRadioT1());

        RadioButton rb2 = (RadioButton)ListItemView.findViewById(R.id.radio2);
        rb2.setText(currentWord.getRadioT2());

        RadioButton rb3 = (RadioButton)ListItemView.findViewById(R.id.radio3);
        rb3.setText(currentWord.getRadioT3());

        RadioButton rb4 = (RadioButton)ListItemView.findViewById(R.id.radio4);
        rb4.setText(currentWord.getRadioT4());



        return ListItemView;

    }
}
