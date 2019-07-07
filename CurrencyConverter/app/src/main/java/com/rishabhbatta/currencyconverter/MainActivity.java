package com.rishabhbatta.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertFunction(View view){

        Log.i("Info","Button Pressed!");

        // Calculate conversion

        EditText editText = findViewById(R.id.amtEditText);

        String entAmt = editText.getText().toString();
        double amt =Double.valueOf(entAmt);
        double finalAmtDouble = amt*68.93;
        String finalAmt = String.format("%.2f",finalAmtDouble);

        Toast.makeText(this, entAmt + " $ is " + finalAmt +" in Rs", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
