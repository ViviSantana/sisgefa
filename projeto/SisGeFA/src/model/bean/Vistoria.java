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
public class Vistoria {
    
    private int id;
    private String data;
    private String local;
    private boolean denuncia;
    private String relatorio;
    private String responsavel;

    public Vistoria() {
    }

    public Vistoria(String data, String local, boolean denuncia, String responsavel, String relatorio) {
         
        this.data = data;
        this.local = local;
        this.denuncia = denuncia;
        this.responsavel = responsavel;
        this.relatorio = relatorio;
    }



    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the denuncia
     */
    public boolean isDenuncia() {
        return denuncia;
    }

    /**
     * @param denuncia the denuncia to set
     */
    public void setDenuncia(boolean denuncia) {
        this.denuncia = denuncia;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the local
     */
    public String getLocal() {
        return local;
    }

    /**
     * @param local the local to set
     */
    public void setLocal(String local) {
        this.local = local;
    }

    /**
     * @return the relatorio
     */
    public String getRelatorio() {
        return relatorio;
    }

    /**
     * @param relatorio the relatorio to set
     */
    public void setRelatorio(String relatorio) {
        this.relatorio = relatorio;
    }

    /**
     * @return the responsavel
     */
    public String getResponsavel() {
        return responsavel;
    }

    /**
     * @param responsavel the responsavel to set
     */
    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
    
    
}
