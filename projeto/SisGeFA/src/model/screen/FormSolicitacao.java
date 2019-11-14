/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.screen;

import ConexaoBanco.ConnectionFactory;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import model.bean.Municipio;
import model.bean.Pessoa;
import model.bean.Solicitacao;
import model.bean.Status;
import model.bean.TipoContato;
import model.bean.TipoLogradouro;
import model.bean.TipoMotivoSol;
import model.bean.TipoSolicitacao;
import model.bean.TipoTerreno;
import model.dao.DenunciaDAO;
import model.dao.PessoaDAO;
import model.dao.SolicitacaoDAO;



public class FormSolicitacao extends javax.swing.JFrame {

    public ImageIcon getIcon() {
        return icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }

    public SolicitacaoDAO getSdao() {
        return sdao;
    }

    public void setSdao(SolicitacaoDAO sdao) {
        this.sdao = sdao;
    }

    public Status getStatusS() {
        return statusS;
    }

    public void setStatusS(Status statusS) {
        this.statusS = statusS;
    }

    public TipoLogradouro getTipoL() {
        return tipoL;
    }

    public void setTipoL(TipoLogradouro tipoL) {
        this.tipoL = tipoL;
    }

    public PessoaDAO getPdao() {
        return pdao;
    }

    public void setPdao(PessoaDAO pdao) {
        this.pdao = pdao;
    }

    public java.awt.Button getBtnAnexarArq() {
        return btnAnexarArq;
    }

    public void setBtnAnexarArq(java.awt.Button btnAnexarArq) {
        this.btnAnexarArq = btnAnexarArq;
    }

    public javax.swing.JButton getBtnGravar() {
        return btnGravar;
    }

    public void setBtnGravar(javax.swing.JButton btnGravar) {
        this.btnGravar = btnGravar;
    }

    public javax.swing.JButton getBtnPreencher() {
        return btnPreencher;
    }

    public void setBtnPreencher(javax.swing.JButton btnPreencher) {
        this.btnPreencher = btnPreencher;
    }

    public javax.swing.JComboBox<String> getCbxMunicipioLocal() {
        return cbxMunicipioLocal;
    }

    public void setCbxMunicipioLocal(javax.swing.JComboBox<String> cbxMunicipioLocal) {
        this.cbxMunicipioLocal = cbxMunicipioLocal;
    }

    public javax.swing.JComboBox<String> getCbxMunicipioReq() {
        return cbxMunicipioReq;
    }

    public void setCbxMunicipioReq(javax.swing.JComboBox<String> cbxMunicipioReq) {
        this.cbxMunicipioReq = cbxMunicipioReq;
    }

    public javax.swing.JComboBox<String> getCbxStatusSolicitacao() {
        return cbxStatusSolicitacao;
    }

    public void setCbxStatusSolicitacao(javax.swing.JComboBox<String> cbxStatusSolicitacao) {
        this.cbxStatusSolicitacao = cbxStatusSolicitacao;
    }

    public javax.swing.JComboBox<String> getCbxTipoLogLocal() {
        return cbxTipoLogLocal;
    }

    public void setCbxTipoLogLocal(javax.swing.JComboBox<String> cbxTipoLogLocal) {
        this.cbxTipoLogLocal = cbxTipoLogLocal;
    }

    public javax.swing.JComboBox<String> getCbxTipoLogReq() {
        return cbxTipoLogReq;
    }

    public void setCbxTipoLogReq(javax.swing.JComboBox<String> cbxTipoLogReq) {
        this.cbxTipoLogReq = cbxTipoLogReq;
    }

    public javax.swing.JComboBox<String> getCbxUfLocal() {
        return cbxUfLocal;
    }

    public void setCbxUfLocal(javax.swing.JComboBox<String> cbxUfLocal) {
        this.cbxUfLocal = cbxUfLocal;
    }

    public javax.swing.JComboBox<String> getCbxUfReq() {
        return cbxUfReq;
    }

    public void setCbxUfReq(javax.swing.JComboBox<String> cbxUfReq) {
        this.cbxUfReq = cbxUfReq;
    }

    public javax.swing.JCheckBox getCkbxMotivoSolAmpliar() {
        return ckbxMotivoSolAmpliar;
    }

    public void setCkbxMotivoSolAmpliar(javax.swing.JCheckBox ckbxMotivoSolAmpliar) {
        this.ckbxMotivoSolAmpliar = ckbxMotivoSolAmpliar;
    }

    public javax.swing.JCheckBox getCkbxMotivoSolConstrucao() {
        return ckbxMotivoSolConstrucao;
    }

    public void setCkbxMotivoSolConstrucao(javax.swing.JCheckBox ckbxMotivoSolConstrucao) {
        this.ckbxMotivoSolConstrucao = ckbxMotivoSolConstrucao;
    }

    public javax.swing.JCheckBox getCkbxMotivoSolDanRedeHidraulica() {
        return ckbxMotivoSolDanRedeHidraulica;
    }

    public void setCkbxMotivoSolDanRedeHidraulica(javax.swing.JCheckBox ckbxMotivoSolDanRedeHidraulica) {
        this.ckbxMotivoSolDanRedeHidraulica = ckbxMotivoSolDanRedeHidraulica;
    }

    public javax.swing.JCheckBox getCkbxMotivoSolOutro() {
        return ckbxMotivoSolOutro;
    }

    public void setCkbxMotivoSolOutro(javax.swing.JCheckBox ckbxMotivoSolOutro) {
        this.ckbxMotivoSolOutro = ckbxMotivoSolOutro;
    }

    public javax.swing.JCheckBox getCkbxMotivoSolProxRedeEletrica() {
        return ckbxMotivoSolProxRedeEletrica;
    }

    public void setCkbxMotivoSolProxRedeEletrica(javax.swing.JCheckBox ckbxMotivoSolProxRedeEletrica) {
        this.ckbxMotivoSolProxRedeEletrica = ckbxMotivoSolProxRedeEletrica;
    }

    public javax.swing.JCheckBox getCkbxMotivoSolRiscoTombar() {
        return ckbxMotivoSolRiscoTombar;
    }

    public void setCkbxMotivoSolRiscoTombar(javax.swing.JCheckBox ckbxMotivoSolRiscoTombar) {
        this.ckbxMotivoSolRiscoTombar = ckbxMotivoSolRiscoTombar;
    }

    public javax.swing.ButtonGroup getGpbtnTipoDenuncia() {
        return gpbtnTipoDenuncia;
    }

    public void setGpbtnTipoDenuncia(javax.swing.ButtonGroup gpbtnTipoDenuncia) {
        this.gpbtnTipoDenuncia = gpbtnTipoDenuncia;
    }

    public javax.swing.ButtonGroup getGpbtnTipoSolicitacao() {
        return gpbtnTipoSolicitacao;
    }

    public void setGpbtnTipoSolicitacao(javax.swing.ButtonGroup gpbtnTipoSolicitacao) {
        this.gpbtnTipoSolicitacao = gpbtnTipoSolicitacao;
    }

    public javax.swing.ButtonGroup getGpbtnTipoTerreno() {
        return gpbtnTipoTerreno;
    }

    public void setGpbtnTipoTerreno(javax.swing.ButtonGroup gpbtnTipoTerreno) {
        this.gpbtnTipoTerreno = gpbtnTipoTerreno;
    }

    public javax.swing.JFormattedTextField getjFCpfCnpj() {
        return jFCpfCnpj;
    }

    public void setjFCpfCnpj(javax.swing.JFormattedTextField jFCpfCnpj) {
        this.jFCpfCnpj = jFCpfCnpj;
    }

    public javax.swing.JFormattedTextField getjFTelRequerente() {
        return jFTelRequerente;
    }

    public void setjFTelRequerente(javax.swing.JFormattedTextField jFTelRequerente) {
        this.jFTelRequerente = jFTelRequerente;
    }

    public javax.swing.JPanel getjPDadosComplementares() {
        return jPDadosComplementares;
    }

    public void setjPDadosComplementares(javax.swing.JPanel jPDadosComplementares) {
        this.jPDadosComplementares = jPDadosComplementares;
    }

    public javax.swing.JPanel getjPDadosRequerente() {
        return jPDadosRequerente;
    }

    public void setjPDadosRequerente(javax.swing.JPanel jPDadosRequerente) {
        this.jPDadosRequerente = jPDadosRequerente;
    }

    public javax.swing.JPanel getjPLocalSolicitacao() {
        return jPLocalSolicitacao;
    }

    public void setjPLocalSolicitacao(javax.swing.JPanel jPLocalSolicitacao) {
        this.jPLocalSolicitacao = jPLocalSolicitacao;
    }

    public javax.swing.JPanel getjPMotivoSolicitacao() {
        return jPMotivoSolicitacao;
    }

    public void setjPMotivoSolicitacao(javax.swing.JPanel jPMotivoSolicitacao) {
        this.jPMotivoSolicitacao = jPMotivoSolicitacao;
    }

    public javax.swing.JPanel getjPTipoSolicitacao() {
        return jPTipoSolicitacao;
    }

    public void setjPTipoSolicitacao(javax.swing.JPanel jPTipoSolicitacao) {
        this.jPTipoSolicitacao = jPTipoSolicitacao;
    }

    public javax.swing.JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(javax.swing.JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public javax.swing.JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(javax.swing.JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public javax.swing.JScrollPane getjScrollPane3() {
        return jScrollPane3;
    }

    public void setjScrollPane3(javax.swing.JScrollPane jScrollPane3) {
        this.jScrollPane3 = jScrollPane3;
    }

    public javax.swing.JFormattedTextField getJfData() {
        return jfData;
    }

    public void setJfData(javax.swing.JFormattedTextField jfData) {
        this.jfData = jfData;
    }

    public javax.swing.JLabel getLblAnexo() {
        return lblAnexo;
    }

    public void setLblAnexo(javax.swing.JLabel lblAnexo) {
        this.lblAnexo = lblAnexo;
    }

    public javax.swing.JLabel getLblArvoreDadosComp() {
        return lblArvoreDadosComp;
    }

    public void setLblArvoreDadosComp(javax.swing.JLabel lblArvoreDadosComp) {
        this.lblArvoreDadosComp = lblArvoreDadosComp;
    }

    public javax.swing.JLabel getLblBairroLocal() {
        return lblBairroLocal;
    }

    public void setLblBairroLocal(javax.swing.JLabel lblBairroLocal) {
        this.lblBairroLocal = lblBairroLocal;
    }

    public javax.swing.JLabel getLblBairroReq() {
        return lblBairroReq;
    }

    public void setLblBairroReq(javax.swing.JLabel lblBairroReq) {
        this.lblBairroReq = lblBairroReq;
    }

    public javax.swing.JLabel getLblCompLogLocal() {
        return lblCompLogLocal;
    }

    public void setLblCompLogLocal(javax.swing.JLabel lblCompLogLocal) {
        this.lblCompLogLocal = lblCompLogLocal;
    }

    public javax.swing.JLabel getLblCompLogReq() {
        return lblCompLogReq;
    }

    public void setLblCompLogReq(javax.swing.JLabel lblCompLogReq) {
        this.lblCompLogReq = lblCompLogReq;
    }

    public javax.swing.JLabel getLblCpfCnpj() {
        return lblCpfCnpj;
    }

    public void setLblCpfCnpj(javax.swing.JLabel lblCpfCnpj) {
        this.lblCpfCnpj = lblCpfCnpj;
    }

    public javax.swing.JLabel getLblDataDenuncia() {
        return lblDataDenuncia;
    }

    public void setLblDataDenuncia(javax.swing.JLabel lblDataDenuncia) {
        this.lblDataDenuncia = lblDataDenuncia;
    }

    public javax.swing.JLabel getLblEmailDenunciante() {
        return lblEmailDenunciante;
    }

    public void setLblEmailDenunciante(javax.swing.JLabel lblEmailDenunciante) {
        this.lblEmailDenunciante = lblEmailDenunciante;
    }

    public javax.swing.JLabel getLblLogLocal() {
        return lblLogLocal;
    }

    public void setLblLogLocal(javax.swing.JLabel lblLogLocal) {
        this.lblLogLocal = lblLogLocal;
    }

    public javax.swing.JLabel getLblLogReq() {
        return lblLogReq;
    }

    public void setLblLogReq(javax.swing.JLabel lblLogReq) {
        this.lblLogReq = lblLogReq;
    }

    public javax.swing.JLabel getLblMaisJustificativa() {
        return lblMaisJustificativa;
    }

    public void setLblMaisJustificativa(javax.swing.JLabel lblMaisJustificativa) {
        this.lblMaisJustificativa = lblMaisJustificativa;
    }

    public javax.swing.JLabel getLblMunicipioLocal() {
        return lblMunicipioLocal;
    }

    public void setLblMunicipioLocal(javax.swing.JLabel lblMunicipioLocal) {
        this.lblMunicipioLocal = lblMunicipioLocal;
    }

    public javax.swing.JLabel getLblMunicipioReq() {
        return lblMunicipioReq;
    }

    public void setLblMunicipioReq(javax.swing.JLabel lblMunicipioReq) {
        this.lblMunicipioReq = lblMunicipioReq;
    }

    public javax.swing.JLabel getLblNomeDenunciante() {
        return lblNomeDenunciante;
    }

    public void setLblNomeDenunciante(javax.swing.JLabel lblNomeDenunciante) {
        this.lblNomeDenunciante = lblNomeDenunciante;
    }

    public javax.swing.JLabel getLblNomeVulgar() {
        return lblNomeVulgar;
    }

    public void setLblNomeVulgar(javax.swing.JLabel lblNomeVulgar) {
        this.lblNomeVulgar = lblNomeVulgar;
    }

    public javax.swing.JLabel getLblNumLogLocal() {
        return lblNumLogLocal;
    }

    public void setLblNumLogLocal(javax.swing.JLabel lblNumLogLocal) {
        this.lblNumLogLocal = lblNumLogLocal;
    }

    public javax.swing.JLabel getLblNumLogReq() {
        return lblNumLogReq;
    }

    public void setLblNumLogReq(javax.swing.JLabel lblNumLogReq) {
        this.lblNumLogReq = lblNumLogReq;
    }

    public javax.swing.JLabel getLblPtoRefLocal() {
        return lblPtoRefLocal;
    }

    public void setLblPtoRefLocal(javax.swing.JLabel lblPtoRefLocal) {
        this.lblPtoRefLocal = lblPtoRefLocal;
    }

    public javax.swing.JLabel getLblQtdArvAlvo() {
        return lblQtdArvAlvo;
    }

    public void setLblQtdArvAlvo(javax.swing.JLabel lblQtdArvAlvo) {
        this.lblQtdArvAlvo = lblQtdArvAlvo;
    }

    public javax.swing.JLabel getLblRgDenunciante() {
        return lblRgDenunciante;
    }

    public void setLblRgDenunciante(javax.swing.JLabel lblRgDenunciante) {
        this.lblRgDenunciante = lblRgDenunciante;
    }

    public javax.swing.JLabel getLblStatusDenuncia() {
        return lblStatusDenuncia;
    }

    public void setLblStatusDenuncia(javax.swing.JLabel lblStatusDenuncia) {
        this.lblStatusDenuncia = lblStatusDenuncia;
    }

    public javax.swing.JLabel getLblTelDenunciante() {
        return lblTelDenunciante;
    }

    public void setLblTelDenunciante(javax.swing.JLabel lblTelDenunciante) {
        this.lblTelDenunciante = lblTelDenunciante;
    }

    public javax.swing.JLabel getLblTipoLogLocal() {
        return lblTipoLogLocal;
    }

    public void setLblTipoLogLocal(javax.swing.JLabel lblTipoLogLocal) {
        this.lblTipoLogLocal = lblTipoLogLocal;
    }

    public javax.swing.JLabel getLblTipoLogReq() {
        return lblTipoLogReq;
    }

    public void setLblTipoLogReq(javax.swing.JLabel lblTipoLogReq) {
        this.lblTipoLogReq = lblTipoLogReq;
    }

    public javax.swing.JLabel getLblTipoRetorno() {
        return lblTipoRetorno;
    }

    public void setLblTipoRetorno(javax.swing.JLabel lblTipoRetorno) {
        this.lblTipoRetorno = lblTipoRetorno;
    }

    public javax.swing.JLabel getLblTipoSolicitacao() {
        return lblTipoSolicitacao;
    }

    public void setLblTipoSolicitacao(javax.swing.JLabel lblTipoSolicitacao) {
        this.lblTipoSolicitacao = lblTipoSolicitacao;
    }

    public javax.swing.JLabel getLblUfLocal() {
        return lblUfLocal;
    }

    public void setLblUfLocal(javax.swing.JLabel lblUfLocal) {
        this.lblUfLocal = lblUfLocal;
    }

    public javax.swing.JLabel getLblUfReq() {
        return lblUfReq;
    }

    public void setLblUfReq(javax.swing.JLabel lblUfReq) {
        this.lblUfReq = lblUfReq;
    }

    public javax.swing.JSeparator getLnSeparaTitulo() {
        return lnSeparaTitulo;
    }

    public void setLnSeparaTitulo(javax.swing.JSeparator lnSeparaTitulo) {
        this.lnSeparaTitulo = lnSeparaTitulo;
    }

    public javax.swing.JRadioButton getRdbtnAR() {
        return rdbtnAR;
    }

    public void setRdbtnAR(javax.swing.JRadioButton rdbtnAR) {
        this.rdbtnAR = rdbtnAR;
    }

    public javax.swing.JRadioButton getRdbtnEmail() {
        return rdbtnEmail;
    }

    public void setRdbtnEmail(javax.swing.JRadioButton rdbtnEmail) {
        this.rdbtnEmail = rdbtnEmail;
    }

    public javax.swing.JRadioButton getRdbtnSolCorte() {
        return rdbtnSolCorte;
    }

    public void setRdbtnSolCorte(javax.swing.JRadioButton rdbtnSolCorte) {
        this.rdbtnSolCorte = rdbtnSolCorte;
    }

    public javax.swing.JRadioButton getRdbtnSolPoda() {
        return rdbtnSolPoda;
    }

    public void setRdbtnSolPoda(javax.swing.JRadioButton rdbtnSolPoda) {
        this.rdbtnSolPoda = rdbtnSolPoda;
    }

    public javax.swing.JRadioButton getRdbtnTelefone() {
        return rdbtnTelefone;
    }

    public void setRdbtnTelefone(javax.swing.JRadioButton rdbtnTelefone) {
        this.rdbtnTelefone = rdbtnTelefone;
    }

    public javax.swing.JRadioButton getRdbtnTerrenoPart() {
        return rdbtnTerrenoPart;
    }

    public void setRdbtnTerrenoPart(javax.swing.JRadioButton rdbtnTerrenoPart) {
        this.rdbtnTerrenoPart = rdbtnTerrenoPart;
    }

    public javax.swing.JRadioButton getRdbtnTerrenoPub() {
        return rdbtnTerrenoPub;
    }

    public void setRdbtnTerrenoPub(javax.swing.JRadioButton rdbtnTerrenoPub) {
        this.rdbtnTerrenoPub = rdbtnTerrenoPub;
    }

    public javax.swing.JRadioButton getRdbtnTerrenoTerc() {
        return rdbtnTerrenoTerc;
    }

    public void setRdbtnTerrenoTerc(javax.swing.JRadioButton rdbtnTerrenoTerc) {
        this.rdbtnTerrenoTerc = rdbtnTerrenoTerc;
    }

    public javax.swing.JLabel getTitFormSolicitacao() {
        return titFormSolicitacao;
    }

    public void setTitFormSolicitacao(javax.swing.JLabel titFormSolicitacao) {
        this.titFormSolicitacao = titFormSolicitacao;
    }

    public javax.swing.JTextField getTxtBairroLocal() {
        return txtBairroLocal;
    }

    public void setTxtBairroLocal(javax.swing.JTextField txtBairroLocal) {
        this.txtBairroLocal = txtBairroLocal;
    }

    public javax.swing.JTextField getTxtBairroReq() {
        return txtBairroReq;
    }

    public void setTxtBairroReq(javax.swing.JTextField txtBairroReq) {
        this.txtBairroReq = txtBairroReq;
    }

    public javax.swing.JTextField getTxtCompLogLocal() {
        return txtCompLogLocal;
    }

    public void setTxtCompLogLocal(javax.swing.JTextField txtCompLogLocal) {
        this.txtCompLogLocal = txtCompLogLocal;
    }

    public javax.swing.JTextField getTxtCompLogReq() {
        return txtCompLogReq;
    }

    public void setTxtCompLogReq(javax.swing.JTextField txtCompLogReq) {
        this.txtCompLogReq = txtCompLogReq;
    }

    public javax.swing.JTextField getTxtEmailRequerente() {
        return txtEmailRequerente;
    }

    public void setTxtEmailRequerente(javax.swing.JTextField txtEmailRequerente) {
        this.txtEmailRequerente = txtEmailRequerente;
    }

    public javax.swing.JTextField getTxtLogLocal() {
        return txtLogLocal;
    }

    public void setTxtLogLocal(javax.swing.JTextField txtLogLocal) {
        this.txtLogLocal = txtLogLocal;
    }

    public javax.swing.JTextField getTxtLogReq() {
        return txtLogReq;
    }

    public void setTxtLogReq(javax.swing.JTextField txtLogReq) {
        this.txtLogReq = txtLogReq;
    }

    public javax.swing.JTextArea getTxtMaisJustificativa() {
        return txtMaisJustificativa;
    }

    public void setTxtMaisJustificativa(javax.swing.JTextArea txtMaisJustificativa) {
        this.txtMaisJustificativa = txtMaisJustificativa;
    }

    public javax.swing.JTextField getTxtMotivoSolOutro() {
        return txtMotivoSolOutro;
    }

    public void setTxtMotivoSolOutro(javax.swing.JTextField txtMotivoSolOutro) {
        this.txtMotivoSolOutro = txtMotivoSolOutro;
    }

    public javax.swing.JTextField getTxtNomeRequerente() {
        return txtNomeRequerente;
    }

    public void setTxtNomeRequerente(javax.swing.JTextField txtNomeRequerente) {
        this.txtNomeRequerente = txtNomeRequerente;
    }

    public javax.swing.JTextField getTxtNomeVulgar() {
        return txtNomeVulgar;
    }

    public void setTxtNomeVulgar(javax.swing.JTextField txtNomeVulgar) {
        this.txtNomeVulgar = txtNomeVulgar;
    }

    public javax.swing.JTextField getTxtNumAR() {
        return txtNumAR;
    }

    public void setTxtNumAR(javax.swing.JTextField txtNumAR) {
        this.txtNumAR = txtNumAR;
    }

    public javax.swing.JTextField getTxtNumLogLocal() {
        return txtNumLogLocal;
    }

    public void setTxtNumLogLocal(javax.swing.JTextField txtNumLogLocal) {
        this.txtNumLogLocal = txtNumLogLocal;
    }

    public javax.swing.JTextField getTxtNumLogReq() {
        return txtNumLogReq;
    }

    public void setTxtNumLogReq(javax.swing.JTextField txtNumLogReq) {
        this.txtNumLogReq = txtNumLogReq;
    }

    public javax.swing.JTextField getTxtPtoRefLocal() {
        return txtPtoRefLocal;
    }

    public void setTxtPtoRefLocal(javax.swing.JTextField txtPtoRefLocal) {
        this.txtPtoRefLocal = txtPtoRefLocal;
    }

    public javax.swing.JTextField getTxtQtdArvAlvo() {
        return txtQtdArvAlvo;
    }

    public void setTxtQtdArvAlvo(javax.swing.JTextField txtQtdArvAlvo) {
        this.txtQtdArvAlvo = txtQtdArvAlvo;
    }

    public javax.swing.JTextField getTxtRgRequerente() {
        return txtRgRequerente;
    }

    public void setTxtRgRequerente(javax.swing.JTextField txtRgRequerente) {
        this.txtRgRequerente = txtRgRequerente;
    }

    private String motivo = null;
    private ImageIcon icon = new ImageIcon("C:\\Users\\btps000328\\Downloads\\icon.png");
    private SolicitacaoDAO sdao = new SolicitacaoDAO();
    private Status statusS = new Status();
    private TipoLogradouro tipoL = new TipoLogradouro();
    private PessoaDAO pdao = new PessoaDAO();
    private TipoTerreno tipoT = new TipoTerreno();
    private TipoMotivoSol tipoM = new TipoMotivoSol();
    TipoSolicitacao tipoS;
    private String prefContato;
    /**
     * Creates new form AgendaVistoria
     */
    public FormSolicitacao() {
        initComponents();
        setIcon();
        this.jfData.setText(getDateTime());

        
    }
    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        gpbtnTipoDenuncia = new javax.swing.ButtonGroup();
        gpbtnTipoSolicitacao = new javax.swing.ButtonGroup();
        gpbtnTipoTerreno = new javax.swing.ButtonGroup();
        titFormSolicitacao = new javax.swing.JLabel();
        lnSeparaTitulo = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        btnGravar = new javax.swing.JButton();
        btnPreencher = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPTipoSolicitacao = new javax.swing.JPanel();
        lblTipoSolicitacao = new javax.swing.JLabel();
        rdbtnSolCorte = new javax.swing.JRadioButton();
        rdbtnSolPoda = new javax.swing.JRadioButton();
        lblDataDenuncia = new javax.swing.JLabel();
        jfData = new javax.swing.JFormattedTextField();
        lblStatusDenuncia = new javax.swing.JLabel();
        cbxStatusSolicitacao = new javax.swing.JComboBox<>();
        jPDadosRequerente = new javax.swing.JPanel();
        lblTipoLogReq = new javax.swing.JLabel();
        cbxTipoLogReq = new javax.swing.JComboBox<>();
        lblLogReq = new javax.swing.JLabel();
        txtLogReq = new javax.swing.JTextField();
        lblNumLogReq = new javax.swing.JLabel();
        txtNumLogReq = new javax.swing.JTextField();
        lblCompLogReq = new javax.swing.JLabel();
        txtCompLogReq = new javax.swing.JTextField();
        lblBairroReq = new javax.swing.JLabel();
        txtBairroReq = new javax.swing.JTextField();
        lblMunicipioReq = new javax.swing.JLabel();
        cbxMunicipioReq = new javax.swing.JComboBox<>();
        lblUfReq = new javax.swing.JLabel();
        cbxUfReq = new javax.swing.JComboBox<>();
        lblTipoRetorno = new javax.swing.JLabel();
        lblNomeDenunciante = new javax.swing.JLabel();
        txtNomeRequerente = new javax.swing.JTextField();
        lblRgDenunciante = new javax.swing.JLabel();
        txtRgRequerente = new javax.swing.JTextField();
        lblCpfCnpj = new javax.swing.JLabel();
        jFCpfCnpj = new javax.swing.JFormattedTextField();
        lblEmailDenunciante = new javax.swing.JLabel();
        txtEmailRequerente = new javax.swing.JTextField();
        lblTelDenunciante = new javax.swing.JLabel();
        jFTelRequerente = new javax.swing.JFormattedTextField();
        rdbtnEmail = new javax.swing.JRadioButton();
        rdbtnTelefone = new javax.swing.JRadioButton();
        rdbtnAR = new javax.swing.JRadioButton();
        txtNumAR = new javax.swing.JTextField();
        jPLocalSolicitacao = new javax.swing.JPanel();
        lblTipoLogLocal = new javax.swing.JLabel();
        cbxTipoLogLocal = new javax.swing.JComboBox<>();
        lblLogLocal = new javax.swing.JLabel();
        txtLogLocal = new javax.swing.JTextField();
        lblNumLogLocal = new javax.swing.JLabel();
        txtNumLogLocal = new javax.swing.JTextField();
        lblCompLogLocal = new javax.swing.JLabel();
        txtCompLogLocal = new javax.swing.JTextField();
        lblBairroLocal = new javax.swing.JLabel();
        txtBairroLocal = new javax.swing.JTextField();
        lblMunicipioLocal = new javax.swing.JLabel();
        cbxMunicipioLocal = new javax.swing.JComboBox<>();
        lblUfLocal = new javax.swing.JLabel();
        cbxUfLocal = new javax.swing.JComboBox<>();
        lblPtoRefLocal = new javax.swing.JLabel();
        txtPtoRefLocal = new javax.swing.JTextField();
        jPDadosComplementares = new javax.swing.JPanel();
        lblArvoreDadosComp = new javax.swing.JLabel();
        rdbtnTerrenoPub = new javax.swing.JRadioButton();
        rdbtnTerrenoPart = new javax.swing.JRadioButton();
        rdbtnTerrenoTerc = new javax.swing.JRadioButton();
        txtNomeVulgar = new javax.swing.JTextField();
        lblNomeVulgar = new javax.swing.JLabel();
        lblQtdArvAlvo = new javax.swing.JLabel();
        txtQtdArvAlvo = new javax.swing.JTextField();
        btnAnexarArq = new java.awt.Button();
        lblAnexo = new javax.swing.JLabel();
        jPMotivoSolicitacao = new javax.swing.JPanel();
        ckbxMotivoSolConstrucao = new javax.swing.JCheckBox();
        ckbxMotivoSolAmpliar = new javax.swing.JCheckBox();
        ckbxMotivoSolDanRedeHidraulica = new javax.swing.JCheckBox();
        ckbxMotivoSolProxRedeEletrica = new javax.swing.JCheckBox();
        txtMotivoSolOutro = new javax.swing.JTextField();
        ckbxMotivoSolOutro = new javax.swing.JCheckBox();
        ckbxMotivoSolRiscoTombar = new javax.swing.JCheckBox();
        lblMaisJustificativa = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMaisJustificativa = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1060, 975));
        setResizable(false);

        titFormSolicitacao.setFont(new java.awt.Font("Sitka Small", 0, 36)); // NOI18N
        titFormSolicitacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titFormSolicitacao.setText("Formulário de Solicitação");

        btnGravar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        btnPreencher.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPreencher.setText("Preencher");
        btnPreencher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreencherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btnPreencher)
                .addGap(18, 18, 18)
                .addComponent(btnGravar))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPreencher, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        lblTipoSolicitacao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTipoSolicitacao.setText("TIPO SOLICITAÇÃO:");

        gpbtnTipoSolicitacao.add(rdbtnSolCorte);
        rdbtnSolCorte.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdbtnSolCorte.setText("Corte");
        rdbtnSolCorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnSolCorteActionPerformed(evt);
            }
        });

        gpbtnTipoSolicitacao.add(rdbtnSolPoda);
        rdbtnSolPoda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdbtnSolPoda.setText("Poda");
        rdbtnSolPoda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnSolPodaActionPerformed(evt);
            }
        });

        lblDataDenuncia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDataDenuncia.setText("Data:");

        try {
            jfData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jfData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblStatusDenuncia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblStatusDenuncia.setText("Status:");

        cbxStatusSolicitacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxStatusSolicitacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nova", "Encaminhada", "Aguardando Vistoria", "Atendida" }));
        cbxStatusSolicitacao.setEnabled(false);
        cbxStatusSolicitacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxStatusSolicitacaoActionPerformed(evt);
            }
        });

        jPDadosRequerente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DADOS DO REQUERENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        lblTipoLogReq.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTipoLogReq.setText("Tipo");

        cbxTipoLogReq.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxTipoLogReq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Avenida", "Alameda", "Praça", "Rua", "Travessia" }));
        cbxTipoLogReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoLogReqActionPerformed(evt);
            }
        });

        lblLogReq.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLogReq.setText("Logradouro");

        txtLogReq.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLogReq.setToolTipText("Informe o logradouro...");
        txtLogReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLogReqActionPerformed(evt);
            }
        });

        lblNumLogReq.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNumLogReq.setText("Nº");

        txtNumLogReq.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNumLogReq.setToolTipText("Informe o número...");
        txtNumLogReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumLogReqActionPerformed(evt);
            }
        });

        lblCompLogReq.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCompLogReq.setText("Complemento");

        txtCompLogReq.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCompLogReq.setToolTipText("Informe o complemento (se houver)...");
        txtCompLogReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCompLogReqActionPerformed(evt);
            }
        });

        lblBairroReq.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBairroReq.setText("Bairro");

        txtBairroReq.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBairroReq.setToolTipText("Informe o bairro...");
        txtBairroReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroReqActionPerformed(evt);
            }
        });

        lblMunicipioReq.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMunicipioReq.setText("Município");

        cbxMunicipioReq.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxMunicipioReq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Belo Horizonte", "Corinto", "Itabirito", "João Monlevade", "Mariana", "Ouro Preto", " ", " ", " " }));

        lblUfReq.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUfReq.setText("UF");

        cbxUfReq.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxUfReq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Minas Gerais" }));

        lblTipoRetorno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTipoRetorno.setText("Preferência de Contato:");

        lblNomeDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNomeDenunciante.setText("Nome:");

        txtNomeRequerente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNomeRequerente.setToolTipText("Informe o logradouro...");
        txtNomeRequerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeRequerenteActionPerformed(evt);
            }
        });

        lblRgDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRgDenunciante.setText("RG:");

        txtRgRequerente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtRgRequerente.setToolTipText("Informe o logradouro...");
        txtRgRequerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRgRequerenteActionPerformed(evt);
            }
        });

        lblCpfCnpj.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCpfCnpj.setText("CPF / CNPJ:");

        try {
            jFCpfCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblEmailDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEmailDenunciante.setText("E-mail:");

        txtEmailRequerente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmailRequerente.setToolTipText("Informe o logradouro...");
        txtEmailRequerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailRequerenteActionPerformed(evt);
            }
        });

        lblTelDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTelDenunciante.setText("Telefone:");

        try {
            jFTelRequerente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTelRequerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTelRequerenteActionPerformed(evt);
            }
        });

        rdbtnEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdbtnEmail.setText("E-mail");
        rdbtnEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnEmailActionPerformed(evt);
            }
        });

        rdbtnTelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdbtnTelefone.setText("Telefone");
        rdbtnTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnTelefoneActionPerformed(evt);
            }
        });

        rdbtnAR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdbtnAR.setText("AR");
        rdbtnAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnARActionPerformed(evt);
            }
        });

        txtNumAR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNumAR.setToolTipText("Informe o logradouro...");
        txtNumAR.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtNumAR.setEnabled(false);
        txtNumAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPDadosRequerenteLayout = new javax.swing.GroupLayout(jPDadosRequerente);
        jPDadosRequerente.setLayout(jPDadosRequerenteLayout);
        jPDadosRequerenteLayout.setHorizontalGroup(
            jPDadosRequerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDadosRequerenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDadosRequerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDadosRequerenteLayout.createSequentialGroup()
                        .addGroup(jPDadosRequerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDadosRequerenteLayout.createSequentialGroup()
                                .addComponent(lblMunicipioReq)
                                .addGap(182, 182, 182)
                                .addComponent(lblUfReq))
                            .addGroup(jPDadosRequerenteLayout.createSequentialGroup()
                                .addComponent(cbxMunicipioReq, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbxUfReq, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPDadosRequerenteLayout.createSequentialGroup()
                        .addGroup(jPDadosRequerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPDadosRequerenteLayout.createSequentialGroup()
                                .addGroup(jPDadosRequerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPDadosRequerenteLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(lblTipoLogReq))
                                    .addComponent(cbxTipoLogReq, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(jPDadosRequerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLogReq, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLogReq))
                                .addGap(15, 15, 15)
                                .addGroup(jPDadosRequerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNumLogReq)
                                    .addComponent(txtNumLogReq, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(jPDadosRequerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPDadosRequerenteLayout.createSequentialGroup()
                                        .addGroup(jPDadosRequerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCompLogReq, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblCompLogReq))
                                        .addGap(15, 15, 15)
                                        .addGroup(jPDadosRequerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblBairroReq)
                                            .addComponent(txtBairroReq)))
                                    .addGroup(jPDadosRequerenteLayout.createSequentialGroup()
                                        .addGroup(jPDadosRequerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPDadosRequerenteLayout.createSequentialGroup()
                                                .addComponent(rdbtnEmail)
                                                .addGap(18, 18, 18)
                                                .addComponent(rdbtnTelefone)
                                                .addGap(18, 18, 18)
                                                .addComponent(rdbtnAR)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtNumAR, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(lblTipoRetorno))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPDadosRequerenteLayout.createSequentialGroup()
                                .addGroup(jPDadosRequerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPDadosRequerenteLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(lblNomeDenunciante))
                                    .addComponent(txtNomeRequerente, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(jPDadosRequerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRgDenunciante)
                                    .addComponent(txtRgRequerente, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(jPDadosRequerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCpfCnpj)
                                    .addComponent(jFCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPDadosRequerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEmailDenunciante)
                                    .addComponent(txtEmailRequerente, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(jPDadosRequerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTelDenunciante)
                                    .addComponent(jFTelRequerente, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(54, 54, 54))))
        );
        jPDadosRequerenteLayout.setVerticalGroup(
            jPDadosRequerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDadosRequerenteLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPDadosRequerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmailDenunciante)
                    .addGroup(jPDadosRequerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPDadosRequerenteLayout.createSequentialGroup()
                            .addComponent(lblRgDenunciante)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtRgRequerente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPDadosRequerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDadosRequerenteLayout.createSequentialGroup()
                                .addComponent(lblCpfCnpj)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPDadosRequerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jFCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmailRequerente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPDadosRequerenteLayout.createSequentialGroup()
                                .addGroup(jPDadosRequerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNomeDenunciante)
                                    .addComponent(lblTelDenunciante))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPDadosRequerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNomeRequerente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFTelRequerente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPDadosRequerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoLogReq)
                    .addComponent(lblLogReq)
                    .addComponent(lblNumLogReq)
                    .addComponent(lblCompLogReq)
                    .addComponent(lblBairroReq))
                .addGap(9, 9, 9)
                .addGroup(jPDadosRequerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxTipoLogReq, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLogReq, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumLogReq, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCompLogReq, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairroReq, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPDadosRequerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDadosRequerenteLayout.createSequentialGroup()
                        .addGroup(jPDadosRequerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMunicipioReq)
                            .addComponent(lblUfReq))
                        .addGap(17, 17, 17)
                        .addGroup(jPDadosRequerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxMunicipioReq, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxUfReq, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPDadosRequerenteLayout.createSequentialGroup()
                        .addComponent(lblTipoRetorno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDadosRequerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumAR, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdbtnEmail)
                            .addComponent(rdbtnTelefone)
                            .addComponent(rdbtnAR))))
                .addContainerGap())
        );

        jPLocalSolicitacao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LOCAL DA SOLICITAÇÃO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        lblTipoLogLocal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTipoLogLocal.setText("Tipo");

        cbxTipoLogLocal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxTipoLogLocal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Avenida", "Alameda", "Praça", "Rua", "Travessia" }));
        cbxTipoLogLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoLogLocalActionPerformed(evt);
            }
        });

        lblLogLocal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLogLocal.setText("Logradouro");

        txtLogLocal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLogLocal.setToolTipText("Informe o logradouro...");
        txtLogLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLogLocalActionPerformed(evt);
            }
        });

        lblNumLogLocal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNumLogLocal.setText("Nº");

        txtNumLogLocal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNumLogLocal.setToolTipText("Informe o número...");
        txtNumLogLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumLogLocalActionPerformed(evt);
            }
        });

        lblCompLogLocal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCompLogLocal.setText("Complemento");

        txtCompLogLocal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCompLogLocal.setToolTipText("Informe o complemento (se houver)...");
        txtCompLogLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCompLogLocalActionPerformed(evt);
            }
        });

        lblBairroLocal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBairroLocal.setText("Bairro");

        txtBairroLocal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBairroLocal.setToolTipText("Informe o bairro...");
        txtBairroLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroLocalActionPerformed(evt);
            }
        });

        lblMunicipioLocal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMunicipioLocal.setText("Município");

        cbxMunicipioLocal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxMunicipioLocal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Belo Horizonte", "Corinto", "Itabirito", "João Monlevade", "Mariana", "Ouro Preto", " ", " ", " " }));

        lblUfLocal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUfLocal.setText("UF");

        cbxUfLocal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxUfLocal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Minas Gerais" }));

        lblPtoRefLocal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPtoRefLocal.setText("Pontos de Referência: ");

        txtPtoRefLocal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPtoRefLocal.setToolTipText("Informe o logradouro...");
        txtPtoRefLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPtoRefLocalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPLocalSolicitacaoLayout = new javax.swing.GroupLayout(jPLocalSolicitacao);
        jPLocalSolicitacao.setLayout(jPLocalSolicitacaoLayout);
        jPLocalSolicitacaoLayout.setHorizontalGroup(
            jPLocalSolicitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLocalSolicitacaoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPLocalSolicitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPLocalSolicitacaoLayout.createSequentialGroup()
                        .addGroup(jPLocalSolicitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxTipoLogLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTipoLogLocal))
                        .addGap(15, 15, 15)
                        .addGroup(jPLocalSolicitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLogLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLogLocal)))
                    .addGroup(jPLocalSolicitacaoLayout.createSequentialGroup()
                        .addComponent(lblMunicipioLocal)
                        .addGap(195, 195, 195)
                        .addComponent(lblUfLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPLocalSolicitacaoLayout.createSequentialGroup()
                        .addComponent(cbxMunicipioLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(cbxUfLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPLocalSolicitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPtoRefLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPLocalSolicitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPLocalSolicitacaoLayout.createSequentialGroup()
                            .addGroup(jPLocalSolicitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNumLogLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNumLogLocal))
                            .addGap(15, 15, 15)
                            .addGroup(jPLocalSolicitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCompLogLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblCompLogLocal))
                            .addGap(15, 15, 15)
                            .addGroup(jPLocalSolicitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblBairroLocal)
                                .addComponent(txtBairroLocal)))
                        .addComponent(txtPtoRefLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPLocalSolicitacaoLayout.setVerticalGroup(
            jPLocalSolicitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLocalSolicitacaoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPLocalSolicitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPLocalSolicitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTipoLogLocal)
                        .addComponent(lblLogLocal))
                    .addComponent(lblNumLogLocal)
                    .addGroup(jPLocalSolicitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblBairroLocal)
                        .addComponent(lblCompLogLocal)))
                .addGap(10, 10, 10)
                .addGroup(jPLocalSolicitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxTipoLogLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLogLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumLogLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCompLogLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairroLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPLocalSolicitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPLocalSolicitacaoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPLocalSolicitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPLocalSolicitacaoLayout.createSequentialGroup()
                                .addComponent(lblMunicipioLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addGroup(jPLocalSolicitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxMunicipioLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxUfLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblUfLocal)))
                    .addGroup(jPLocalSolicitacaoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPtoRefLocal))
                    .addGroup(jPLocalSolicitacaoLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(txtPtoRefLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        jPDadosComplementares.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DADOS COMPLEMENTARES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        lblArvoreDadosComp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblArvoreDadosComp.setText("Árvore(s) em terreno:");

        gpbtnTipoTerreno.add(rdbtnTerrenoPub);
        rdbtnTerrenoPub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdbtnTerrenoPub.setText("Público");
        rdbtnTerrenoPub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnTerrenoPubActionPerformed(evt);
            }
        });

        gpbtnTipoTerreno.add(rdbtnTerrenoPart);
        rdbtnTerrenoPart.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdbtnTerrenoPart.setText("Particular");

        gpbtnTipoTerreno.add(rdbtnTerrenoTerc);
        rdbtnTerrenoTerc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdbtnTerrenoTerc.setText("de Terceiros");
        rdbtnTerrenoTerc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnTerrenoTercActionPerformed(evt);
            }
        });

        txtNomeVulgar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNomeVulgar.setToolTipText("Informe o logradouro...");
        txtNomeVulgar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeVulgarActionPerformed(evt);
            }
        });

        lblNomeVulgar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNomeVulgar.setText("Informe o(s) nome(s) vulgar(es) da(s) árvore(s): ");

        lblQtdArvAlvo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblQtdArvAlvo.setText("Informe a quantidade de árvores alvo da solicitação:");

        txtQtdArvAlvo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtQtdArvAlvo.setToolTipText("Informe o logradouro...");
        txtQtdArvAlvo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdArvAlvoActionPerformed(evt);
            }
        });

        btnAnexarArq.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnAnexarArq.setLabel("Anexar Arquivo");
        btnAnexarArq.setName("Anexar"); // NOI18N
        btnAnexarArq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnexarArqActionPerformed(evt);
            }
        });

        lblAnexo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAnexo.setText("Caso seja possível, poderão ser anexadas até quatro fotos da(s) árvore(s) e do local onde estão plantadas.");

        javax.swing.GroupLayout jPDadosComplementaresLayout = new javax.swing.GroupLayout(jPDadosComplementares);
        jPDadosComplementares.setLayout(jPDadosComplementaresLayout);
        jPDadosComplementaresLayout.setHorizontalGroup(
            jPDadosComplementaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDadosComplementaresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDadosComplementaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPDadosComplementaresLayout.createSequentialGroup()
                        .addComponent(lblArvoreDadosComp)
                        .addGap(27, 27, 27)
                        .addComponent(rdbtnTerrenoPub)
                        .addGap(31, 31, 31)
                        .addComponent(rdbtnTerrenoPart)
                        .addGap(39, 39, 39)
                        .addComponent(rdbtnTerrenoTerc))
                    .addComponent(lblNomeVulgar)
                    .addComponent(lblQtdArvAlvo)
                    .addGroup(jPDadosComplementaresLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnAnexarArq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(lblAnexo))
                    .addComponent(txtNomeVulgar, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
                    .addComponent(txtQtdArvAlvo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPDadosComplementaresLayout.setVerticalGroup(
            jPDadosComplementaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDadosComplementaresLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPDadosComplementaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPDadosComplementaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblArvoreDadosComp)
                        .addComponent(rdbtnTerrenoPub))
                    .addGroup(jPDadosComplementaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(rdbtnTerrenoPart)
                        .addComponent(rdbtnTerrenoTerc)))
                .addGap(16, 16, 16)
                .addComponent(lblNomeVulgar)
                .addGap(10, 10, 10)
                .addComponent(txtNomeVulgar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lblQtdArvAlvo)
                .addGap(10, 10, 10)
                .addComponent(txtQtdArvAlvo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPDadosComplementaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDadosComplementaresLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnAnexarArq, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPDadosComplementaresLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblAnexo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPMotivoSolicitacao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MOTIVO(S) DA SOLICITAÇÃO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        ckbxMotivoSolConstrucao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ckbxMotivoSolConstrucao.setText("Para Construção");
        ckbxMotivoSolConstrucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbxMotivoSolConstrucaoActionPerformed(evt);
            }
        });

        ckbxMotivoSolAmpliar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ckbxMotivoSolAmpliar.setText("Para ampliação de imóvel");

        ckbxMotivoSolDanRedeHidraulica.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ckbxMotivoSolDanRedeHidraulica.setText("Por danificar rede hidráulica");
        ckbxMotivoSolDanRedeHidraulica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbxMotivoSolDanRedeHidraulicaActionPerformed(evt);
            }
        });

        ckbxMotivoSolProxRedeEletrica.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ckbxMotivoSolProxRedeEletrica.setText("Por estar próximo à rede elétrica");

        txtMotivoSolOutro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMotivoSolOutro.setToolTipText("Informe o logradouro...");
        txtMotivoSolOutro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMotivoSolOutroActionPerformed(evt);
            }
        });

        ckbxMotivoSolOutro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ckbxMotivoSolOutro.setText("Outros (especificar):");
        ckbxMotivoSolOutro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbxMotivoSolOutroActionPerformed(evt);
            }
        });

        ckbxMotivoSolRiscoTombar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ckbxMotivoSolRiscoTombar.setText("Risco de tombamento");

        lblMaisJustificativa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMaisJustificativa.setText("Mais informações sobre a justficativa:");

        txtMaisJustificativa.setColumns(20);
        txtMaisJustificativa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMaisJustificativa.setRows(5);
        jScrollPane2.setViewportView(txtMaisJustificativa);

        javax.swing.GroupLayout jPMotivoSolicitacaoLayout = new javax.swing.GroupLayout(jPMotivoSolicitacao);
        jPMotivoSolicitacao.setLayout(jPMotivoSolicitacaoLayout);
        jPMotivoSolicitacaoLayout.setHorizontalGroup(
            jPMotivoSolicitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMotivoSolicitacaoLayout.createSequentialGroup()
                .addGroup(jPMotivoSolicitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPMotivoSolicitacaoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPMotivoSolicitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ckbxMotivoSolRiscoTombar)
                            .addComponent(ckbxMotivoSolConstrucao))
                        .addGap(15, 15, 15)
                        .addGroup(jPMotivoSolicitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPMotivoSolicitacaoLayout.createSequentialGroup()
                                .addComponent(ckbxMotivoSolAmpliar)
                                .addGap(25, 25, 25)
                                .addComponent(ckbxMotivoSolDanRedeHidraulica)
                                .addGap(25, 25, 25)
                                .addComponent(ckbxMotivoSolProxRedeEletrica))
                            .addGroup(jPMotivoSolicitacaoLayout.createSequentialGroup()
                                .addComponent(ckbxMotivoSolOutro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMotivoSolOutro))))
                    .addGroup(jPMotivoSolicitacaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMaisJustificativa, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPMotivoSolicitacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPMotivoSolicitacaoLayout.setVerticalGroup(
            jPMotivoSolicitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMotivoSolicitacaoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPMotivoSolicitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckbxMotivoSolConstrucao)
                    .addComponent(ckbxMotivoSolAmpliar)
                    .addGroup(jPMotivoSolicitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ckbxMotivoSolProxRedeEletrica)
                        .addComponent(ckbxMotivoSolDanRedeHidraulica)))
                .addGap(15, 15, 15)
                .addGroup(jPMotivoSolicitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMotivoSolOutro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPMotivoSolicitacaoLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPMotivoSolicitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ckbxMotivoSolRiscoTombar)
                            .addComponent(ckbxMotivoSolOutro))))
                .addGap(15, 15, 15)
                .addComponent(lblMaisJustificativa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPTipoSolicitacaoLayout = new javax.swing.GroupLayout(jPTipoSolicitacao);
        jPTipoSolicitacao.setLayout(jPTipoSolicitacaoLayout);
        jPTipoSolicitacaoLayout.setHorizontalGroup(
            jPTipoSolicitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTipoSolicitacaoLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPTipoSolicitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPLocalSolicitacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPDadosRequerente, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPTipoSolicitacaoLayout.createSequentialGroup()
                        .addComponent(lblTipoSolicitacao)
                        .addGap(30, 30, 30)
                        .addComponent(rdbtnSolCorte)
                        .addGap(39, 39, 39)
                        .addComponent(rdbtnSolPoda)
                        .addGap(91, 91, 91)
                        .addComponent(lblDataDenuncia)
                        .addGap(18, 18, 18)
                        .addComponent(jfData, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblStatusDenuncia)
                        .addGap(18, 18, 18)
                        .addComponent(cbxStatusSolicitacao, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPDadosComplementares, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPMotivoSolicitacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );
        jPTipoSolicitacaoLayout.setVerticalGroup(
            jPTipoSolicitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTipoSolicitacaoLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPTipoSolicitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbtnSolPoda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdbtnSolCorte, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDataDenuncia)
                    .addComponent(jfData, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStatusDenuncia)
                    .addComponent(cbxStatusSolicitacao, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipoSolicitacao))
                .addGap(15, 15, 15)
                .addComponent(jPDadosRequerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jPLocalSolicitacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jPDadosComplementares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jPMotivoSolicitacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        jScrollPane3.setViewportView(jPTipoSolicitacao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titFormSolicitacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(750, 750, 750)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lnSeparaTitulo)
                .addContainerGap())
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(titFormSolicitacao)
                .addGap(1, 1, 1)
                .addComponent(lnSeparaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumLogReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumLogReqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumLogReqActionPerformed

    private void txtCompLogReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCompLogReqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCompLogReqActionPerformed

    private void txtNomeRequerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeRequerenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeRequerenteActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        //recupera e Armazena no tipo logradouro o ID recuperado
        getTipoL().setCodigo(sdao.RetornaIdTipoLog(getCbxTipoLogReq().getSelectedItem().toString()));

        //Retorna o município do Requerente
        Municipio municRequerente = new Municipio(sdao.RetornaIdMunicipio(getCbxMunicipioReq().getSelectedItem().toString()), cbxMunicipioReq.getSelectedItem().toString(), sdao.RetornaUfMunicipio(sdao.RetornaIdMunicipio(getCbxMunicipioReq().getSelectedItem().toString())));

        //Retorna o município do Local da Solicitação
        Municipio municLocal = new Municipio(sdao.RetornaIdMunicipio(getCbxMunicipioLocal().getSelectedItem().toString()), cbxMunicipioLocal.getSelectedItem().toString(), sdao.RetornaUfMunicipio(sdao.RetornaIdMunicipio(getCbxMunicipioLocal().getSelectedItem().toString())));

        //Verifica e define o tipo de contato Preferido do Requerente
        if(getRdbtnEmail().isSelected()){
            prefContato = "E-mail";
        }else if(getRdbtnTelefone().isSelected()){
            prefContato = "Telefone";
        }else if(getRdbtnAR().isSelected()){
            prefContato = "AR";
            getTxtNumAR().setVisible(true);
        }
        //Verifica e define o tipo de terreno onde estão os alvos da solicitação
        if(getRdbtnTerrenoPart().isSelected()){
            tipoT = new TipoTerreno("Pt", "Particular");
        }else if(getRdbtnTerrenoPub().isSelected()){
            tipoT = new TipoTerreno("Pb", "Público");
        }else if(getRdbtnTerrenoTerc().isSelected()){
            tipoT = new TipoTerreno("T", "Terceiros");
        }
        //Verifica e define o motivo da solicitação
         if(getCkbxMotivoSolConstrucao().isSelected()){
            tipoM = new TipoMotivoSol("C", "Construção");
        }else if(getCkbxMotivoSolAmpliar().isSelected()){
            tipoM = new TipoMotivoSol("A", "Ampliar Imóvel");
        }else if(getCkbxMotivoSolDanRedeHidraulica().isSelected()){
            tipoM = new TipoMotivoSol("RH", "Dano a Rede Hidráulica");
        }else if(getCkbxMotivoSolProxRedeEletrica().isSelected()){
            tipoM = new TipoMotivoSol("RE", "Proximidade Rede Elétrica");
        }else if(getCkbxMotivoSolRiscoTombar().isSelected()){
            tipoM = new TipoMotivoSol("RT", "Risco de Tombamento");
        }else if(getCkbxMotivoSolOutro().isSelected()){
            tipoM = new TipoMotivoSol("O", "Outro", txtMotivoSolOutro.getText());
        }
         
         //Verifica se a solicitação é de corte
        if (this.rdbtnSolCorte.isSelected()){
            //Se sim, define o tipo de Solicitação como "Corte"
            tipoS = new TipoSolicitacao("C", "Corte");
        //Verifica se a solicitação é de poda
        }else if(this.rdbtnSolPoda.isSelected()){
            //Se sim, define o tipo de Solicitação como "Corte"
            tipoS = new TipoSolicitacao("P", "Poda");
        }
        
        //recupera e armazena o ID do status da solicitação
        getStatusS().setCodigo(sdao.RetornaIdStatus(getCbxStatusSolicitacao().getSelectedItem().toString()));
        
        //Recupera os dados do Requerente
        Pessoa requerente = new Pessoa(getTxtNomeRequerente().getText(), getTxtRgRequerente().getText(), getjFCpfCnpj().getText(), getTxtEmailRequerente().getText(), getjFTelRequerente().getText(), getTipoL(), getTxtLogReq().getText(), 10, getTxtCompLogReq().getText(), getTxtBairroReq().getText(), municRequerente, municRequerente.getUf(), prefContato);
        
        //Verifica se o requerente já está cadastrado no banco de dados
        //Se não estiver
        if(sdao.RetornaPessoa(requerente.getCpf_cnpj()) == null){
            //Insere o denunciante no banco de dados
            pdao.Insere(requerente);

        }
        
        //Prepara os dados da solicitação para inserção no banco de dados
        Solicitacao solicita = new Solicitacao(getJfData().getText(),tipoS.getDescricao(), getStatusS().getCodigo(), sdao.RetornaPessoa(requerente.getCpf_cnpj()), getTipoL(), txtLogReq.getText(), Integer.parseInt(txtNumLogReq.getText()), txtCompLogReq.getText(), txtBairroReq.getText(), municLocal, municLocal.getUf(), txtPtoRefLocal.getText(), tipoT, txtNomeVulgar.getText(), txtQtdArvAlvo.getText(), tipoM, txtMaisJustificativa.getText());

        //insere a solicitação e recupera o ID automático criado
        int protocoloSol = sdao.InsereSolicitacao(solicita, requerente);

        //Fecha o formulário de cadastro de solicitação
        FechaFormSolicitacao();

        //Define formatação da mensagem exibida ao usuário
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.TRUETYPE_FONT ,14)));

        //Define e exibe mensagem de sucesso!
        JOptionPane.showMessageDialog(null, "Protocolo: 00000"+protocoloSol + " / 2019", "Denúncia gravada com sucesso.", JOptionPane.INFORMATION_MESSAGE, getIcon());

    }//GEN-LAST:event_btnGravarActionPerformed

    private void txtBairroReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroReqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroReqActionPerformed

    private void rdbtnSolCorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnSolCorteActionPerformed
        if("Denúncia".equals(this.getMotivo())){
        
            getRdbtnSolCorte().setSelected(false);
            getLblNomeDenunciante().setVisible(false);
            getTxtNomeRequerente().setVisible(false);
            getLblTipoRetorno().setVisible(false);
       
        }else if("Solicitação".equals(this.getMotivo())){
        
            getLblNomeDenunciante().setVisible(true);
            getTxtNomeRequerente().setVisible(true);
            getLblTipoRetorno().setVisible(true);
            
    }
    }//GEN-LAST:event_rdbtnSolCorteActionPerformed

    private void rdbtnSolPodaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnSolPodaActionPerformed
//        rdbtnDetalheMotivo1.setSelected(false);
//        lblDadosMotivacao.setEnabled(true);
//        lblNomeMotivo.setEnabled(true);
//        txtNomeRequerente.setEnabled(true);
//        lblTipoRetorno.setEnabled(true);
//        ckbEmail.setEnabled(true);
//        ckbCarta.setEnabled(true);
//        ckbLigacao.setEnabled(true);
//        lblDadoRetorno.setEnabled(true);
//        txtDadoRetorno.setEnabled(true);
       
        getRdbtnSolCorte().setSelected(false);
        getLblNomeDenunciante().setVisible(true);
        getTxtNomeRequerente().setVisible(true);
        getLblTipoRetorno().setVisible(true);
        
    }//GEN-LAST:event_rdbtnSolPodaActionPerformed

    private void txtLogReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLogReqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLogReqActionPerformed

    private void txtRgRequerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRgRequerenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRgRequerenteActionPerformed

    private void txtEmailRequerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailRequerenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailRequerenteActionPerformed

    private void txtLogLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLogLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLogLocalActionPerformed

    private void txtNumLogLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumLogLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumLogLocalActionPerformed

    private void txtCompLogLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCompLogLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCompLogLocalActionPerformed

    private void txtBairroLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroLocalActionPerformed

    private void txtPtoRefLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPtoRefLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPtoRefLocalActionPerformed

    private void rdbtnTerrenoPubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnTerrenoPubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnTerrenoPubActionPerformed

    private void rdbtnTerrenoTercActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnTerrenoTercActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnTerrenoTercActionPerformed

    private void txtNomeVulgarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeVulgarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeVulgarActionPerformed

    private void txtQtdArvAlvoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdArvAlvoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdArvAlvoActionPerformed

    private void btnAnexarArqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnexarArqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnexarArqActionPerformed

    private void ckbxMotivoSolDanRedeHidraulicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbxMotivoSolDanRedeHidraulicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbxMotivoSolDanRedeHidraulicaActionPerformed

    private void ckbxMotivoSolOutroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbxMotivoSolOutroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbxMotivoSolOutroActionPerformed

    private void txtMotivoSolOutroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMotivoSolOutroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMotivoSolOutroActionPerformed

    private void cbxTipoLogReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoLogReqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTipoLogReqActionPerformed

    private void jFTelRequerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTelRequerenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTelRequerenteActionPerformed

    private void rdbtnEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnEmailActionPerformed
        getTxtNumAR().setEnabled(false);
    }//GEN-LAST:event_rdbtnEmailActionPerformed

    private void rdbtnTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnTelefoneActionPerformed
        getTxtNumAR().setEnabled(false);
    }//GEN-LAST:event_rdbtnTelefoneActionPerformed

    private void rdbtnARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnARActionPerformed
        getTxtNumAR().setEnabled(true);
    }//GEN-LAST:event_rdbtnARActionPerformed

    private void txtNumARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumARActionPerformed

    private void cbxTipoLogLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoLogLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTipoLogLocalActionPerformed

    private void ckbxMotivoSolConstrucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbxMotivoSolConstrucaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbxMotivoSolConstrucaoActionPerformed

    private void btnPreencherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreencherActionPerformed
        
        this.getRdbtnSolCorte().setSelected(true);
        this.getTxtNomeRequerente().setText("Luke Cage");
        this.getTxtRgRequerente().setText("MM-123456");
        this.getjFCpfCnpj().setValue("123.456.789-11");
        this.getTxtEmailRequerente().setText("requerente@solicitacao.com.br");
        this.getjFTelRequerente().setValue("(31)9638-5274");
        this.getCbxTipoLogReq().setSelectedItem("Rua");
        this.getTxtLogReq().setText("Hum");
        this.getTxtNumLogReq().setText("10");
        this.getTxtCompLogReq().setText("Casa");
        this.getTxtBairroReq().setText("Central");
        this.getCbxMunicipioReq().setSelectedItem("Itabirito");
        this.getCbxUfReq().setSelectedItem("Minas Gerais");
        this.getRdbtnEmail().setSelected(true);
        this.getCbxTipoLogLocal().setSelectedItem("Rua");
        this.getTxtLogLocal().setText("Dez");
        this.getTxtNumLogLocal().setText("1");
        this.getTxtCompLogLocal().setText("N/A");
        this.getTxtBairroLocal().setText("Funcionários");
        this.getCbxMunicipioLocal().setSelectedItem("Itabirito");
        this.getCbxUfLocal().setSelectedItem("Minas Gerais");
        this.getTxtPtoRefLocal().setText("Em frente ao desfiladeiro");
        this.getRdbtnTerrenoPart().setSelected(true);
        this.getTxtNomeVulgar().setText("Pau a pique");
        this.getTxtQtdArvAlvo().setText("17");
        this.getCkbxMotivoSolAmpliar().setSelected(true);
        this.getTxtMaisJustificativa().setText("Árvores impedindo a realização da obra de expansão da minha casa");
    }//GEN-LAST:event_btnPreencherActionPerformed

    private void cbxStatusSolicitacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxStatusSolicitacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxStatusSolicitacaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormSolicitacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSolicitacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSolicitacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSolicitacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSolicitacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnAnexarArq;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnPreencher;
    private javax.swing.JComboBox<String> cbxMunicipioLocal;
    private javax.swing.JComboBox<String> cbxMunicipioReq;
    private javax.swing.JComboBox<String> cbxStatusSolicitacao;
    private javax.swing.JComboBox<String> cbxTipoLogLocal;
    private javax.swing.JComboBox<String> cbxTipoLogReq;
    private javax.swing.JComboBox<String> cbxUfLocal;
    private javax.swing.JComboBox<String> cbxUfReq;
    private javax.swing.JCheckBox ckbxMotivoSolAmpliar;
    private javax.swing.JCheckBox ckbxMotivoSolConstrucao;
    private javax.swing.JCheckBox ckbxMotivoSolDanRedeHidraulica;
    private javax.swing.JCheckBox ckbxMotivoSolOutro;
    private javax.swing.JCheckBox ckbxMotivoSolProxRedeEletrica;
    private javax.swing.JCheckBox ckbxMotivoSolRiscoTombar;
    private javax.swing.ButtonGroup gpbtnTipoDenuncia;
    private javax.swing.ButtonGroup gpbtnTipoSolicitacao;
    private javax.swing.ButtonGroup gpbtnTipoTerreno;
    private javax.swing.JFormattedTextField jFCpfCnpj;
    private javax.swing.JFormattedTextField jFTelRequerente;
    private javax.swing.JPanel jPDadosComplementares;
    private javax.swing.JPanel jPDadosRequerente;
    private javax.swing.JPanel jPLocalSolicitacao;
    private javax.swing.JPanel jPMotivoSolicitacao;
    private javax.swing.JPanel jPTipoSolicitacao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JFormattedTextField jfData;
    private javax.swing.JLabel lblAnexo;
    private javax.swing.JLabel lblArvoreDadosComp;
    private javax.swing.JLabel lblBairroLocal;
    private javax.swing.JLabel lblBairroReq;
    private javax.swing.JLabel lblCompLogLocal;
    private javax.swing.JLabel lblCompLogReq;
    private javax.swing.JLabel lblCpfCnpj;
    private javax.swing.JLabel lblDataDenuncia;
    private javax.swing.JLabel lblEmailDenunciante;
    private javax.swing.JLabel lblLogLocal;
    private javax.swing.JLabel lblLogReq;
    private javax.swing.JLabel lblMaisJustificativa;
    private javax.swing.JLabel lblMunicipioLocal;
    private javax.swing.JLabel lblMunicipioReq;
    private javax.swing.JLabel lblNomeDenunciante;
    private javax.swing.JLabel lblNomeVulgar;
    private javax.swing.JLabel lblNumLogLocal;
    private javax.swing.JLabel lblNumLogReq;
    private javax.swing.JLabel lblPtoRefLocal;
    private javax.swing.JLabel lblQtdArvAlvo;
    private javax.swing.JLabel lblRgDenunciante;
    private javax.swing.JLabel lblStatusDenuncia;
    private javax.swing.JLabel lblTelDenunciante;
    private javax.swing.JLabel lblTipoLogLocal;
    private javax.swing.JLabel lblTipoLogReq;
    private javax.swing.JLabel lblTipoRetorno;
    private javax.swing.JLabel lblTipoSolicitacao;
    private javax.swing.JLabel lblUfLocal;
    private javax.swing.JLabel lblUfReq;
    private javax.swing.JSeparator lnSeparaTitulo;
    private javax.swing.JRadioButton rdbtnAR;
    private javax.swing.JRadioButton rdbtnEmail;
    private javax.swing.JRadioButton rdbtnSolCorte;
    private javax.swing.JRadioButton rdbtnSolPoda;
    private javax.swing.JRadioButton rdbtnTelefone;
    private javax.swing.JRadioButton rdbtnTerrenoPart;
    private javax.swing.JRadioButton rdbtnTerrenoPub;
    private javax.swing.JRadioButton rdbtnTerrenoTerc;
    private javax.swing.JLabel titFormSolicitacao;
    private javax.swing.JTextField txtBairroLocal;
    private javax.swing.JTextField txtBairroReq;
    private javax.swing.JTextField txtCompLogLocal;
    private javax.swing.JTextField txtCompLogReq;
    private javax.swing.JTextField txtEmailRequerente;
    private javax.swing.JTextField txtLogLocal;
    private javax.swing.JTextField txtLogReq;
    private javax.swing.JTextArea txtMaisJustificativa;
    private javax.swing.JTextField txtMotivoSolOutro;
    private javax.swing.JTextField txtNomeRequerente;
    private javax.swing.JTextField txtNomeVulgar;
    private javax.swing.JTextField txtNumAR;
    private javax.swing.JTextField txtNumLogLocal;
    private javax.swing.JTextField txtNumLogReq;
    private javax.swing.JTextField txtPtoRefLocal;
    private javax.swing.JTextField txtQtdArvAlvo;
    private javax.swing.JTextField txtRgRequerente;
    // End of variables declaration//GEN-END:variables

   
    
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
    
    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

        public void FechaFormSolicitacao(){

            dispose();

    }
}
