package com.example.enocksam.fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FirstFragment.SendMessage{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void sendData(String message) {
        SecondFragment f2=(SecondFragment)getFragmentManager().findFragmentById(R.id.f2);
        f2.getData(message);

    }
}
