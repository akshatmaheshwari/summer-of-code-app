package com.example.practiceset5;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class day1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day1);
        Button b1 = (Button) findViewById(R.id.pset1_btn);
        b1.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View v) {
                                      Intent intent = new Intent(day1.this, pset1.class);
                                      startActivity(intent);
                                  }
                              }
        );
    }
}
