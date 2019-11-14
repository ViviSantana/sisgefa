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
public class Funcionario {
    
    private String cpf;
    private String nome;
    private String funcao;
    private String senha;
    private String setor;

    public Funcionario() {
    }

    public Funcionario(String cpf, String nome, String funcao, String setor, String senha) {
        this.cpf = cpf;
        this.nome = nome;
        this.funcao = funcao;
        this.setor = setor;
        this.senha = senha;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
     
}
