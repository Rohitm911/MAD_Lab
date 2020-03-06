package com.kn.rightintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        TextView t1 = findViewById(R.id.textView3);
        Intent I = getIntent();
        t1.setText("User Name : "+I.getStringExtra("name"));
        TextView t2 = findViewById(R.id.textView4);
        t2.setText("User USN : "+ I.getStringExtra("usn"));
        TextView t3 = findViewById(R.id.textView5);
        t3.setText("User Branch : " + I.getStringExtra("branch"));

    }
}
