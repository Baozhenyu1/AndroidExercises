package com.example.simpleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button helloButton = (Button)findViewById((R.id.button));

        helloButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TextView helloTextView = (TextView) findViewById(R.id.textView);

                Toast.makeText(MainActivity.this, "Clicked", Toast.LENGTH_SHORT).show();
                helloTextView.setText(R.string.interact_message);
            }
        });
    }
}