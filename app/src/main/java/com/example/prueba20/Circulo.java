package com.example.prueba20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Circulo extends AppCompatActivity {
    private EditText numRC, numPIC;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);

        numRC = (EditText) findViewById(R.id.idRadioCirculo);
        numPIC = (EditText) findViewById(R.id.idpiCirculo);
        result = (TextView) findViewById(R.id.idRelsultadoCirculo);
    }

    public void AreaCir (View view)
    {
        double n1,n2, AreaCir;
        n1= Double.parseDouble(numRC.getText().toString());
        n2= Double.parseDouble(numPIC.getText().toString());
        AreaCir = n2 * n1 *(n1 * n1);
        result.setText(" " + AreaCir);
    }


}