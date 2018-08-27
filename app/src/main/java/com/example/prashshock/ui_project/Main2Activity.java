package com.example.prashshock.ui_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    Button btn;
    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btn = (Button)findViewById(R.id.button);
        final EditText e1=(EditText)findViewById(R.id.editText);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                String number = e1.getText().toString();
                Long num= Long.parseLong(number);
                if(num>999999999){
                    startActivity(new Intent(Main2Activity.this, Main3Activity.class));}}
                 catch(Exception e){
                    Toast.makeText(getApplicationContext(), "Number not entered", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

