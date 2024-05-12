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

//        XML코드에 onclick를 넣지 않아도 ID를 찾아서 클릭 기능
//        Button calculator_btn = (Button) findViewById(R.id.calculator_btn);
//        calculator_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent calculatorintent = new Intent(getApplicationContext(), CalculatorActivity.class);
//
//                startActivity(calculatorintent);
//            }
//        });

//        XML코드에 onclick를 넣지 않아도 ID를 찾아서 클릭 기능
//        Button tdl_btn = (Button) findViewById(R.id.TDL_btn);
//        tdl_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent TDLintent = new Intent(getApplicationContext(), TDLActivity.class);
//                startActivity(TDLintent);
//            }
//        });
    }
    public void btnclick(View v) {
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