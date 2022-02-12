package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.text.SpannableStringBuilder;
//import org.mariuszgromada.math.mxparser.*;


public class MainActivity extends AppCompatActivity {

    private TextView previousCalc;
    private EditText display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        previousCalc = findViewById(R.id.showResultField);
        display = findViewById(R.id.inputField);

        display.setShowSoftInputOnFocus(false);
    }

    private void updateText(String strToAdd){
        StringBuilder
    }

    public void zeroBTNPush(View view){
        updateText(getResources().getString(R.string.zeroText));
    }
    public void oneBTNPush(View view){ updateText(getResources().getString(R.string.oneText)); }
    public void twoBTNPush(View view){ updateText(getResources().getString(R.string.twoText)); }
    public void threeBTNPush(View view){ updateText(getResources().getString(R.string.threeText)); }
    public void fourBTNPush(View view){ updateText(getResources().getString(R.string.fourText)); }
    public void fiveBTNPush(View view){ updateText(getResources().getString(R.string.fiveText)); }
    public void sixBTNPush(View view){ updateText(getResources().getString(R.string.sixText)); }
    public void sevenBTNPush(View view){ updateText(getResources().getString(R.string.sevenText)); }
    public void eightBTNPush(View view){ updateText(getResources().getString(R.string.eightText)); }
    public void nineBTNPush(View view){ updateText(getResources().getString(R.string.nineText)); }
    public void divideBTNPush(View view){ updateText(getResources().getString(R.string.divideText)); }
    public void multiplyBTNPush(View view){ updateText(getResources().getString(R.string.multiplyText)); }
    public void minusBTNPush(View view){ updateText(getResources().getString(R.string.minusText)); }
    public void plusBTNPush(View view){ updateText(getResources().getString(R.string.plusText)); }
    public void pointBTNPush(View view){ updateText(getResources().getString(R.string.pointText)); }
    public void percentBTNPush(View view){ updateText(getResources().getString(R.string.percentText)); }
    public void clearBTNPush(View view){ }
    public void backspaceBTNPush(View view){ }
    public void equalBTNPush(View view){}

}