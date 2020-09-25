package com.gugliamo.alexanderguglenko_ceng319lab1_ex2;

import android.content.Intent;
import android.os.Bundle;


import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


import androidx.fragment.app.ListFragment;


public class TopFragment extends ListFragment {

    public TopFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_top, container, false);

        String[] activities = getResources().getStringArray(R.array.activityList);

        //Set up top fragment's list with custom string array
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, activities);
        setListAdapter(adapter);

        //using Toast class methods to display quick message
        Toast.makeText(this.getContext(), getString(R.string.onCreate),Toast.LENGTH_LONG).show();

        return view;
    }

    public void onStart()
    {
        super.onStart();

        Toast.makeText(this.getContext(),getString(R.string.onStart),Toast.LENGTH_LONG).show();

    }

    //send user to AIActivity or VRActivity
    @Override
    public void onListItemClick(ListView l, View v, int position, long id)
    {
        Intent intent = null;
        if(position == 0)
        {
            intent = new Intent(v.getContext(), AIActivity.class);
            startActivity(intent);
        }
        if(position == 1)
        {
            intent = new Intent(v.getContext(), VRActivity.class);
            startActivity(intent);
        }
    }
}