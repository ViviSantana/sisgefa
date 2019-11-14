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
public class Denuncia {

    private int id;
    private Pessoa denunciante ;
    private String data;
    private int numLogradouro;
    private String nomeDenunciado;
    private String logradouro;
    private String complLogradouro;
    private String bairro;
    private String ptoReferencia;
    private String descricaoDenuncia;
    private TipoLogradouro tipoLogradouro;
    private TipoDenuncia tipoDenuncia;
    private Municipio municipio;
    private String uf;
    private Arquivos arquivos;
    private String statusD;
            
    public Denuncia() {
    }

    public Denuncia(TipoDenuncia tipoDenuncia, String data, Pessoa denunciante, String nomeDenunciado, TipoLogradouro tipoLogradouro, String logradouro, int numLogradouro, String complLogradouro, String bairro,  Municipio municipio, String uf, String ptoReferencia, String descricaoDenuncia, String statusD) {
        this.denunciante = denunciante;
        this.data = data;
        this.numLogradouro = numLogradouro;
        this.nomeDenunciado = nomeDenunciado;
        this.logradouro = logradouro;
        this.complLogradouro = complLogradouro;
        this.bairro = bairro;
        this.ptoReferencia = ptoReferencia;
        this.descricaoDenuncia = descricaoDenuncia;
        this.tipoLogradouro = tipoLogradouro;
        this.tipoDenuncia = tipoDenuncia;
        this.municipio = municipio;
        this.uf = uf;
        this.statusD = statusD;
    
    }
    public Denuncia(TipoDenuncia tipoDenuncia, String data, String nomeDenunciado, TipoLogradouro tipoLogradouro, String logradouro, int numLogradouro, String complLogradouro, String bairro,  Municipio municipio, String uf, String ptoReferencia, String descricaoDenuncia, String statusD) {
    
        this.numLogradouro = numLogradouro;
        this.data = data;
        this.nomeDenunciado = nomeDenunciado;
        this.logradouro = logradouro;
        this.complLogradouro = complLogradouro;
        this.bairro = bairro;
        this.ptoReferencia = ptoReferencia;
        this.descricaoDenuncia = descricaoDenuncia;
        this.tipoLogradouro = tipoLogradouro;
        this.tipoDenuncia = tipoDenuncia;
        this.municipio = municipio;
        this.uf = uf;
        this.statusD = statusD;
    }

    public String getStatusD() {
        return statusD;
    }

    public void setStatusD(String statusD) {
        this.statusD = statusD;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    public int getNumLogradouro() {
        return numLogradouro;
    }

    public void setNumLogradouro(int numLogradouro) {
        this.numLogradouro = numLogradouro;
    }

    public String getNomeDenunciado() {
        return nomeDenunciado;
    }

    public void setNomeDenunciado(String nomeDenunciado) {
        this.nomeDenunciado = nomeDenunciado;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplLogradouro() {
        return complLogradouro;
    }

    public void setComplLogradouro(String complLogradouro) {
        this.complLogradouro = complLogradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getPtoReferencia() {
        return ptoReferencia;
    }

    public void setPtoReferencia(String ptoReferencia) {
        this.ptoReferencia = ptoReferencia;
    }

    public String getDescricaoDenuncia() {
        return descricaoDenuncia;
    }

    public void setDescricaoDenuncia(String descricaoDenuncia) {
        this.descricaoDenuncia = descricaoDenuncia;
    }

    public TipoLogradouro getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public TipoDenuncia getTipoDenuncia() {
        return tipoDenuncia;
    }

    public void setTipoDenuncia(TipoDenuncia tipoDenuncia) {
        this.tipoDenuncia = tipoDenuncia;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public Arquivos getArquivos() {
        return arquivos;
    }

    public void setArquivos(Arquivos arquivos) {
        this.arquivos = arquivos;
    }

    public Pessoa getDenunciante() {
        return denunciante;
    }

    public void setDenunciante(Pessoa denunciante) {
        this.denunciante = denunciante;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
    

    
    
}
