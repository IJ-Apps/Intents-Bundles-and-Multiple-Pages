package com.example.multiplepages;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Page3 extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
        //Just a regular TextView
        text = findViewById(R.id.text);

        //Get the intent.
        Intent receiveIntent = getIntent();
        //Get the Bundle containing the information from Page 1.
        Bundle page1Info = receiveIntent.getBundleExtra("Page 1 Info");
        //Get the String containing the information from Page 2.
        String page2Info = receiveIntent.getStringExtra("Page 2 Info");

        //Make a String called results that will be displayed.
        String result = "Page 1 Info -";
        //Iterate through the keys (or names) in our bundle.
        for(String name: page1Info.keySet()){
            //Use the key/name to get the value matching to that key/name.
            result+= page1Info.get(name) +"\n";
        }

        //Append information from Page 2
        result += "\nPage 2 Info -\n" + page2Info;

        //Set the Text.
        text.setText(result);

    }
}
