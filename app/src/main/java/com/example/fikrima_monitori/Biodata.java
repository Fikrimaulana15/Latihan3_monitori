package com.example.fikrima_monitori;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class Biodata extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.fikrima_monitori.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }

        public void sendMessage(View view) {
            Intent intent = new Intent(this,Hello.class);
            EditText editText = (EditText) findViewById(R.id.editText);
            String message = editText.getText().toString();
            intent.putExtra(EXTRA_MESSAGE,message);
            startActivity(intent);

    }
}