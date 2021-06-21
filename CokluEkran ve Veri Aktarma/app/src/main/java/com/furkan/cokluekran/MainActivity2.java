package com.furkan.cokluekran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
   String userName = "x";
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.textView);
        Intent intent = getIntent();  //degisken olamaz (OnCreate)
        userName = intent.getStringExtra("userInput");
        textView.setText(userName);
    }

    public void button(View view){
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);  // packageContext: MainActivity2.this
        startActivity(intent);
    }
}