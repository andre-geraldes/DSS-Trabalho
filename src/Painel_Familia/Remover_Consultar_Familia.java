/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Painel_Familia;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Cunha
 */
public class Remover_Consultar_Familia extends javax.swing.JPanel {

    /**
     * Creates new form Remover_Consultar_Familia
     */
    public Remover_Consultar_Familia() {
        initComponents();
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
        Familias = new javax.swing.JList();
        Remover = new javax.swing.JButton();
        Rendimento = new javax.swing.JFormattedTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Nelementos = new javax.swing.JFormattedTextField();
        Morada = new javax.swing.JFormattedTextField();
        jLabel39 = new javax.swing.JLabel();
        Cod_Postal = new javax.swing.JFormattedTextField();
        Localidade = new javax.swing.JFormattedTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Representante = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Agregado = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        Familias.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(Familias);

        add(jScrollPane1);
        jScrollPane1.setBounds(30, 170, 110, 240);

        Remover.setText("Remover");
        Remover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RemoverMouseClicked(evt);
            }
        });
        add(Remover);
        Remover.setBounds(30, 420, 110, 30);
        add(Rendimento);
        Rendimento.setBounds(360, 210, 40, 30);

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("Rendimento");
        add(jLabel34);
        jLabel34.setBounds(270, 210, 90, 30);

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel75.setText("€");
        add(jLabel75);
        jLabel75.setBounds(410, 210, 8, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nº Elementos");
        add(jLabel2);
        jLabel2.setBounds(480, 210, 100, 30);
        add(Nelementos);
        Nelementos.setBounds(600, 210, 50, 30);
        add(Morada);
        Morada.setBounds(360, 270, 380, 30);

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setText("Localidade");
        add(jLabel39);
        jLabel39.setBounds(570, 310, 100, 30);
        add(Cod_Postal);
        Cod_Postal.setBounds(450, 310, 110, 30);
        add(Localidade);
        Localidade.setBounds(640, 310, 100, 30);

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setText("Código-Postal");
        add(jLabel37);
        jLabel37.setBounds(360, 310, 100, 30);

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("Morada");
        add(jLabel38);
        jLabel38.setBounds(270, 270, 70, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Representante");
        add(jLabel3);
        jLabel3.setBounds(270, 360, 100, 30);
        add(Representante);
        Representante.setBounds(380, 360, 360, 30);

        Agregado.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(Agregado);

        add(jScrollPane2);
        jScrollPane2.setBounds(150, 210, 110, 200);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Agregado:");
        add(jLabel4);
        jLabel4.setBounds(150, 170, 90, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/987.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 960, 610);
    }// </editor-fold>//GEN-END:initComponents

    private void RemoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemoverMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Removido!");
    }//GEN-LAST:event_RemoverMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList Agregado;
    private javax.swing.JFormattedTextField Cod_Postal;
    private javax.swing.JList Familias;
    private javax.swing.JFormattedTextField Localidade;
    private javax.swing.JFormattedTextField Morada;
    private javax.swing.JFormattedTextField Nelementos;
    private javax.swing.JButton Remover;
    private javax.swing.JFormattedTextField Rendimento;
    private javax.swing.JFormattedTextField Representante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
