package com.example.prueba20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class Triangulo extends AppCompatActivity {

    private EditText numBT, numAT;
    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);

        numBT = (EditText) findViewById(R.id.idbaseTriangulo);
        numAT = (EditText) findViewById(R.id.idalturaTriangulo);
        result = (TextView) findViewById(R.id.idResultadoTriangulo);
    }
    public void AreaTri (View view)
    {
        double n1, n2, AreaTri;
        n1 = Double.parseDouble(numBT.getText().toString());
        n2 = Double.parseDouble(numAT.getText().toString());
        AreaTri = n1 * n2/ 2;
        result.setText(" " + AreaTri);
    }

}