package com.example.calculadora_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText et1;
    private EditText et2;
    private TextView tv1;
    private RadioButton suma,resta,multiplicacion,divicion,exponencial,radicacion;

    private Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        tv1=findViewById(R.id.vl1);

        suma=findViewById(R.id.suma);
       multiplicacion=findViewById(R.id.multiplicacion);
        resta=findViewById(R.id.resta);
        divicion=findViewById(R.id.divicion);
        exponencial=findViewById(R.id.exponencial);
        radicacion=findViewById(R.id.radicacion);




    }



    public void onclick(View view) {
        if (view.getId() == R.id.validar) {

            validar();


        }


        }
    public void validar(){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();
        int nro1 = Integer.parseInt(valor1);
        int nro2 = Integer.parseInt(valor2);
        String resu = "";
        if (suma.isChecked() == true) {

            int suma = nro1 + nro2;
            resu = "la suma es = " + suma;

        }
        if (resta.isChecked() == true) {

            int resta = nro1 - nro2;
            resu = resu + "la resta es = " + resta;


        } if (multiplicacion.isChecked() == true) {

            int multiplicacion = nro1 * nro2;
            resu = resu + "la multiplicación es = " + multiplicacion;


        } if (divicion.isChecked() == true) {

            double divicion = nro1 / nro2;
            resu = resu + "la divicion es = " + divicion;


        } if (exponencial.isChecked() == true) {

            int exponencial = nro1*nro1;
            int exponencial1 = nro2*nro2;
            resu = resu + "la potencia 1 es = " + exponencial+" y de la 2 es = "+exponencial1;


        } if (radicacion.isChecked() == true) {

            double radicacion = Math.sqrt(nro1);
            double radicacion1 = Math.sqrt(nro2);
            resu = resu + "la raiz 1 es = " + radicacion+" la raiz 2 es = "+radicacion1;


        }
        tv1.setText(resu);

    }}












