package com.barbaburguer.snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private Button buttonAbrir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAbrir = findViewById(R.id.buttonAbrir);



    }
    public void abrirSnackbar(View view){


        Snackbar.make(
                view, "Botão pressionado", Snackbar.LENGTH_INDEFINITE //pode ser Long ou Short também

        ).setAction("ACEITA CARALHO", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonAbrir.setText("BOA PORRA");
            }
        }).setActionTextColor(getResources().getColor(R.color.colorPrimaryDark)).show();

    }
    /*
    public void fechar(View view){
    snackbar.dismiss();
    }

     */
}
