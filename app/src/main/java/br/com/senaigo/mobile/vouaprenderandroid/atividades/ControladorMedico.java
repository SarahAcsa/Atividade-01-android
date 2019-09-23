package br.com.senaigo.mobile.vouaprenderandroid.atividades;

import android.os.Bundle;
import android.view.View;


import br.com.senaigo.mobile.vouaprenderandroid.R;
import br.com.senaigo.mobile.vouaprenderandroid.adapters.MedicoAdapter;
import br.com.senaigo.mobile.vouaprenderandroid.entidades.Medico;


public class ControladorMedico extends MedicoActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_cad_medico);
    }

    public void adicionarMedico(View view){

        txtNome = findViewById(R.id.txtItemNome);
        txtNomeSocial = findViewById(R.id.txtItemNomeSocial);
        txtCPF = findViewById(R.id.txtItemCPF);
        txtRG = findViewById(R.id.txtitemRG);
        txtOrgaoExpeditor = findViewById(R.id.txtItemOrgaoExpeditor);
        txtTelefone = findViewById(R.id.txtItemTelefone);
        txtSexo = findViewById(R.id.txtItemSexo);
        txtDataNasc = findViewById(R.id.txtItemDataNasc);
        txtCRM = findViewById(R.id.txtItemCPF);
        txtEndereco = findViewById(R.id.txtItemEndereco);
        txtEmail = findViewById(R.id.txtItemEmail);


        String nome, nomeSocial, telefone, cpf, rg, orgaoExpeditor, dataNasc, sexo, endereco, especialidade, crm,email;

        nome = txtNome.getText().toString();
        nomeSocial = txtNomeSocial.getText().toString();
        telefone = txtTelefone.getText().toString();
        cpf = txtCPF.getText().toString();
        rg = txtRG.getText().toString();
        orgaoExpeditor = txtOrgaoExpeditor.getText().toString();
        dataNasc = txtDataNasc.getText().toString();
        sexo = txtSexo.getText().toString();
        endereco = txtEndereco.getText().toString();
        especialidade = txtEspecialidade.getText().toString();
        crm = txtCRM.getText().toString();
        email = txtEmail.getText().toString();

        Medico medico = new Medico(nome, nomeSocial, cpf, rg, telefone, orgaoExpeditor, sexo, dataNasc, endereco, especialidade, crm, email);

        lista.add(medico);


        listaMedico = findViewById(R.id.listaPaciente);

        MedicoAdapter medicoAdapter = new MedicoAdapter(this, lista);

        listaMedico.setAdapter(medicoAdapter);
    }

}
