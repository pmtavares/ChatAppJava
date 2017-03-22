package com.pedro.ClientServer;

/**
 * Java Chat Application - DT249/4
 * @author Pedro Tavares - D12123176
 */

import java.awt.Toolkit;
public class MainProgram extends javax.swing.JFrame {


    public MainProgram() {
        initComponents();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainTitleLabel = new javax.swing.JLabel();
        InformationLabel = new javax.swing.JLabel();
        OpenServerButton = new javax.swing.JButton();
        OpenClientButton = new javax.swing.JButton();
        ServerButtonInf = new javax.swing.JLabel();
        ClientButtonInf = new javax.swing.JLabel();
        MainCloseButton = new javax.swing.JButton();
        DITIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chat Java Application");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Icon.png")));
        setName("MainForm"); // NOI18N
        setResizable(false);

        MainTitleLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MainTitleLabel.setText("Chat Application");
        MainTitleLabel.setToolTipText("");

        InformationLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        InformationLabel.setText("Choose one of the following:");

        OpenServerButton.setText("Open Server");
        OpenServerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenServerButtonActionPerformed(evt);
            }
        });

        OpenClientButton.setText("Open Client");
        OpenClientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenClientButtonActionPerformed(evt);
            }
        });

        ServerButtonInf.setText("Not started yet. Start it before open any client.");
        ServerButtonInf.setToolTipText("");

        ClientButtonInf.setText("Can open more than one.");

        MainCloseButton.setText("Close");
        MainCloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainCloseButtonActionPerformed(evt);
            }
        });

        DITIcon.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(OpenServerButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ServerButtonInf))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(InformationLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(OpenClientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MainCloseButton)
                            .addComponent(ClientButtonInf)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DITIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(MainTitleLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DITIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(MainTitleLabel)
                        .addGap(18, 18, 18)))
                .addComponent(InformationLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OpenServerButton)
                    .addComponent(ServerButtonInf))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OpenClientButton)
                    .addComponent(ClientButtonInf))
                .addGap(18, 18, 18)
                .addComponent(MainCloseButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MainCloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainCloseButtonActionPerformed
        super.dispose(); //Close the form
        //Code to close all the opened forms
    }//GEN-LAST:event_MainCloseButtonActionPerformed

    private void OpenClientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenClientButtonActionPerformed
        (new ChatClient()).setVisible(true);
    }//GEN-LAST:event_OpenClientButtonActionPerformed

    private void OpenServerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenServerButtonActionPerformed
        (new ChatServer()).setVisible(true);
        OpenServerButton.setEnabled(false);
        ServerButtonInf.setText("Server Screen already started");
    }//GEN-LAST:event_OpenServerButtonActionPerformed


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
            java.util.logging.Logger.getLogger(MainProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainProgram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ClientButtonInf;
    private javax.swing.JLabel DITIcon;
    private javax.swing.JLabel InformationLabel;
    private javax.swing.JButton MainCloseButton;
    private javax.swing.JLabel MainTitleLabel;
    private javax.swing.JButton OpenClientButton;
    private javax.swing.JButton OpenServerButton;
    private javax.swing.JLabel ServerButtonInf;
    // End of variables declaration//GEN-END:variables
}