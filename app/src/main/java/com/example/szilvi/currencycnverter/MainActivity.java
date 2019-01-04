package com.example.szilvi.currencycnverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button currencyButt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        currencyButt = findViewById(R.id.currencyButton);
        currencyButt.setTag(1);
    }

    public void convert(View view) {
        EditText amount = findViewById(R.id.amountEditText);
        Double amountInDoub = Double.parseDouble(amount.getText().toString());
        String result = "";
        if (currencyButt.getText().equals("EUR to HUF")) {
            amountInDoub *= 314;
            result = amountInDoub + " HUF";
        } else {
            amountInDoub /= 314;
            result = amountInDoub + " EUR";
        }
        Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();
    }

    public void changeCurrency(View view) {
        int status = (Integer) view.getTag();
        if(status == 1) {
            currencyButt.setText("HUF to EUR");
            view.setTag(0);
        } else {
            currencyButt.setText("EUR to HUF");
            view.setTag(1);
        }
    }
}
