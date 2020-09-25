package com.gugliamo.alexanderguglenko_ceng319lab1_ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //display to bottom fragment's TextView every time onCreate() occurs
        BottomFragment.display(getString(R.string.onCreate));
    }

    //various life cycle event handlers
    public void onStart()
    {
        super.onStart();
        BottomFragment.display(getString(R.string.onStart));
    }
    public void onRestart()
    {
        super.onRestart();
        BottomFragment.display("In the onRestart() event");
    }
    public void onPause()
    {
        super.onPause();
        BottomFragment.display("In the onPause() event");
    }
    public void onStop()
    {
        super.onStop();
        BottomFragment.display("In the onStop() event");
    }
    public void onDestroy()
    {
        super.onDestroy();
        BottomFragment.display("In the onDestroy() event");
    }



}