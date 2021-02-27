package com.example.languagenavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class NewActivity extends AppCompatActivity {
    TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        name=findViewById(R.id.name);
        Intent intent = getIntent();
        String languages = intent.getExtras().getString("language");
        Toast.makeText(this, languages, Toast.LENGTH_SHORT).show();



    }

}