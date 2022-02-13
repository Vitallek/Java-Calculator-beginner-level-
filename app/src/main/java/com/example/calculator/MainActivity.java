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
                if(view.getId() == R.id.button3){
                    updateText(getResources().getString(R.string.threeText));
                }
                if(view.getId() == R.id.button4){
                    updateText(getResources().getString(R.string.fourText));
                }
                if(view.getId() == R.id.button5){
                    updateText(getResources().getString(R.string.fiveText));
                }
                if(view.getId() == R.id.button6){
                    updateText(getResources().getString(R.string.sixText));
                }
                if(view.getId() == R.id.button7){
                    updateText(getResources().getString(R.string.sevenText));
                }
                if(view.getId() == R.id.button8){
                    updateText(getResources().getString(R.string.eightText));
                }
                if(view.getId() == R.id.button9){
                    updateText(getResources().getString(R.string.nineText));
                }
                if(view.getId() == R.id.button0){
                    updateText(getResources().getString(R.string.zeroText));
                }
                if(view.getId() == R.id.buttonDivide){
                    updateText(getResources().getString(R.string.twoText));
                }
                if(view.getId() == R.id.buttonMul){
                    updateText(getResources().getString(R.string.twoText));
                }
                if(view.getId() == R.id.buttonMinus){
                    updateText(getResources().getString(R.string.twoText));
                }
                if(view.getId() == R.id.buttonPlus){
                    updateText(getResources().getString(R.string.twoText));
                }
                if(view.getId() == R.id.buttonPoint){
                    updateText(getResources().getString(R.string.twoText));
                }
                if(view.getId() == R.id.buttonPercent){
                    updateText(getResources().getString(R.string.twoText));
                }
                if(view.getId() == R.id.buttonClear){
                    clearField();
                }
                if(view.getId() == R.id.buttonBackspace){
                    //
                }
                if(view.getId() == R.id.buttonEqual){
                    //
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
        //my own may(works?)
        strToDisplay.insert(cursorPos,strToAdd);

        //way from video(works)
//        String oldStr = display.getText().toString();
//        String leftStr = oldStr.substring(0, cursorPos);
//        String rightStr = oldStr.substring(cursorPos);
//        display.setText(String.format("%s%s%s", leftStr, strToAdd, rightStr));

        display.setText(strToDisplay);
        display.setSelection(cursorPos + strToAdd.length());
    }

    public void clearField(){
        strToDisplay.setLength(0);
        display.setText(strToDisplay);
    }
}