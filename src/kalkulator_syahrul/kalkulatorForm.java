/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator_syahrul;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class kalkulatorForm extends javax.swing.JFrame {

    CRUD aa = new CRUD();
    /**
     * Creates new form kalkulatorForm
     */
    public kalkulatorForm() {
        initComponents();
    }
    
    public static Double penjumlahan(Double angka1, Double angka2) {
        Double hasil = angka1 + angka2;
        return hasil;
    }
    
     public static Double pengurangan(Double angka1, Double angka2) {
        Double hasil = angka1 - angka2;
        return hasil;
    }
     
     public static Double perkalian(Double angka1, Double angka2) {
        Double hasil = angka1 * angka2;
        return hasil;
    }
     
     public static Double pembagian(Double angka1, Double angka2) {
        Double hasil = angka1 / angka2;
        return hasil;
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
        txtAngka2 = new javax.swing.JTextField();
        cbOperator = new javax.swing.JComboBox<>();
        txtAngka1 = new javax.swing.JTextField();
        btnHitung = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Kalkulator");

        txtAngka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAngka2ActionPerformed(evt);
            }
        });

        cbOperator.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-", "*", "/", " " }));
        cbOperator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOperatorActionPerformed(evt);
            }
        });

        txtAngka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAngka1ActionPerformed(evt);
            }
        });

        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(txtAngka1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(cbOperator, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(txtAngka2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(btnHitung)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAngka2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAngka1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbOperator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(btnHitung)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAngka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAngka2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAngka2ActionPerformed

    private void cbOperatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOperatorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbOperatorActionPerformed

    private void txtAngka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAngka1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAngka1ActionPerformed

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
       Double angka1, angka2, hasil = null;
       String operator;
       
       angka1 = Double.valueOf(txtAngka1.getText());
       angka2 = Double.valueOf(txtAngka2.getText());
       operator = (String) cbOperator.getSelectedItem();
       
        System.out.println(angka1 + " " + operator + " " + angka2);
        
  
        
        if(operator.equals("+")) {
            hasil = angka1 + angka2;
            
        }else if (operator.equals("-" )) {
            hasil = angka1 - angka2;
            
        }else if (operator.equals("*")) {
            hasil = angka1 * angka2;
                    
        }else if (operator.equals("/")) {
            hasil = angka1 / angka2;
        }
 
         
    try{
        aa.setAngka1(angka1);
        aa.setOperator(operator);
        aa.setAngka2(angka1);
        aa.setHasil(hasil);
        aa.simpanData(aa.getAngka1(), aa.getOperator(), aa.getAngka2(), aa.getHasil());
     } catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(null, "Anda harus memasukkan angka!", "Error", JOptionPane.ERROR_MESSAGE);
}
   
        JOptionPane.showMessageDialog(null, "Hasil Dari" +  angka1 + " " + operator + " " + angka2 + "adalah" + hasil);
        txtAngka1.setText("");
        txtAngka2.setText("");
        cbOperator.setSelectedIndex(0);
    }//GEN-LAST:event_btnHitungActionPerformed

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
            java.util.logging.Logger.getLogger(kalkulatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kalkulatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kalkulatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kalkulatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
 
            public void run() {
                new kalkulatorForm().setVisible(true);
            }
        });
        
    }
    
      
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHitung;
    private javax.swing.JComboBox<String> cbOperator;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtAngka1;
    private javax.swing.JTextField txtAngka2;
    // End of variables declaration//GEN-END:variables
}
