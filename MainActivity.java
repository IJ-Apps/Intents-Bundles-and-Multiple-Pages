package com.example.multiplepages;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find our button. It's just a regular button center in the screen.
        btn = findViewById(R.id.btn);

        //Set an onClickListener to detect clicks.
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new Intent from this activity to Page 2.
                Intent intent = new Intent(MainActivity.this, Page2.class);
                //Send some data along in the intent using the names below, and then the values.
                intent.putExtra("Message", "Hello");
                intent.putExtra("Message1", "Hi");
                intent.putExtra("Message2", "Subscribe");
                intent.putExtra("Message3", "to");
                intent.putExtra("Message4", "IJ Apps");
                //Start the activity using the intent.
                startActivity(intent);
            }
        });

    }
}
