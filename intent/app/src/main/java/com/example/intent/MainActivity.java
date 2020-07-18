package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE_CODIGO = "com.example.intent CODIGO";
    public final static String EXTRA_MESSAGE_SENHA = "com.example.intent SENHA";
    public final static String EXTRA_MESSAGE_ROBO = "com.example.intent ROBO";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void informa(View view){

        EditText numero_cont = findViewById(R.id. txtnmr);
        EditText senha = findViewById(R.id. txtsenha);
        RadioButton rdb02 = findViewById(R.id.rdb02);
        String n = numero_cont.getText().toString();
        String v = senha.getText().toString();
        String p ;
        if (rdb02.isChecked())
            p = "robô";
        else
            p= "não é um robô";
        Intent intent = new Intent(this, login.class);
        intent.putExtra(EXTRA_MESSAGE_CODIGO, n);
        intent.putExtra(EXTRA_MESSAGE_SENHA, v);
        intent.putExtra(EXTRA_MESSAGE_ROBO, p);
        startActivity(intent);
    }
}
