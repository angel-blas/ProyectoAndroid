package com.example.angel.materialdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Double resultado=0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView texto = (TextView) findViewById(R.id.puchame);
        texto.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(),"Quibo hambrita?",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this,Segunda.class);
                startActivity(i);
        }
        });
    }

    public void sumar (View view){
        EditText uno = (EditText)findViewById(R.id.num1);
        EditText dos = (EditText)findViewById(R.id.num2);

        Double num1 = Double.parseDouble(uno.getText().toString());
        Double num2 = Double.parseDouble(dos.getText().toString());

        resultado=num1+num2;

        mostrarCantidad(resultado);
    }
    public void mostrarCantidad(Double r){
        TextView digito = (TextView) findViewById(R.id.digito);
        digito.setText(""+resultado);
    }
}
