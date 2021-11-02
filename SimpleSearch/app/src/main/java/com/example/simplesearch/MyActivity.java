package com.example.simplesearch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        TextView mTextView = (TextView) findViewById(R.id.my_text);
        mTextView.setText(getIntent().getStringExtra("extra"));
    }
}