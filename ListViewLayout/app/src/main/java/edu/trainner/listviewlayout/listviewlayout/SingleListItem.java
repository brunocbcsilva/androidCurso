package edu.trainner.listviewlayout.listviewlayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by bruno on 24/02/2018.
 */

public class SingleListItem extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.single_list);
        TextView txtElemento = (TextView) findViewById(R.id.elemento_label);
        Intent i = getIntent();

        // capturando o dado anexado a partir da intent
        String elemento = i.getStringExtra("elemento");

        // mostrando o nome do item selecionado
        txtElemento.setText(elemento);
    }
}
