package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
//import org.mariuszgromada.math.mxparser.*;


public class MainActivity extends AppCompatActivity {

    private TextView previousCalc;
    private EditText display;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;
    private Button btnDiv;
    private Button btnMul;
    private Button btnMinus;
    private Button btnPlus;
    private Button btnPoint;
    private Button btnPercent;
    private Button btnClear;
    private Button btnBackspace;
    private Button btnEqual;

    private StringBuilder strToDisplay = new StringBuilder(""); //пустая строка для изменений

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        previousCalc = findViewById(R.id.previousCalc); //прошлый результат
        display = findViewById(R.id.inputField); // строка, которая вводится юзером и заменяется strToDisplay
        display.setShowSoftInputOnFocus(false); //убрать клавиатуру по нажатию на поле ввода

        btn1 = findViewById(R.id.button1); //найти кнопки
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);
        btn0 = findViewById(R.id.button0);
        btnDiv = findViewById(R.id.buttonDivide);
        btnMul = findViewById(R.id.buttonMul);
        btnMinus = findViewById(R.id.buttonMinus);
        btnPlus = findViewById(R.id.buttonPlus);
        btnPoint = findViewById(R.id.buttonPoint);
        btnPercent = findViewById(R.id.buttonPercent);
        btnClear = findViewById(R.id.buttonClear);
        btnBackspace = findViewById(R.id.buttonBackspace);
        btnEqual = findViewById(R.id.buttonEqual);

        View.OnClickListener onClkBtn = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId() == R.id.button1){
                    updateText(getResources().getString(R.string.oneText));
                }
                if(view.getId() == R.id.button2){
                    updateText(getResources().getString(R.string.twoText));
                }
            }
        };

        btn1.setOnClickListener(onClkBtn); //повесить слушатели на кнопки
        btn2.setOnClickListener(onClkBtn);
        btn3.setOnClickListener(onClkBtn);
        btn4.setOnClickListener(onClkBtn);
        btn5.setOnClickListener(onClkBtn);
        btn6.setOnClickListener(onClkBtn);
        btn7.setOnClickListener(onClkBtn);
        btn8.setOnClickListener(onClkBtn);
        btn9.setOnClickListener(onClkBtn);
        btn0.setOnClickListener(onClkBtn);
        btnDiv.setOnClickListener(onClkBtn);
        btnMul.setOnClickListener(onClkBtn);
        btnMinus.setOnClickListener(onClkBtn);
        btnPlus.setOnClickListener(onClkBtn);
        btnPoint.setOnClickListener(onClkBtn);
        btnPercent.setOnClickListener(onClkBtn);
        btnClear.setOnClickListener(onClkBtn);
        btnBackspace.setOnClickListener(onClkBtn);
        btnEqual.setOnClickListener(onClkBtn);
    }

    public void updateText(String strToAdd){
        int cursorPos = display.getSelectionStart();
        strToDisplay.insert(cursorPos,strToAdd);
        display.setText(strToDisplay);
    }

}