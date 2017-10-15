package com.graphyjeunes.mapremiereapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // EditFext field
    private EditText etWords; // currently null
    // private <type> <Id>;
    private TextView tvLabel; // null


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      // Creates the layout in memory
        setContentView(R.layout.activity_main); // associates the java in the joll
        // views are created in the layout
        // find reference to those views
        etWords= (EditText) findViewById(R.id.etWords);
        // id = (<type>) findViewById(R.id.<id>);
        tvLabel= (TextView) findViewById(R.id.tvLabel);
    }

    //fired when the button is clicked
    public void onSubmit( View view ){
     // Getthe valuefrom the text field (whatever was typed into the Text field)
        String fieldvalue = etWords.getText().toString();
     // Set the value into the label (Textview)

        tvLabel.setText(fieldvalue);
     // Display the value as a quick alert
        Toast.makeText(this, fieldvalue, Toast.LENGTH_SHORT).show();

        /*
    // show a "Hello word" message on Screen
    // a stoast =="simple alert"
        Toast.makeText(this, "hallo world" Toast.LENGTH_SHORT).show();
        */
    }

}
