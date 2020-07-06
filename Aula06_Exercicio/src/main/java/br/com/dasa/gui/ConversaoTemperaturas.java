/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dasa.gui;

import javax.swing.JOptionPane;

/**
 *
 * @author leonardo
 */
public class ConversaoTemperaturas extends javax.swing.JFrame {

    /**
     * Creates new form ConversaoTemperaturas
     */
    public ConversaoTemperaturas() {
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

        lblTemperaturaCelsius = new javax.swing.JLabel();
        lblTemperaturaFahrenheit = new javax.swing.JLabel();
        txtTemperaturaFahrenheit = new javax.swing.JTextField();
        lblTemperaturaKelvin = new javax.swing.JLabel();
        txtTemperaturaKelvin = new javax.swing.JTextField();
        btnConverter = new javax.swing.JButton();
        txtfTemperaturaCelsius = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor de Temperatura");

        lblTemperaturaCelsius.setText("Digite a temperatura em Celsius");

        lblTemperaturaFahrenheit.setText("Temperatura em Fahrenheit");

        txtTemperaturaFahrenheit.setEditable(false);

        lblTemperaturaKelvin.setText("Temperatura Kelvin");

        txtTemperaturaKelvin.setEditable(false);

        btnConverter.setText("Converter");
        btnConverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConverterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTemperaturaCelsius, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTemperaturaFahrenheit)
                    .addComponent(lblTemperaturaKelvin)
                    .addComponent(txtTemperaturaFahrenheit)
                    .addComponent(txtTemperaturaKelvin)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnConverter))
                    .addComponent(txtfTemperaturaCelsius))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTemperaturaCelsius)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfTemperaturaCelsius, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTemperaturaFahrenheit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTemperaturaFahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTemperaturaKelvin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTemperaturaKelvin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConverter)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConverterActionPerformed

        String txtTemperaturaCelsius = txtfTemperaturaCelsius.getText();

        if (txtTemperaturaCelsius.length() > 0) {

            double temperaturaCelsius = Double.parseDouble(txtTemperaturaCelsius);
            double fahrenheit = ((temperaturaCelsius * 9) / 5) + 32;
            double kelvin = temperaturaCelsius + 273.15;
            
            txtTemperaturaFahrenheit.setText(String.valueOf(fahrenheit));
            txtTemperaturaKelvin.setText(String.valueOf(kelvin));

        } else {

            JOptionPane.showMessageDialog(rootPane, "Digite Algo!");

        }
    }//GEN-LAST:event_btnConverterActionPerformed

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
            java.util.logging.Logger.getLogger(ConversaoTemperaturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConversaoTemperaturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConversaoTemperaturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConversaoTemperaturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConversaoTemperaturas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConverter;
    private javax.swing.JLabel lblTemperaturaCelsius;
    private javax.swing.JLabel lblTemperaturaFahrenheit;
    private javax.swing.JLabel lblTemperaturaKelvin;
    private javax.swing.JTextField txtTemperaturaFahrenheit;
    private javax.swing.JTextField txtTemperaturaKelvin;
    private javax.swing.JTextField txtfTemperaturaCelsius;
    // End of variables declaration//GEN-END:variables
}
