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

    /**
     * Custom method that will greet the user. Can only be called
     * by UI elements (know as View objects in Android)
     *
     * We are expecting the button to call this method. As such, we know
     * that the View object that is passed in will be the button. However,
     * we want the text that was written into the EditText View. So how
     * do we get it?
     *
     * We can grab a reference to that object by asking the Android OS for it.
     * findViewById is a method that will allow us to find any View by it's id.
     * So we will pass in R.id.editText and it will return our EditText object
     * as a View object.
     *
     * You can think of R as a phonebook that lets us quickly look up relevant objects.
     *
     * We cast that object to an EditText object and in the next line we can grab
     * the text it is holding. We can now use that text to greet our user via a Toast.
     *
     * @param view - The UI element that called this method. The element
     *             will pass itself in automatically when it calls this
     *             method.
     */
    public void greet(View view) {
        EditText nameField = (EditText)findViewById(R.id.editText);
        String message = nameField.getText().toString();

        Toast.makeText(this, "Hello, " + message + "!", Toast.LENGTH_SHORT).show();
    }
}
