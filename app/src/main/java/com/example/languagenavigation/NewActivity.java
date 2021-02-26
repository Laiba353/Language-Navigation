package com.example.languagenavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class NewActivity extends AppCompatActivity {
    TextView newone;
    Context context;
    Resources resources;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        newone=findViewById(R.id.newone);
        Intent intent = getIntent();
        String languages = intent.getExtras().getString("language");
        //Toast.makeText(context, languages, Toast.LENGTH_SHORT).show();
        context = LocaleHelper.setLocale(NewActivity.this, languages);
        resources = context.getResources();
        newone.setText(resources.getString(R.string.language));
    }
}