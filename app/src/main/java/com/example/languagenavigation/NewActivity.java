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
    Context context;
    Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        name=findViewById(R.id.name);
        Intent intent = getIntent();
        String languages = intent.getExtras().getString("language");
        Toast.makeText(this, languages, Toast.LENGTH_SHORT).show();
        if(languages.equals("ENGLISH"))
        {

            context = LocaleHelper.setLocale(NewActivity.this, "en");
            resources = context.getResources();
            name.setText(resources.getString(R.string.myname));

        }
        //if user select prefered language as Hindi then
        if(languages.equals("اردو"))
        {
            context = LocaleHelper.setLocale(NewActivity.this, "zh");
            resources = context.getResources();
            name.setText(resources.getString(R.string.myname));

        }
    }

}