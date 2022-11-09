package com.example.prueba20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button Triangulo, Circulo, Rectangulo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Triangulo = (Button) findViewById(R.id.idTriangulo);
        Circulo= (Button) findViewById(R.id.idCirculo);
        Rectangulo = (Button) findViewById(R.id.idRectangulo);


    }
    public void triangulo(View view)
    {
        Intent intenciont = new Intent(this, Triangulo.class);
        startActivity(intenciont);
    }

    public void Circulo(View view)
    {
     Intent intencionC = new Intent(this, Circulo.class);
     startActivity(intencionC);

    }
    public void Cuadrado(View view)
    {
        Intent intencionCU = new Intent(this, Cuadrado.class);
        startActivity(intencionCU);
    }

}