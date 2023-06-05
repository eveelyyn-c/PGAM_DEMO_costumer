package com.evelyn.chichande.costumer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*Método de enlace con el boton
     * 1. Debe ser público
     * 2. Debe estar vacío
     * 3. Debe devolver un view*/
    public void enviarMensaje (View view){
        Intent intent= new Intent(this,Segundoactivity.class);
                /*El concepto de CONTEXTO va a estar muy presente aquí*, porque tenemos que identificar
                desde qué contexto estamos trabajando...con THIS podemos llegar al contexto o con GETAPPLICACION CONTEXT/
                 */
        /*Aquí vamos a linkear o casterar el ELEMENTO
         * 1. Casteo o enlazo el elemento por tu ID*/
        //EditText editTextMensaje= (EditText) findViewById(R.id.txtMensajeA1);
        /*Aquí llega el control completo y del control, SÓLO saco el texto*/
        //String mensaje= editTextMensaje.getText().toString();
        //intent.putExtra("mensa", mensaje);
        /*Mando el valor y lo que me queda es recibir el valor*/

        /*NOTA: VOY A ELIMINAR EL TEXT____PARA PROBAR EL LOGIN :) */

        startActivity(intent);  /*Iniciamos el activity*/
    }
}