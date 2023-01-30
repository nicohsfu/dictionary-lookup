package com.example.dictionarylookup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class WordEntryActivity extends AppCompatActivity implements View.OnClickListener {

    EditText wordEntryEditText;

    Button wordEntryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_entry);

        wordEntryEditText = findViewById(R.id.wordEntryEditText);

        wordEntryButton = findViewById(R.id.wordEntryButton);
        wordEntryButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // popup message as a test to see if the button is being clicked
        Toast.makeText(this, "Search up word button clicked", Toast.LENGTH_SHORT).show();
    }
}