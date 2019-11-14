/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.screen;

import java.awt.Component;
import java.awt.Toolkit;
import javax.swing.JFrame;


/**
 *
 * @author btps000328
 */
public class SisGeFA extends javax.swing.JFrame {

    /**
     * Creates new form SisGeFA
     */
    public SisGeFA() {
        initComponents();
        setIcon();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        formulario = new javax.swing.JMenu();
        denuncia = new javax.swing.JMenuItem();
        solicitacao = new javax.swing.JMenuItem();
        vistoria = new javax.swing.JMenu();
        agVistoria = new javax.swing.JMenuItem();
        pesqVistoria = new javax.swing.JMenuItem();
        relVistorias = new javax.swing.JMenuItem();
        notificacao = new javax.swing.JMenu();
        addNotificacao = new javax.swing.JMenuItem();
        pesqNotificacao = new javax.swing.JMenuItem();
        relNotificacao = new javax.swing.JMenuItem();
        autoinfracao = new javax.swing.JMenu();
        addAI = new javax.swing.JMenuItem();
        pesqAI = new javax.swing.JMenuItem();
        relAI = new javax.swing.JMenuItem();
        infracoes = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SisGeFA - Sistema de Gestão de Licenciamento e Fiscalização Ambiental");
        setBackground(getBackground());
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Desenvolvido por Viviane Santana");

        titulo1.setFont(new java.awt.Font("Sitka Small", 1, 48)); // NOI18N
        titulo1.setForeground(new java.awt.Color(153, 153, 153));
        titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo1.setText("Sistema de Gestão de Licenciamento e Fiscalização Ambiental");

        formulario.setText("Formulários");
        formulario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        formulario.setPreferredSize(new java.awt.Dimension(115, 22));

        denuncia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        denuncia.setText("Denúncia");
        denuncia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                denunciaActionPerformed(evt);
            }
        });
        formulario.add(denuncia);

        solicitacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        solicitacao.setText("Solicitação");
        solicitacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solicitacaoActionPerformed(evt);
            }
        });
        formulario.add(solicitacao);

        Menu.add(formulario);

        vistoria.setText("Vistoria");
        vistoria.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        vistoria.setMaximumSize(new java.awt.Dimension(80, 32767));

        agVistoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        agVistoria.setText("Agendar Vistoria");
        agVistoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agVistoriaMouseClicked(evt);
            }
        });
        agVistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agVistoriaActionPerformed(evt);
            }
        });
        vistoria.add(agVistoria);

        pesqVistoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pesqVistoria.setText("Pesquisar Vistoria");
        vistoria.add(pesqVistoria);

        relVistorias.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        relVistorias.setText("Relatório");
        vistoria.add(relVistorias);

        Menu.add(vistoria);

        notificacao.setText("Notificação");
        notificacao.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        notificacao.setMaximumSize(new java.awt.Dimension(110, 32767));

        addNotificacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addNotificacao.setText("Nova Notificação");
        addNotificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNotificacaoActionPerformed(evt);
            }
        });
        notificacao.add(addNotificacao);

        pesqNotificacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pesqNotificacao.setText("Pesquisar Notificação");
        notificacao.add(pesqNotificacao);

        relNotificacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        relNotificacao.setText("Relatório");
        notificacao.add(relNotificacao);

        Menu.add(notificacao);

        autoinfracao.setText("Auto Infração");
        autoinfracao.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        autoinfracao.setMaximumSize(new java.awt.Dimension(120, 32767));

        addAI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addAI.setText("Novo AI");
        autoinfracao.add(addAI);

        pesqAI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pesqAI.setText("Pesquisar AI");
        autoinfracao.add(pesqAI);

        relAI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        relAI.setText("Relatório");
        autoinfracao.add(relAI);

        Menu.add(autoinfracao);

        infracoes.setText("Infrações");
        infracoes.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Menu.add(infracoes);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 79, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1837, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 1923, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(985, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(10, 10, 10))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 987, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(13, Short.MAX_VALUE)))
        );

        getAccessibleContext().setAccessibleName("Teste ");

        setSize(new java.awt.Dimension(1937, 1083));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void agVistoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agVistoriaMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_agVistoriaMouseClicked

    private void agVistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agVistoriaActionPerformed
        new AgendaVistoria().setVisible(true);
    }//GEN-LAST:event_agVistoriaActionPerformed

    private void denunciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_denunciaActionPerformed
        new PesqDenuncia().setVisible(true);
    }//GEN-LAST:event_denunciaActionPerformed

    private void solicitacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitacaoActionPerformed
        new FormSolicitacao().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_solicitacaoActionPerformed

    private void addNotificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNotificacaoActionPerformed

    }//GEN-LAST:event_addNotificacaoActionPerformed

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
            java.util.logging.Logger.getLogger(SisGeFA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SisGeFA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SisGeFA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SisGeFA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SisGeFA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenuItem addAI;
    private javax.swing.JMenuItem addNotificacao;
    private javax.swing.JMenuItem agVistoria;
    private javax.swing.JMenu autoinfracao;
    private javax.swing.JMenuItem denuncia;
    private javax.swing.JMenu formulario;
    private javax.swing.JMenu infracoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu notificacao;
    private javax.swing.JMenuItem pesqAI;
    private javax.swing.JMenuItem pesqNotificacao;
    private javax.swing.JMenuItem pesqVistoria;
    private javax.swing.JMenuItem relAI;
    private javax.swing.JMenuItem relNotificacao;
    private javax.swing.JMenuItem relVistorias;
    private javax.swing.JMenuItem solicitacao;
    private javax.swing.JLabel titulo1;
    private javax.swing.JMenu vistoria;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon_100.png")));
    }
    
}
