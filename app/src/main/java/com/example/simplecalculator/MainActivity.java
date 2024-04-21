package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1, e2;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = findViewById(R.id.num1);
        e2 = findViewById(R.id.num2);
        t1 = findViewById(R.id.result);
    }

    private boolean getNumbers() {
        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();

        if(s1.isEmpty() || s2.isEmpty()) {
            return false;
        }

        try {
            num1 = Integer.parseInt(s1);
            num2 = Integer.parseInt(s2);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void doSum(View v) {
        if (getNumbers()) {
            int sum = num1 + num2;
            t1.setText(Integer.toString(sum));
        } else {
            t1.setText("Error: Please enter valid numbers");
        }
    }

    public void doSub(View v) {
        if (getNumbers()) {
            int diff = num1 - num2;
            t1.setText(Integer.toString(diff));
        } else {
            t1.setText("Error: Please enter valid numbers");
        }
    }

    public void doMul(View v) {
        if (getNumbers()) {
            int product = num1 * num2;
            t1.setText(Integer.toString(product));
        } else {
            t1.setText("Error: Please enter valid numbers");
        }
    }

    public void doDiv(View v) {
        if (getNumbers()) {
            if (num2 != 0) {
                double result = (double) num1 / num2;
                t1.setText(Double.toString(result));
            } else {
                t1.setText("Error: Cannot divide by zero");
            }
        } else {
            t1.setText("Error: Please enter valid numbers");
        }
    }

    public void doPow(View v) {
        if (getNumbers()) {
            double result = Math.pow(num1, num2);
            t1.setText(Double.toString(result));
        } else {
            t1.setText("Error: Please enter valid numbers");
        }
    }

    public void doMod(View v) {
        if (getNumbers()) {
            if (num2 != 0) {
                int result = num1 % num2;
                t1.setText(Integer.toString(result));
            } else {
                t1.setText("Error: Cannot perform modulus with zero");
            }
        } else {
            t1.setText("Error: Please enter valid numbers");
        }
    }

    private int num1, num2;
}
