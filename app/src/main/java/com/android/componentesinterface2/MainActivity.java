package com.android.componentesinterface2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private Switch switchEstado;
    private ToggleButton toggleButtonEstado;
    private CheckBox checkBoxEstado;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchEstado = findViewById(R.id.switchEstadoId);
        toggleButtonEstado = findViewById(R.id.toggleButtonEstadoId);
        checkBoxEstado = findViewById(R.id.checkBoxEstadoId);
        textViewResultado = findViewById(R.id.textViewResultadoId);
    }

    public void enviar(View view){


         //Testa Switch
        if ( switchEstado.isChecked() ){
            textViewResultado.setText("Switch ligado");
        }
        else{
            textViewResultado.setText("Switch desligado");
        }

        /*  Testa Toggle Button
        *   No toogleButton você pode passar valores em textOff e textOn para quando o botão for clicado
        */

        /* if ( toggleButtonEstado.isChecked() ){
            textViewResultado.setText("Toggle Button ligado");
        }
        else{
            textViewResultado.setText("Toggle Button desligado");
        }*/

        /*toast
        Toast.makeText(getApplicationContext(), "enviado", Toast.LENGTH_SHORT).show();
        */


        //Testa CheckBox
        /*if ( checkBoxEstado.isChecked() ){
            textViewResultado.setText("CheckBox preenchido");
        }
        else{
            textViewResultado.setText("CheckBox vazio");
        }*/


        //imagem star_big_off que aparecerá quando o botão "enviar" forclicado
        ImageView imagem = new ImageView((getApplicationContext()));
        imagem.setImageResource(android.R.drawable.star_big_off);

        //toast customizado
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView( imagem );
        toast.show();

    }
}
