/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author vivis
 */
public class Pessoa {

    private int num_logradouro ;
    private String nome ;
    private String rg ;
    private String cpf_cnpj ;
    private String email ;
    private String telefone ;
    private String logradouro ;
    private String comp_logradouro ;
    private String bairro_logradouro ;
    private String pref_contato ;
    private Municipio municipio_id ;
    private String uf;
    private TipoLogradouro tipo_logradouro_cod ;

    public Pessoa() {
        this.nome = nome;
        this.rg = rg;
        this.cpf_cnpj = cpf_cnpj;
        this.email = email;
        this.telefone = telefone;
        this.tipo_logradouro_cod = tipo_logradouro_cod;
        this.logradouro = logradouro;
        this.num_logradouro = num_logradouro;
        this.comp_logradouro = comp_logradouro;
        this.bairro_logradouro = bairro_logradouro;
        this.municipio_id = municipio_id;
        this.uf = uf;
        this.pref_contato = pref_contato;
    }

    public Pessoa(String nome, String rg, String cpf_cnpj, String email, String telefone, TipoLogradouro tipo_logradouro_cod, String logradouro, int num_logradouro, String comp_logradouro, String bairro_logradouro, Municipio municipio_id, String uf, String pref_contato) {
        this.nome = nome;
        this.rg = rg;
        this.cpf_cnpj = cpf_cnpj;
        this.email = email;
        this.telefone = telefone;
        this.tipo_logradouro_cod = tipo_logradouro_cod;
        this.logradouro = logradouro;
        this.num_logradouro = num_logradouro;
        this.comp_logradouro = comp_logradouro;
        this.bairro_logradouro = bairro_logradouro;
        this.municipio_id = municipio_id;
        this.uf = uf;
        this.pref_contato = pref_contato;
        
    }
    
    



    public int getNum_logradouro() {
        return num_logradouro;
    }

    public void setNum_logradouro(int num_logradouro) {
        this.num_logradouro = num_logradouro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComp_logradouro() {
        return comp_logradouro;
    }

    public void setComp_logradouro(String comp_logradouro) {
        this.comp_logradouro = comp_logradouro;
    }

    public String getBairro_logradouro() {
        return bairro_logradouro;
    }

    public void setBairro_logradouro(String bairro_logradouro) {
        this.bairro_logradouro = bairro_logradouro;
    }

    public String getPref_contato() {
        return pref_contato;
    }

    public void setPref_contato(String pref_contato) {
        this.pref_contato = pref_contato;
    }

    public Municipio getMunicipio_id() {
        return municipio_id;
    }

    public void setMunicipio_id(Municipio municipio_id) {
        this.municipio_id = municipio_id;
    }

    public TipoLogradouro gettipo_logradouro_cod() {
        return tipo_logradouro_cod;
    }

    public void settipo_logradouro_cod(TipoLogradouro tipo_logradouro_cod) {
        this.tipo_logradouro_cod = tipo_logradouro_cod;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    
}
