package edu.trainner.gridviewlayout.gridviewlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = (GridView) findViewById(R.id.grid_view);

        // Instancia do ImageAdapter Class
        gridView.setAdapter(new ImageAdapter(this));

        /**
         * Evento onclick da Full Image Item
         * */
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                // Enviando a imagem id para FullImageActivity
                Intent i = new Intent(getApplicationContext(), FullImageActivity.class);
                // passando o index do array index
                i.putExtra("id", position);
                startActivity(i);
            }
        });
    }
}
