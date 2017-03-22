/**
 * Java Chat Application - DT249/4
 * @author Pedro Tavares - D12123176
 */

package com.pedro.ClientServer;

import java.awt.Color;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ChatServer extends javax.swing.JFrame {
  
    public static Registry registry ;
    ServerInterface server;
    boolean registryCreated = false;

    public ChatServer() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ChatServerTitle = new javax.swing.JLabel();
        PortNumberLabel = new javax.swing.JLabel();
        StartServerButton = new javax.swing.JButton();
        StopServerButton = new javax.swing.JButton();
        ServerLabelInf = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Server: Client/Server Application");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Icon.png")));
        setResizable(false);

        ChatServerTitle.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ChatServerTitle.setText("Server");

        PortNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PortNumberLabel.setText("Port Number is 1099");

        StartServerButton.setText("Start Server");
        StartServerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartServerButtonActionPerformed(evt);
            }
        });

        StopServerButton.setText("Stop Server");
        StopServerButton.setEnabled(false);
        StopServerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopServerButtonActionPerformed(evt);
            }
        });

        ServerLabelInf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ServerLabelInf.setForeground(new java.awt.Color(255, 0, 0));
        ServerLabelInf.setText("Server is not running.");

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel1.setText("Pedro Tavares - DIT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ServerLabelInf, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(154, 154, 154)
                            .addComponent(ChatServerTitle))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(PortNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(StartServerButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(StopServerButton))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ChatServerTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PortNumberLabel)
                    .addComponent(StartServerButton)
                    .addComponent(StopServerButton))
                .addGap(18, 18, 18)
                .addComponent(ServerLabelInf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartServerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartServerButtonActionPerformed
        try {
            if(registryCreated == false)
            {
                registry = LocateRegistry.createRegistry(1099);
                registryCreated = true;

            }
            else
            {
                registry = LocateRegistry.getRegistry();
            }

            this.server = new Server();
            Naming.rebind("rmi://localhost/mainServer", this.server);
            
            //Modifying the Gui's items
            ServerLabelInf.setText("Server is running...");
            ServerLabelInf.setForeground(Color.BLUE);
            StopServerButton.setEnabled(true);
            StartServerButton.setEnabled(false);

        }

        catch(RemoteException | MalformedURLException ex)
        {
            System.out.println(ex);
        }
  
    }//GEN-LAST:event_StartServerButtonActionPerformed

    private void StopServerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StopServerButtonActionPerformed
        try{
            Naming.unbind("mainServer");
            UnicastRemoteObject.unexportObject(registry, true);
            this.server = null;
            if(registryCreated == true)
            {
                registry = null;
                registryCreated = false;
  
            }

            //Modifying the Gui's items
            ServerLabelInf.setText("Server is stopped...");
            ServerLabelInf.setForeground(Color.RED);
            StopServerButton.setEnabled(false);
            StartServerButton.setEnabled(true);

        }
        catch(RemoteException | NotBoundException | MalformedURLException ex)
        {
            System.out.println("A error occur when trying to stop the server:\n" + ex.getLocalizedMessage());
        }
        
    }//GEN-LAST:event_StopServerButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ChatServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChatServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChatServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChatServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatServer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ChatServerTitle;
    private javax.swing.JLabel PortNumberLabel;
    private javax.swing.JLabel ServerLabelInf;
    private javax.swing.JButton StartServerButton;
    private javax.swing.JButton StopServerButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
