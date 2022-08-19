package com.example.inputname_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name;
    Button display;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.nameEdit);
        display = (Button) findViewById(R.id.button);
        output = (TextView) findViewById(R.id.output);
        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = (EditText) findViewById(R.id.nameEdit);
                if(name.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "Name column need to be filled!", Toast.LENGTH_SHORT).show();
                } else{
                    output.setText("Your name is " +name.getText().toString());
                }
            }
        });
    }
}