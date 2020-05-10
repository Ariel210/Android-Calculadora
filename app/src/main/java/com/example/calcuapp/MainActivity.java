package com.example.calcuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Declarando atributos
    private EditText Num1;
    private EditText Num2;
    private TextView Respuesta;


    //Llamada
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Num1=findViewById(R.id.Num1);
        Num2=findViewById(R.id.Num2);

        Respuesta=findViewById(R.id.Respuesta);
    }

    //Métodos
    public void sumar(View view)
    {
        //Excepcion
        try {
            int respuesta_num=Integer.parseInt(Num1.getText().toString()) + Integer.parseInt(Num2.getText().toString());
            Respuesta.setText(respuesta_num + "");
        }catch (Exception e) {
            Toast.makeText(this, "Numeros no validos",Toast.LENGTH_SHORT).show();
        }
    }

    public void resta(View view)
    {
        try {
            int respuesta_num=Integer.parseInt(Num1.getText().toString()) - Integer.parseInt(Num2.getText().toString());
            Respuesta.setText(respuesta_num + "");
        }catch (Exception e) {
            Toast.makeText(this, "Numeros no validos",Toast.LENGTH_SHORT).show();
        }
    }

    public void producto(View view)
    {
        try {
            int respuesta_num=Integer.parseInt(Num1.getText().toString()) * Integer.parseInt(Num2.getText().toString());
            Respuesta.setText(respuesta_num + "");
        }catch (Exception e) {
            Toast.makeText(this, "Numeros no validos",Toast.LENGTH_SHORT).show();
        }
    }

    public void division(View view)
    {
        try {
            int respuesta_num=Integer.parseInt(Num1.getText().toString()) / Integer.parseInt(Num2.getText().toString());
            Respuesta.setText(respuesta_num + "");
        }catch (Exception e) {
            Toast.makeText(this, "Numeros no validos", Toast.LENGTH_SHORT).show();
        }
    }
}
