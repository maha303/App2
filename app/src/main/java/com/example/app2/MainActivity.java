package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String message = "Welcome to my first Java program";
        System.out.println(message.substring(0,7)+" "+message.substring(11,13)+" "+message.substring(20,24));
        System.out.println(message);
        System.out.println(message.replace("e","").replace("o","")
                .replace("i","").replace("a",""));
    }
}