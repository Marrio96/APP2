/**
 * Escobedo López Mario Arturo
 * Computo Móvil
 * Ordenamiento de 20 números
 */
package com.example.actividad1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    String cadena=null;
    public int[] numeros=new int[25];
    int pos_numero=0;
    int i=0;
    Button ingresar;
    EditText input_numero;
    MediaPlayer sonido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ingresar= findViewById(R.id.button);
        input_numero= findViewById(R.id.editText);
        sonido=MediaPlayer.create(this,R.raw.beep);
        Toast.makeText(getApplicationContext(),  getResources().getString(R.string.Bienvenido), Toast.LENGTH_SHORT).show();
        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                sonido.start();
                cadena = input_numero.getText().toString();
                if(cadena.length()!=0) {

                    i++;
                    guardado(cadena);

                }
                else{
                        Toast.makeText(MainActivity.this,  getResources().getString(R.string.error), Toast.LENGTH_LONG).show();;
                    }
                }

        });
    }

    //Cambio de activity
    private void siguiente(View view) {
        i=1;
        input_numero.setText(null);
        Intent siguientea = new Intent(this,Resultados.class);
        siguientea.putExtra("numeros",numeros);
        startActivity(siguientea);
        finish();
    }
    //Almacenar el número ingresado
    private  void  guardado(String n){
        if(i<=20){
            Toast.makeText(getApplicationContext(),  getResources().getString(R.string.numero) + " " + n  + " " + getResources().getString(R.string.mensaje_ingresado), Toast.LENGTH_LONG).show();
            input_numero.setText(null);
            pos_numero = Integer.parseInt(n);
            numeros[i]=pos_numero;
        }
        else{
            //ordenamiento(numeros);
            siguiente(null);
        }
    }

    //Proceso de ordenamiento



}
