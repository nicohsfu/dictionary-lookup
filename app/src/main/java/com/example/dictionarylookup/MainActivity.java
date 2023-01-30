package com.example.dictionarylookup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button enterAWordButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterAWordButton = findViewById(R.id.enterAWordButton);
        enterAWordButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // popup message as a test to see if the button is being clicked
        Toast.makeText(this, "Enter a Word button clicked", Toast.LENGTH_SHORT).show();
    }
}