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
public class Solicitacao {

   
    private int id;
    private String tipoSol;
    private String data;
    private String statusS;
    private Pessoa requerente ;
    private TipoLogradouro tipoLogSol;
    private String logSol;
    private int numLogSol;
    private String complLogSol;
    private String bairroSol;
    private Municipio municSol;
    private String ufSol;
    private String ptoReferenciaSol;
    private TipoTerreno tipoTSol;
    private String nomeVulgarSol;
    private String qtdAlvoSol; 
    private TipoMotivoSol motivoS;
    private String maisInfoJustSolicitacao;
    private Arquivos arquivos;

    public Solicitacao() {
    }

    public Solicitacao(String data, String tipoSol, String statusS, Pessoa requerente, TipoLogradouro tipoLogSol, String logSol, int numLogSol, String complLogSol, String bairroSol, Municipio municSol, String ufSol, String ptoReferenciaSol, TipoTerreno tipoTSol, String nomeVulgarSol, String qtdAlvoSol, TipoMotivoSol motivoS, String maisInfoJustSolicitacao) {
        this.tipoSol = tipoSol;
        this.data = data;
        this.statusS = statusS;
        this.requerente = requerente;
        this.tipoLogSol = tipoLogSol;
        this.logSol = logSol;
        this.numLogSol = numLogSol;
        this.complLogSol = complLogSol;
        this.bairroSol = bairroSol;
        this.municSol = municSol;
        this.ufSol = ufSol;
        this.ptoReferenciaSol = ptoReferenciaSol;
        this.tipoTSol = tipoTSol;
        this.nomeVulgarSol = nomeVulgarSol;
        this.qtdAlvoSol = qtdAlvoSol;
        this.motivoS = motivoS;
        this.maisInfoJustSolicitacao = maisInfoJustSolicitacao;

    }

    public String getTipoSol() {
        return tipoSol;
    }

    public void setTipoSol(String tipoSol) {
        this.tipoSol = tipoSol;
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

    public String getStatusS() {
        return statusS;
    }

    public void setStatusS(String statusS) {
        this.statusS = statusS;
    }

    public Pessoa getRequerente() {
        return requerente;
    }

    public void setRequerente(Pessoa requerente) {
        this.requerente = requerente;
    }

    public TipoLogradouro getTipoLogSol() {
        return tipoLogSol;
    }

    public void setTipoLogSol(TipoLogradouro tipoLogSol) {
        this.tipoLogSol = tipoLogSol;
    }

    public String getLogSol() {
        return logSol;
    }

    public void setLogSol(String logSol) {
        this.logSol = logSol;
    }

    public int getNumLogSol() {
        return numLogSol;
    }

    public void setNumLogSol(int numLogSol) {
        this.numLogSol = numLogSol;
    }

    public String getComplLogSol() {
        return complLogSol;
    }

    public void setComplLogSol(String complLogSol) {
        this.complLogSol = complLogSol;
    }

    public String getBairroSol() {
        return bairroSol;
    }

    public void setBairroSol(String bairroSol) {
        this.bairroSol = bairroSol;
    }

    public Municipio getMunicSol() {
        return municSol;
    }

    public void setMunicSol(Municipio municSol) {
        this.municSol = municSol;
    }

    public String getUfSol() {
        return ufSol;
    }

    public void setUfSol(String ufSol) {
        this.ufSol = ufSol;
    }

    public String getPtoReferenciaSol() {
        return ptoReferenciaSol;
    }

    public void setPtoReferenciaSol(String ptoReferenciaSol) {
        this.ptoReferenciaSol = ptoReferenciaSol;
    }

    public TipoTerreno getTipoTSol() {
        return tipoTSol;
    }

    public void setTipoTSol(TipoTerreno tipoTSol) {
        this.tipoTSol = tipoTSol;
    }

    public String getNomeVulgarSol() {
        return nomeVulgarSol;
    }

    public void setNomeVulgarSol(String nomeVulgarSol) {
        this.nomeVulgarSol = nomeVulgarSol;
    }

    public String getQtdAlvoSol() {
        return qtdAlvoSol;
    }

    public void setQtdAlvoSol(String qtdAlvoSol) {
        this.qtdAlvoSol = qtdAlvoSol;
    }

    public TipoMotivoSol getMotivoS() {
        return motivoS;
    }

    public void setMotivoS(TipoMotivoSol motivoS) {
        this.motivoS = motivoS;
    }

    public String getMaisInfoJustSolicitacao() {
        return maisInfoJustSolicitacao;
    }

    public void setMaisInfoJustSolicitacao(String maisInfoJustSolicitacao) {
        this.maisInfoJustSolicitacao = maisInfoJustSolicitacao;
    }

    public Arquivos getArquivos() {
        return arquivos;
    }

    public void setArquivos(Arquivos arquivos) {
        this.arquivos = arquivos;
    }
    
    

}
