package com.example.multiplepages;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Page2 extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        //Find our button. It's just a regular button center in the screen.
        btn = findViewById(R.id.btn);

        //Set an onClickListener to detect clicks.
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Get the intent from the previous page.
                Intent receiveIntent = getIntent();
                //Get a Bundle of data from the previous page rather than receive each string individually.
                Bundle bundle = receiveIntent.getExtras();
                //Create a new intent to the next page.
                Intent toPage3 = new Intent(Page2.this, Page3.class);
                //Put the bundle from the previous page and info from this page in the intent.
                toPage3.putExtra("Page 1 Info", bundle);
                toPage3.putExtra("Page 2 Info", "Page 2");
                //Start the activity to the next page.
                startActivity(toPage3);
            }
        });

    }
}
