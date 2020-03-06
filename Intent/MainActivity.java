package com.kn.rightintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){
                Intent I;
                I = new Intent(MainActivity.this, Activity2.class);
                EditText E1 = findViewById(R.id.e1);
                EditText E2 = findViewById(R.id.e2);
                EditText E3 = findViewById(R.id.e3);
                I.putExtra("name", E1.getText().toString());
                I.putExtra("usn", E2.getText().toString());
                I.putExtra("branch", E3.getText().toString());
                startActivity(I);
            }

        });
    }
}
