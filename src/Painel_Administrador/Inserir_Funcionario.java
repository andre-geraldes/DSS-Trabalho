/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Painel_Administrador;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Cunha
 */
public class Inserir_Funcionario extends javax.swing.JPanel {

    /**
     * Creates new form Inserir_Funcionario
     */
    public Inserir_Funcionario() {
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
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Nome = new javax.swing.JFormattedTextField();
        Dia = new javax.swing.JFormattedTextField();
        Nacionalidade = new javax.swing.JFormattedTextField();
        Telefone = new javax.swing.JFormattedTextField();
        Nif = new javax.swing.JFormattedTextField();
        Niss = new javax.swing.JFormattedTextField();
        Telemovel = new javax.swing.JFormattedTextField();
        Morada = new javax.swing.JFormattedTextField();
        Postal = new javax.swing.JFormattedTextField();
        Localidade = new javax.swing.JFormattedTextField();
        Email = new javax.swing.JFormattedTextField();
        Comissao = new javax.swing.JFormattedTextField();
        Mes = new javax.swing.JFormattedTextField();
        Ano = new javax.swing.JFormattedTextField();
        Salario = new javax.swing.JFormattedTextField();
        Feminino = new javax.swing.JCheckBox();
        Masculino = new javax.swing.JCheckBox();
        Inserir = new javax.swing.JButton();
        jLabel75 = new javax.swing.JLabel();
        Fundo_Inserir_Funcionario = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(954, 608));
        setMinimumSize(new java.awt.Dimension(954, 608));
        setLayout(null);

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("Nome");
        add(jLabel34);
        jLabel34.setBounds(170, 120, 50, 30);

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("Telemóvel");
        add(jLabel35);
        jLabel35.setBounds(170, 250, 80, 30);

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setText("Data de nascimento");
        add(jLabel36);
        jLabel36.setBounds(170, 160, 130, 30);

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setText("Código-Postal");
        add(jLabel37);
        jLabel37.setBounds(260, 330, 100, 30);

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("Morada");
        add(jLabel38);
        jLabel38.setBounds(170, 290, 70, 30);

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setText("Localidade");
        add(jLabel39);
        jLabel39.setBounds(470, 330, 100, 30);

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel40.setText("NIF");
        add(jLabel40);
        jLabel40.setBounds(370, 200, 30, 30);

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setText("NISS");
        add(jLabel41);
        jLabel41.setBounds(500, 200, 29, 30);

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel42.setText("Nacionalidade");
        add(jLabel42);
        jLabel42.setBounds(460, 160, 90, 30);

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel43.setText("Sexo");
        add(jLabel43);
        jLabel43.setBounds(510, 250, 50, 30);

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel44.setText("Telefone");
        add(jLabel44);
        jLabel44.setBounds(170, 200, 70, 30);

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel45.setText("E-mail");
        add(jLabel45);
        jLabel45.setBounds(170, 370, 70, 30);

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel46.setText("Comissão");
        add(jLabel46);
        jLabel46.setBounds(170, 410, 90, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Salário");
        add(jLabel2);
        jLabel2.setBounds(370, 250, 60, 30);
        add(Nome);
        Nome.setBounds(260, 120, 380, 30);
        add(Dia);
        Dia.setBounds(300, 160, 40, 30);
        add(Nacionalidade);
        Nacionalidade.setBounds(550, 160, 90, 30);
        add(Telefone);
        Telefone.setBounds(260, 200, 100, 30);
        add(Nif);
        Nif.setBounds(400, 200, 90, 30);
        add(Niss);
        Niss.setBounds(540, 200, 100, 30);
        add(Telemovel);
        Telemovel.setBounds(260, 250, 100, 30);
        add(Morada);
        Morada.setBounds(260, 290, 380, 30);
        add(Postal);
        Postal.setBounds(350, 330, 110, 30);
        add(Localidade);
        Localidade.setBounds(540, 330, 100, 30);
        add(Email);
        Email.setBounds(260, 370, 380, 30);
        add(Comissao);
        Comissao.setBounds(260, 410, 380, 30);
        add(Mes);
        Mes.setBounds(350, 160, 40, 30);
        add(Ano);
        Ano.setBounds(400, 160, 40, 30);
        add(Salario);
        Salario.setBounds(420, 250, 60, 30);

        Feminino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Feminino.setText("Feminino");
        Feminino.setOpaque(false);
        Feminino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FemininoMouseClicked(evt);
            }
        });
        add(Feminino);
        Feminino.setBounds(560, 230, 90, 30);

        Masculino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Masculino.setText("Masculino");
        Masculino.setOpaque(false);
        Masculino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MasculinoMouseClicked(evt);
            }
        });
        add(Masculino);
        Masculino.setBounds(560, 260, 100, 30);

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

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel75.setText("€");
        add(jLabel75);
        jLabel75.setBounds(480, 250, 8, 30);

        Fundo_Inserir_Funcionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/987.jpg"))); // NOI18N
        add(Fundo_Inserir_Funcionario);
        Fundo_Inserir_Funcionario.setBounds(0, -10, 960, 610);
    }// </editor-fold>//GEN-END:initComponents

    private void FemininoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FemininoMouseClicked
        // TODO add your handling code here:
        if(Feminino.isSelected()){
            Masculino.setEnabled(false);
        }else{
            Masculino.setEnabled(true);;
        }
    }//GEN-LAST:event_FemininoMouseClicked

    private void MasculinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MasculinoMouseClicked
        // TODO add your handling code here:
        if(Masculino.isSelected()){
            Feminino.setEnabled(false);
        }else{
            Feminino.setEnabled(true);;
        }
    }//GEN-LAST:event_MasculinoMouseClicked

    private void InserirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InserirMouseClicked
        // TODO add your handling code here:
        if (this.Niss.getText().equals("") || this.Dia.getText().equals("") || this.Mes.getText().equals("") || this.Ano.getText().equals("") || 
            this.Nome.getText().equals("") || this.Nacionalidade.getText().equals("") || this.Telefone.getText().equals("") || this.Nif.getText().equals("") ||
            this.Telemovel.getText().equals("") || this.Morada.getText().equals("") || this.Postal.getText().equals("") || this.Localidade.getText().equals("") || 
            this.Email.getText().equals("") || this.Comissao.getText().equals("") || this.Salario.getText().equals("") || (!this.Feminino.isSelected() && !this.Masculino.isSelected())) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        }else{
            JOptionPane.showMessageDialog(null, "Inserido!");
            this.Niss.setText("");
            this.Dia.setText("");
            this.Mes.setText("");
            this.Ano.setText("");
            this.Nome.setText("");
            this.Nacionalidade.setText("");
            this.Telefone.setText("");
            this.Nif.setText("");
            this.Telemovel.setText("");
            this.Morada.setText("");
            this.Postal.setText("");
            this.Localidade.setText("");
            this.Email.setText("");
            this.Comissao.setText("");
            this.Salario.setText("");  
            this.Feminino.setSelected(false);
            this.Masculino.setSelected(false);
        }
    }//GEN-LAST:event_InserirMouseClicked

    private void InserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InserirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InserirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField Ano;
    private javax.swing.JFormattedTextField Comissao;
    private javax.swing.JFormattedTextField Dia;
    private javax.swing.JFormattedTextField Email;
    private javax.swing.JCheckBox Feminino;
    private javax.swing.JLabel Fundo_Inserir_Funcionario;
    private javax.swing.JButton Inserir;
    private javax.swing.JFormattedTextField Localidade;
    private javax.swing.JCheckBox Masculino;
    private javax.swing.JFormattedTextField Mes;
    private javax.swing.JFormattedTextField Morada;
    private javax.swing.JFormattedTextField Nacionalidade;
    private javax.swing.JFormattedTextField Nif;
    private javax.swing.JFormattedTextField Niss;
    private javax.swing.JFormattedTextField Nome;
    private javax.swing.JFormattedTextField Postal;
    private javax.swing.JFormattedTextField Salario;
    private javax.swing.JFormattedTextField Telefone;
    private javax.swing.JFormattedTextField Telemovel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel75;
    // End of variables declaration//GEN-END:variables
}
