package com.mrvn.Evaluacion1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.mrvn.Evaluacion1.R;

public class MainActivity extends AppCompatActivity {
    Button btnNuevo;
    Button btnLista;
    Button btnMisDatos;
    public static Integer contador=1;
    public static String msjEstudiante="0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNuevo = findViewById(R.id.btnNuevo);
        btnLista = findViewById(R.id.btnLista);
        btnMisDatos = findViewById(R.id.btnMisDatos);
        btnNuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), NuevoEstudiante.class);
                startActivityForResult(i,0);
            }
        });
        btnLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), MostrarLista.class);
                startActivityForResult(i,0);
            }
        });
        btnMisDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), MisDatos.class);
                startActivityForResult(i,0);
            }
        });
    }
    public void onActivityResult(int RequestCode, int ResultCode, Intent datos) {
        super.onActivityResult(RequestCode, ResultCode, datos);
        if (ResultCode == RESULT_OK){
            Toast.makeText(this,datos.getStringExtra(msjEstudiante),Toast.LENGTH_SHORT).show();
        }
    }
}
