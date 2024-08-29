/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.visao;

import br.com.controle.CalculosOperacoes;

/**
 *
 * @author maria.gabriel
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form teste
     */
    public Calculadora() {
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

        jPanel1 = new javax.swing.JPanel();
        jTvalor1 = new javax.swing.JTextField();
        jLvalor1 = new javax.swing.JLabel();
        jLvalor2 = new javax.swing.JLabel();
        jTvalor2 = new javax.swing.JTextField();
        jBsoma = new javax.swing.JButton();
        jBsub = new javax.swing.JButton();
        jBmult = new javax.swing.JButton();
        jBdiv = new javax.swing.JButton();
        jLresultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTvalor1.setColumns(4);

        jLvalor1.setText("Digite o 1º valor:");

        jLvalor2.setText("Digite o 2º valor: ");

        jTvalor2.setColumns(4);
        jTvalor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTvalor2ActionPerformed(evt);
            }
        });

        jBsoma.setBackground(new java.awt.Color(0, 255, 51));
        jBsoma.setText("+");
        jBsoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsomaActionPerformed(evt);
            }
        });

        jBsub.setBackground(new java.awt.Color(0, 255, 51));
        jBsub.setText("-");
        jBsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsubActionPerformed(evt);
            }
        });

        jBmult.setBackground(new java.awt.Color(51, 255, 51));
        jBmult.setText("x");
        jBmult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmultActionPerformed(evt);
            }
        });

        jBdiv.setBackground(new java.awt.Color(51, 255, 51));
        jBdiv.setText("/");
        jBdiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBdivActionPerformed(evt);
            }
        });

        jLresultado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLresultado.setForeground(new java.awt.Color(255, 0, 0));
        jLresultado.setText("0.00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBsoma, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBsub, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBmult, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBdiv, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLvalor2)
                                    .addComponent(jLvalor1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTvalor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jTvalor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLresultado)))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTvalor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLvalor1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLvalor2)
                    .addComponent(jTvalor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBsoma)
                    .addComponent(jBsub)
                    .addComponent(jBmult)
                    .addComponent(jBdiv))
                .addGap(38, 38, 38)
                .addComponent(jLresultado)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 411, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTvalor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTvalor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTvalor2ActionPerformed

    private void jBsomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsomaActionPerformed
        // TODO add your handling code here:
        CalculosOperacoes c = new CalculosOperacoes();
        c.setValor1(Double.valueOf(jTvalor1.getText()));
        c.setValor2(Double.valueOf(jTvalor2.getText()));

        jLresultado.setText("A soma é: " + c.calcularSoma());
    }//GEN-LAST:event_jBsomaActionPerformed

    private void jBsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsubActionPerformed
        // TODO add your handling code here:
         CalculosOperacoes c = new CalculosOperacoes();
        c.setValor1(Double.valueOf(jTvalor1.getText()));
        c.setValor2(Double.valueOf(jTvalor2.getText()));

        jLresultado.setText("A subtração é: " + c.calcularSub());
    }//GEN-LAST:event_jBsubActionPerformed

    private void jBmultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmultActionPerformed
        // TODO add your handling code here:
        CalculosOperacoes c = new CalculosOperacoes();
        c.setValor1(Double.valueOf(jTvalor1.getText()));
        c.setValor2(Double.valueOf(jTvalor2.getText()));

        jLresultado.setText("A multiplicação é: " + c.calcularMult());
    }//GEN-LAST:event_jBmultActionPerformed

    private void jBdivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdivActionPerformed
        // TODO add your handling code here:
        CalculosOperacoes c = new CalculosOperacoes();
        c.setValor1(Double.valueOf(jTvalor1.getText()));
        c.setValor2(Double.valueOf(jTvalor2.getText()));

        jLresultado.setText("A divisão é: " + c.calcularDiv());
    }//GEN-LAST:event_jBdivActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBdiv;
    private javax.swing.JButton jBmult;
    private javax.swing.JButton jBsoma;
    private javax.swing.JButton jBsub;
    private javax.swing.JLabel jLresultado;
    private javax.swing.JLabel jLvalor1;
    private javax.swing.JLabel jLvalor2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTvalor1;
    private javax.swing.JTextField jTvalor2;
    // End of variables declaration//GEN-END:variables
}