package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView result;
    EditText number1,number2;
    Button button1,button2,button3,button4;
    private  int num1,num2;
   double result_num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView) findViewById(R.id.display);
        number1 = (EditText) findViewById(R.id.input1);
        number2 = (EditText) findViewById(R.id.input2);

        button1 = (Button)findViewById(R.id.add);
        button1.setOnClickListener(this);
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //Button temp = (Button)v;
//                num1 = Integer.parseInt(number1.getText().toString());
//                num2 = Integer.parseInt(number2.getText().toString());
//                result_num  = num1 + num2;
//                result.setText(String.valueOf(result_num));
//            }
//        });




        button2 = (Button)findViewById(R.id.subtract);
        button2.setOnClickListener(this);
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                num1 = Integer.parseInt(number1.getText().toString());
//                num2 = Integer.parseInt(number2.getText().toString());
//                result_num  =  num1 - num2;
//                result.setText(String.valueOf(result_num));
//            }
//        });
        button3 = (Button)findViewById(R.id.multiply);
        button3.setOnClickListener(this);
//        button3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                num1 = Integer.parseInt(number1.getText().toString());
//                num2 = Integer.parseInt(number2.getText().toString());
//                result_num  = num1 * num2;
//                result.setText(String.valueOf(result_num));
//            }
//        });


        button4 = (Button)findViewById(R.id.divide);
        button4.setOnClickListener(this);
//        button4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                num1 = Integer.parseInt(number1.getText().toString());
//                num2 = Integer.parseInt(number2.getText().toString());
//                result_num  = num1 / num2;
//                result.setText(String.valueOf(result_num));
//            }
//        });


    }

    @Override
    public void onClick(View v) {
        num1 = Integer.parseInt(number1.getText().toString());
        num2 = Integer.parseInt(number2.getText().toString());
        switch (v.getId())
        {
            case R.id.add:
                result_num = num1 + num2;
                result.setText(String.valueOf(result_num));
                break;
            case R.id.subtract:
                result_num = num1 - num2;
                result.setText(String.valueOf(result_num));
                break;
            case R.id.multiply:
                result_num = num1 * num2;
                result.setText(String.valueOf(result_num));
                break;
            case R.id.divide:
                result_num = num1 / num2;
                result.setText(String.valueOf(result_num));
                break;

        }
    }
}
