package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import org.mariuszgromada.math.mxparser.*;


public class MainActivity extends AppCompatActivity {

    private TextView previousCalc;
    private TextView resultCalc;
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
    //horizontal
    private Button btnOpenBracket;
    private Button btnCloseBracket;
    private Button btnNumPower;
    private Button btnExponent;
    private Button btnPI;
    private Button btnSin;
    private Button btnCos;
    private Button btnTan;
    private Button btnLog10;
    private Button btnHistory;

    private StringBuilder strToDisplay = new StringBuilder(""); //empty string for change

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

        previousCalc = findViewById(R.id.previousCalc); //last expression
        resultCalc = findViewById(R.id.result); // result
        display = findViewById(R.id.inputField); // string, which user writes and replaces with strToDisplay
        display.setShowSoftInputOnFocus(false); //hide keyboard when click

        if(savedInstanceState != null){
            previousCalc.setText(savedInstanceState.getString("previousCalc"));
            resultCalc.setText(savedInstanceState.getString("previousCalc"));
            display.setText(savedInstanceState.getString("previousCalc"));

            strToDisplay.setLength(0);
            strToDisplay.append(savedInstanceState.getString("previousCalc"));
        }

        btn1 = findViewById(R.id.button1); //find buttons
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
        //horizontal view
        btnOpenBracket = findViewById(R.id.buttonOpenBracket);
        btnCloseBracket = findViewById(R.id.buttonCloseBracket);
        btnNumPower = findViewById(R.id.buttonNumPower);
        btnExponent = findViewById(R.id.buttonExponent);
        btnPI = findViewById(R.id.buttonPI);
        btnSin = findViewById(R.id.buttonSin);
        btnCos = findViewById(R.id.buttonCos);
        btnTan = findViewById(R.id.buttonTan);
        btnLog10 = findViewById(R.id.buttonLog10);
        btnHistory = findViewById(R.id.buttonHistory);

        View.OnClickListener onClkBtn = new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.button1:
                        updateText(getResources().getString(R.string.oneText));
                        break;
                    case R.id.button2:
                        updateText(getResources().getString(R.string.twoText));
                        break;
                    case R.id.button3:
                        updateText(getResources().getString(R.string.threeText));
                        break;
                    case R.id.button4:
                        updateText(getResources().getString(R.string.fourText));
                        break;
                    case R.id.button5:
                        updateText(getResources().getString(R.string.fiveText));
                        break;
                    case R.id.button6:
                        updateText(getResources().getString(R.string.sixText));
                        break;
                    case R.id.button7:
                        updateText(getResources().getString(R.string.sevenText));
                        break;
                    case R.id.button8:
                        updateText(getResources().getString(R.string.eightText));
                        break;
                    case R.id.button9:
                        updateText(getResources().getString(R.string.nineText));
                        break;
                    case R.id.button0:
                        updateText(getResources().getString(R.string.zeroText));
                        break;
                    case R.id.buttonDivide:
                        updateText(getResources().getString(R.string.divideText));
                        break;
                    case R.id.buttonMul:
                        updateText(getResources().getString(R.string.multiplyText));
                        break;
                    case R.id.buttonMinus:
                        updateText(getResources().getString(R.string.minusText));
                        break;
                    case R.id.buttonPlus:
                        updateText(getResources().getString(R.string.plusText));
                        break;
                    case R.id.buttonPoint:
                        updateText(getResources().getString(R.string.pointText));
                        break;
                    case R.id.buttonPercent:
                        percentPush(getResources().getString(R.string.percentText));
                        break;
                    case R.id.buttonClear:
                        clearField();
                        break;
                    case R.id.buttonBackspace:
                        backspacePush();
                        break;
                    case R.id.buttonEqual:
                        equalBTNPush();
                        break;
                    //horizontal view
                    case R.id.buttonOpenBracket:
                        updateText(getResources().getString(R.string.openBracketText));
                        break;
                    case R.id.buttonCloseBracket:
                        updateText(getResources().getString(R.string.closeBracketText));
                        break;
                    case R.id.buttonNumPower:
                        updateText(getResources().getString(R.string.numPowerText));
                        break;
                    case R.id.buttonExponent:
                        updateText(getResources().getString(R.string.exponentText));
                        break;
                    case R.id.buttonPI:
                        updateText(getResources().getString(R.string.piTextMX));
                        break;
                    case R.id.buttonSin:
                        updateText(getResources().getString(R.string.sinText));
                        break;
                    case R.id.buttonCos:
                        updateText(getResources().getString(R.string.cosText));
                        break;
                    case R.id.buttonTan:
                        updateText(getResources().getString(R.string.tanText));
                        break;
                    case R.id.buttonLog10:
                        updateText(getResources().getString(R.string.log10Text));
                        break;
                    case R.id.buttonHistory:
                        break;
                }

            }
        };

        //add listeners to buttons
        btn1.setOnClickListener(onClkBtn);
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
        //horizontal view
        btnOpenBracket.setOnClickListener(onClkBtn);
        btnCloseBracket.setOnClickListener(onClkBtn);
        btnNumPower.setOnClickListener(onClkBtn);
        btnExponent.setOnClickListener(onClkBtn);
        btnPI.setOnClickListener(onClkBtn);
        btnSin.setOnClickListener(onClkBtn);
        btnCos.setOnClickListener(onClkBtn);
        btnTan.setOnClickListener(onClkBtn);
        btnLog10.setOnClickListener(onClkBtn);
        btnHistory.setOnClickListener(onClkBtn);

    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);

        outState.putString("previousCalc",previousCalc.getText().toString());
        outState.putString("resultCalc",resultCalc.getText().toString());
        outState.putString("display",display.getText().toString());
        outState.putString("strToDisplay",strToDisplay.toString());
    }

    public void updateText(String strToAdd){
        int cursorPos = display.getSelectionStart();
        //my own way(works?)
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

    public void percentPush(String strToAdd){
        int cursorPos = display.getSelectionStart();
        int digitIndex = strToDisplay.length()-1;

        StringBuilder percentPart = new StringBuilder(""); //for simple percent operations like 50% = 0.5
        percentPart.setLength(0);

        while(digitIndex >= 0 && (Character.isDigit(strToDisplay.charAt(digitIndex)) || strToDisplay.charAt(digitIndex) == '.')){ //a number before % to percentPart
            percentPart.append(strToDisplay.charAt(digitIndex));
            strToDisplay.deleteCharAt(digitIndex);
            digitIndex--;
        }
        if(digitIndex < 0) digitIndex = 0;

        double percentPartResult = Double.parseDouble(percentPart.reverse().toString());
        percentPartResult /= 100;
        strToDisplay.append(String.valueOf(percentPartResult));

        display.setText(strToDisplay);
        display.setSelection(digitIndex + String.valueOf(percentPartResult).length());

        //part2
        if(strToDisplay.charAt(digitIndex) == '-' || strToDisplay.charAt(digitIndex) == '+'){
            strToDisplay.delete(digitIndex + 1,digitIndex + String.valueOf(percentPartResult).length() + 1);
            StringBuilder percentPart2 = new StringBuilder(""); //for percent operations with - and + like 200-50% = 100
            percentPart.setLength(0);
            percentPart.append(percentPartResult + "*");
            digitIndex--; //from - or + to digit
            while(digitIndex >= 0 && (Character.isDigit(strToDisplay.charAt(digitIndex)) || strToDisplay.charAt(digitIndex) == '.')){ //a number before - to percentPart2
                percentPart2.append(strToDisplay.charAt(digitIndex));
                digitIndex--;
            }
            if(digitIndex < 0) digitIndex = 0;
            percentPartResult = Double.parseDouble(percentPart2.reverse().toString());
            percentPart.append(String.valueOf(percentPartResult));

            Expression exp = new Expression(percentPart.toString());
            strToDisplay.append(exp.calculate());
            display.setText(strToDisplay);

            display.setSelection(percentPart.length()-1);
        }
    }

    public void backspacePush(){
        int cursorPos = display.getSelectionStart();

        if (cursorPos != 0){
            strToDisplay.deleteCharAt(cursorPos-1);
            display.setText(strToDisplay);
            display.setSelection(cursorPos-1);
        }
    }

    public void equalBTNPush(){
        previousCalc.setText(strToDisplay);
        String strToCalc = strToDisplay.toString();
        // avoid MXparser restrictions: replacing ÷ to / , × to *
        strToCalc = strToCalc.replaceAll(getResources().getString(R.string.divideText), "/");
        strToCalc = strToCalc.replaceAll(getResources().getString(R.string.multiplyText), "*");

        Expression exp = new Expression(strToCalc);

        String result = String.valueOf(exp.calculate());

        resultCalc.setText(result);
//        display.setSelection(result.length());
    }

}