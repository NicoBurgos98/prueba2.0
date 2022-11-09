package com.example.prueba20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Cuadrado extends AppCompatActivity {

    private EditText numBR, numAR;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);

        numBR = (EditText) findViewById(R.id.idBaseRectangulo);
        numAR = (EditText) findViewById(R.id.idalturaRectangulo);
        result = (TextView) findViewById(R.id.idresultadorectangulo);
    }
    public void AreaRec (View view)
    {
        double n1, n2, AreaRec;
        n1 = Double.parseDouble(numBR.getText().toString());
        n2 = Double.parseDouble(numAR.getText().toString());
        AreaRec = n1 * n2 ;
        result.setText(" " + AreaRec);
    }
}