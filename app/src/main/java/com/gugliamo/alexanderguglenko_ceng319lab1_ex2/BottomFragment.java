package com.gugliamo.alexanderguglenko_ceng319lab1_ex2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class BottomFragment extends Fragment {

    static TextView tvCycle;
    static int counter = 0;

    public BottomFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bottom, container, false);

        tvCycle = (TextView) view.findViewById(R.id.btm_frag_display);
        return view;
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




}