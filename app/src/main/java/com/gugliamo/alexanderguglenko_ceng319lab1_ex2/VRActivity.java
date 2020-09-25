package com.gugliamo.alexanderguglenko_ceng319lab1_ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class VRActivity extends AppCompatActivity {

    static TextView tvCycle;
    static int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_r);

        tvCycle = (TextView) findViewById(R.id.VRActivity_text);

        display("In the onCreate() event");
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
        display("In the onStart() event");
    }
    public void onStop()
    {
        super.onStop();
        display("In the onStop() event");
    }
    public void onDestroy()
    {
        super.onDestroy();
        display("In the onDestroy() event");
    }
}