/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Painel_Armazem;

/**
 *
 * @author Tiago Cunha
 */
public class Consultar extends javax.swing.JPanel {

    /**
     * Creates new form Inserir_Armazém
     */
    public Consultar() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Montante = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Material = new javax.swing.JList();
        Quantidade = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Tipo:");
        add(jLabel3);
        jLabel3.setBounds(240, 160, 70, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Dinheiro");
        add(jLabel4);
        jLabel4.setBounds(270, 200, 70, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Material");
        add(jLabel5);
        jLabel5.setBounds(270, 260, 70, 30);

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel75.setText("€");
        add(jLabel75);
        jLabel75.setBounds(440, 200, 20, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Quantidade:");
        add(jLabel6);
        jLabel6.setBounds(520, 380, 80, 30);
        add(Montante);
        Montante.setBounds(350, 200, 80, 30);

        Material.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Martelo", "Chouriço", "Vodka", "Caneta", "Lápis", "Caderno", "Beirão", "eu&tu", "tu&eu", "África", "Brahimi", "Talisca" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(Material);

        add(jScrollPane1);
        jScrollPane1.setBounds(340, 300, 130, 180);

        Quantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantidadeActionPerformed(evt);
            }
        });
        add(Quantidade);
        Quantidade.setBounds(610, 380, 60, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/987.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 954, 608);
    }// </editor-fold>//GEN-END:initComponents

    private void QuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantidadeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList Material;
    private javax.swing.JTextField Montante;
    private javax.swing.JFormattedTextField Quantidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
