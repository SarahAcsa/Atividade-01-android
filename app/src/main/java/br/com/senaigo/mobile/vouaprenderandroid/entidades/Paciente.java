package br.com.senaigo.mobile.vouaprenderandroid.entidades;

public class Paciente {

    protected String nome;
    protected String nomeSocial;
    protected String cpf;
    protected String rg;
    protected String telefone;
    protected String orgaoExpeditor;
    protected String sexo;
    protected String dataNasc;

    public Paciente(String nome, String nomeSocial, String cpf, String rg, String telefone, String orgaoExpeditor, String sexo, String dataNasc) {
        this.nome = nome;
        this.nomeSocial = nomeSocial;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.orgaoExpeditor = orgaoExpeditor;
        this.sexo = sexo;
        this.dataNasc = dataNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getOrgaoExpeditor() {
        return orgaoExpeditor;
    }

    public void setOrgaoExpeditor(String orgaoExpeditor) {
        this.orgaoExpeditor = orgaoExpeditor;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", nomeSocial='" + nomeSocial + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", telefone='" + telefone + '\'' +
                ", orgaoExpeditor='" + orgaoExpeditor + '\'' +
                ", sexo='" + sexo + '\'' +
                ", dataNasc='" + dataNasc + '\'' +
                '}';
    }
}
