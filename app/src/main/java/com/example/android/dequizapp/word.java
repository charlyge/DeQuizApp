package com.example.android.dequizapp;

/**
 * Created by DELL PC on 2/7/2018.
 */

public class word {
    private String textview;
    private String radioT1;
    private String radioT2;
    private String radioT3;
    private String radioT4;

    public word(String textview,String radioT1,String radioT2,String radioT3,String radioT4){

        this.textview=textview;
        this.radioT1=radioT1;
        this.radioT2=radioT2;
        this.radioT3=radioT3;
        this.radioT4=radioT4;

    }
    public String getTextview(){
        return textview;

    }
    public String getRadioT1(){
        return radioT1;

    }
    public String getRadioT2(){

        return radioT2;
    }

    public String getRadioT3(){

        return radioT3;
    }

    public String getRadioT4(){

        return radioT4;
    }
}
