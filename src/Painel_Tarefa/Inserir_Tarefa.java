/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Painel_Tarefa;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Cunha
 */
public class Inserir_Tarefa extends javax.swing.JPanel {

    /**
     * Creates new form Inserir_Tarefa
     */
    public Inserir_Tarefa() {
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

        jLabel34 = new javax.swing.JLabel();
        Nome = new javax.swing.JFormattedTextField();
        Dia = new javax.swing.JFormattedTextField();
        Mes = new javax.swing.JFormattedTextField();
        Ano = new javax.swing.JFormattedTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        Prazo = new javax.swing.JFormattedTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        Projecto = new javax.swing.JComboBox();
        Equipa = new javax.swing.JComboBox();
        Inserir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("Nome");
        add(jLabel34);
        jLabel34.setBounds(170, 160, 50, 30);
        add(Nome);
        Nome.setBounds(260, 160, 380, 30);
        add(Dia);
        Dia.setBounds(260, 210, 40, 30);
        add(Mes);
        Mes.setBounds(310, 210, 40, 30);
        add(Ano);
        Ano.setBounds(360, 210, 40, 30);

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setText("Data Inicio");
        add(jLabel36);
        jLabel36.setBounds(170, 210, 70, 30);

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel44.setText("Prazo");
        add(jLabel44);
        jLabel44.setBounds(170, 270, 70, 30);
        add(Prazo);
        Prazo.setBounds(260, 270, 40, 30);

        jLabel22.setText("     (dd-mm-aaaa)  ");
        add(jLabel22);
        jLabel22.setBounds(280, 240, 110, 14);

        jLabel81.setText("Dias");
        add(jLabel81);
        jLabel81.setBounds(310, 270, 40, 30);

        Projecto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Projecto", "Item 2", "Item 3", "Item 4" }));
        add(Projecto);
        Projecto.setBounds(260, 320, 150, 30);

        Equipa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Equipa", "Item 2", "Item 3", "Item 4" }));
        add(Equipa);
        Equipa.setBounds(460, 320, 150, 30);

        Inserir.setText("Inserir");
        Inserir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InserirMouseClicked(evt);
            }
        });
        Inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InserirActionPerformed(evt);
            }
        });
        add(Inserir);
        Inserir.setBounds(690, 450, 80, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/987.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 954, 608);
    }// </editor-fold>//GEN-END:initComponents

    private void InserirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InserirMouseClicked
        // TODO add your handling code here:
        if (this.Nome.getText().equals("") || this.Dia.getText().equals("") || this.Mes.getText().equals("") || this.Ano.getText().equals("") || 
            this.Prazo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        }else{
            JOptionPane.showMessageDialog(null, "Inserido!");
            this.Nome.setText("");
            this.Dia.setText("");
            this.Mes.setText("");
            this.Ano.setText("");
            this.Prazo.setText("");
        }
    }//GEN-LAST:event_InserirMouseClicked

    private void InserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InserirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InserirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField Ano;
    private javax.swing.JFormattedTextField Dia;
    private javax.swing.JComboBox Equipa;
    private javax.swing.JButton Inserir;
    private javax.swing.JFormattedTextField Mes;
    private javax.swing.JFormattedTextField Nome;
    private javax.swing.JFormattedTextField Prazo;
    private javax.swing.JComboBox Projecto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel81;
    // End of variables declaration//GEN-END:variables
}
