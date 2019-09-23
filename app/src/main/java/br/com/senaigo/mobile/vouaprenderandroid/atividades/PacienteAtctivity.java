package br.com.senaigo.mobile.vouaprenderandroid.atividades;

import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import br.com.senaigo.mobile.vouaprenderandroid.entidades.Paciente;

public class PacienteAtctivity extends AppCompatActivity {

    public EditText txtNome;
    public EditText txtNomeSocial;
    public EditText txtCPF;
    public EditText txtRG;
    public EditText txtTelefone;
    public EditText txtOrgaoExpeditor;
    public EditText txtSexo;
    public EditText txtDataNasc;
    public List<Paciente> lista = new ArrayList<>();
    public ListView listaPaciente;
}
