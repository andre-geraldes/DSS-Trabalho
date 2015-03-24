/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Painel_Candidatura;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Cunha
 */
public class Remover_Consultar_Candidatura extends javax.swing.JPanel {

    /**
     * Creates new form Remover_Consutlar_Candidatura
     */
    public Remover_Consultar_Candidatura() {
        initComponents();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel25 = new javax.swing.JLabel();
        Dia_Submissao = new javax.swing.JFormattedTextField();
        Mes_Submissao = new javax.swing.JFormattedTextField();
        Ano_Submissao = new javax.swing.JFormattedTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Observacoes = new javax.swing.JTextArea();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Documentos = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        Candidaturas = new javax.swing.JList();
        Remover = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Dia_Aprovacao = new javax.swing.JFormattedTextField();
        Mes_Aprovacao = new javax.swing.JFormattedTextField();
        Ano_Aprovacao = new javax.swing.JFormattedTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Estado = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Data Submissão");
        add(jLabel25);
        jLabel25.setBounds(330, 160, 110, 30);
        add(Dia_Submissao);
        Dia_Submissao.setBounds(460, 160, 40, 30);
        add(Mes_Submissao);
        Mes_Submissao.setBounds(510, 160, 40, 30);
        add(Ano_Submissao);
        Ano_Submissao.setBounds(560, 160, 40, 30);

        jLabel27.setText("(dd-mm-aaaa)");
        add(jLabel27);
        jLabel27.setBounds(620, 160, 100, 30);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Observações:");
        add(jLabel24);
        jLabel24.setBounds(330, 240, 110, 30);

        Observacoes.setColumns(20);
        Observacoes.setRows(5);
        jScrollPane1.setViewportView(Observacoes);

        add(jScrollPane1);
        jScrollPane1.setBounds(460, 240, 310, 96);

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Nome Documentos:");
        add(jLabel26);
        jLabel26.setBounds(330, 340, 130, 30);

        Documentos.setColumns(20);
        Documentos.setRows(5);
        jScrollPane2.setViewportView(Documentos);

        add(jScrollPane2);
        jScrollPane2.setBounds(460, 350, 310, 96);

        Candidaturas.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(Candidaturas);

        add(jScrollPane3);
        jScrollPane3.setBounds(50, 170, 120, 270);

        Remover.setText("Remover");
        Remover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RemoverMouseClicked(evt);
            }
        });
        Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverActionPerformed(evt);
            }
        });
        add(Remover);
        Remover.setBounds(50, 460, 120, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Data Aprovação");
        add(jLabel2);
        jLabel2.setBounds(330, 200, 110, 30);
        add(Dia_Aprovacao);
        Dia_Aprovacao.setBounds(460, 200, 40, 30);
        add(Mes_Aprovacao);
        Mes_Aprovacao.setBounds(510, 200, 40, 30);
        add(Ano_Aprovacao);
        Ano_Aprovacao.setBounds(560, 200, 40, 30);

        jLabel28.setText("(dd-mm-aaaa)");
        add(jLabel28);
        jLabel28.setBounds(620, 200, 100, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Estado");
        add(jLabel3);
        jLabel3.setBounds(340, 460, 110, 30);
        add(Estado);
        Estado.setBounds(460, 460, 310, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/987.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 960, 610);
    }// </editor-fold>//GEN-END:initComponents

    private void RemoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemoverMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Removido!");
    }//GEN-LAST:event_RemoverMouseClicked

    private void RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RemoverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField Ano_Aprovacao;
    private javax.swing.JFormattedTextField Ano_Submissao;
    private javax.swing.JList Candidaturas;
    private javax.swing.JFormattedTextField Dia_Aprovacao;
    private javax.swing.JFormattedTextField Dia_Submissao;
    private javax.swing.JTextArea Documentos;
    private javax.swing.JFormattedTextField Estado;
    private javax.swing.JFormattedTextField Mes_Aprovacao;
    private javax.swing.JFormattedTextField Mes_Submissao;
    private javax.swing.JTextArea Observacoes;
    private javax.swing.JButton Remover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}