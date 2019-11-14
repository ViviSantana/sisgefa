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
class Arquivos {
    private int id;
    private Denuncia idDenuncia;
    private String caminho;

    public Arquivos() {
    }

    public Arquivos(int id, Denuncia idDenuncia, String caminho) {
        this.id = id;
        this.idDenuncia = idDenuncia;
        this.caminho = caminho;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Denuncia getIdDenuncia() {
        return idDenuncia;
    }

    public void setIdDenuncia(Denuncia idDenuncia) {
        this.idDenuncia = idDenuncia;
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }
    
    
}
