package com.example.enocksam.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by EnockSam on 11/30/2016.
 */

public class SecondFragment extends Fragment {
    TextView txt;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        /**
         * Inflate the layout for this fragment
         */
        View v;
        v = inflater.inflate(R.layout.fragment_two, container, false);
        txt=(TextView)v.findViewById(R.id.txt);
        return v;
    }
    public void getData(String message)
    {
     txt.setText(message);
    }
}
