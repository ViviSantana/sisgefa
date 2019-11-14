/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author btps000328
 */
public class TipoMotivoSol {
    private String codigo;
    private String descricao;
    private String outro;

    public TipoMotivoSol() {
    }

    public TipoMotivoSol(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public TipoMotivoSol(String codigo, String descricao, String outro) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.outro = outro;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getOutro() {
        return outro;
    }

    public void setOutro(String outro) {
        this.outro = outro;
    }
    
    
    
    
}
