package br.com.senaigo.mobile.vouaprenderandroid.atividades;

import android.os.Bundle;
import android.view.View;

import br.com.senaigo.mobile.vouaprenderandroid.R;
import br.com.senaigo.mobile.vouaprenderandroid.adapters.PacienteAdapter;
import br.com.senaigo.mobile.vouaprenderandroid.entidades.Paciente;


public class ControladorPaciente extends PacienteAtctivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_cad_paciente);
    }

    public void adicionar(View view) {

        //ENTRADA DE DADOS
        //Captura o componente EditText da VIEW
        txtNome = findViewById(R.id.txtItemNome);
        txtNomeSocial = findViewById(R.id.txtItemNomeSocial);
        txtCPF = findViewById(R.id.txtItemCPF);
        txtRG = findViewById(R.id.txtitemRG);
        txtOrgaoExpeditor = findViewById(R.id.txtItemOrgaoExpeditor);
        txtTelefone = findViewById(R.id.txtItemTelefone);
        txtDataNasc = findViewById(R.id.txtItemDataNasc);
        txtSexo = findViewById(R.id.txtItemSexo);


        String nome, nomeSocial, telefone, cpf, rg, orgaoExpeditor, dataNasc, sexo;

        nome = txtNome.getText().toString();
        nomeSocial = txtNomeSocial.getText().toString();
        telefone = txtTelefone.getText().toString();
        cpf = txtCPF.getText().toString();
        rg = txtRG.getText().toString();
        orgaoExpeditor = txtOrgaoExpeditor.getText().toString();
        dataNasc = txtDataNasc.getText().toString();
        sexo = txtSexo.getText().toString();


        Paciente paciente = new Paciente(nome, nomeSocial, telefone, cpf, rg, orgaoExpeditor, dataNasc, sexo);

        lista.add(paciente);

        //SAIDA

        listaPaciente = findViewById(R.id.listaPaciente);


        PacienteAdapter pacienteAdapter = new PacienteAdapter(this, lista);
        listaPaciente.setAdapter(pacienteAdapter);
    }
}
