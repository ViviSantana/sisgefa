/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.screen;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import model.bean.Denuncia;
import model.bean.Municipio;
import model.bean.Pessoa;
import model.bean.TipoDenuncia;
import model.bean.TipoLogradouro;
import model.dao.DenunciaDAO;

/**
 *
 * @author vivis
 */
public class FormDenuncia_old extends javax.swing.JFrame {

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

    public javax.swing.JLabel getLblIdDenunciante() {
        return lblIdDenunciante;
    }

    public void setLblIdDenunciante(javax.swing.JLabel lblIdDenunciante) {
        this.lblIdDenunciante = lblIdDenunciante;
    }

    public javax.swing.JLabel getLblIdDenunciante1() {
        return lblEnderecoDenunciante;
    }

    public void setLblIdDenunciante1(javax.swing.JLabel lblIdDenunciante1) {
        this.lblEnderecoDenunciante = lblIdDenunciante1;
    }

    public javax.swing.JLabel getLblIdDenunciante2() {
        return lblIdDenunciante2;
    }

    public void setLblIdDenunciante2(javax.swing.JLabel lblIdDenunciante2) {
        this.lblIdDenunciante2 = lblIdDenunciante2;
    }

    public javax.swing.JLabel getLblIdDenunciante3() {
        return lblIdDenunciante3;
    }

    public void setLblIdDenunciante3(javax.swing.JLabel lblIdDenunciante3) {
        this.lblIdDenunciante3 = lblIdDenunciante3;
    }

    public javax.swing.JLabel getLblIdDenunciante4() {
        return lblIdDenunciante4;
    }

    public void setLblIdDenunciante4(javax.swing.JLabel lblIdDenunciante4) {
        this.lblIdDenunciante4 = lblIdDenunciante4;
    }

    public javax.swing.JLabel getLblLocal10() {
        return lblLocal10;
    }

    public void setLblLocal10(javax.swing.JLabel lblLocal10) {
        this.lblLocal10 = lblLocal10;
    }

    public javax.swing.JLabel getLblLocal11() {
        return lblLocal11;
    }

    public void setLblLocal11(javax.swing.JLabel lblLocal11) {
        this.lblLocal11 = lblLocal11;
    }

    public javax.swing.JLabel getLblLocal12() {
        return lblLocal12;
    }

    public void setLblLocal12(javax.swing.JLabel lblLocal12) {
        this.lblLocal12 = lblLocal12;
    }

    public javax.swing.JLabel getLblLocal13() {
        return lblLocal13;
    }

    public void setLblLocal13(javax.swing.JLabel lblLocal13) {
        this.lblLocal13 = lblLocal13;
    }

    public javax.swing.JLabel getLblLocal14() {
        return lblLocal14;
    }

    public void setLblLocal14(javax.swing.JLabel lblLocal14) {
        this.lblLocal14 = lblLocal14;
    }

    public javax.swing.JLabel getLblLocal15() {
        return lblLocal15;
    }

    public void setLblLocal15(javax.swing.JLabel lblLocal15) {
        this.lblLocal15 = lblLocal15;
    }

    public javax.swing.JLabel getLblLocal16() {
        return lblLocal16;
    }

    public void setLblLocal16(javax.swing.JLabel lblLocal16) {
        this.lblLocal16 = lblLocal16;
    }

    public javax.swing.JLabel getLblLocal17() {
        return lblLocal17;
    }

    public void setLblLocal17(javax.swing.JLabel lblLocal17) {
        this.lblLocal17 = lblLocal17;
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
        return lblNomeDenunciante1;
    }

    public void setLblNomeDenunciante1(javax.swing.JLabel lblNomeDenunciante1) {
        this.lblNomeDenunciante1 = lblNomeDenunciante1;
    }

    public javax.swing.JLabel getLblNomeDenunciante2() {
        return lblNomeDenunciante2;
    }

    public void setLblNomeDenunciante2(javax.swing.JLabel lblNomeDenunciante2) {
        this.lblNomeDenunciante2 = lblNomeDenunciante2;
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
        return lnSeparaTitulo;
    }

    public void setLnSeparaTitulo(javax.swing.JSeparator lnSeparaTitulo) {
        this.lnSeparaTitulo = lnSeparaTitulo;
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

    private String motivo = null;
    private String prefContato = null;
    /**
     * Creates new form AgendaVistoria
     */
    public FormDenuncia_old() {
        initComponents();
        setIcon();
        txtNumAR.setVisible(false);
//        lblTipoDenuncia.setVisible(true);
//        rdbtnDenAnonima.setVisible(true);
//        rdbtnDenIdentificada.setVisible(true);
//        lblIdDenunciante.setVisible(false);
//        lblNomeDenunciante.setVisible(false);
//        txtNomeDenunciante.setVisible(false);
//        lblTipoRetorno.setVisible(false);
//        ckbEmail.setVisible(false);
//        ckbCarta.setVisible(false);
//        ckbLigacao.setVisible(false);
        
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
        titulo = new javax.swing.JLabel();
        lnSeparaTitulo = new javax.swing.JSeparator();
        lblTipoDenuncia = new javax.swing.JLabel();
        rdbtnDenAnonima = new javax.swing.JRadioButton();
        rdbtnDenIdentificada = new javax.swing.JRadioButton();
        lblIdDenunciante = new javax.swing.JLabel();
        lblNomeDenunciante = new javax.swing.JLabel();
        cbxTipoLogDenunciante = new javax.swing.JComboBox<>();
        txtnumLogDenunciante = new javax.swing.JTextField();
        txtComplLogDenunciante = new javax.swing.JTextField();
        lblComplLogDenunciante = new javax.swing.JLabel();
        lblNumLogDenunciante = new javax.swing.JLabel();
        lblBairroDenunciante = new javax.swing.JLabel();
        txtBairroDenunciante = new javax.swing.JTextField();
        lblMuncDenunciante = new javax.swing.JLabel();
        cbxMunicipioDenunciante = new javax.swing.JComboBox<>();
        lblUfDenunciante = new javax.swing.JLabel();
        cbxUfDenunciante = new javax.swing.JComboBox<>();
        lblTipoRetorno = new javax.swing.JLabel();
        txtNomeDenunciante = new javax.swing.JTextField();
        btnGravarDenuncia = new javax.swing.JButton();
        lblCpfCnpjDenunciante = new javax.swing.JLabel();
        txtLogDenunciante = new javax.swing.JTextField();
        lblRgDenunciante = new javax.swing.JLabel();
        lblEmailDenunciante = new javax.swing.JLabel();
        txtRgDenunciante = new javax.swing.JTextField();
        lblTipoLogDenunciante = new javax.swing.JLabel();
        lblLogDenunciante = new javax.swing.JLabel();
        lblEnderecoDenunciante = new javax.swing.JLabel();
        lblTelDenunciante = new javax.swing.JLabel();
        txtEmailDenunciante = new javax.swing.JTextField();
        lblIdDenunciante2 = new javax.swing.JLabel();
        lblNomeDenunciante1 = new javax.swing.JLabel();
        txtNomeDenunciado = new javax.swing.JTextField();
        lblLocal10 = new javax.swing.JLabel();
        cbxTipoLogDenunciado = new javax.swing.JComboBox<>();
        lblLocal11 = new javax.swing.JLabel();
        txtLogDenunciado = new javax.swing.JTextField();
        lblLocal12 = new javax.swing.JLabel();
        txtnumLogDenunciado = new javax.swing.JTextField();
        lblLocal13 = new javax.swing.JLabel();
        txtComplLogDenunciado = new javax.swing.JTextField();
        lblLocal14 = new javax.swing.JLabel();
        txtBairroDenunciado = new javax.swing.JTextField();
        lblLocal15 = new javax.swing.JLabel();
        cbxMunicipioDenunciado = new javax.swing.JComboBox<>();
        lblLocal16 = new javax.swing.JLabel();
        cbxUFDenunciado = new javax.swing.JComboBox<>();
        lblIdDenunciante3 = new javax.swing.JLabel();
        lblLocal17 = new javax.swing.JLabel();
        txtPtoRefDenunciado = new javax.swing.JTextField();
        lblIdDenunciante4 = new javax.swing.JLabel();
        lblNomeDenunciante2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescDenuncia = new javax.swing.JTextArea();
        btnFormDenunciaAnexo = new java.awt.Button();
        lblDataDenuncia = new javax.swing.JLabel();
        btnPreencher = new javax.swing.JButton();
        rdbtnEmail = new javax.swing.JRadioButton();
        rdbtnAR = new javax.swing.JRadioButton();
        rdbtnTelefone = new javax.swing.JRadioButton();
        txtNumAR = new javax.swing.JTextField();
        jFData = new javax.swing.JFormattedTextField();
        jFCpfCnpj = new javax.swing.JFormattedTextField();
        jFTelefone = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SisGeFA - Sistema de Gestão de Licenciamento e Fiscalização Ambiental");
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 1024));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Sitka Small", 0, 36)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Formulário de Denúncia");

        lblTipoDenuncia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTipoDenuncia.setText("TIPO DENÚNCIA:");

        gpbtnTipoDenuncia.add(rdbtnDenAnonima);
        rdbtnDenAnonima.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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

        lblIdDenunciante.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIdDenunciante.setText("IDENTIFICAÇÃO DO DENUNCIANTE");

        lblNomeDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNomeDenunciante.setText("Nome:");

        cbxTipoLogDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxTipoLogDenunciante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Avenida", "Alameda", "Praça", "Rua", "Travessia" }));

        txtnumLogDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnumLogDenunciante.setToolTipText("Informe o número...");
        txtnumLogDenunciante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumLogDenuncianteActionPerformed(evt);
            }
        });

        txtComplLogDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtComplLogDenunciante.setToolTipText("Informe o complemento (se houver)...");
        txtComplLogDenunciante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComplLogDenuncianteActionPerformed(evt);
            }
        });

        lblComplLogDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblComplLogDenunciante.setText("Complemento");

        lblNumLogDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNumLogDenunciante.setText("Nº");

        lblBairroDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBairroDenunciante.setText("Bairro");

        txtBairroDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBairroDenunciante.setToolTipText("Informe o bairro...");
        txtBairroDenunciante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroDenuncianteActionPerformed(evt);
            }
        });

        lblMuncDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMuncDenunciante.setText("Município");

        cbxMunicipioDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxMunicipioDenunciante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Belo Horizonte", "Corinto", "Itabirito", "João Monlevade", "Mariana", "Ouro Preto", " ", " ", " " }));

        lblUfDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUfDenunciante.setText("UF");

        cbxUfDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxUfDenunciante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Minas Gerais" }));
        cbxUfDenunciante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUfDenuncianteActionPerformed(evt);
            }
        });

        lblTipoRetorno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTipoRetorno.setText("Preferência de  Retorno:");

        txtNomeDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNomeDenunciante.setToolTipText("Informe o logradouro...");
        txtNomeDenunciante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeDenuncianteActionPerformed(evt);
            }
        });

        btnGravarDenuncia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGravarDenuncia.setText("Gravar");
        btnGravarDenuncia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarDenunciaActionPerformed(evt);
            }
        });

        lblCpfCnpjDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCpfCnpjDenunciante.setText("CPF / CNPJ:");

        txtLogDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLogDenunciante.setToolTipText("Informe o logradouro...");
        txtLogDenunciante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLogDenuncianteActionPerformed(evt);
            }
        });

        lblRgDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRgDenunciante.setText("RG:");

        lblEmailDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEmailDenunciante.setText("E-mail:");

        txtRgDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtRgDenunciante.setToolTipText("Informe o logradouro...");

        lblTipoLogDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTipoLogDenunciante.setText("Tipo");

        lblLogDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLogDenunciante.setText("Logradouro");

        lblEnderecoDenunciante.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEnderecoDenunciante.setText("ENDEREÇO DO DENUNCIANTE");

        lblTelDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTelDenunciante.setText("Telefone:");

        txtEmailDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmailDenunciante.setToolTipText("Informe o logradouro...");
        txtEmailDenunciante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailDenuncianteActionPerformed(evt);
            }
        });

        lblIdDenunciante2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIdDenunciante2.setText("DADOS DA DENÚNCIA");

        lblNomeDenunciante1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNomeDenunciante1.setText("Denunciado:");

        txtNomeDenunciado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNomeDenunciado.setToolTipText("Informe o logradouro...");
        txtNomeDenunciado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeDenunciadoActionPerformed(evt);
            }
        });

        lblLocal10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLocal10.setText("Tipo");

        cbxTipoLogDenunciado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxTipoLogDenunciado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Avenida", "Alameda", "Praça", "Rua", "Travessia" }));

        lblLocal11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLocal11.setText("Logradouro");

        txtLogDenunciado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLogDenunciado.setToolTipText("Informe o logradouro...");
        txtLogDenunciado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLogDenunciadoActionPerformed(evt);
            }
        });

        lblLocal12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLocal12.setText("Nº");

        txtnumLogDenunciado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnumLogDenunciado.setToolTipText("Informe o número...");
        txtnumLogDenunciado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumLogDenunciadoActionPerformed(evt);
            }
        });

        lblLocal13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLocal13.setText("Complemento");

        txtComplLogDenunciado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtComplLogDenunciado.setToolTipText("Informe o complemento (se houver)...");
        txtComplLogDenunciado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComplLogDenunciadoActionPerformed(evt);
            }
        });

        lblLocal14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLocal14.setText("Bairro");

        txtBairroDenunciado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBairroDenunciado.setToolTipText("Informe o bairro...");
        txtBairroDenunciado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroDenunciadoActionPerformed(evt);
            }
        });

        lblLocal15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLocal15.setText("Município");

        cbxMunicipioDenunciado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxMunicipioDenunciado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Belo Horizonte", "Corinto", "Itabirito", "João Monlevade", "Mariana", "Ouro Preto", " ", " ", " " }));

        lblLocal16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLocal16.setText("UF");

        cbxUFDenunciado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxUFDenunciado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Minas Gerais" }));

        lblIdDenunciante3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIdDenunciante3.setText("ENDEREÇO DENUNCIADO");

        lblLocal17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLocal17.setText("Pontos de Referência: ");

        txtPtoRefDenunciado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPtoRefDenunciado.setToolTipText("Informe o logradouro...");
        txtPtoRefDenunciado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPtoRefDenunciadoActionPerformed(evt);
            }
        });

        lblIdDenunciante4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIdDenunciante4.setText("FATO DENUNCIADO");

        lblNomeDenunciante2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNomeDenunciante2.setText("Descrição:");

        txtDescDenuncia.setColumns(20);
        txtDescDenuncia.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtDescDenuncia.setRows(5);
        jScrollPane2.setViewportView(txtDescDenuncia);

        btnFormDenunciaAnexo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnFormDenunciaAnexo.setLabel("Anexar Arquivo");
        btnFormDenunciaAnexo.setName("Anexar"); // NOI18N
        btnFormDenunciaAnexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormDenunciaAnexoActionPerformed(evt);
            }
        });

        lblDataDenuncia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDataDenuncia.setText("Data:");

        btnPreencher.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPreencher.setText("Preencher");
        btnPreencher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreencherActionPerformed(evt);
            }
        });

        gpbtnPrefContato.add(rdbtnEmail);
        rdbtnEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdbtnEmail.setText("E-mail");
        rdbtnEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnEmailActionPerformed(evt);
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

        gpbtnPrefContato.add(rdbtnTelefone);
        rdbtnTelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdbtnTelefone.setText("Telefone");
        rdbtnTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnTelefoneActionPerformed(evt);
            }
        });

        txtNumAR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNumAR.setToolTipText("Informe o logradouro...");
        txtNumAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumARActionPerformed(evt);
            }
        });

        try {
            jFData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        try {
            jFCpfCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFCpfCnpj.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jFCpfCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFCpfCnpjActionPerformed(evt);
            }
        });

        try {
            jFTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jFTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTelefoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 1369, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lnSeparaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 1349, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblTipoDenuncia)
                .addGap(25, 25, 25)
                .addComponent(rdbtnDenAnonima)
                .addGap(18, 18, 18)
                .addComponent(rdbtnDenIdentificada)
                .addGap(182, 182, 182)
                .addComponent(lblDataDenuncia)
                .addGap(18, 18, 18)
                .addComponent(jFData, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(223, 223, 223)
                .addComponent(btnPreencher, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnGravarDenuncia, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblIdDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblEnderecoDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(lblTipoLogDenunciante)
                .addGap(80, 80, 80)
                .addComponent(lblLogDenunciante)
                .addGap(226, 226, 226)
                .addComponent(lblNumLogDenunciante)
                .addGap(35, 35, 35)
                .addComponent(lblComplLogDenunciante)
                .addGap(59, 59, 59)
                .addComponent(lblBairroDenunciante)
                .addGap(194, 194, 194)
                .addComponent(lblMuncDenunciante)
                .addGap(171, 171, 171)
                .addComponent(lblUfDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(lblTipoRetorno)
                .addGap(18, 18, 18)
                .addComponent(rdbtnEmail)
                .addGap(36, 36, 36)
                .addComponent(rdbtnTelefone)
                .addGap(40, 40, 40)
                .addComponent(rdbtnAR)
                .addGap(6, 6, 6)
                .addComponent(txtNumAR, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblIdDenunciante2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(lblNomeDenunciante1)
                .addGap(10, 10, 10)
                .addComponent(txtNomeDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblIdDenunciante3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(lblLocal10)
                .addGap(80, 80, 80)
                .addComponent(lblLocal11)
                .addGap(226, 226, 226)
                .addComponent(lblLocal12)
                .addGap(35, 35, 35)
                .addComponent(lblLocal13)
                .addGap(59, 59, 59)
                .addComponent(lblLocal14)
                .addGap(194, 194, 194)
                .addComponent(lblLocal15)
                .addGap(171, 171, 171)
                .addComponent(lblLocal16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(cbxTipoLogDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(txtLogDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(txtnumLogDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(txtComplLogDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(txtBairroDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(cbxMunicipioDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(cbxUFDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(lblLocal17, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtPtoRefDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblIdDenunciante4, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblNomeDenunciante2))
                    .addComponent(btnFormDenunciaAnexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblNomeDenunciante)
                        .addGap(10, 10, 10)
                        .addComponent(txtNomeDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lblRgDenunciante)
                        .addGap(10, 10, 10)
                        .addComponent(txtRgDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lblCpfCnpjDenunciante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(lblEmailDenunciante)
                        .addGap(10, 10, 10)
                        .addComponent(txtEmailDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(lblTelDenunciante)
                        .addGap(18, 18, 18)
                        .addComponent(jFTelefone))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbxTipoLogDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtLogDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtnumLogDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtComplLogDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtBairroDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(cbxMunicipioDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(cbxUfDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(titulo)
                .addGap(1, 1, 1)
                .addComponent(lnSeparaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(lblTipoDenuncia))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(rdbtnDenAnonima))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(rdbtnDenIdentificada))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDataDenuncia)
                            .addComponent(jFData, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnPreencher, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnGravarDenuncia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addComponent(lblIdDenunciante)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblNomeDenunciante))
                    .addComponent(txtNomeDenunciante, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(lblRgDenunciante))
                    .addComponent(txtRgDenunciante, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblCpfCnpjDenunciante))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmailDenunciante)
                            .addComponent(jFCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblTelDenunciante))
                    .addComponent(txtEmailDenunciante, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jFTelefone, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(28, 28, 28)
                .addComponent(lblEnderecoDenunciante)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipoLogDenunciante)
                    .addComponent(lblLogDenunciante)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblNumLogDenunciante))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblComplLogDenunciante))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblBairroDenunciante))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblMuncDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblUfDenunciante)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxTipoLogDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLogDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnumLogDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComplLogDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairroDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxMunicipioDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxUfDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblTipoRetorno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(rdbtnEmail))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(rdbtnTelefone))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(rdbtnAR))
                    .addComponent(txtNumAR, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(lblIdDenunciante2)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblNomeDenunciante1))
                    .addComponent(txtNomeDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(lblIdDenunciante3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLocal10)
                    .addComponent(lblLocal11)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblLocal12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblLocal13))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblLocal14))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblLocal15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblLocal16)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxTipoLogDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLogDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnumLogDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComplLogDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairroDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxMunicipioDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxUFDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblLocal17))
                    .addComponent(txtPtoRefDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(lblIdDenunciante4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNomeDenunciante2)
                        .addGap(63, 63, 63)
                        .addComponent(btnFormDenunciaAnexo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtnumLogDenuncianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumLogDenuncianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumLogDenuncianteActionPerformed

    private void txtComplLogDenuncianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComplLogDenuncianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComplLogDenuncianteActionPerformed

    private void txtNomeDenuncianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeDenuncianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeDenuncianteActionPerformed

    private void btnGravarDenunciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarDenunciaActionPerformed
        
        
        DenunciaDAO ddao = new DenunciaDAO();
        
        if(getRdbtnDenAnonima().isSelected()){
            
            TipoDenuncia tipoD = new TipoDenuncia("A", "Anônima");
            
            TipoLogradouro tipoL = new TipoLogradouro();
            tipoL.setCodigo(ddao.RetornaIdTipoLog(getCbxTipoLogDenunciado().getSelectedItem().toString()));
            
            Municipio municipio = new Municipio(ddao.RetornaIdMunicipio(getCbxMunicipioDenunciado().getSelectedItem().toString()), getCbxMunicipioDenunciado().getSelectedItem().toString(), ddao.RetornaUfMunicipio(ddao.RetornaIdMunicipio(getCbxMunicipioDenunciado().getSelectedItem().toString())));
            
            Denuncia denuncia = new Denuncia(tipoD, jFData.getText(),txtNomeDenunciado.getText(), tipoL , txtLogDenunciado.getText(), Integer.parseInt(txtnumLogDenunciado.getText()), txtComplLogDenunciado.getText(), txtBairroDenunciado.getText(), municipio, municipio.getUf(), txtPtoRefDenunciado.getText(), txtDescDenuncia.getText());
        
            if(ddao.InsereDenunciaAn(denuncia) == true){
                
                int protocoloDenuncia = ddao.RetornaProtocolo(denuncia);
                
                FechaFormDenuncia();
                
                JOptionPane.showMessageDialog(null, "Denúncia gravada com sucesso. \n Protocolo: 00000"+protocoloDenuncia);
        }
        
        }else if(getRdbtnDenIdentificada().isSelected()){
            
            TipoDenuncia tipoD = new TipoDenuncia("I", "Identificada");
            
            TipoLogradouro tipoL = new TipoLogradouro();
            tipoL.setCodigo(ddao.RetornaIdTipoLog(getCbxTipoLogDenunciado().getSelectedItem().toString()));
            
            Municipio municDenunciante = new Municipio(ddao.RetornaIdMunicipio(getCbxMunicipioDenunciante().getSelectedItem().toString()), getCbxMunicipioDenunciante().getSelectedItem().toString(), ddao.RetornaUfMunicipio(ddao.RetornaIdMunicipio(getCbxMunicipioDenunciante().getSelectedItem().toString())));
            
            Municipio municDenunciado = new Municipio(ddao.RetornaIdMunicipio(getCbxMunicipioDenunciado().getSelectedItem().toString()), getCbxMunicipioDenunciado().getSelectedItem().toString(), ddao.RetornaUfMunicipio(ddao.RetornaIdMunicipio(getCbxMunicipioDenunciado().getSelectedItem().toString())));
            
            //Verifica opção de preferência de retorno
            //e seta na variável prefContato
                if(rdbtnEmail.isSelected()){
                    prefContato = "E-mail";
                }else if(rdbtnTelefone.isSelected()){
                    prefContato = "Telefone";
                }
                else if(rdbtnAR.isSelected()){
                    prefContato = "AR";
                    txtNumAR.setVisible(true);
                }
            //
            
            Pessoa denunciante = new Pessoa(txtNomeDenunciante.getText(), txtRgDenunciante.getText(), jFCpfCnpj.getText(), txtEmailDenunciante.getText(), jFTelefone.getText(), tipoL, txtLogDenunciante.getText(), Integer.parseInt(txtnumLogDenunciante.getText()), txtComplLogDenunciante.getText(), txtBairroDenunciante.getText(), municDenunciante, municDenunciante.getUf(), prefContato);
            
            Denuncia denuncia = new Denuncia(tipoD, jFData.getText(), denunciante, txtNomeDenunciado.getText(), tipoL , txtLogDenunciado.getText(), Integer.parseInt(txtnumLogDenunciado.getText()), txtComplLogDenunciado.getText(), txtBairroDenunciado.getText(), municDenunciado, municDenunciado.getUf(), txtPtoRefDenunciado.getText(), txtDescDenuncia.getText());

                if(ddao.InsereDenunciaAn(denuncia) == true){
                    
                    int protocoloDenuncia = ddao.RetornaProtocolo(denuncia);
                    
                    FechaFormDenuncia();
                    
                    JOptionPane.showMessageDialog(null, "Denúncia gravada com sucesso. \n Protocolo: 00000"+protocoloDenuncia);
            }
        
        }
    }//GEN-LAST:event_btnGravarDenunciaActionPerformed

    private void txtBairroDenuncianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroDenuncianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroDenuncianteActionPerformed

    private void rdbtnDenAnonimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnDenAnonimaActionPerformed
       
        this.rdbtnDenIdentificada.setSelected(false);
        this.lblIdDenunciante.setVisible(false);
        this.lblNomeDenunciante.setVisible(false);
        this.txtNomeDenunciante.setVisible(false);
        this.lblRgDenunciante.setVisible(false);
        this.txtRgDenunciante.setVisible(false);
        this.lblCpfCnpjDenunciante.setVisible(false);
        this.jFCpfCnpj.setVisible(false);
        this.lblEmailDenunciante.setVisible(false);
        this.txtEmailDenunciante.setVisible(false);
        this.lblTelDenunciante.setVisible(false);
        this.jFTelefone.setVisible(false);
        this.lblEnderecoDenunciante.setVisible(false);
        this.lblTipoLogDenunciante.setVisible(false);
        this.cbxTipoLogDenunciante.setVisible(false);
        this.lblLogDenunciante.setVisible(false);
        this.txtLogDenunciante.setVisible(false);
        this.lblNumLogDenunciante.setVisible(false);
        this.txtnumLogDenunciante.setVisible(false);
        this.lblComplLogDenunciante.setVisible(false);
        this.txtComplLogDenunciante.setVisible(false);
        this.lblBairroDenunciante.setVisible(false);
        this.txtBairroDenunciante.setVisible(false);
        this.lblMuncDenunciante.setVisible(false);
        this.cbxMunicipioDenunciante.setVisible(false);
        this.lblUfDenunciante.setVisible(false);
        this.cbxUfDenunciante.setVisible(false);
        this.lblTipoRetorno.setVisible(false);
        this.rdbtnAR.setVisible(false);
        this.rdbtnEmail.setVisible(false);
        this.rdbtnTelefone.setVisible(false);
        
        
        //Limpa os dados
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
        
      
    }//GEN-LAST:event_rdbtnDenAnonimaActionPerformed

    private void rdbtnDenIdentificadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnDenIdentificadaActionPerformed

        this.rdbtnDenAnonima.setSelected(false);
        this.lblIdDenunciante.setVisible(true);
        this.lblNomeDenunciante.setVisible(true);
        this.txtNomeDenunciante.setVisible(true);
        this.lblRgDenunciante.setVisible(true);
        this.txtRgDenunciante.setVisible(true);
        this.lblCpfCnpjDenunciante.setVisible(true);
        this.jFCpfCnpj.setVisible(true);
        this.lblEmailDenunciante.setVisible(true);
        this.txtEmailDenunciante.setVisible(true);
        this.lblTelDenunciante.setVisible(true);
        this.jFTelefone.setVisible(true);
        this.lblEnderecoDenunciante.setVisible(true);
        this.lblTipoLogDenunciante.setVisible(true);
        this.cbxTipoLogDenunciante.setVisible(true);
        this.lblLogDenunciante.setVisible(true);
        this.txtLogDenunciante.setVisible(true);
        this.lblNumLogDenunciante.setVisible(true);
        this.txtnumLogDenunciante.setVisible(true);
        this.lblComplLogDenunciante.setVisible(true);
        this.txtComplLogDenunciante.setVisible(true);
        this.lblBairroDenunciante.setVisible(true);
        this.txtBairroDenunciante.setVisible(true);
        this.lblMuncDenunciante.setVisible(true);
        this.cbxMunicipioDenunciante.setVisible(true);
        this.lblUfDenunciante.setVisible(true);
        this.cbxUfDenunciante.setVisible(true);
        this.lblTipoRetorno.setVisible(true);
        this.rdbtnAR.setVisible(true);
        this.rdbtnEmail.setVisible(true);
        this.rdbtnTelefone.setVisible(true);
        
        //Limpa os dados ao mudar a identificação
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
        
        
    }//GEN-LAST:event_rdbtnDenIdentificadaActionPerformed

    private void txtLogDenuncianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLogDenuncianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLogDenuncianteActionPerformed

    private void txtEmailDenuncianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailDenuncianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailDenuncianteActionPerformed

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
        
            this.jFData.setText("01/12/2019");
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
            this.jFData.setText("01/12/2019");
            this.txtNomeDenunciante.setText("Guy Santana");
            this.txtRgDenunciante.setText("MG11223344");
            this.jFCpfCnpj .setText("99999999999");
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

    private void rdbtnEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnEmailActionPerformed

    private void rdbtnARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnARActionPerformed
        txtNumAR.setVisible(true);
    }//GEN-LAST:event_rdbtnARActionPerformed

    private void rdbtnTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnTelefoneActionPerformed

    private void txtNumARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumARActionPerformed

    private void cbxUfDenuncianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxUfDenuncianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxUfDenuncianteActionPerformed

    private void jFCpfCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFCpfCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFCpfCnpjActionPerformed

    private void jFTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTelefoneActionPerformed

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
            java.util.logging.Logger.getLogger(FormDenuncia_old.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDenuncia_old.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDenuncia_old.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDenuncia_old.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDenuncia_old().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnFormDenunciaAnexo;
    private javax.swing.JButton btnGravarDenuncia;
    private javax.swing.JButton btnPreencher;
    private javax.swing.JComboBox<String> cbxMunicipioDenunciado;
    private javax.swing.JComboBox<String> cbxMunicipioDenunciante;
    private javax.swing.JComboBox<String> cbxTipoLogDenunciado;
    private javax.swing.JComboBox<String> cbxTipoLogDenunciante;
    private javax.swing.JComboBox<String> cbxUFDenunciado;
    private javax.swing.JComboBox<String> cbxUfDenunciante;
    private javax.swing.ButtonGroup gpbtnPrefContato;
    private javax.swing.ButtonGroup gpbtnTipoDenuncia;
    private javax.swing.JFormattedTextField jFCpfCnpj;
    private javax.swing.JFormattedTextField jFData;
    private javax.swing.JFormattedTextField jFTelefone;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBairroDenunciante;
    private javax.swing.JLabel lblComplLogDenunciante;
    private javax.swing.JLabel lblCpfCnpjDenunciante;
    private javax.swing.JLabel lblDataDenuncia;
    private javax.swing.JLabel lblEmailDenunciante;
    private javax.swing.JLabel lblEnderecoDenunciante;
    private javax.swing.JLabel lblIdDenunciante;
    private javax.swing.JLabel lblIdDenunciante2;
    private javax.swing.JLabel lblIdDenunciante3;
    private javax.swing.JLabel lblIdDenunciante4;
    private javax.swing.JLabel lblLocal10;
    private javax.swing.JLabel lblLocal11;
    private javax.swing.JLabel lblLocal12;
    private javax.swing.JLabel lblLocal13;
    private javax.swing.JLabel lblLocal14;
    private javax.swing.JLabel lblLocal15;
    private javax.swing.JLabel lblLocal16;
    private javax.swing.JLabel lblLocal17;
    private javax.swing.JLabel lblLogDenunciante;
    private javax.swing.JLabel lblMuncDenunciante;
    private javax.swing.JLabel lblNomeDenunciante;
    private javax.swing.JLabel lblNomeDenunciante1;
    private javax.swing.JLabel lblNomeDenunciante2;
    private javax.swing.JLabel lblNumLogDenunciante;
    private javax.swing.JLabel lblRgDenunciante;
    private javax.swing.JLabel lblTelDenunciante;
    private javax.swing.JLabel lblTipoDenuncia;
    private javax.swing.JLabel lblTipoLogDenunciante;
    private javax.swing.JLabel lblTipoRetorno;
    private javax.swing.JLabel lblUfDenunciante;
    private javax.swing.JSeparator lnSeparaTitulo;
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

    /**
     * @return the motivo
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * @param motivo the motivo to set
     */
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
    public void LimpaFormDenuncia(){
        
        this.getRdbtnDenAnonima().setSelected(false);
        this.getRdbtnDenIdentificada().setSelected(false);
        this.getTxtNomeDenunciado().setText("");
        this.getCbxTipoLogDenunciado().setSelectedItem("");
        this.getTxtLogDenunciado().setText("");
        this.getTxtnumLogDenunciado().setText("");
        this.getTxtComplLogDenunciado().setText("");
        this.getTxtBairroDenunciado().setText("");
        this.getCbxMunicipioDenunciado().setSelectedItem("");
        this.getCbxUFDenunciado().setSelectedItem("");
        this.getTxtPtoRefDenunciado().setText("");
        this.getTxtDescDenuncia().setText("");
    }
    
    
    public void FechaFormDenuncia(){
        
        dispose();
        
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

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
    
    
}
