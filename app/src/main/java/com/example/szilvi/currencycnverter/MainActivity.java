package com.example.szilvi.currencycnverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view) {
        EditText amount = findViewById(R.id.amountEditText);
        Button currencyButt = findViewById(R.id.currencyButton);
        Double amountInDoub = Double.parseDouble(amount.getText().toString());
        String result = "";
        if (currencyButt.getText().equals("EUR to HUF")) {
            amountInDoub *= 314;
            result = amountInDoub + " HUF";
        } else {
            amountInDoub /= 314;
            result = amountInDoub + " EUR";
        }
        Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT);
    }
}
