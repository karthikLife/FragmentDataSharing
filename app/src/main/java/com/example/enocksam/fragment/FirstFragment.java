package com.example.enocksam.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by EnockSam on 11/30/2016.
 */

public class FirstFragment extends Fragment {
SendMessage SM;
    Button bn;
    EditText msg;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        /**
         * Inflate the layout for this fragment
         */
        View v;
        v= inflater.inflate(R.layout.fragment_one, container, false);
        msg=(EditText)v.findViewById(R.id.msg);
        bn=(Button)v.findViewById(R.id.bn);

        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String  Message;
                Message=msg.getText().toString();
                SM.sendData(Message);
            }
        });
 return v;
    }
    interface SendMessage
    {
        public   void sendData(String message);
    }
    public void onAttach(Activity activity){
        super.onAttach(activity);
        try
        {
            SM=(SendMessage)activity;

        }catch (ClassCastException e)
        {
            throw new ClassCastException("send the Data");
        }
    }
}
