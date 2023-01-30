package com.example.dictionarylookup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        String word = wordEntryEditText.getText().toString();
        Toast.makeText(this, word, Toast.LENGTH_LONG).show();

        // this Intent sends data back to a different Activity, e.g. "MainActivity"
        Intent i = new Intent();
        // sends the word inputted by the user
        i.putExtra("WORD", word);
        setResult(RESULT_OK, i);

        // finish() means we leave this Activity
        finish();
    }
}