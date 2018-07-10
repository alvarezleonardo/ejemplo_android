package com.leonardo.ejemplo_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtHolaMundo;
    private String textoaMostrar = "hola mundo";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHolaMundo = findViewById(R.id.txtHolaMundo);

       txtHolaMundo.setText(textoaMostrar);


    }
}
