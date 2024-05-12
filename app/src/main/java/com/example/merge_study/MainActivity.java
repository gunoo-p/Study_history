package com.example.merge_study;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }
    public void btnClick(View v) {
        Button calculator_btn = (Button) findViewById(R.id.calculator_btn);
        Button tdl_btn = (Button) findViewById(R.id.TDL_btn);

        Intent calculatorintent = new Intent(getApplicationContext(), CalculatorActivity.class);
        Intent TDLintent = new Intent(getApplicationContext(), TDLActivity.class);

        if (v == calculator_btn) {
            startActivity(calculatorintent);
        } else if (v == tdl_btn) {
            startActivity(TDLintent);
        }
    }
}