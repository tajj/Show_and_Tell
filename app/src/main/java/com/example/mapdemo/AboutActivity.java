package com.example.mapdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AboutActivity extends AppCompatActivity {
    Button btnProceed2;
    String fullName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

//button to move to group activity


        fullName = getIntent().getStringExtra("fullName");

        btnProceed2 = (Button) findViewById(R.id.btnProceed2);

        btnProceed2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                    Intent i = new Intent(AboutActivity.this, ChooseActivity.class);

                    i.putExtra("fullName", fullName);
                    startActivity(i);

                finish();

            }


        });

    }
}
