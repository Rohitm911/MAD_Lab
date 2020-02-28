package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button add = (Button)findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText ip1 = (EditText) findViewById(R.id.editText1);
                EditText ip2 = (EditText) findViewById(R.id.editText2);
                TextView ans = (TextView) findViewById(R.id.res);
                int num1 = Integer.parseInt(ip1.getText().toString());
                int num2 = Integer.parseInt(ip2.getText().toString());
                int result = num1 + num2;
                ans.setText(Integer.toString(result));
            }
        });

        Button sub = (Button) findViewById(R.id.sub);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText ip1 = (EditText) findViewById(R.id.editText1);
                EditText ip2 = (EditText) findViewById(R.id.editText2);
                TextView ans = (TextView) findViewById(R.id.res);
                int num1 = Integer.parseInt(ip1.getText().toString());
                int num2 = Integer.parseInt(ip2.getText().toString());
                int result = num1 - num2;
                ans.setText(Integer.toString(result));
            }
        });

        Button mul = (Button)findViewById(R.id.mul);
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText ip1 = (EditText) findViewById(R.id.editText1);
                EditText ip2 = (EditText) findViewById(R.id.editText2);
                TextView ans = (TextView) findViewById(R.id.res);
                int num1 = Integer.parseInt(ip1.getText().toString());
                int num2 = Integer.parseInt(ip2.getText().toString());
                int result = num1 * num2;
                ans.setText(Integer.toString(result));
            }
        });

        Button div = (Button)findViewById(R.id.div);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText ip1 = (EditText) findViewById(R.id.editText1);
                EditText ip2 = (EditText) findViewById(R.id.editText2);
                TextView ans = (TextView) findViewById(R.id.res);
                int num1 = Integer.parseInt(ip1.getText().toString());
                int num2 = Integer.parseInt(ip2.getText().toString());
                int result = num1 / num2;
                ans.setText(Integer.toString(result));
            }
        });
    }
}
