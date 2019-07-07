package com.rishabhbatta.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    int n=0;
    public void guessTheNumber(View view){

        EditText editText = findViewById(R.id.numEditText);
        int number = Integer.parseInt(editText.getText().toString());
        if(number >  n){
            System.out.println("Higher!");
            Toast.makeText(this, "Higher!", Toast.LENGTH_SHORT).show();
        }else if(number < n){
            System.out.println("Lower!");
            Toast.makeText(this, "Lower!", Toast.LENGTH_SHORT).show();

        }else{
            System.out.println("Congratulations! You guessed it Right!");
            Toast.makeText(this, "Congratulations! You guessed it Right! Let's play again!", Toast.LENGTH_SHORT).show();
            getRandomNumber();
        }
        Log.i("Random Number", Integer.toString(n));
        Log.i("Guessed Number", Integer.toString(number));


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getRandomNumber();


    }
    public void getRandomNumber(){
        Random random = new Random();
        n = random.nextInt(20);
        n+=1;

    }

}

