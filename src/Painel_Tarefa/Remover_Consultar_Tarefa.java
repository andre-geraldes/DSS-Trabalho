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
public class Remover_Consultar_Tarefa extends javax.swing.JPanel {

    /**
     * Creates new form Remover_Consultar_Tarefa
     */
    public Remover_Consultar_Tarefa() {
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
        Projecto = new javax.swing.JFormattedTextField();
        Equipa = new javax.swing.JFormattedTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        Prazo = new javax.swing.JFormattedTextField();
        jLabel81 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tarefas = new javax.swing.JList();
        Remover = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("Nome");
        add(jLabel34);
        jLabel34.setBounds(280, 170, 50, 30);
        add(Nome);
        Nome.setBounds(370, 170, 380, 30);
        add(Dia);
        Dia.setBounds(370, 220, 40, 30);
        add(Mes);
        Mes.setBounds(420, 220, 40, 30);
        add(Ano);
        Ano.setBounds(470, 220, 40, 30);

        Projecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProjectoActionPerformed(evt);
            }
        });
        add(Projecto);
        Projecto.setBounds(620, 220, 130, 30);
        add(Equipa);
        Equipa.setBounds(620, 280, 130, 30);

        jLabel22.setText("  (dd-mm-aaaa)  ");
        add(jLabel22);
        jLabel22.setBounds(400, 250, 80, 14);

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setText("Data Inicio");
        add(jLabel36);
        jLabel36.setBounds(280, 220, 70, 30);

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel44.setText("Prazo");
        add(jLabel44);
        jLabel44.setBounds(280, 280, 70, 30);
        add(Prazo);
        Prazo.setBounds(370, 280, 40, 30);

        jLabel81.setText("Dias");
        add(jLabel81);
        jLabel81.setBounds(420, 280, 40, 30);

        Tarefas.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(Tarefas);

        add(jScrollPane1);
        jScrollPane1.setBounds(70, 170, 120, 220);

        Remover.setText("Remover");
        Remover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RemoverMouseClicked(evt);
            }
        });
        add(Remover);
        Remover.setBounds(70, 400, 120, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Projecto");
        add(jLabel2);
        jLabel2.setBounds(540, 220, 70, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Equipa");
        add(jLabel3);
        jLabel3.setBounds(540, 280, 70, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/987.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 960, 610);
    }// </editor-fold>//GEN-END:initComponents

    private void RemoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemoverMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Removido com Sucesso!");
    }//GEN-LAST:event_RemoverMouseClicked

    private void ProjectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProjectoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProjectoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField Ano;
    private javax.swing.JFormattedTextField Dia;
    private javax.swing.JFormattedTextField Equipa;
    private javax.swing.JFormattedTextField Mes;
    private javax.swing.JFormattedTextField Nome;
    private javax.swing.JFormattedTextField Prazo;
    private javax.swing.JFormattedTextField Projecto;
    private javax.swing.JButton Remover;
    private javax.swing.JList Tarefas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
