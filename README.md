# Ex.No:9 Develop a simple calculator using android studio.

## AIM:

To develop a program to develop a simple calculator in Android Studio.

## EQUIPMENTS REQUIRED:

Android Studio(Latest Version)

## ALGORITHM:

Step 1: Open Android Stdio and then click on File -> New -> New project.

Step 2: Then type the Application name as calculator and click Next. 

Step 3: Then select the Minimum SDK as shown below and click Next.

Step 4: Then select the Empty Activity and click Next. Finally click Finish.

Step 5: Design layout using UI components in activity_main.xml.

Step 6: Display the calculator operation in MainActivity file.

Step 7: Save and run the application.

## PROGRAM:
```
/*
Program to print the text “calculator operation”.
Developed by:SANDHYA B N 
Registeration Number :212222040144
*/
```
activity main.xml:
```
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#CA94D8"
    android:backgroundTint="#FDE5D4"
    tools:context=".MainActivity">

    <!-- Text View to display our basic heading of "calculator"-->
    <TextView
        android:layout_width="194dp"
        android:layout_height="43dp"
        android:layout_marginStart="114dp"
        android:layout_marginTop="58dp"
        android:layout_marginEnd="103dp"
        android:layout_marginBottom="502dp"
        android:scrollbarSize="30dp"
        android:text=" CALCULATOR"
        android:textAppearance="@style/TextAppearance.AppCompat.Body1"
        android:textSize="30dp"
        android:textStyle="bold|italic"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <!-- Edit Text View to input the values -->
    <EditText
        android:id="@+id/num1"
        android:layout_width="258dp"
        android:layout_height="54dp"
        android:layout_marginStart="72dp"
        android:layout_marginTop="70dp"
        android:layout_marginEnd="71dp"
        android:layout_marginBottom="416dp"
        android:background="@android:color/white"
        android:ems="10"
        android:inputType="number"
        android:onClick="clearTextNum1"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <!-- Edit Text View to input 2nd value-->

    <!-- Text View to display result -->

    <!-- A button to perform 'sum' operation -->

    <EditText
        android:id="@+id/num2"
        android:layout_width="257dp"
        android:layout_height="51dp"
        android:layout_marginStart="72dp"
        android:layout_marginTop="112dp"
        android:layout_marginEnd="71dp"
        android:layout_marginBottom="374dp"
        android:background="@android:color/white"
        android:ems="10"
        android:inputType="number"
        android:onClick="clearTextNum2"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.421"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.651" />

    <TextView
        android:id="@+id/result"
        android:layout_width="253dp"
        android:layout_height="75dp"
        android:layout_marginStart="41dp"
        android:layout_marginTop="151dp"
        android:layout_marginEnd="48dp"
        android:layout_marginBottom="287dp"
        android:background="@android:color/white"
        android:text="result"
        android:textAlignment="center"
        android:textColor="#57000000"
        android:textColorHighlight="#FF0000"
        android:textColorHint="#000000"
        android:textColorLink="@color/black"
        android:textSize="24sp"
        android:textStyle="normal"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.544"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.688" />

    <!-- A button to perform subtraction operation. -->

    <!-- A button to perform division. -->

    <!-- A button to perform multiplication. -->

    <!-- A button to perform a modulus function. -->

    <!-- A button to perform a power function. -->

    <Button
        android:id="@+id/sum"
        android:layout_width="94dp"
        android:layout_height="50dp"
        android:layout_marginStart="92dp"
        android:backgroundTint="#9C27B0"
        android:onClick="doSum"
        android:text="+"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/result"
        app:layout_constraintVertical_bias="0.15" />

    <Button
        android:id="@+id/sub"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginEnd="113dp"
        android:backgroundTint="#9C27B0"
        android:onClick="doSub"
        android:text="-"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.0"
        app:layout_constraintStart_toStartOf="@+id/sum"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.816" />

    <Button
        android:id="@+id/div"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginEnd="100dp"
        android:layout_marginBottom="268dp"
        android:backgroundTint="#9C27B0"
        android:onClick="doDiv"
        android:text="/"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.675"
        app:layout_constraintStart_toEndOf="@+id/sum"
        app:layout_constraintTop_toBottomOf="@+id/result"
        app:layout_constraintVertical_bias="1.0" />

    <Button
        android:id="@+id/mul"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:backgroundTint="#9C27B0"
        android:onClick="doMul"
        android:text="x"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.656"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.816" />

    <Button
        android:id="@+id/button"
        android:layout_width="97dp"
        android:layout_height="53dp"
        android:layout_marginTop="356dp"
        android:layout_marginBottom="199dp"
        android:backgroundTint="#9C27B0"
        android:onClick="doMod"
        android:text="%(mod)"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.671"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="1.0" />

    <Button
        android:id="@+id/pow"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:backgroundTint="#9C27B0"
        android:onClick="doPow"
        android:text="n1^n2"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.303"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.711" />

</androidx.constraintlayout.widget.ConstraintLayout>

```
Mainactivity.Java
```
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
```

## OUTPUT


![WhatsApp Image 2024-04-21 at 18 47 22_afd490b0](https://github.com/sandhyabalamurali/simplecalculator/assets/115525118/70f1a76e-6ec8-4e16-9318-f4b754772811)

![WhatsApp Image 2024-04-21 at 18 47 22_c8bacdb4](https://github.com/sandhyabalamurali/simplecalculator/assets/115525118/57f91f0d-8e8f-474c-8721-c5c63d4e18f4)

## RESULT
Thus a Simple Android Application develop a program to create simple calculator in Android Studio is developed and executed successfully.
