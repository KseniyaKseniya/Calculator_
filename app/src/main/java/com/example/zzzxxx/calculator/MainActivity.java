package com.example.zzzxxx.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText firstNum, secondNum, result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNum = (EditText) findViewById(R.id.firstNum);
        secondNum = (EditText) findViewById(R.id.secondNum);
        result = (EditText) findViewById(R.id.result);
    }

    public void onPlusClick(View v) {
        int fnum = Integer.parseInt(firstNum.getText().toString());
        int snum = Integer.parseInt((secondNum.getText().toString()));

        Integer res = fnum + snum;

        result.setText(res.toString());

    }

    public void onMinusClick(View v) {
        int fnum = Integer.parseInt(firstNum.getText().toString());
        int snum = Integer.parseInt((secondNum.getText().toString()));

        Integer res = fnum - snum;

        result.setText(res.toString());

    }


    public void onMultiplicateClick(View v) {
        int fnum = Integer.parseInt(firstNum.getText().toString());
        int snum = Integer.parseInt((secondNum.getText().toString()));

        Integer res = fnum * snum;

        result.setText(res.toString());

    }
    public void onDivisionClick(View v) {
        int fnum = Integer.parseInt(firstNum.getText().toString());
        int snum = Integer.parseInt((secondNum.getText().toString()));
        if (snum!=0) {
            Integer res = fnum / snum;

        result.setText(res.toString());
        }else
            result.setText("На ноль делить нельзя");

    }
    public void onPercentClick(View v) {
        double fnum = Integer.parseInt(firstNum.getText().toString());
        double snum = Integer.parseInt((secondNum.getText().toString()));
        Double res = (fnum/100) *snum;

        result.setText(res.toString());

    }
    public void onSquareClick(View v) {
        double fnum = Integer.parseInt(firstNum.getText().toString());
       // double snum = Integer.parseInt((secondNum.getText().toString()));

        Double res = Math.sqrt(fnum);

        result.setText(res.toString());

    }

}