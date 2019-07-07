package com.rishabhbatta.imageviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void imageChangeFunction(View view){
        ImageView imageView = findViewById(R.id.imageView);

        Log.i("Info","Button Pressed!");

        imageView.setImageResource(R.drawable.cat2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
