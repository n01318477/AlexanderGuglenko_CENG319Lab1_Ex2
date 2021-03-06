package com.gugliamo.alexanderguglenko_ceng319lab1_ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class AIActivity extends AppCompatActivity {

    static TextView tvCycle;
    static int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_i);

        tvCycle = (TextView) findViewById(R.id.AIActivity_text);

        display(getString(R.string.onCreate));
    }

    //simple function to append bottom fragment's TextView
    public static void display(String cycle)
    {
        //clear textview of life cycle log if it gets too long
        if(counter >24)
        {
            tvCycle.setText("");
            counter=0;
        }

        tvCycle.append("\n" +cycle);
        counter ++;
    }

    public void onStart()
    {
        super.onStart();
        display(getString(R.string.onStart));
    }
    public void onStop()
    {
        super.onStop();
        display(getString(R.string.onStop));
    }
    public void onDestroy()
    {
        super.onDestroy();
        display(getString(R.string.onDestroy));
    }
}