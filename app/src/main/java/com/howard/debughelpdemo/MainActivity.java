package com.howard.debughelpdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.howard.mylibrary.MyLib;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.helloTextView);
        if (textView != null) {
            textView.setText(new MyLib().getText());
        }
    }
}
