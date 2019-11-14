package model.screen;

import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Denuncia;
import model.dao.DenunciaDAO;


public class PesqDenuncia extends javax.swing.JFrame {

    public JButton getBtnNovaDenuncia() {
        return btnNovaDenuncia;
    }

    public JButton getBtnPesqDenuncia() {
        return btnPesqDenuncia;
    }

    public JComboBox<String> getCbxStatusDenuncia() {
        return cbxStatusDenuncia;
    }

    public JTable getjTResultPesq() {
        return jTResultPesq;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public JPanel getjPTitulo() {
        return jPTitulo;
    }

    public JPanel getjPFiltrosDenunciante() {
        return jPFiltrosDenunciante;
    }

    public JPanel getjPFiltrosDenuncia() {
        return jPFiltrosDenuncia;
    }

    public JPanel getjPFiltros() {
        return jPFiltros;
    }

    public JPanel getjPBotoes() {
        return jPBotoes;
    }

    public JFormattedTextField getjFData1() {
        return jFIdDenuncia;
    }

    public JFormattedTextField getjFData() {
        return jFData;
    }

    public JFormattedTextField getjFCpfCnpj() {
        return jFCpfCnpj;
    }

    public JTextField getTxtDescDenuncia() {
        return txtDescDenuncia;
    }

    public JLabel getLblUfDenunciante() {
        return lblUfDenunciante;
    }

    public JLabel getLblMuncDenunciante() {
        return lblMuncDenunciante;
    }

    public JLabel getLblStatusDenuncia() {
        return lblStatusDenuncia;
    }

    public JLabel getLblTipoDenuncia1() {
        return lblTipoDenuncia1;
    }

    
    public javax.swing.JComboBox<String> getCbxUfDenunciante() {
        return cbxUfDenunciante;
    }

    public void setCbxUfDenunciante(javax.swing.JComboBox<String> cbxUfDenunciante) {
        this.cbxUfDenunciante = cbxUfDenunciante;
    }

    public javax.swing.JButton getBtnGravarDenuncia() {
        return btnPesqDenuncia;
    }

    public void setBtnGravarDenuncia(javax.swing.JButton btnGravarDenuncia) {
        this.btnPesqDenuncia = btnGravarDenuncia;
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

    public void setBtnNovaDenuncia(JButton btnNovaDenuncia) {
        this.btnNovaDenuncia = btnNovaDenuncia;
    }

    public void setBtnPesqDenuncia(JButton btnPesqDenuncia) {
        this.btnPesqDenuncia = btnPesqDenuncia;
    }

    public void setCbxStatusDenuncia(JComboBox<String> cbxStatusDenuncia) {
        this.cbxStatusDenuncia = cbxStatusDenuncia;
    }

    public void setGpbtnPrefContato(ButtonGroup gpbtnPrefContato) {
        this.gpbtnPrefContato = gpbtnPrefContato;
    }

    public void setjFCpfCnpj(JFormattedTextField jFCpfCnpj) {
        this.jFCpfCnpj = jFCpfCnpj;
    }

    @Override
    public void setJMenuBar(JMenuBar jmb) {
        super.setJMenuBar(jmb); //To change body of generated methods, choose Tools | Templates.
    }

    public void setjFData(JFormattedTextField jFData) {
        this.jFData = jFData;
    }

    public void setjFData1(JFormattedTextField jFData1) {
        this.jFIdDenuncia = jFData1;
    }

    public void setjPBotoes(JPanel jPBotoes) {
        this.jPBotoes = jPBotoes;
    }

    public void setjPFiltros(JPanel jPFiltros) {
        this.jPFiltros = jPFiltros;
    }

    public void setjPFiltrosDenuncia(JPanel jPFiltrosDenuncia) {
        this.jPFiltrosDenuncia = jPFiltrosDenuncia;
    }

    public void setjPFiltrosDenunciante(JPanel jPFiltrosDenunciante) {
        this.jPFiltrosDenunciante = jPFiltrosDenunciante;
    }

    public void setjPTitulo(JPanel jPTitulo) {
        this.jPTitulo = jPTitulo;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public void setjTResultPesq(JTable jTResultPesq) {
        this.jTResultPesq = jTResultPesq;
    }

    public void setLblMuncDenunciante(JLabel lblMuncDenunciante) {
        this.lblMuncDenunciante = lblMuncDenunciante;
    }

    public void setLblTipoDenuncia1(JLabel lblTipoDenuncia1) {
        this.lblTipoDenuncia1 = lblTipoDenuncia1;
    }

    public void setLblUfDenunciante(JLabel lblUfDenunciante) {
        this.lblUfDenunciante = lblUfDenunciante;
    }

    public void setLblStatusDenuncia(JLabel lblStatusDenuncia) {
        this.lblStatusDenuncia = lblStatusDenuncia;
    }

    public void setTxtDescDenuncia(JTextField txtDescDenuncia) {
        this.txtDescDenuncia = txtDescDenuncia;
    }
    
    public void setLblLocal16(javax.swing.JLabel lblLocal16) {
        this.lblLocal16 = lblLocal16;
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

    public javax.swing.JLabel getLblTipoDenuncia() {
        return lblTipoDenuncia;
    }

    public void setLblTipoDenuncia(javax.swing.JLabel lblTipoDenuncia) {
        this.lblTipoDenuncia = lblTipoDenuncia;
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

    public JFormattedTextField getjFIdDenuncia() {
        return jFIdDenuncia;
    }

    public void setjFIdDenuncia(JFormattedTextField jFIdDenuncia) {
        this.jFIdDenuncia = jFIdDenuncia;
    }
    

    private String motivo = null;
    private String prefContato = null;
    /**
     * Creates new form AgendaVistoria
     */
    public PesqDenuncia() {
        initComponents();
        setIcon();
        jFData.setText(getDateTime());
        DefaultTableModel model = (DefaultTableModel) jTResultPesq.getModel();
        model.setNumRows(0);
        //CarregaTabela();

        
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
        jPFiltros = new javax.swing.JPanel();
        jPFiltrosDenunciante = new javax.swing.JPanel();
        txtNomeDenunciante = new javax.swing.JTextField();
        cbxUfDenunciante = new javax.swing.JComboBox<>();
        lblUfDenunciante = new javax.swing.JLabel();
        cbxMunicipioDenunciante = new javax.swing.JComboBox<>();
        lblMuncDenunciante = new javax.swing.JLabel();
        jFCpfCnpj = new javax.swing.JFormattedTextField();
        lblCpfCnpjDenunciante = new javax.swing.JLabel();
        lblNomeDenunciante = new javax.swing.JLabel();
        jPFiltrosDenuncia = new javax.swing.JPanel();
        lblNomeDenunciante1 = new javax.swing.JLabel();
        txtNomeDenunciado = new javax.swing.JTextField();
        lblNomeDenunciante2 = new javax.swing.JLabel();
        txtDescDenuncia = new javax.swing.JTextField();
        lblLocal14 = new javax.swing.JLabel();
        txtBairroDenunciado = new javax.swing.JTextField();
        lblLocal15 = new javax.swing.JLabel();
        cbxMunicipioDenunciado = new javax.swing.JComboBox<>();
        cbxUFDenunciado = new javax.swing.JComboBox<>();
        lblLocal16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblTipoDenuncia1 = new javax.swing.JLabel();
        jFIdDenuncia = new javax.swing.JFormattedTextField();
        lblTipoDenuncia = new javax.swing.JLabel();
        rdbtnDenAnonima = new javax.swing.JRadioButton();
        rdbtnDenIdentificada = new javax.swing.JRadioButton();
        lblDataDenuncia = new javax.swing.JLabel();
        jFData = new javax.swing.JFormattedTextField();
        lblStatusDenuncia = new javax.swing.JLabel();
        cbxStatusDenuncia = new javax.swing.JComboBox<>();
        jPTitulo = new javax.swing.JPanel();
        lnSeparaTitulo = new javax.swing.JSeparator();
        titulo = new javax.swing.JLabel();
        jPBotoes = new javax.swing.JPanel();
        btnPreencher = new javax.swing.JButton();
        btnPesqDenuncia = new javax.swing.JButton();
        btnNovaDenuncia = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTResultPesq = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SisGeFA - Sistema de Gestão de Licenciamento e Fiscalização Ambiental");
        setMaximumSize(new java.awt.Dimension(1060, 950));
        setPreferredSize(new java.awt.Dimension(1060, 950));
        setResizable(false);
        setSize(new java.awt.Dimension(1060, 950));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPFiltros.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FILTROS DE PESQUISA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jPFiltrosDenunciante.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DADOS DENUNCIANTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        txtNomeDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNomeDenunciante.setToolTipText("Informe o logradouro...");
        txtNomeDenunciante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeDenuncianteActionPerformed(evt);
            }
        });

        cbxUfDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxUfDenunciante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Minas Gerais" }));
        cbxUfDenunciante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUfDenuncianteActionPerformed(evt);
            }
        });

        lblUfDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUfDenunciante.setText("UF:");

        cbxMunicipioDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxMunicipioDenunciante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Belo Horizonte", "Corinto", "Itabirito", "João Monlevade", "Mariana", "Ouro Preto" }));

        lblMuncDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMuncDenunciante.setText("Município:");

        try {
            jFCpfCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFCpfCnpj.setMinimumSize(new java.awt.Dimension(6, 23));
        jFCpfCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFCpfCnpjActionPerformed(evt);
            }
        });

        lblCpfCnpjDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCpfCnpjDenunciante.setText("CPF / CNPJ:");

        lblNomeDenunciante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNomeDenunciante.setText("Denunciante:");

        javax.swing.GroupLayout jPFiltrosDenuncianteLayout = new javax.swing.GroupLayout(jPFiltrosDenunciante);
        jPFiltrosDenunciante.setLayout(jPFiltrosDenuncianteLayout);
        jPFiltrosDenuncianteLayout.setHorizontalGroup(
            jPFiltrosDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFiltrosDenuncianteLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPFiltrosDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomeDenunciante)
                    .addGroup(jPFiltrosDenuncianteLayout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addGroup(jPFiltrosDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCpfCnpjDenunciante))
                        .addGap(10, 10, 10)
                        .addGroup(jPFiltrosDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMuncDenunciante)
                            .addComponent(cbxMunicipioDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPFiltrosDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUfDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxUfDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPFiltrosDenuncianteLayout.setVerticalGroup(
            jPFiltrosDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFiltrosDenuncianteLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPFiltrosDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPFiltrosDenuncianteLayout.createSequentialGroup()
                        .addComponent(lblNomeDenunciante)
                        .addGap(0, 0, 0)
                        .addComponent(txtNomeDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPFiltrosDenuncianteLayout.createSequentialGroup()
                        .addComponent(lblCpfCnpjDenunciante)
                        .addGap(27, 27, 27))
                    .addGroup(jPFiltrosDenuncianteLayout.createSequentialGroup()
                        .addGroup(jPFiltrosDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMuncDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUfDenunciante))
                        .addGap(0, 0, 0)
                        .addGroup(jPFiltrosDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPFiltrosDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbxMunicipioDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbxUfDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jFCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10))
        );

        jPFiltrosDenuncia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DADOS DENÚNCIA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        lblNomeDenunciante1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNomeDenunciante1.setText("Denunciado:");

        txtNomeDenunciado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNomeDenunciado.setToolTipText("Informe o logradouro...");
        txtNomeDenunciado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeDenunciadoActionPerformed(evt);
            }
        });

        lblNomeDenunciante2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNomeDenunciante2.setText("Descrição:");

        txtDescDenuncia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDescDenuncia.setToolTipText("Informe o logradouro...");
        txtDescDenuncia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescDenunciaActionPerformed(evt);
            }
        });

        lblLocal14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLocal14.setText("Bairro:");

        txtBairroDenunciado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBairroDenunciado.setToolTipText("Informe o bairro...");
        txtBairroDenunciado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroDenunciadoActionPerformed(evt);
            }
        });

        lblLocal15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLocal15.setText("Município:");

        cbxMunicipioDenunciado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxMunicipioDenunciado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Belo Horizonte", "Corinto", "Itabirito", "João Monlevade", "Mariana", "Ouro Preto" }));

        cbxUFDenunciado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxUFDenunciado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Minas Gerais" }));

        lblLocal16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLocal16.setText("UF:");

        javax.swing.GroupLayout jPFiltrosDenunciaLayout = new javax.swing.GroupLayout(jPFiltrosDenuncia);
        jPFiltrosDenuncia.setLayout(jPFiltrosDenunciaLayout);
        jPFiltrosDenunciaLayout.setHorizontalGroup(
            jPFiltrosDenunciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFiltrosDenunciaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPFiltrosDenunciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDescDenuncia, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomeDenunciante2)
                    .addGroup(jPFiltrosDenunciaLayout.createSequentialGroup()
                        .addGroup(jPFiltrosDenunciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNomeDenunciante1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPFiltrosDenunciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBairroDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLocal14))
                        .addGap(10, 10, 10)
                        .addGroup(jPFiltrosDenunciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxMunicipioDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLocal15))
                        .addGap(18, 18, 18)
                        .addGroup(jPFiltrosDenunciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxUFDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLocal16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPFiltrosDenunciaLayout.setVerticalGroup(
            jPFiltrosDenunciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFiltrosDenunciaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPFiltrosDenunciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeDenunciante1)
                    .addComponent(lblLocal14)
                    .addGroup(jPFiltrosDenunciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblLocal15)
                        .addComponent(lblLocal16)))
                .addGap(0, 0, 0)
                .addGroup(jPFiltrosDenunciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairroDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxMunicipioDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxUFDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblNomeDenunciante2)
                .addGap(0, 0, 0)
                .addComponent(txtDescDenuncia, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setEnabled(false);

        lblTipoDenuncia1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTipoDenuncia1.setText("Protocolo:");

        try {
            jFIdDenuncia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFIdDenuncia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jFIdDenuncia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFIdDenunciaActionPerformed(evt);
            }
        });

        lblTipoDenuncia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTipoDenuncia.setText("Tipo Denúncia:");

        gpbtnTipoDenuncia.add(rdbtnDenAnonima);
        rdbtnDenAnonima.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdbtnDenAnonima.setText("Anônima");
        rdbtnDenAnonima.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rdbtnDenAnonima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnDenAnonimaActionPerformed(evt);
            }
        });

        gpbtnTipoDenuncia.add(rdbtnDenIdentificada);
        rdbtnDenIdentificada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdbtnDenIdentificada.setText("Identificada");
        rdbtnDenIdentificada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rdbtnDenIdentificada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnDenIdentificadaActionPerformed(evt);
            }
        });

        lblDataDenuncia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDataDenuncia.setText("Data:");

        try {
            jFData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblStatusDenuncia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblStatusDenuncia.setText("Status:");

        cbxStatusDenuncia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxStatusDenuncia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Nova", "Encaminhada", "Aguardando Vistoria", "Atendida", "Finalizada" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFIdDenuncia, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipoDenuncia1))
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipoDenuncia)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdbtnDenAnonima)
                        .addGap(10, 10, 10)
                        .addComponent(rdbtnDenIdentificada)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFData, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDataDenuncia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStatusDenuncia)
                    .addComponent(cbxStatusDenuncia, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTipoDenuncia)
                        .addComponent(lblTipoDenuncia1))
                    .addComponent(lblDataDenuncia)
                    .addComponent(lblStatusDenuncia))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rdbtnDenAnonima)
                                .addComponent(jFIdDenuncia, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rdbtnDenIdentificada)))
                    .addComponent(jFData, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxStatusDenuncia, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPFiltrosLayout = new javax.swing.GroupLayout(jPFiltros);
        jPFiltros.setLayout(jPFiltrosLayout);
        jPFiltrosLayout.setHorizontalGroup(
            jPFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFiltrosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPFiltrosDenunciante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPFiltrosDenuncia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPFiltrosLayout.setVerticalGroup(
            jPFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFiltrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPFiltrosDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPFiltrosDenuncia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        titulo.setFont(new java.awt.Font("Sitka Small", 0, 36)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Pesquisa Denúncia");

        javax.swing.GroupLayout jPTituloLayout = new javax.swing.GroupLayout(jPTitulo);
        jPTitulo.setLayout(jPTituloLayout);
        jPTituloLayout.setHorizontalGroup(
            jPTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lnSeparaTitulo)
                .addContainerGap())
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
        );
        jPTituloLayout.setVerticalGroup(
            jPTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTituloLayout.createSequentialGroup()
                .addComponent(titulo)
                .addGap(1, 1, 1)
                .addComponent(lnSeparaTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 9, Short.MAX_VALUE))
        );

        btnPreencher.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPreencher.setText("Preencher");
        btnPreencher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreencherActionPerformed(evt);
            }
        });

        btnPesqDenuncia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPesqDenuncia.setText("Pesquisar");
        btnPesqDenuncia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqDenunciaActionPerformed(evt);
            }
        });

        btnNovaDenuncia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNovaDenuncia.setText("Novo");
        btnNovaDenuncia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaDenunciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPBotoesLayout = new javax.swing.GroupLayout(jPBotoes);
        jPBotoes.setLayout(jPBotoesLayout);
        jPBotoesLayout.setHorizontalGroup(
            jPBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPBotoesLayout.createSequentialGroup()
                .addContainerGap(666, Short.MAX_VALUE)
                .addComponent(btnPreencher, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnPesqDenuncia, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnNovaDenuncia, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPBotoesLayout.setVerticalGroup(
            jPBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBotoesLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPreencher, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPesqDenuncia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNovaDenuncia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );

        jTResultPesq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Protocolo", "Data", "Tipo Denúncia", "Denunciante", "Denunciado", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTResultPesq.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(jTResultPesq);
        jTResultPesq.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPFiltros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jPFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeDenuncianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeDenuncianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeDenuncianteActionPerformed

    private void btnPesqDenunciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqDenunciaActionPerformed
        LimpaFiltros();
        CarregaTabela();

        
    }//GEN-LAST:event_btnPesqDenunciaActionPerformed

    private void rdbtnDenAnonimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnDenAnonimaActionPerformed
       
        this.jPFiltrosDenunciante.setVisible(false);
      
    }//GEN-LAST:event_rdbtnDenAnonimaActionPerformed

    private void rdbtnDenIdentificadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnDenIdentificadaActionPerformed

        this.jPFiltrosDenunciante.setVisible(true);
        
    }//GEN-LAST:event_rdbtnDenIdentificadaActionPerformed

    private void txtNomeDenunciadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeDenunciadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeDenunciadoActionPerformed

    private void txtBairroDenunciadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroDenunciadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroDenunciadoActionPerformed

    private void btnPreencherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreencherActionPerformed
        if(rdbtnDenAnonima.isSelected()){
        

            this.txtNomeDenunciado.setText("Peixaria da Tilápia");
            this.txtBairroDenunciado.setText("Pescador");
            this.cbxMunicipioDenunciado.setSelectedItem("Itabirito");
            this.cbxUFDenunciado.setSelectedItem("Minas Gerais");
            this.txtDescDenuncia.setText("Musica alta");

        }else if(rdbtnDenIdentificada.isSelected()){

            this.txtNomeDenunciante.setText("Guy Santana");
            this.jFCpfCnpj.setText("99999999999");
            this.cbxMunicipioDenunciante.setSelectedItem("Belo Horizonte");
            this.cbxUfDenunciante.setSelectedItem("Minas Gerais");
            this.txtNomeDenunciado.setText("Peixaria da Tilápia");
            this.txtBairroDenunciado.setText("Pescador");
            this.cbxMunicipioDenunciado.setSelectedItem("Itabirito");
            this.cbxUFDenunciado.setSelectedItem("Minas Gerais");
            this.txtDescDenuncia.setText("Música muito alta");
        
       }
    }//GEN-LAST:event_btnPreencherActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void cbxUfDenuncianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxUfDenuncianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxUfDenuncianteActionPerformed

    private void txtDescDenunciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescDenunciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescDenunciaActionPerformed

    private void jFCpfCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFCpfCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFCpfCnpjActionPerformed

    private void btnNovaDenunciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaDenunciaActionPerformed
        
        FechaFormDenuncia();
    
        new FormDenuncia().setVisible(true);


    }//GEN-LAST:event_btnNovaDenunciaActionPerformed

    private void jFIdDenunciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFIdDenunciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFIdDenunciaActionPerformed

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
            java.util.logging.Logger.getLogger(PesqDenuncia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesqDenuncia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesqDenuncia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesqDenuncia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesqDenuncia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNovaDenuncia;
    private javax.swing.JButton btnPesqDenuncia;
    private javax.swing.JButton btnPreencher;
    private javax.swing.JComboBox<String> cbxMunicipioDenunciado;
    private javax.swing.JComboBox<String> cbxMunicipioDenunciante;
    private javax.swing.JComboBox<String> cbxStatusDenuncia;
    private javax.swing.JComboBox<String> cbxUFDenunciado;
    private javax.swing.JComboBox<String> cbxUfDenunciante;
    private javax.swing.ButtonGroup gpbtnPrefContato;
    private javax.swing.ButtonGroup gpbtnTipoDenuncia;
    private javax.swing.JFormattedTextField jFCpfCnpj;
    private javax.swing.JFormattedTextField jFData;
    private javax.swing.JFormattedTextField jFIdDenuncia;
    private javax.swing.JPanel jPBotoes;
    private javax.swing.JPanel jPFiltros;
    private javax.swing.JPanel jPFiltrosDenuncia;
    private javax.swing.JPanel jPFiltrosDenunciante;
    private javax.swing.JPanel jPTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTResultPesq;
    private javax.swing.JLabel lblCpfCnpjDenunciante;
    private javax.swing.JLabel lblDataDenuncia;
    private javax.swing.JLabel lblLocal14;
    private javax.swing.JLabel lblLocal15;
    private javax.swing.JLabel lblLocal16;
    private javax.swing.JLabel lblMuncDenunciante;
    private javax.swing.JLabel lblNomeDenunciante;
    private javax.swing.JLabel lblNomeDenunciante1;
    private javax.swing.JLabel lblNomeDenunciante2;
    private javax.swing.JLabel lblStatusDenuncia;
    private javax.swing.JLabel lblTipoDenuncia;
    private javax.swing.JLabel lblTipoDenuncia1;
    private javax.swing.JLabel lblUfDenunciante;
    private javax.swing.JSeparator lnSeparaTitulo;
    private javax.swing.JRadioButton rdbtnDenAnonima;
    private javax.swing.JRadioButton rdbtnDenIdentificada;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtBairroDenunciado;
    private javax.swing.JTextField txtDescDenuncia;
    private javax.swing.JTextField txtNomeDenunciado;
    private javax.swing.JTextField txtNomeDenunciante;
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
    
    private String getDateTime() {
        
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
        
    }
    
    public void LimpaFormDenuncia(){
        
        this.rdbtnDenAnonima.setSelected(false);
        this.rdbtnDenIdentificada.setSelected(false);
        this.txtNomeDenunciado.setText("");
        this.txtBairroDenunciado.setText("");
        this.cbxMunicipioDenunciado.setSelectedItem("");
        this.cbxUFDenunciado.setSelectedItem("");
        this.txtDescDenuncia.setText("");
    }
    
    
    public void FechaFormDenuncia(){
        
        dispose();
        
    }
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
    
    public List<String> montaSQL(){
        
        DenunciaDAO ddao = new DenunciaDAO();
        
        List<String> listaParametros = new ArrayList();

        //1//CPF DENUNCIANTE
            if(jFCpfCnpj.getValue() == null){
                listaParametros.add(null);
            }else{
                listaParametros.add(jFCpfCnpj.getValue().toString());
            }
            
         //2//ID PROTOCOLO
            if(jFIdDenuncia.getValue() == null) {
                listaParametros.add(null);
            }else{
                listaParametros.add(jFIdDenuncia.getValue().toString());
            }
            
        //3//TIPO DENUNCIA
            if (rdbtnDenAnonima.isSelected()){
                listaParametros.add("A");
            }else if(rdbtnDenIdentificada.isSelected()){
                listaParametros.add("I"); 
            }else{
                listaParametros.add(null);
            }
            
        //4//DATA DENUNCIA
            if((jFData.getValue() == null)){
                listaParametros.add(null);
            }else{
                listaParametros.add(jFData.getValue().toString());
            }
        
        //5//STATUS DENUNCIA
            if(cbxStatusDenuncia.getSelectedItem().toString() == "Selecione..."){
                listaParametros.add(null);
            }else{
                listaParametros.add(ddao.RetornaIdStatus(cbxStatusDenuncia.getSelectedItem().toString()));
            }
       
        //6//MUNICIPIO DENUNCIANTE
            if(cbxMunicipioDenunciante.getSelectedItem().toString() == "Selecione..."){
                listaParametros.add(null);
            }else{
                listaParametros.add(Integer.toString(ddao.RetornaIdMunicipio(cbxMunicipioDenunciante.getSelectedItem().toString())));
            }
        
        //7//UF DENUNCIANTE
            if(cbxUfDenunciante.getSelectedItem().toString() == "Selecione..."){
                listaParametros.add(null);
            }else{
                listaParametros.add(ddao.RetornaUfMunicipio(cbxUfDenunciante.getSelectedItem().toString()));
            }
        
        //8//NOME DENUNCIADO
            if(txtNomeDenunciado.getText() == ""){
                listaParametros.add(null);
            }else{
                listaParametros.add(txtNomeDenunciado.getText());
            }
        
        //9//BAIRRO DENUNCIADO
            if(txtBairroDenunciado.getText() == ""){
                listaParametros.add(null);
            }else{
                listaParametros.add(txtBairroDenunciado.getText());
            }
        
        //10//MUNICIPIO DENUNCIADO
            if(cbxMunicipioDenunciado.getSelectedItem().toString() == "Selecione..."){
                listaParametros.add(null);
            }else{
                listaParametros.add(Integer.toString(ddao.RetornaIdMunicipio(cbxMunicipioDenunciado.getSelectedItem().toString())));
            }
        
        //11//UF DENUNCIADO
            if(cbxUFDenunciado.getSelectedItem().toString() == "Selecione..."){
                listaParametros.add(null);
            }else{
                listaParametros.add(ddao.RetornaUfMunicipio(cbxUFDenunciado.getSelectedItem().toString()));                
            }
        
//        //12//DESCRICAO DENUNCIA
//            if(txtDescDenuncia.getText() == null){
//                listaParametros.add(null);
//            }else{
//                listaParametros.add("%"+txtDescDenuncia.getText()+"%");
//            }
            
        return listaParametros;
    }
    
       public void CarregaTabela(){
        
        DefaultTableModel dtmDenuncia = (DefaultTableModel) jTResultPesq.getModel();
        jTResultPesq.setRowSorter(new TableRowSorter(dtmDenuncia));
        DenunciaDAO ddao = new DenunciaDAO();
        
        for (Denuncia d: ddao.PesquisaDenuncia(montaSQL())){
            
            dtmDenuncia.addRow(new Object[]{

                d.getId(),
                d.getData(),
                d.getTipoDenuncia().getCodigo(),
                d.getDenunciante().getNome(),
                d.getNomeDenunciado(),
                d.getStatusD()
            });

        }
    }   

    private void LimpaFiltros() {
        
    }
}
