package com.rishabhbatta.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void checkNumber(View view){
        EditText editText = findViewById(R.id.editText);


        class Number{

            public int number;

            public boolean isSquareNumber() {

                int x = 1;
                while(x<=50) {

                    int r = number %x;
                    int q = number /x;

                    if(r==0 && q==x) {
                        return true;
                    }
                    x++;
                }

                return false;
            }

            public boolean isTriangularNumber() {
                int x=1;
                int triangularNumber = 1;

                while(x <= 50) {

                    if(number == triangularNumber) {
                        return true;
                    }

                    x++;

                    triangularNumber = triangularNumber+x;
                }

                return false;
            }
        }

        if(editText.getText().toString().isEmpty()){
            printToastMsg("Please enter a number!");
        }else{
            Number num = new Number();
            num.number = Integer.parseInt(editText.getText().toString());

            if(num.isSquareNumber() & num.isTriangularNumber()) {
                printToastMsg(num.number+" is Square number & triangular number.");
                System.out.println(num.number+" is Square number & triangular number.");
            }else if(num.isSquareNumber()) {
                printToastMsg(num.number + " is Square Number");
                System.out.println(num.number + " is Square Number");
            }else if(num.isTriangularNumber()) {
                printToastMsg(num.number + " is triangular Number");
                System.out.println(num.number + " is triangular Number");
            }else {
                printToastMsg(num.number + " neither square number nor triangular number.");
                System.out.println(num.number + " neither square number nor triangular number.");
            }

        }



    }

    public void printToastMsg(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
