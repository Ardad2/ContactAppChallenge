package com.example.intentchallenge4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class create_contact extends AppCompatActivity {
    EditText etName, etNumber, etWebsite, etLocation;
    ImageView iv_smile,iv_neutral,iv_frown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_contact);

        etName=findViewById(R.id.etName);
        etNumber=findViewById(R.id.etNumber);
        etWebsite=findViewById(R.id.etWebsite);
        etLocation=findViewById(R.id.etLocation);

        iv_smile=findViewById(R.id.iv_smile);
        iv_neutral=findViewById(R.id.iv_neutral);
        iv_frown=findViewById(R.id.iv_frown);

        iv_smile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        iv_neutral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        iv_frown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });




    }
}