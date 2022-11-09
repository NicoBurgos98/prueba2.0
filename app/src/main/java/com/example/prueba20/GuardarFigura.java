package com.example.prueba20;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class GuardarFigura extends AppCompatActivity {

    EditText nombreFig, tipoFig, Base, altura, area;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guardar_figura);

        nombreFig = (EditText) findViewById(R.id.idnombreFigura);
        tipoFig= (EditText) findViewById(R.id.idTipofigura);
        Base= (EditText) findViewById(R.id.idbasefigura);
        altura = (EditText) findViewById(R.id.idalturafigura);
        area = (EditText) findViewById(R.id.idareafigura);
        }
   public void guardarfigura(View view)
   {
     BD basededatos = new BD(this,"prueba2.0", null, 1);
     SQLiteDatabase editBD= basededatos.getWritableDatabase();
   }


    }
}