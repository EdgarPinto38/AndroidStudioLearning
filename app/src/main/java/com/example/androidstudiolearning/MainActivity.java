package com.example.androidstudiolearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText campo1,campo2;
    TextView etiResultado;
    int n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campo1 = (EditText) findViewById(R.id.campo1);
        campo2 = (EditText) findViewById(R.id.campo2);
        etiResultado = (TextView) findViewById(R.id.etiResultado);
    }

    @Override
    protected void onResume() { //Ejemplo de metodo de cliclo de vida de las actividades
        super.onResume();
    }

    public void onClick(View view) {
        n1 = Integer.parseInt(campo1.getText().toString());
        n2 = Integer.parseInt(campo2.getText().toString());
        int id = view.getId();
        if (id == R.id.btn1)
        {
            sumar();
        }
        else if (id == R.id.btn2)
        {
            restar();
        }
        else if (id == R.id.btn3)
        {
            multiplicar();
        }
        else if (id == R.id.btn4)
        {
            dividir();
        }
    }

    private void sumar()
    {
        int suma = n1 + n2;
        etiResultado.setText("El resultado de la suma es: "+suma);
    }
    private void restar()
    {
        int resta = n1 - n2;
        etiResultado.setText("El resultado de la resta es: "+resta);
    }

    private void multiplicar()
    {
        int multiplicacion = n1 * n2;
        etiResultado.setText("El resultado de la multiplicacion es: "+multiplicacion);
    }

    private void dividir()
    {
        if (n2 > 0)
        {
            int division = n1 / n2;
            etiResultado.setText("El resultado de la division es: "+division);
        }
        else
        {
            Toast.makeText(this,"Advertencia",Toast.LENGTH_LONG).show();
            etiResultado.setText("El numero 2 debe ser mayor a 0 para la division");
        }

    }
}