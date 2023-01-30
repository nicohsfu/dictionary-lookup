package com.example.dictionarylookup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button enterAWordButton;

    private static int REQUEST_WORD_ENTRY = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterAWordButton = findViewById(R.id.enterAWordButton);
        enterAWordButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(MainActivity.this, WordEntryActivity.class);
        // strikethrough just means it's deprecated, it still works though
        startActivityForResult(i, REQUEST_WORD_ENTRY);
    }

    @Override
    protected void onActivityResult(int requestedCode, int resultCode, Intent data) {
        if (requestedCode == REQUEST_WORD_ENTRY) {
            if (resultCode == RESULT_OK) {
                if (data.hasExtra("WORD")) {
                    // extracts the user-inputted word (i.e. the value) based on its key
                    String word_entered = data.getExtras().getString("WORD");

                    // adds the user-inputted word to the dictionary URL in order to "look it up"
                    Uri webpage = Uri.parse("http://www.merriam-webster.com/dictionary/" + word_entered);

                    // implicit Intent - opens the webpage as determined above
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                    startActivity(webIntent);
                }
            }
        }
        super.onActivityResult(requestedCode, resultCode, data);
    }
}