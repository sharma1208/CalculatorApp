package com.example.venyascalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void findSum(View view){
        EditText firstNum = findViewById(R.id.firstNum);
        EditText secondNum = findViewById(R.id.secondNum);
        TextView finalSum = findViewById(R.id.resultant);

        int parse1 = Integer.parseInt((firstNum.getText().toString()));
        int parse2 = Integer.parseInt((secondNum.getText().toString()));

        int sum = parse1 + parse2;

        finalSum.setText(" " + sum);

    }

    public void findSubtraction(View view){
        EditText firstNum = findViewById(R.id.firstNum);
        EditText secondNum = findViewById(R.id.secondNum);
        TextView finalSum = findViewById(R.id.resultant);

        int parse1 = Integer.parseInt((firstNum.getText().toString()));
        int parse2 = Integer.parseInt((secondNum.getText().toString()));

        int sum = parse1 - parse2;

        finalSum.setText(" " + sum);

    }



}