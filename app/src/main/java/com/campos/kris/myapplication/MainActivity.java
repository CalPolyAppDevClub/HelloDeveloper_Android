package com.campos.kris.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void greet(View view) {
        EditText nameField = (EditText)findViewById(R.id.editText);
        String message = nameField.getText().toString();

        Toast.makeText(this, "Hello, " + message + "!", Toast.LENGTH_SHORT).show();
    }
}
