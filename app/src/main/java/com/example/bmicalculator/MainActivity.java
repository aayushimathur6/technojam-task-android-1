package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String result;
    private EditText editTextweight;
    private EditText editTextheight;
    private Button button;
    private TextView textview3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextweight = findViewById(R.id.editTextWeight);
        editTextheight = findViewById(R.id.editTextheight);
        button = findViewById(R.id.button);
        textview3 = findViewById(R.id.textView3);
    }
    public void BMI(View view){
        String s1 = editTextweight.getText().toString();
        String s2 = editTextheight.getText().toString();
        float s1val = Float.parseFloat(s1);
        float s2val = Float.parseFloat(s2);
        float Bmi = s1val/(s2val*s2val);
        if (Bmi < 18.5) {
            System.out.println("less than 18.5");
            result = " CONDITION:Underweight";
        } else if ((Bmi) >= 18.5 && (Bmi) <= 24.9) {
            System.out.println("between 18.5 and 24.9");
            result = " CONDITION:Normal";
        } else if (Bmi >= 25 && Bmi <= 29.9) {
            System.out.println("between 25 and 29.9");
            result = " CONDITION:Overweight";
        } else {
            System.out.println("greater than 30");
            result = " CONDITION:Obese";
        }
        textview3.setText("Your BMI is: " + Bmi+"\n"+ result);





    }
}
