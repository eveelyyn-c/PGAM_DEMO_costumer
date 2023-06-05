package com.evelyn.chichande.costumer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Segundoactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundoactivity);

        Intent intent = getIntent();
        //String mensajeRecibido= intent.getStringExtra("mensa");

        //TextView textView= findViewById(R.id.txtMensaje);
        //textView.setText(mensajeRecibido);
    }

}