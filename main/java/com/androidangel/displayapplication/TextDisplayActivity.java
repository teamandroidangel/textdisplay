package com.androidangel.displayapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TextDisplayActivity extends AppCompatActivity {
    //EditText field
    private EditText etWords; // currently null
    // private <type> <id>;
    private TextView tbLabel; // null

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Creates a layout in memory
        setContentView(R.layout.activity_text_display); //Associates the java with the XML
        // Views are created in the layout
        // Find the reference to those views
        etWords = (EditText) findViewById(R.id.etWords);
        // <id> = (<typed>) findViewById(R.id.<id>);
        tbLabel = (TextView) findViewById(R.id.tbLabel);
}
    // Fired when the button is clicked
    public void onSearch(View view) {
        //Get the value from the TextField (whatever was typed into the text field)
        String fieldValue = etWords.getText().toString();
        //Set the value into the Label (TextView)
        tbLabel.setText(fieldValue);
        //Display the value as a quick alert
        Toast.makeText(this, fieldValue, Toast.LENGTH_SHORT).show();
    }
}
