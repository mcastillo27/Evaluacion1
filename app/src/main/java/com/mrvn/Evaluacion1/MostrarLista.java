package com.mrvn.Evaluacion1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.mrvn.Evaluacion1.R;

import static com.mrvn.Evaluacion1.NuevoEstudiante.valores;
public class MostrarLista extends AppCompatActivity {
    private ListView valoresLista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_lista);
        valoresLista = findViewById(R.id.listValores);
        this.valoresLista.setAdapter(new AdaptadorLista(this,R.layout.activity_lista_estudiantes, valores));
    }
}
