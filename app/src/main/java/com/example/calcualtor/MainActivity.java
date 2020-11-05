package com.example.calcualtor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tx1, tx2;
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnAdd, btnMul, btnDiv, btnSub, btnDot, btnEq, btnClear;
    Double num1, num2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        setOnClick();
    }

    @Override
    public void onClick(View v) {
        String preText;
        String ftx;
        switch (v.getId()) {
            case R.id.btn0:
                preText = tx2.getText().toString();
                ftx = preText + "0";
                tx2.setText(ftx);
                break;

            case R.id.btn1:
                preText = tx2.getText().toString();
                ftx = preText + "1";
                tx2.setText(ftx);
                break;

            case R.id.btn2:
                preText = tx2.getText().toString();
                ftx = preText + "2";
                tx2.setText(ftx);
                break;

            case R.id.btn3:
                preText = tx2.getText().toString();
                ftx = preText + "3";
                tx2.setText(ftx);
                break;

            case R.id.btn4:
                preText = tx2.getText().toString();
                ftx = preText + "4";
                tx2.setText(ftx);
                break;

            case R.id.btn5:
                preText = tx2.getText().toString();
                ftx = preText + "5";
                tx2.setText(ftx);
                break;

            case R.id.btn6:
                preText = tx2.getText().toString();
                ftx = preText + "6";
                tx2.setText(ftx);
                break;

            case R.id.btn7:
                preText = tx2.getText().toString();
                ftx = preText + "7";
                tx2.setText(ftx);
                break;

            case R.id.btn8:
                preText = tx2.getText().toString();
                ftx = preText + "8";
                tx2.setText(ftx);
                break;

            case R.id.btnDot:
                preText = tx2.getText().toString();


                if (preText.contains(".")){
                    ftx = preText;
                } else if (preText.isEmpty()){
                    ftx = preText + "0.";
                } else {
                    ftx = preText + ".";
                }
                tx2.setText(ftx);
                break;

            case R.id.btn9:
                preText = tx2.getText().toString();
                ftx = preText + "9";
                tx2.setText(ftx);
                break;

            case R.id.btnAdd:
                preText = tx2.getText().toString();
                num1 = Double.parseDouble(preText);
                ftx = preText + "+";
                tx1.setText(ftx);
                tx2.setText("");

                break;

            case R.id.btnSub:
                preText = tx2.getText().toString();
                ftx = preText + "-";
                tx2.setText(ftx);
                break;

            case R.id.btnMul:
                preText = tx2.getText().toString();
                ftx = preText + "*";
                tx2.setText(ftx);
                break;

            case R.id.btnDiv:
                preText = tx2.getText().toString();
                ftx = preText + "/";
                tx2.setText(ftx);
                break;

            case R.id.btnClear:
                tx2.setText("");
                tx1.setText("");
                break;

            case R.id.btnEq:
                preText = tx1.getText().toString();
                ftx = preText + tx2.getText().toString();
                tx1.setText(ftx + "=");
                num2 = Double.parseDouble(tx2.getText().toString());
                result = num1 + num2;
                tx2.setText(result.toString());

                break;
        }
    }

    private void init() {
        tx1 = findViewById(R.id.tx1);
        tx2 = findViewById(R.id.tx2);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
        btnAdd = findViewById(R.id.btnAdd);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        btnSub = findViewById(R.id.btnSub);
        btnDot = findViewById(R.id.btnDot);
        btnEq = findViewById(R.id.btnEq);
        btnClear = findViewById(R.id.btnClear); 
    }

    private void setOnClick() {
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnDot.setOnClickListener(this);
        btnEq.setOnClickListener(this);
        btnClear.setOnClickListener(this);
    }
}