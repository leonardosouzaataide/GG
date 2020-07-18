package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        setContentView(R.layout.activity_login);
        TextView cod = findViewById(R.id.textView11);
        TextView sen = findViewById(R.id.textView12);
        TextView rob = findViewById(R.id.textView13);
        String l = extras.getString(MainActivity.EXTRA_MESSAGE_CODIGO);
        String a = extras.getString(MainActivity.EXTRA_MESSAGE_SENHA);
        String q = extras.getString(MainActivity.EXTRA_MESSAGE_ROBO);
        cod.setText(l);
        sen.setText(a);
        rob.setText(q);
    }
}
