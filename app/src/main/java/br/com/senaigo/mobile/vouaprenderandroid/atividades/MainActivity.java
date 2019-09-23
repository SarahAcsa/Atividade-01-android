package br.com.senaigo.mobile.vouaprenderandroid.atividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import br.com.senaigo.mobile.vouaprenderandroid.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_principal);
    }


    public void ControladorPaciente(View view) {
        startActivity(new Intent(this, ControladorPaciente.class));
    }

    public void ControladorMedico2(View view) {
        startActivity(new Intent(this,ControladorMedico.class));
    }
}
