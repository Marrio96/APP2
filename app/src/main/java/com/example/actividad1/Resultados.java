package com.example.actividad1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Resultados extends AppCompatActivity {
    //Creando  objetos
    TextView tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8,tx9,tx10,tx11,tx12,tx13,tx14
            ,tx15,tx16,tx17,tx18,tx19,tx20;
    int k=1;
    MediaPlayer sonido2;
    int j=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);
        //Instanciando
        sonido2=MediaPlayer.create(this,R.raw.beepsbonksboinks8);
        tx1 = (TextView) findViewById(R.id.tx1);
        tx2 = (TextView) findViewById(R.id.tx2);
        tx3 = (TextView) findViewById(R.id.tx3);
        tx4 = (TextView) findViewById(R.id.tx4);
        tx5 = (TextView) findViewById(R.id.tx5);
        tx6 = (TextView) findViewById(R.id.tx6);
        tx7 = (TextView) findViewById(R.id.tx7);
        tx8 = (TextView) findViewById(R.id.tx8);
        tx9 = (TextView) findViewById(R.id.tx9);
        tx10 = (TextView) findViewById(R.id.tx10);
        tx11 = (TextView) findViewById(R.id.tx11);
        tx12 = (TextView) findViewById(R.id.tx12);
        tx13 = (TextView) findViewById(R.id.tx13);
        tx14 = (TextView) findViewById(R.id.tx14);
        tx15 = (TextView) findViewById(R.id.tx15);
        tx16 = (TextView) findViewById(R.id.tx16);
        tx17 = (TextView) findViewById(R.id.tx17);
        tx18 = (TextView) findViewById(R.id.tx18);
        tx19 = (TextView) findViewById(R.id.tx19);
        tx20 = (TextView) findViewById(R.id.tx20);

        //Obtencion de valores de la MainActivity//
        int[] num = getIntent().getIntArrayExtra("numeros");
        while(j<20){
            while (k < 20){
                if (num[k] > num[k + 1]) {
                    int aux = num[k + 1];
                    num[k + 1] = num[k];
                    num[k] = aux;
                }
                k=k+1;
            }
            j=j+1;
            k=1;
        }

        //ASignando el valor a las casillas//

        tx1.setText("1.- "+ String.valueOf(num[1]));
        tx2.setText("2.- "+String.valueOf(num[2]));
        tx3.setText("3.- "+String.valueOf(num[3]));
        tx4.setText("4.- "+String.valueOf(num[4]));
        tx5.setText("5.- "+String.valueOf(num[5]));
        tx6.setText("6.- "+String.valueOf(num[6]));
        tx7.setText("7.- "+String.valueOf(num[7]));
        tx8.setText("8.- " +String.valueOf(num[8]));
        tx9.setText("9.- "+String.valueOf(num[9]));
        tx10.setText("10.- "+String.valueOf(num[10]));
        tx11.setText("11.- "+String.valueOf(num[11]));
        tx12.setText("12.- "+String.valueOf(num[12]));
        tx13.setText("13.- "+String.valueOf(num[13]));
        tx14.setText("14.- "+String.valueOf(num[14]));
        tx15.setText("15.- "+String.valueOf(num[15]));
        tx16.setText("16.- "+String.valueOf(num[16]));
        tx17.setText("17.- "+String.valueOf(num[17]));
        tx18.setText("18.- "+String.valueOf(num[18]));
        tx19.setText("19.- "+String.valueOf(num[19]));
        tx20.setText("20.- "+String.valueOf(num[20]));


    }

    //Método del boton de regreso
    public void atras(View view ) {
        sonido2.start();
        Intent anterior = new Intent(this,MainActivity.class);
        startActivity(anterior);
        finish();
    }

    public void  ordenamiento(int [] n){
        //Método de la burbuja
        int aux=0,
                j=1,
                k=1;
        for(k=1;k<n.length;k++)
        {
            if(n[k]>n[k+1])
            {
                aux=n[k];
                n[k]=n[k+1];
                n[k+1]=aux;
            }
        }
    }
}
