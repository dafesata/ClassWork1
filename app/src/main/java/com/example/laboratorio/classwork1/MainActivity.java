package com.example.laboratorio.classwork1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button CalcularNota;
    private EditText Nota1,Nota2,Nota3,Nota4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CalcularNota = (Button) findViewById(R.id.CalcularNota);

        CalcularNota.setOnClickListener(this);

        Nota1 = (EditText) findViewById(R.id.Nota1);
        Nota2 = (EditText) findViewById(R.id.Nota2);
        Nota3 = (EditText) findViewById(R.id.Nota3);
        Nota4 = (EditText) findViewById(R.id.Nota4);
        // Sample

    }


    @Override
    public void onClick(View v) {


        if (!Nota1.getText().toString().equals("") && !Nota2.getText().toString().equals("") && !Nota3.getText().toString().equals("")) {
            double nota1 = Double.parseDouble(Nota1.getText().toString());
            double nota2 = Double.parseDouble(Nota2.getText().toString());
            double nota3 = Double.parseDouble(Nota3.getText().toString());
            double nota4 = (3.5 - ((nota1 + nota2 + nota3) / 3) * 0.75) / 0.25;
            Nota4.setText(String.valueOf(nota4));
        }else{
            Toast toast1 =
                    Toast.makeText(getApplicationContext(),
                            "LLene todos los campos para continuar", Toast.LENGTH_SHORT);
            toast1.show();
        }



    }
}
