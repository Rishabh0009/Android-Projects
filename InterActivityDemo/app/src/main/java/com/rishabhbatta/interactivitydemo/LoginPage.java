package com.rishabhbatta.interactivitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class LoginPage extends AppCompatActivity {

    public void loginFunction(View view){
        EditText emailEditText = findViewById(R.id.emailEditText);
        EditText passEditText = findViewById(R.id.passEditText);

        Log.i("Values","Username : "+emailEditText.getText().toString()+" & " + "Password : "+ passEditText.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
    }
}
