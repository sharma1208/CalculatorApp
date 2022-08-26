package com.example.venyascalc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

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
        try{
            int parse1 = Integer.parseInt((firstNum.getText().toString()));
            int parse2 = Integer.parseInt((secondNum.getText().toString()));
            int sum = parse1 + parse2;
            finalSum.setText(" " + parse1 + "+" + parse2 + "=" + sum);

        }catch(Exception e){
            Snackbar.make(view,"Input 2 integers in their designated areas, currently not enough inputs", Snackbar.LENGTH_LONG).setBackgroundTint(
                    getResources().getColor(R.color.teal_200)).setTextColor(getResources().getColor(R.color.purple_700)).show();

        }


        /*
        This code closes the keyboard on the phone screen after any operation button is pressed, instead of keeping
        the keyboard the whole time.
        Source:https://stackoverflow.com/questions/1109022/how-to-close-hide-the-android-soft-keyboard-programmatically#:~:text=You%20can%20force%20Android%20to,window%20containing%20your%20focused%20view.&text=This%20will%20force%20the%20keyboard%20to%20be%20hidden%20in%20all%20situations.
         */
        View key = this.getCurrentFocus();
        if (key != null) {
            InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(key.getWindowToken(), 0);
        }

    }

    public void findSubtraction(View view){
        EditText firstNum = findViewById(R.id.firstNum);
        EditText secondNum = findViewById(R.id.secondNum);
        TextView finalDiff = findViewById(R.id.resultant);
        try {
            int parse1 = Integer.parseInt((firstNum.getText().toString()));
            int parse2 = Integer.parseInt((secondNum.getText().toString()));

            int diff = parse1 - parse2;
            finalDiff.setText(" "+ parse1 +"-" + parse2 + "=" + diff);
        }catch(Exception e){
            /*
            Making a Snackbar to alert when both input boxes aren't full with integers.
            Source: Mrs. Denna's Notes: https://docs.google.com/document/d/14BxV4knzpPfMVzn_C-ffNubRvDWL-PNDsbTV6Uspvew/edit
             */
            Snackbar.make(view,"Input 2 integers in their designated areas, currently not enough inputs", Snackbar.LENGTH_LONG).setBackgroundTint(
                    getResources().getColor(R.color.black)).setTextColor(getResources().getColor(R.color.venyared)).show();
        }

        /*
        This code closes the keyboard on the phone screen after any operation button is pressed, instead of keeping
        the keyboard the whole time.
        Source:https://stackoverflow.com/questions/1109022/how-to-close-hide-the-android-soft-keyboard-programmatically#:~:text=You%20can%20force%20Android%20to,window%20containing%20your%20focused%20view.&text=This%20will%20force%20the%20keyboard%20to%20be%20hidden%20in%20all%20situations.
         */
        View key = this.getCurrentFocus();
        if (key != null) {
            InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(key.getWindowToken(), 0);
        }

    }

    public void findMultiply(View view){
        EditText firstNum = findViewById(R.id.firstNum);
        EditText secondNum = findViewById(R.id.secondNum);
        TextView finalMulti = findViewById(R.id.resultant);

        try {
            int parse1 = Integer.parseInt((firstNum.getText().toString()));
            int parse2 = Integer.parseInt((secondNum.getText().toString()));

            int multi = parse1 * parse2;

            finalMulti.setText(" "+ parse1 +"x" + parse2 + "=" + multi);

        }catch(Exception e){
            /*
            Making a Snackbar to alert when both input boxes aren't full with integers.
            Source: Mrs. Denna's Notes: https://docs.google.com/document/d/14BxV4knzpPfMVzn_C-ffNubRvDWL-PNDsbTV6Uspvew/edit
             */
            Snackbar.make(view,"Input 2 integers in their designated areas, currently not enough inputs", Snackbar.LENGTH_LONG).setBackgroundTint(
                    getResources().getColor(R.color.black)).setTextColor(getResources().getColor(R.color.purple_500)).show();
        }
        /*
        This code closes the keyboard on the phone screen after any operation button is pressed, instead of keeping
        the keyboard the whole time.
        Source:https://stackoverflow.com/questions/1109022/how-to-close-hide-the-android-soft-keyboard-programmatically#:~:text=You%20can%20force%20Android%20to,window%20containing%20your%20focused%20view.&text=This%20will%20force%20the%20keyboard%20to%20be%20hidden%20in%20all%20situations.
         */
        View key = this.getCurrentFocus();
        if (key != null) {
            InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(key.getWindowToken(), 0);
        }

    }

    public void findDiv(View view){
        EditText firstNum = findViewById(R.id.firstNum);
        EditText secondNum = findViewById(R.id.secondNum);
        TextView finalDiv = findViewById(R.id.resultant);

        try {
            double parse1 = Double.parseDouble((firstNum.getText().toString()));
            double parse2 = Double.parseDouble((secondNum.getText().toString()));

            double div = (parse1) / parse2;
            finalDiv.setText(" "+ parse1 +"/" + parse2 + "=" + div);
        }catch(Exception e){
            /*
            Making a Snackbar to alert when both input boxes aren't full with integers.
            Source: Mrs. Denna's Notes: https://docs.google.com/document/d/14BxV4knzpPfMVzn_C-ffNubRvDWL-PNDsbTV6Uspvew/edit
             */
            Snackbar.make(view,"Input 2 integers in their designated areas, currently not enough inputs", Snackbar.LENGTH_LONG).setBackgroundTint(
                    getResources().getColor(R.color.venyateal)).setTextColor(getResources().getColor(R.color.purple_200)).show();
        }
        /*
        This code closes the keyboard on the phone screen after any operation button is pressed, instead of keeping
        the keyboard the whole time.
        Source:https://stackoverflow.com/questions/1109022/how-to-close-hide-the-android-soft-keyboard-programmatically#:~:text=You%20can%20force%20Android%20to,window%20containing%20your%20focused%20view.&text=This%20will%20force%20the%20keyboard%20to%20be%20hidden%20in%20all%20situations.
         */
        View key = this.getCurrentFocus();
        if (key != null) {
            InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(key.getWindowToken(), 0);
        }

    }

    public void expo(View view) {
        EditText base = findViewById(R.id.firstNum);
        EditText expo = findViewById(R.id.secondNum);
        TextView finalExpo = findViewById(R.id.resultant);

        try {
            int parse1 = Integer.parseInt((base.getText().toString()));
            int parse2 = Integer.parseInt((expo.getText().toString()));

            int expoResult = 1;

            for (int i = 1; i <= parse2; i++) {
                expoResult *= parse1;
            }

            finalExpo.setText(parse1 + "^" + parse2 + "=" + expoResult);
        } catch (Exception e) {
           /*
            Making a Snackbar to alert when both input boxes aren't full with integers
            Source: Mrs. Denna's Notes: https://docs.google.com/document/d/14BxV4knzpPfMVzn_C-ffNubRvDWL-PNDsbTV6Uspvew/edit
             */
            Snackbar.make(view, "Input 2 integers in their designated areas, currently not enough inputs", Snackbar.LENGTH_LONG).setBackgroundTint(
                    getResources().getColor(R.color.white)).setTextColor(getResources().getColor(R.color.venyateal)).show();
        }
        /*
        This code closes the keyboard on the phone screen after any operation button is pressed, instead of keeping
        the keyboard the whole time.
        Source:https://stackoverflow.com/questions/1109022/how-to-close-hide-the-android-soft-keyboard-programmatically#:~:text=You%20can%20force%20Android%20to,window%20containing%20your%20focused%20view.&text=This%20will%20force%20the%20keyboard%20to%20be%20hidden%20in%20all%20situations.
         */
        View key = this.getCurrentFocus();
        if (key != null) {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(key.getWindowToken(), 0);
        }
    }

        public void mod(View view) {
            EditText num1 = findViewById(R.id.firstNum);
            EditText num2 = findViewById(R.id.secondNum);
            TextView finalMod = findViewById(R.id.resultant);

            try {
                int parse1 = Integer.parseInt((num1.getText().toString()));
                int parse2 = Integer.parseInt((num2.getText().toString()));

                int modulus = parse1 % parse2;
                finalMod.setText(parse1 + "%" + parse2 + "=" + modulus);
            } catch (Exception e) {
            /*
            Making a Snackbar to alert when both input boxes aren't full with integers
            Source: Mrs. Denna's Notes: https://docs.google.com/document/d/14BxV4knzpPfMVzn_C-ffNubRvDWL-PNDsbTV6Uspvew/edit
             */
                Snackbar.make(view, "Input 2 integers in their designated areas, currently not enough inputs", Snackbar.LENGTH_LONG).setBackgroundTint(
                        getResources().getColor(R.color.white)).setTextColor(getResources().getColor(R.color.venyateal)).show();
            }
            /*
            This code closes the keyboard on the phone screen after any operation button is pressed, instead of keeping
            the keyboard the whole time.
            Source:https://stackoverflow.com/questions/1109022/how-to-close-hide-the-android-soft-keyboard-programmatically#:~:text=You%20can%20force%20Android%20to,window%20containing%20your%20focused%20view.&text=This%20will%20force%20the%20keyboard%20to%20be%20hidden%20in%20all%20situations.
             */
            View key = this.getCurrentFocus();
            if (key != null) {
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(key.getWindowToken(), 0);

            }
        }

        /*
        If a user wants to clear all the inputs that they have put in so far, this function will
        allow them to do so and start with empty input boxes for both num1 and num2.
        Source: stackoverflow.com/questions/8758635/how-to-clear-the-edittext-when-onclick-on-button
         */
            public void clear(View v) {
                EditText first = findViewById(R.id.firstNum);
                EditText second = findViewById(R.id.secondNum);
                first.setText("");
                second.setText("");
            }




        }






















