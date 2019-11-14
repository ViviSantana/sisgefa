/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.screen;

import java.awt.Font;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import model.bean.Denuncia;
import model.bean.Municipio;
import model.bean.Pessoa;
import model.bean.Status;
import model.bean.TipoDenuncia;
import model.bean.TipoLogradouro;
import model.dao.DenunciaDAO;
import model.dao.PessoaDAO;

/**
 *
 * @author vivis
 */
public final class FormDenuncia extends javax.swing.JFrame {

    public javax.swing.JComboBox<String> getCbxUfDenunciante() {
        return cbxUfDenunciante;
    }

    public void setCbxUfDenunciante(javax.swing.JComboBox<String> cbxUfDenunciante) {
        this.cbxUfDenunciante = cbxUfDenunciante;
    }

    public javax.swing.JTextField getTxtEmailDenunciante() {
        return txtEmailDenunciante;
    }

    public void setTxtEmailDenunciante(javax.swing.JTextField txtEmailDenunciante) {
        this.txtEmailDenunciante = txtEmailDenunciante;
    }

    public javax.swing.JTextField getTxtRgDenunciante() {
        return txtRgDenunciante;
    }

    public void setTxtRgDenunciante(javax.swing.JTextField txtRgDenunciante) {
        this.txtRgDenunciante = txtRgDenunciante;
    }

    public java.awt.Button getBtnFormDenunciaAnexo() {
        return btnFormDenunciaAnexo;
    }

    public void setBtnFormDenunciaAnexo(java.awt.Button btnFormDenunciaAnexo) {
        this.btnFormDenunciaAnexo = btnFormDenunciaAnexo;
    }

    public javax.swing.JButton getBtnGravarDenuncia() {
        return btnGravarDenuncia;
    }

    public void setBtnGravarDenuncia(javax.swing.JButton btnGravarDenuncia) {
        this.btnGravarDenuncia = btnGravarDenuncia;
    }

    public javax.swing.JButton getBtnPreencher() {
        return btnPreencher;
    }

    public void setBtnPreencher(javax.swing.JButton btnPreencher) {
        this.btnPreencher = btnPreencher;
    }


    public javax.swing.JComboBox<String> getCbxMunicipioDenunciado() {
        return cbxMunicipioDenunciado;
    }

    public void setCbxMunicipioDenunciado(javax.swing.JComboBox<String> cbxMunicipioDenunciado) {
        this.cbxMunicipioDenunciado = cbxMunicipioDenunciado;
    }

    public javax.swing.JComboBox<String> getCbxMunicipioDenunciante() {
        return cbxMunicipioDenunciante;
    }

    public void setCbxMunicipioDenunciante(javax.swing.JComboBox<String> cbxMunicipioDenunciante) {
        this.cbxMunicipioDenunciante = cbxMunicipioDenunciante;
    }

    public javax.swing.JComboBox<String> getCbxTipoLogDenunciado() {
        return cbxTipoLogDenunciado;
    }

    public void setCbxTipoLogDenunciado(javax.swing.JComboBox<String> cbxTipoLogDenunciado) {
        this.cbxTipoLogDenunciado = cbxTipoLogDenunciado;
    }

    public javax.swing.JComboBox<String> getCbxTipoLogDenunciante() {
        return cbxTipoLogDenunciante;
    }

    public void setCbxTipoLogDenunciante(javax.swing.JComboBox<String> cbxTipoLogDenunciante) {
        this.cbxTipoLogDenunciante = cbxTipoLogDenunciante;
    }

    public javax.swing.JComboBox<String> getCbxUFDenunciado() {
        return cbxUFDenunciado;
    }

    public void setCbxUFDenunciado(javax.swing.JComboBox<String> cbxUFDenunciado) {
        this.cbxUFDenunciado = cbxUFDenunciado;
    }

    public javax.swing.ButtonGroup getGpbtnTipoDenuncia() {
        return gpbtnTipoDenuncia;
    }

    public void setGpbtnTipoDenuncia(javax.swing.ButtonGroup gpbtnTipoDenuncia) {
        this.gpbtnTipoDenuncia = gpbtnTipoDenuncia;
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

    public javax.swing.JTextField getjTextField7() {
        return getTxtRgDenunciante();
    }

    public void setjTextField7(javax.swing.JTextField jTextField7) {
        this.setTxtRgDenunciante(jTextField7);
    }

    public javax.swing.JTextField getjTextField8() {
        return getTxtEmailDenunciante();
    }

    public void setjTextField8(javax.swing.JTextField jTextField8) {
        this.setTxtEmailDenunciante(jTextField8);
    }

    public javax.swing.JLabel getLblCpfCnpjDenunciante() {
        return lblCpfCnpjDenunciante;
    }

    public void setLblCpfCnpjDenunciante(javax.swing.JLabel lblCpfCnpjDenunciante) {
        this.lblCpfCnpjDenunciante = lblCpfCnpjDenunciante;
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

    public javax.swing.JLabel getLblLocal10() {
        return lblTipoLog;
    }

    public void setLblLocal10(javax.swing.JLabel lblLocal10) {
        this.lblTipoLog = lblLocal10;
    }

    public javax.swing.JLabel getLblLocal11() {
        return lblLogradoudo;
    }

    public void setLblLocal11(javax.swing.JLabel lblLocal11) {
        this.lblLogradoudo = lblLocal11;
    }

    public javax.swing.JLabel getLblLocal12() {
        return lblNumLog;
    }

    public void setLblLocal12(javax.swing.JLabel lblLocal12) {
        this.lblNumLog = lblLocal12;
    }

    public javax.swing.JLabel getLblLocal13() {
        return lblCompLog;
    }

    public void setLblLocal13(javax.swing.JLabel lblLocal13) {
        this.lblCompLog = lblLocal13;
    }

    public javax.swing.JLabel getLblLocal14() {
        return lblBairro;
    }

    public void setLblLocal14(javax.swing.JLabel lblLocal14) {
        this.lblBairro = lblLocal14;
    }

    public javax.swing.JLabel getLblLocal15() {
        return lblMunicipio;
    }

    public void setLblLocal15(javax.swing.JLabel lblLocal15) {
        this.lblMunicipio = lblLocal15;
    }

    public javax.swing.JLabel getLblLocal16() {
        return lblUf;
    }

    public void setLblLocal16(javax.swing.JLabel lblLocal16) {
        this.lblUf = lblLocal16;
    }

    public javax.swing.JLabel getLblLocal17() {
        return lblPtoReferencia;
    }

    public void setLblLocal17(javax.swing.JLabel lblLocal17) {
        this.lblPtoReferencia = lblLocal17;
    }

    public javax.swing.JLabel getLblLocal3() {
        return lblNumLogDenunciante;
    }

    public void setLblLocal3(javax.swing.JLabel lblLocal3) {
        this.lblNumLogDenunciante = lblLocal3;
    }

    public javax.swing.JLabel getLblLocal4() {
        return lblComplLogDenunciante;
    }

    public void setLblLocal4(javax.swing.JLabel lblLocal4) {
        this.lblComplLogDenunciante = lblLocal4;
    }

    public javax.swing.JLabel getLblLocal5() {
        return lblBairroDenunciante;
    }

    public void setLblLocal5(javax.swing.JLabel lblLocal5) {
        this.lblBairroDenunciante = lblLocal5;
    }

    public javax.swing.JLabel getLblLocal6() {
        return lblMuncDenunciante;
    }

    public void setLblLocal6(javax.swing.JLabel lblLocal6) {
        this.lblMuncDenunciante = lblLocal6;
    }

    public javax.swing.JLabel getLblLocal7() {
        return lblUfDenunciante;
    }

    public void setLblLocal7(javax.swing.JLabel lblLocal7) {
        this.lblUfDenunciante = lblLocal7;
    }

    public javax.swing.JLabel getLblLocal8() {
        return lblTipoLogDenunciante;
    }

    public void setLblLocal8(javax.swing.JLabel lblLocal8) {
        this.lblTipoLogDenunciante = lblLocal8;
    }

    public javax.swing.JLabel getLblLocal9() {
        return lblLogDenunciante;
    }

    public void setLblLocal9(javax.swing.JLabel lblLocal9) {
        this.lblLogDenunciante = lblLocal9;
    }

    public javax.swing.JLabel getLblNomeDenunciante() {
        return lblNomeDenunciante;
    }

    public void setLblNomeDenunciante(javax.swing.JLabel lblNomeDenunciante) {
        this.lblNomeDenunciante = lblNomeDenunciante;
    }

    public javax.swing.JLabel getLblNomeDenunciante1() {
        return lblNomeDenunciado;
    }

    public void setLblNomeDenunciante1(javax.swing.JLabel lblNomeDenunciante1) {
        this.lblNomeDenunciado = lblNomeDenunciante1;
    }

    public javax.swing.JLabel getLblNomeDenunciante2() {
        return lblDescDenuncia;
    }

    public void setLblNomeDenunciante2(javax.swing.JLabel lblNomeDenunciante2) {
        this.lblDescDenuncia = lblNomeDenunciante2;
    }

    public javax.swing.JLabel getLblRgDenunciante() {
        return lblRgDenunciante;
    }

    public void setLblRgDenunciante(javax.swing.JLabel lblRgDenunciante) {
        this.lblRgDenunciante = lblRgDenunciante;
    }

    public javax.swing.JLabel getLblTelDenunciante() {
        return lblTelDenunciante;
    }

    public void setLblTelDenunciante(javax.swing.JLabel lblTelDenunciante) {
        this.lblTelDenunciante = lblTelDenunciante;
    }

    public javax.swing.JLabel getLblTipoDenuncia() {
        return lblTipoDenuncia;
    }

    public void setLblTipoDenuncia(javax.swing.JLabel lblTipoDenuncia) {
        this.lblTipoDenuncia = lblTipoDenuncia;
    }

    public javax.swing.JLabel getLblTipoRetorno() {
        return lblTipoRetorno;
    }

    public void setLblTipoRetorno(javax.swing.JLabel lblTipoRetorno) {
        this.lblTipoRetorno = lblTipoRetorno;
    }

    public javax.swing.JSeparator getLnSeparaTitulo() {
        return linhaTitulo;
    }

    public void setLnSeparaTitulo(javax.swing.JSeparator lnSeparaTitulo) {
        this.linhaTitulo = lnSeparaTitulo;
    }

    public javax.swing.JRadioButton getRdbtnDenAnonima() {
        return rdbtnDenAnonima;
    }

    public void setRdbtnDenAnonima(javax.swing.JRadioButton rdbtnDenAnonima) {
        this.rdbtnDenAnonima = rdbtnDenAnonima;
    }

    public javax.swing.JRadioButton getRdbtnDenIdentificada() {
        return rdbtnDenIdentificada;
    }

    public void setRdbtnDenIdentificada(javax.swing.JRadioButton rdbtnDenIdentificada) {
        this.rdbtnDenIdentificada = rdbtnDenIdentificada;
    }

    public javax.swing.JLabel getTitulo() {
        return titulo;
    }

    public void setTitulo(javax.swing.JLabel titulo) {
        this.titulo = titulo;
    }

    public javax.swing.JTextField getTxtBairroDenunciado() {
        return txtBairroDenunciado;
    }

    public void setTxtBairroDenunciado(javax.swing.JTextField txtBairroDenunciado) {
        this.txtBairroDenunciado = txtBairroDenunciado;
    }

    public javax.swing.JTextField getTxtBairroDenunciante() {
        return txtBairroDenunciante;
    }

    public void setTxtBairroDenunciante(javax.swing.JTextField txtBairroDenunciante) {
        this.txtBairroDenunciante = txtBairroDenunciante;
    }

    public javax.swing.JTextField getTxtComplLogDenunciado() {
        return txtComplLogDenunciado;
    }

    public void setTxtComplLogDenunciado(javax.swing.JTextField txtComplLogDenunciado) {
        this.txtComplLogDenunciado = txtComplLogDenunciado;
    }

    public javax.swing.JTextField getTxtComplLogDenunciante() {
        return txtComplLogDenunciante;
    }

    public void setTxtComplLogDenunciante(javax.swing.JTextField txtComplLogDenunciante) {
        this.txtComplLogDenunciante = txtComplLogDenunciante;
    }

    public javax.swing.JTextArea getTxtDescDenuncia() {
        return txtDescDenuncia;
    }

    public void setTxtDescDenuncia(javax.swing.JTextArea txtDescDenuncia) {
        this.txtDescDenuncia = txtDescDenuncia;
    }

    public javax.swing.JTextField getTxtLogDenunciado() {
        return txtLogDenunciado;
    }

    public void setTxtLogDenunciado(javax.swing.JTextField txtLogDenunciado) {
        this.txtLogDenunciado = txtLogDenunciado;
    }

    public javax.swing.JTextField getTxtLogDenunciante() {
        return txtLogDenunciante;
    }

    public void setTxtLogDenunciante(javax.swing.JTextField txtLogDenunciante) {
        this.txtLogDenunciante = txtLogDenunciante;
    }

    public javax.swing.JTextField getTxtNomeDenunciado() {
        return txtNomeDenunciado;
    }

    public void setTxtNomeDenunciado(javax.swing.JTextField txtNomeDenunciado) {
        this.txtNomeDenunciado = txtNomeDenunciado;
    }

    public javax.swing.JTextField getTxtNomeDenunciante() {
        return txtNomeDenunciante;
    }

    public void setTxtNomeDenunciante(javax.swing.JTextField txtNomeDenunciante) {
        this.txtNomeDenunciante = txtNomeDenunciante;
    }

    public javax.swing.JTextField getTxtPtoRefDenunciado() {
        return txtPtoRefDenunciado;
    }

    public void setTxtPtoRefDenunciado(javax.swing.JTextField txtPtoRefDenunciado) {
        this.txtPtoRefDenunciado = txtPtoRefDenunciado;
    }

    public javax.swing.JTextField getTxtnumLogDenunciado() {
        return txtnumLogDenunciado;
    }

    public void setTxtnumLogDenunciado(javax.swing.JTextField txtnumLogDenunciado) {
        this.txtnumLogDenunciado = txtnumLogDenunciado;
    }

    public javax.swing.JTextField getTxtnumLogDenunciante() {
        return txtnumLogDenunciante;
    }

    public void setTxtnumLogDenunciante(javax.swing.JTextField txtnumLogDenunciante) {
        this.txtnumLogDenunciante = txtnumLogDenunciante;
    }

    public JComboBox<String> getCbxStatusDenuncia() {
        return cbxStatusDenuncia;
    }

    public void setCbxStatusDenuncia(JComboBox<String> cbxStatusDenuncia) {
        this.cbxStatusDenuncia = cbxStatusDenuncia;
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

    public javax.swing.JRadioButton getRdbtnTelefone() {
        return rdbtnTelefone;
    }

    public void setRdbtnTelefone(javax.swing.JRadioButton rdbtnTelefone) {
        this.rdbtnTelefone = rdbtnTelefone;
    }
    
    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    

    private String motivo = null;
    private String prefContato = null;
    ImageIcon icon = new ImageIcon("C:\\Users\\btps000328\\Downloads\\icon.png");
    
    /**
     * Creates new form AgendaVistoria
     */
    public FormDenuncia() {
        initComponents();
        setIcon();
        this.jfData.setText(getDateTime());
        habilitaDenunciante(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gpbtnTipoDenuncia = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        gpbtnPrefContato = new javax.swing.ButtonGroup();
        jPTitulo = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        linhaTitulo = new javax.swing.JSeparator();
        jPBotoes = new javax.swing.JPanel();
        btnPreencher = new javax.swing.JButton();
        btnGravarDenuncia = new javax.swing.JButton();
        jPTipoDenuncia = new javax.swing.JPanel();
        lblTipoDenuncia = new javax.swing.JLabel();
        rdbtnDenAnonima = new javax.swing.JRadioButton();
        rdbtnDenIdentificada = new javax.swing.JRadioButton();
        lblDataDenuncia = new javax.swing.JLabel();
        jfData = new javax.swing.JFormattedTextField();
        jPDenunciante = new javax.swing.JPanel();
        lblNomeDenunciante = new javax.swing.JLabel();
        txtNomeDenunciante = new javax.swing.JTextField();
        lblTipoLogDenunciante = new javax.swing.JLabel();
        cbxTipoLogDenunciante = new javax.swing.JComboBox<>();
        lblLogDenunciante = new javax.swing.JLabel();
        txtLogDenunciante = new javax.swing.JTextField();
        txtnumLogDenunciante = new javax.swing.JTextField();
        lblRgDenunciante = new javax.swing.JLabel();
        txtRgDenunciante = new javax.swing.JTextField();
        lblCpfCnpjDenunciante = new javax.swing.JLabel();
        jFCpfCnpj = new javax.swing.JFormattedTextField();
        lblEmailDenunciante = new javax.swing.JLabel();
        txtEmailDenunciante = new javax.swing.JTextField();
        lblTelDenunciante = new javax.swing.JLabel();
        jFTelefone = new javax.swing.JFormattedTextField();
        lblUfDenunciante = new javax.swing.JLabel();
        cbxUfDenunciante = new javax.swing.JComboBox<>();
        cbxMunicipioDenunciante = new javax.swing.JComboBox<>();
        lblMuncDenunciante = new javax.swing.JLabel();
        txtBairroDenunciante = new javax.swing.JTextField();
        lblBairroDenunciante = new javax.swing.JLabel();
        txtComplLogDenunciante = new javax.swing.JTextField();
        lblComplLogDenunciante = new javax.swing.JLabel();
        lblNumLogDenunciante = new javax.swing.JLabel();
        lblTipoRetorno = new javax.swing.JLabel();
        rdbtnEmail = new javax.swing.JRadioButton();
        rdbtnTelefone = new javax.swing.JRadioButton();
        rdbtnAR = new javax.swing.JRadioButton();
        txtNumAR = new javax.swing.JTextField();
        lblStatusDenuncia = new javax.swing.JLabel();
        cbxStatusDenuncia = new javax.swing.JComboBox<>();
        jPDenuncia = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescDenuncia = new javax.swing.JTextArea();
        txtNomeDenunciado = new javax.swing.JTextField();
        lblTipoLog = new javax.swing.JLabel();
        cbxTipoLogDenunciado = new javax.swing.JComboBox<>();
        lblLogradoudo = new javax.swing.JLabel();
        txtLogDenunciado = new javax.swing.JTextField();
        lblNumLog = new javax.swing.JLabel();
        txtnumLogDenunciado = new javax.swing.JTextField();
        lblCompLog = new javax.swing.JLabel();
        txtComplLogDenunciado = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        txtBairroDenunciado = new javax.swing.JTextField();
        lblMunicipio = new javax.swing.JLabel();
        cbxMunicipioDenunciado = new javax.swing.JComboBox<>();
        lblUf = new javax.swing.JLabel();
        cbxUFDenunciado = new javax.swing.JComboBox<>();
        lblPtoReferencia = new javax.swing.JLabel();
        txtPtoRefDenunciado = new javax.swing.JTextField();
        lblDescDenuncia = new javax.swing.JLabel();
        lblNomeDenunciado = new javax.swing.JLabel();
        btnFormDenunciaAnexo = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SisGeFA - Sistema de Gestão de Licenciamento e Fiscalização Ambiental");
        setMinimumSize(new java.awt.Dimension(1060, 975));
        setName("FormDenuncia"); // NOI18N
        setResizable(false);
        setSize(1060,1000);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Sitka Small", 0, 36)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Formulário de Denúncia");

        btnPreencher.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPreencher.setText("Preencher");
        btnPreencher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreencherActionPerformed(evt);
            }
        });

        btnGravarDenuncia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGravarDenuncia.setText("Gravar");
        btnGravarDenuncia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarDenunciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPBotoesLayout = new javax.swing.GroupLayout(jPBotoes);
        jPBotoes.setLayout(jPBotoesLayout);
        jPBotoesLayout.setHorizontalGroup(
            jPBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBotoesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnPreencher, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnGravarDenuncia, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        jPBotoesLayout.setVerticalGroup(
            jPBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBotoesLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPreencher, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGravarDenuncia, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPTituloLayout = new javax.swing.GroupLayout(jPTitulo);
        jPTitulo.setLayout(jPTituloLayout);
        jPTituloLayout.setHorizontalGroup(
            jPTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTituloLayout.createSequentialGroup()
                .addGroup(jPTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPTituloLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(linhaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 259, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(327, 327, 327))
        );
        jPTituloLayout.setVerticalGroup(
            jPTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(linhaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTipoDenuncia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTipoDenuncia.setText("TIPO DENÚNCIA:");

        gpbtnTipoDenuncia.add(rdbtnDenAnonima);
        rdbtnDenAnonima.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdbtnDenAnonima.setSelected(true);
        rdbtnDenAnonima.setText("Anônima");
        rdbtnDenAnonima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnDenAnonimaActionPerformed(evt);
            }
        });

        gpbtnTipoDenuncia.add(rdbtnDenIdentificada);
        rdbtnDenIdentificada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdbtnDenIdentificada.setText("Identificada");
        rdbtnDenIdentificada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnDenIdentificadaActionPerformed(evt);
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

        jPDenunciante.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DADOS DENUNCIANTE", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        lblNomeDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNomeDenunciante.setText("Nome:");

        txtNomeDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNomeDenunciante.setToolTipText("Informe o logradouro...");
        txtNomeDenunciante.setMaximumSize(new java.awt.Dimension(2147483647, 30));
        txtNomeDenunciante.setMinimumSize(new java.awt.Dimension(6, 30));
        txtNomeDenunciante.setPreferredSize(new java.awt.Dimension(4, 27));
        txtNomeDenunciante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeDenuncianteActionPerformed(evt);
            }
        });

        lblTipoLogDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTipoLogDenunciante.setText("Tipo:");

        cbxTipoLogDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxTipoLogDenunciante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Avenida", "Alameda", "Praça", "Rua", "Travessia" }));

        lblLogDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLogDenunciante.setText("Logradouro:");

        txtLogDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLogDenunciante.setToolTipText("Informe o logradouro...");
        txtLogDenunciante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLogDenuncianteActionPerformed(evt);
            }
        });

        txtnumLogDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnumLogDenunciante.setToolTipText("Informe o número...");
        txtnumLogDenunciante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumLogDenuncianteActionPerformed(evt);
            }
        });

        lblRgDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRgDenunciante.setText("RG:");

        txtRgDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtRgDenunciante.setToolTipText("Informe o logradouro...");
        txtRgDenunciante.setMaximumSize(new java.awt.Dimension(2147483647, 27));
        txtRgDenunciante.setMinimumSize(new java.awt.Dimension(6, 27));
        txtRgDenunciante.setPreferredSize(new java.awt.Dimension(6, 27));

        lblCpfCnpjDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCpfCnpjDenunciante.setText("CPF / CNPJ:");

        try {
            jFCpfCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFCpfCnpj.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jFCpfCnpj.setMaximumSize(new java.awt.Dimension(2147483647, 27));
        jFCpfCnpj.setMinimumSize(new java.awt.Dimension(6, 27));
        jFCpfCnpj.setPreferredSize(new java.awt.Dimension(63, 27));
        jFCpfCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFCpfCnpjActionPerformed(evt);
            }
        });

        lblEmailDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEmailDenunciante.setText("E-mail:");

        txtEmailDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmailDenunciante.setToolTipText("Informe o logradouro...");
        txtEmailDenunciante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailDenuncianteActionPerformed(evt);
            }
        });

        lblTelDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTelDenunciante.setText("Telefone:");

        try {
            jFTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jFTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTelefoneActionPerformed(evt);
            }
        });

        lblUfDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUfDenunciante.setText("UF:");

        cbxUfDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxUfDenunciante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Minas Gerais" }));
        cbxUfDenunciante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUfDenuncianteActionPerformed(evt);
            }
        });

        cbxMunicipioDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxMunicipioDenunciante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Belo Horizonte", "Corinto", "Itabirito", "João Monlevade", "Mariana", "Ouro Preto", " ", " ", " " }));

        lblMuncDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMuncDenunciante.setText("Município:");

        txtBairroDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBairroDenunciante.setToolTipText("Informe o bairro...");
        txtBairroDenunciante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroDenuncianteActionPerformed(evt);
            }
        });

        lblBairroDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBairroDenunciante.setText("Bairro:");

        txtComplLogDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtComplLogDenunciante.setToolTipText("Informe o complemento (se houver)...");
        txtComplLogDenunciante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComplLogDenuncianteActionPerformed(evt);
            }
        });

        lblComplLogDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblComplLogDenunciante.setText("Complemento:");

        lblNumLogDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNumLogDenunciante.setText("Nº:");

        lblTipoRetorno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTipoRetorno.setText("Preferência de  Retorno:");

        gpbtnPrefContato.add(rdbtnEmail);
        rdbtnEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdbtnEmail.setText("E-mail");
        rdbtnEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnEmailActionPerformed(evt);
            }
        });

        gpbtnPrefContato.add(rdbtnTelefone);
        rdbtnTelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdbtnTelefone.setText("Telefone");
        rdbtnTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnTelefoneActionPerformed(evt);
            }
        });

        gpbtnPrefContato.add(rdbtnAR);
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

        javax.swing.GroupLayout jPDenuncianteLayout = new javax.swing.GroupLayout(jPDenunciante);
        jPDenunciante.setLayout(jPDenuncianteLayout);
        jPDenuncianteLayout.setHorizontalGroup(
            jPDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDenuncianteLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDenuncianteLayout.createSequentialGroup()
                        .addGroup(jPDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxTipoLogDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTipoLogDenunciante))
                        .addGap(10, 10, 10)
                        .addGroup(jPDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLogDenunciante)
                            .addComponent(txtLogDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnumLogDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNumLogDenunciante))
                        .addGap(10, 10, 10)
                        .addGroup(jPDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblComplLogDenunciante)
                            .addComponent(txtComplLogDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBairroDenunciante)
                            .addComponent(txtBairroDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPDenuncianteLayout.createSequentialGroup()
                        .addGroup(jPDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeDenunciante)
                            .addComponent(txtNomeDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRgDenunciante)
                            .addComponent(txtRgDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCpfCnpjDenunciante)
                            .addComponent(jFCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmailDenunciante)
                            .addComponent(txtEmailDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelDenunciante)
                            .addComponent(jFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPDenuncianteLayout.createSequentialGroup()
                        .addGroup(jPDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMuncDenunciante)
                            .addComponent(cbxMunicipioDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUfDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxUfDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTipoRetorno)
                            .addGroup(jPDenuncianteLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(rdbtnEmail)
                                .addGap(18, 18, 18)
                                .addComponent(rdbtnTelefone)
                                .addGap(18, 18, 18)
                                .addComponent(rdbtnAR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumAR, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(127, 127, 127))
        );
        jPDenuncianteLayout.setVerticalGroup(
            jPDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDenuncianteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeDenunciante)
                    .addComponent(lblRgDenunciante)
                    .addComponent(lblCpfCnpjDenunciante)
                    .addComponent(lblEmailDenunciante)
                    .addComponent(lblTelDenunciante))
                .addGap(10, 10, 10)
                .addGroup(jPDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmailDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRgDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDenuncianteLayout.createSequentialGroup()
                        .addGroup(jPDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTipoLogDenunciante)
                                .addComponent(lblLogDenunciante))
                            .addGroup(jPDenuncianteLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblComplLogDenunciante)
                                    .addComponent(lblNumLogDenunciante))))
                        .addGap(10, 10, 10)
                        .addGroup(jPDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxTipoLogDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLogDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnumLogDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtComplLogDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUfDenunciante)
                            .addComponent(lblMuncDenunciante)
                            .addComponent(lblTipoRetorno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxMunicipioDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbxUfDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNumAR, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rdbtnEmail)
                                .addComponent(rdbtnTelefone)
                                .addComponent(rdbtnAR))))
                    .addGroup(jPDenuncianteLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblBairroDenunciante)
                        .addGap(10, 10, 10)
                        .addComponent(txtBairroDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        lblStatusDenuncia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblStatusDenuncia.setText("Status:");

        cbxStatusDenuncia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxStatusDenuncia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nova", "Encaminhada", "Aguardando Vistoria", "Atendida" }));
        cbxStatusDenuncia.setEnabled(false);

        javax.swing.GroupLayout jPTipoDenunciaLayout = new javax.swing.GroupLayout(jPTipoDenuncia);
        jPTipoDenuncia.setLayout(jPTipoDenunciaLayout);
        jPTipoDenunciaLayout.setHorizontalGroup(
            jPTipoDenunciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTipoDenunciaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPTipoDenunciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPTipoDenunciaLayout.createSequentialGroup()
                        .addComponent(jPDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPTipoDenunciaLayout.createSequentialGroup()
                        .addComponent(lblTipoDenuncia)
                        .addGap(18, 18, 18)
                        .addComponent(rdbtnDenAnonima)
                        .addGap(18, 18, 18)
                        .addComponent(rdbtnDenIdentificada)
                        .addGap(78, 78, 78)
                        .addComponent(lblDataDenuncia)
                        .addGap(18, 18, 18)
                        .addComponent(jfData, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblStatusDenuncia)
                        .addGap(18, 18, 18)
                        .addComponent(cbxStatusDenuncia, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))))
        );
        jPTipoDenunciaLayout.setVerticalGroup(
            jPTipoDenunciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTipoDenunciaLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPTipoDenunciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipoDenuncia)
                    .addComponent(rdbtnDenAnonima)
                    .addGroup(jPTipoDenunciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDataDenuncia)
                        .addComponent(jfData, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rdbtnDenIdentificada)
                    .addGroup(jPTipoDenunciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblStatusDenuncia)
                        .addComponent(cbxStatusDenuncia, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(jPDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPDenuncia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DADOS DA DENUNCIA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPDenuncia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtDescDenuncia.setColumns(20);
        txtDescDenuncia.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtDescDenuncia.setRows(5);
        jScrollPane2.setViewportView(txtDescDenuncia);

        txtNomeDenunciado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNomeDenunciado.setToolTipText("Informe o logradouro...");
        txtNomeDenunciado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeDenunciadoActionPerformed(evt);
            }
        });

        lblTipoLog.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTipoLog.setText("Tipo");

        cbxTipoLogDenunciado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxTipoLogDenunciado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Avenida", "Alameda", "Praça", "Rua", "Travessia" }));

        lblLogradoudo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLogradoudo.setText("Logradouro");

        txtLogDenunciado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLogDenunciado.setToolTipText("Informe o logradouro...");
        txtLogDenunciado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLogDenunciadoActionPerformed(evt);
            }
        });

        lblNumLog.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNumLog.setText("Nº");

        txtnumLogDenunciado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnumLogDenunciado.setToolTipText("Informe o número...");
        txtnumLogDenunciado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumLogDenunciadoActionPerformed(evt);
            }
        });

        lblCompLog.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCompLog.setText("Complemento");

        txtComplLogDenunciado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtComplLogDenunciado.setToolTipText("Informe o complemento (se houver)...");
        txtComplLogDenunciado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComplLogDenunciadoActionPerformed(evt);
            }
        });

        lblBairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBairro.setText("Bairro");

        txtBairroDenunciado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBairroDenunciado.setToolTipText("Informe o bairro...");
        txtBairroDenunciado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroDenunciadoActionPerformed(evt);
            }
        });

        lblMunicipio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMunicipio.setText("Município");

        cbxMunicipioDenunciado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxMunicipioDenunciado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Belo Horizonte", "Corinto", "Itabirito", "João Monlevade", "Mariana", "Ouro Preto", " ", " ", " " }));

        lblUf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUf.setText("UF");

        cbxUFDenunciado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxUFDenunciado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Minas Gerais" }));
        cbxUFDenunciado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUFDenunciadoActionPerformed(evt);
            }
        });

        lblPtoReferencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPtoReferencia.setText("Pontos de Referência: ");

        txtPtoRefDenunciado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPtoRefDenunciado.setToolTipText("Informe o logradouro...");
        txtPtoRefDenunciado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPtoRefDenunciadoActionPerformed(evt);
            }
        });

        lblDescDenuncia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDescDenuncia.setText("Descrição da denúncia:");

        lblNomeDenunciado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNomeDenunciado.setText("Denunciado:");

        btnFormDenunciaAnexo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnFormDenunciaAnexo.setLabel("Anexar Arquivo");
        btnFormDenunciaAnexo.setName("Anexar"); // NOI18N
        btnFormDenunciaAnexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormDenunciaAnexoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPDenunciaLayout = new javax.swing.GroupLayout(jPDenuncia);
        jPDenuncia.setLayout(jPDenunciaLayout);
        jPDenunciaLayout.setHorizontalGroup(
            jPDenunciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDenunciaLayout.createSequentialGroup()
                .addGroup(jPDenunciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPDenunciaLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPDenunciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPDenunciaLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFormDenunciaAnexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPDenunciaLayout.createSequentialGroup()
                                .addGroup(jPDenunciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPDenunciaLayout.createSequentialGroup()
                                        .addComponent(lblMunicipio)
                                        .addGap(159, 159, 159))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDenunciaLayout.createSequentialGroup()
                                        .addComponent(cbxMunicipioDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15)))
                                .addGroup(jPDenunciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxUFDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPDenunciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPtoReferencia)
                                    .addComponent(txtPtoRefDenunciado)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPDenunciaLayout.createSequentialGroup()
                                .addGroup(jPDenunciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDescDenuncia, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNomeDenunciado, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNomeDenunciado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPDenunciaLayout.createSequentialGroup()
                        .addGroup(jPDenunciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDenunciaLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(lblTipoLog)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblLogradoudo)
                                .addGap(213, 213, 213))
                            .addGroup(jPDenunciaLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbxTipoLogDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtLogDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))
                        .addGroup(jPDenunciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnumLogDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNumLog))
                        .addGap(6, 6, 6)
                        .addGroup(jPDenunciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtComplLogDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCompLog))
                        .addGap(6, 6, 6)
                        .addGroup(jPDenunciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBairro)
                            .addComponent(txtBairroDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50))
        );
        jPDenunciaLayout.setVerticalGroup(
            jPDenunciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDenunciaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNomeDenunciado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNomeDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPDenunciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDenunciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblLogradoudo)
                        .addComponent(lblTipoLog))
                    .addGroup(jPDenunciaLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPDenunciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumLog)
                            .addComponent(lblCompLog)
                            .addComponent(lblBairro))))
                .addGap(12, 12, 12)
                .addGroup(jPDenunciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnumLogDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPDenunciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtComplLogDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtLogDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbxTipoLogDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtBairroDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPDenunciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDenunciaLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblUf))
                    .addGroup(jPDenunciaLayout.createSequentialGroup()
                        .addGroup(jPDenunciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDenunciaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPDenunciaLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblPtoReferencia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPDenunciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPtoRefDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPDenunciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbxMunicipioDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbxUFDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(20, 20, 20)
                .addComponent(lblDescDenuncia)
                .addGroup(jPDenunciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDenunciaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPDenunciaLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btnFormDenunciaAnexo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jPTipoDenuncia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPDenuncia, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPTipoDenuncia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jPDenuncia, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGravarDenunciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarDenunciaActionPerformed
        DenunciaDAO ddao = new DenunciaDAO();
        Status statusD = new Status();
        TipoLogradouro tipoL = new TipoLogradouro();
        PessoaDAO pdao = new PessoaDAO(); 
        
        //recupera e Armazena no tipo logradouro o ID recuperado
        tipoL.setCodigo(ddao.RetornaIdTipoLog(getCbxTipoLogDenunciado().getSelectedItem().toString()));

        //Retorna o município do Denunciante
        Municipio municDenunciante = new Municipio(ddao.RetornaIdMunicipio(getCbxMunicipioDenunciante().getSelectedItem().toString()), getCbxMunicipioDenunciante().getSelectedItem().toString(), ddao.RetornaUfMunicipio(ddao.RetornaIdMunicipio(getCbxMunicipioDenunciante().getSelectedItem().toString())));

        //Retorna o município do Denunciado
        Municipio municDenunciado = new Municipio(ddao.RetornaIdMunicipio(getCbxMunicipioDenunciado().getSelectedItem().toString()), getCbxMunicipioDenunciado().getSelectedItem().toString(), ddao.RetornaUfMunicipio(ddao.RetornaIdMunicipio(getCbxMunicipioDenunciado().getSelectedItem().toString())));

        //Verifica se a denúncia é anônima
        if(getRdbtnDenAnonima().isSelected()){

            //Define o tipo de Denúncia como "Anônima"
            TipoDenuncia tipoD = new TipoDenuncia("A", "Anônima");

            //recupera e armazena o ID do status da denúncia
            statusD.setCodigo(ddao.RetornaIdStatus(getCbxStatusDenuncia().getSelectedItem().toString()));

            //Prepara os dados da denúncia para inserção no banco de dados
            Denuncia denuncia = new Denuncia(tipoD, jfData.getText(),txtNomeDenunciado.getText(), tipoL , txtLogDenunciado.getText(), Integer.parseInt(txtnumLogDenunciado.getText()), txtComplLogDenunciado.getText(), txtBairroDenunciado.getText(), municDenunciado, municDenunciado.getUf(), txtPtoRefDenunciado.getText(), txtDescDenuncia.getText(), statusD.getCodigo());

            //insere a denúncia e recupera o ID automático criado
            int protocoloDenuncia = ddao.InsereDenunciaAn(denuncia);

            //Fecha o formulário de cadastro de denúncia
           // FechaFormDenuncia();

            //Define formatação da mensagem exibida ao usuário
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.TRUETYPE_FONT ,14)));

            //Define e exibe mensagem de sucesso!
            JOptionPane.showMessageDialog(null, "Protocolo: 00000"+protocoloDenuncia + " / 2019", "Denúncia gravada com sucesso.", JOptionPane.INFORMATION_MESSAGE, icon);

        //Verifica se a denúncia é IDENTIFICADA
        }else if(getRdbtnDenIdentificada().isSelected()){
            //Define o tipo de Denúncia como "Identificada"
            TipoDenuncia tipoD = new TipoDenuncia("I", "Identificada");
            
            //recupera e armazena o ID do status da denúncia
            statusD.setCodigo(ddao.RetornaIdStatus(getCbxStatusDenuncia().getSelectedItem().toString()));

            //Verifica e define a opção de preferência de retorno do usuário
            if(rdbtnEmail.isSelected()){
                prefContato = "E-mail";
            }else if(rdbtnTelefone.isSelected()){
                prefContato = "Telefone";
            }
            else if(rdbtnAR.isSelected()){
                prefContato = "AR";
                txtNumAR.setVisible(true);
            }

            //Recupera os dados do denunciante
            Pessoa denunciante = new Pessoa(txtNomeDenunciante.getText(), txtRgDenunciante.getText(), jFCpfCnpj.getText(), txtEmailDenunciante.getText(), jFTelefone.getText(), tipoL, txtLogDenunciante.getText(), Integer.parseInt(txtnumLogDenunciante.getText()), txtComplLogDenunciante.getText(), txtBairroDenunciante.getText(), municDenunciante, municDenunciante.getUf(), prefContato);
            
            //Verifica se o denunciante já está cadastrado no banco de dados
            //Se não estiver
            if(ddao.RetornaPessoa(denunciante.getCpf_cnpj()) == null){
                
                //Insere o denunciante no banco de dados
                pdao.Insere(denunciante);
            }
            
            //Prepara os dados da denúncia para inserção no banco de dados
            Denuncia denuncia = new Denuncia(tipoD, jfData.getText(), denunciante, txtNomeDenunciado.getText(), tipoL , txtLogDenunciado.getText(), Integer.parseInt(txtnumLogDenunciado.getText()), txtComplLogDenunciado.getText(), txtBairroDenunciado.getText(), municDenunciado, municDenunciado.getUf(), txtPtoRefDenunciado.getText(), txtDescDenuncia.getText(), statusD.getCodigo());

            //insere a denúncia e recupera o ID automático criado
            int protocoloDenuncia = ddao.InsereDenunciaId(denuncia, denunciante);

            //Fecha o formulário de cadastro de denúncia
            //FechaFormDenuncia();

            //Define formatação da mensagem exibida ao usuário
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.TRUETYPE_FONT ,14)));
            
            //Define e exibe mensagem de sucesso!
            JOptionPane.showMessageDialog(null, "Denúncia gravada com sucesso. \n\n Protocolo: 00000"+protocoloDenuncia + " / 2019", "", JOptionPane.INFORMATION_MESSAGE, this.icon);

        }
    }//GEN-LAST:event_btnGravarDenunciaActionPerformed

    private void rdbtnDenAnonimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnDenAnonimaActionPerformed
       
        //Limpa os dados denunciante
        LimpaCampos("A");
        
        //Desabilita os campos de Denunciante
        habilitaDenunciante(false);
  
      
    }//GEN-LAST:event_rdbtnDenAnonimaActionPerformed

    private void rdbtnDenIdentificadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnDenIdentificadaActionPerformed

        //Habilita os campos de Denunciante
        habilitaDenunciante(true);
        
    }//GEN-LAST:event_rdbtnDenIdentificadaActionPerformed

    private void txtNomeDenunciadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeDenunciadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeDenunciadoActionPerformed

    private void txtLogDenunciadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLogDenunciadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLogDenunciadoActionPerformed

    private void txtnumLogDenunciadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumLogDenunciadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumLogDenunciadoActionPerformed

    private void txtComplLogDenunciadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComplLogDenunciadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComplLogDenunciadoActionPerformed

    private void txtBairroDenunciadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroDenunciadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroDenunciadoActionPerformed

    private void txtPtoRefDenunciadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPtoRefDenunciadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPtoRefDenunciadoActionPerformed

    private void btnFormDenunciaAnexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormDenunciaAnexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFormDenunciaAnexoActionPerformed

    private void btnPreencherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreencherActionPerformed
        if(rdbtnDenAnonima.isSelected()){
        
            
            this.txtNomeDenunciado.setText("Peixaria da Tilápia");
            this.cbxTipoLogDenunciado.setSelectedItem("Rua");
            this.txtLogDenunciado.setText("do Peixe");
            this.txtnumLogDenunciado.setText("1");
            this.txtComplLogDenunciado.setText("Loja 13");
            this.txtBairroDenunciado.setText("Pescador");
            this.cbxMunicipioDenunciado.setSelectedItem("Itabirito");
            this.cbxUFDenunciado.setSelectedItem("Minas Gerais");
            this.txtPtoRefDenunciado.setText("Praça do Peixe");
            this.txtDescDenuncia.setText("Música muito alta");

        }else if(rdbtnDenIdentificada.isSelected()){
            this.txtNomeDenunciante.setText("Guy Santana");
            this.txtRgDenunciante.setText("MG11223344");
            this.jFCpfCnpj.setText("99999999997");
            this.txtEmailDenunciante.setText("email@email.com");
            this.jFTelefone.setText("999-999-999");
            this.cbxTipoLogDenunciante.setSelectedItem("Rua");
            this.txtLogDenunciante.setText("Manila");
            this.txtnumLogDenunciante.setText("90");
            this.txtComplLogDenunciante.setText("Apto 602");
            this.txtBairroDenunciante.setText("Havaí");
            this.cbxMunicipioDenunciante.setSelectedItem("Belo Horizonte");
            this.cbxUfDenunciante.setSelectedItem("Minas Gerais");
            this.rdbtnAR.setSelected(true);
            this.txtNomeDenunciado.setText("Peixaria da Tilápia");
            this.cbxTipoLogDenunciado.setSelectedItem("Rua");
            this.txtLogDenunciado.setText("do Peixe");
            this.txtnumLogDenunciado.setText("1");
            this.txtComplLogDenunciado.setText("Loja 13");
            this.txtBairroDenunciado.setText("Pescador");
            this.cbxMunicipioDenunciado.setSelectedItem("Itabirito");
            this.cbxUFDenunciado.setSelectedItem("Minas Gerais");
            this.txtPtoRefDenunciado.setText("Praça do Peixe");
            this.txtDescDenuncia.setText("Música muito alta");
        
       }
    }//GEN-LAST:event_btnPreencherActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void txtNumARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumARActionPerformed

    private void rdbtnARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnARActionPerformed
        txtNumAR.setEnabled(true);
    }//GEN-LAST:event_rdbtnARActionPerformed

    private void rdbtnTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnTelefoneActionPerformed
        txtNumAR.setEnabled(false);
    }//GEN-LAST:event_rdbtnTelefoneActionPerformed

    private void rdbtnEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnEmailActionPerformed
        txtNumAR.setEnabled(false);
    }//GEN-LAST:event_rdbtnEmailActionPerformed

    private void txtComplLogDenuncianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComplLogDenuncianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComplLogDenuncianteActionPerformed

    private void txtBairroDenuncianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroDenuncianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroDenuncianteActionPerformed

    private void cbxUfDenuncianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxUfDenuncianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxUfDenuncianteActionPerformed

    private void jFTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTelefoneActionPerformed

    private void txtEmailDenuncianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailDenuncianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailDenuncianteActionPerformed

    private void jFCpfCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFCpfCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFCpfCnpjActionPerformed

    private void txtnumLogDenuncianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumLogDenuncianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumLogDenuncianteActionPerformed

    private void txtLogDenuncianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLogDenuncianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLogDenuncianteActionPerformed

    private void txtNomeDenuncianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeDenuncianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeDenuncianteActionPerformed

    private void cbxUFDenunciadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxUFDenunciadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxUFDenunciadoActionPerformed

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
            java.util.logging.Logger.getLogger(FormDenuncia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDenuncia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDenuncia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDenuncia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDenuncia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnFormDenunciaAnexo;
    private javax.swing.JButton btnGravarDenuncia;
    private javax.swing.JButton btnPreencher;
    private javax.swing.JComboBox<String> cbxMunicipioDenunciado;
    private javax.swing.JComboBox<String> cbxMunicipioDenunciante;
    private javax.swing.JComboBox<String> cbxStatusDenuncia;
    private javax.swing.JComboBox<String> cbxTipoLogDenunciado;
    private javax.swing.JComboBox<String> cbxTipoLogDenunciante;
    private javax.swing.JComboBox<String> cbxUFDenunciado;
    private javax.swing.JComboBox<String> cbxUfDenunciante;
    private javax.swing.ButtonGroup gpbtnPrefContato;
    private javax.swing.ButtonGroup gpbtnTipoDenuncia;
    private javax.swing.JFormattedTextField jFCpfCnpj;
    private javax.swing.JFormattedTextField jFTelefone;
    private javax.swing.JPanel jPBotoes;
    private javax.swing.JPanel jPDenuncia;
    private javax.swing.JPanel jPDenunciante;
    private javax.swing.JPanel jPTipoDenuncia;
    private javax.swing.JPanel jPTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JFormattedTextField jfData;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblBairroDenunciante;
    private javax.swing.JLabel lblCompLog;
    private javax.swing.JLabel lblComplLogDenunciante;
    private javax.swing.JLabel lblCpfCnpjDenunciante;
    private javax.swing.JLabel lblDataDenuncia;
    private javax.swing.JLabel lblDescDenuncia;
    private javax.swing.JLabel lblEmailDenunciante;
    private javax.swing.JLabel lblLogDenunciante;
    private javax.swing.JLabel lblLogradoudo;
    private javax.swing.JLabel lblMuncDenunciante;
    private javax.swing.JLabel lblMunicipio;
    private javax.swing.JLabel lblNomeDenunciado;
    private javax.swing.JLabel lblNomeDenunciante;
    private javax.swing.JLabel lblNumLog;
    private javax.swing.JLabel lblNumLogDenunciante;
    private javax.swing.JLabel lblPtoReferencia;
    private javax.swing.JLabel lblRgDenunciante;
    private javax.swing.JLabel lblStatusDenuncia;
    private javax.swing.JLabel lblTelDenunciante;
    private javax.swing.JLabel lblTipoDenuncia;
    private javax.swing.JLabel lblTipoLog;
    private javax.swing.JLabel lblTipoLogDenunciante;
    private javax.swing.JLabel lblTipoRetorno;
    private javax.swing.JLabel lblUf;
    private javax.swing.JLabel lblUfDenunciante;
    private javax.swing.JSeparator linhaTitulo;
    private javax.swing.JRadioButton rdbtnAR;
    private javax.swing.JRadioButton rdbtnDenAnonima;
    private javax.swing.JRadioButton rdbtnDenIdentificada;
    private javax.swing.JRadioButton rdbtnEmail;
    private javax.swing.JRadioButton rdbtnTelefone;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtBairroDenunciado;
    private javax.swing.JTextField txtBairroDenunciante;
    private javax.swing.JTextField txtComplLogDenunciado;
    private javax.swing.JTextField txtComplLogDenunciante;
    private javax.swing.JTextArea txtDescDenuncia;
    private javax.swing.JTextField txtEmailDenunciante;
    private javax.swing.JTextField txtLogDenunciado;
    private javax.swing.JTextField txtLogDenunciante;
    private javax.swing.JTextField txtNomeDenunciado;
    private javax.swing.JTextField txtNomeDenunciante;
    private javax.swing.JTextField txtNumAR;
    private javax.swing.JTextField txtPtoRefDenunciado;
    public javax.swing.JTextField txtRgDenunciante;
    private javax.swing.JTextField txtnumLogDenunciado;
    private javax.swing.JTextField txtnumLogDenunciante;
    // End of variables declaration//GEN-END:variables


    
    public void LimpaFormDenuncia(){
        
        this.rdbtnDenAnonima.setSelected(false);
        this.rdbtnDenIdentificada.setSelected(false);
        this.txtNomeDenunciado.setText("");
        this.cbxTipoLogDenunciado.setSelectedItem("");
        this.txtLogDenunciado.setText("");
        this.txtnumLogDenunciado.setText("");
        this.txtComplLogDenunciado.setText("");
        this.txtBairroDenunciado.setText("");
        this.cbxMunicipioDenunciado.setSelectedItem("");
        this.cbxUFDenunciado.setSelectedItem("");
        this.txtPtoRefDenunciado.setText("");
        this.txtDescDenuncia.setText("");
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon_64.png")));
    }
    
    public void FechaFormDenuncia(){

            dispose();

    }
    public void LimpaCampos(String tipoDenuncia){
            
        if("A".equals(tipoDenuncia)){
            
            this.txtNomeDenunciante.setText("");
            this.txtRgDenunciante.setText("");
            this.jFCpfCnpj.setText("");
            this.txtEmailDenunciante.setText("");
            this.jFTelefone.setText("");
            this.cbxTipoLogDenunciante.setSelectedItem("");
            this.txtLogDenunciante.setText("");
            this.txtnumLogDenunciante.setText("");
            this.txtComplLogDenunciante.setText("");
            this.txtBairroDenunciante.setText("");
            this.cbxMunicipioDenunciante.setSelectedItem("");
            this.cbxUfDenunciante.setSelectedItem("");
            this.rdbtnAR.setSelected(false);
            this.rdbtnEmail.setSelected(false);
            this.rdbtnTelefone.setSelected(false);         
            
        }else if("I".equals(tipoDenuncia)){
            
            this.txtNomeDenunciante.setText("");
            this.txtRgDenunciante.setText("");
            this.jFCpfCnpj.setText("");
            this.txtEmailDenunciante.setText("");
            this.jFTelefone.setText("");
            this.cbxTipoLogDenunciante.setSelectedItem("");
            this.txtLogDenunciante.setText("");
            this.txtnumLogDenunciante.setText("");
            this.txtComplLogDenunciante.setText("");
            this.txtBairroDenunciante.setText("");
            this.cbxMunicipioDenunciante.setSelectedItem("");
            this.cbxUfDenunciante.setSelectedItem("");
            this.rdbtnAR.setSelected(false);
            this.rdbtnEmail.setSelected(false);
            this.rdbtnTelefone.setSelected(false);         
            this.txtNomeDenunciado.setText("");
            this.cbxTipoLogDenunciado.setSelectedItem("");
            this.txtLogDenunciado.setText("");
            this.txtnumLogDenunciado.setText("");
            this.txtComplLogDenunciado.setText("");
            this.txtBairroDenunciado.setText("");
            this.cbxMunicipioDenunciado.setSelectedItem("");
            this.cbxUFDenunciado.setSelectedItem("");
            this.txtPtoRefDenunciado.setText("");
            this.txtDescDenuncia.setText("");
        }
    }
    
    public void habilitaDenunciante(Boolean status){
        
        this.txtNomeDenunciante.setEnabled(status);
        this.txtRgDenunciante.setEnabled(status);
        this.jFCpfCnpj.setEnabled(status);
        this.txtEmailDenunciante.setEnabled(status);
        this.jFTelefone.setEnabled(status);
        this.cbxTipoLogDenunciante.setEnabled(status);
        this.txtLogDenunciante.setEnabled(status);
        this.txtnumLogDenunciante.setEnabled(status);
        this.txtComplLogDenunciante.setEnabled(status);
        this.txtBairroDenunciante.setEnabled(status);
        this.cbxMunicipioDenunciante.setEnabled(status);
        this.cbxUfDenunciante.setEnabled(status);
        this.rdbtnAR.setEnabled(status);
        this.rdbtnEmail.setEnabled(status);
        this.rdbtnTelefone.setEnabled(status);       
    }
    private String getDateTime() {
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date date = new Date();
    return dateFormat.format(date);
}
}
