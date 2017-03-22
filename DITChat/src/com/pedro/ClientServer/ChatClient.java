package com.pedro.ClientServer;


import java.awt.Color;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.DefaultCaret;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;


public class ChatClient extends javax.swing.JFrame{

    
    private Client client;
    private String host;
    private String nick;
    public DefaultListModel listModel = new DefaultListModel(); 
    
    public ChatClient(){
        initComponents();
        this.setLocationRelativeTo(null);

        try {
            Registry registry = LocateRegistry.getRegistry(1099);
        } catch (RemoteException ex) {
            Logger.getLogger(ChatClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ChatClientTitleLabel = new javax.swing.JLabel();
        HostLabel = new javax.swing.JLabel();
        HostIPTextField = new javax.swing.JTextField();
        NameLabel = new javax.swing.JLabel();
        NameUniqueTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        LIstName = new javax.swing.JList();
        WriteMsgTextField = new javax.swing.JTextField();
        SendMsgButton = new javax.swing.JButton();
        ConnectButton = new javax.swing.JButton();
        DisconnectButton = new javax.swing.JButton();
        ConversationsLabel = new javax.swing.JLabel();
        UsersConnectedLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        DITIcon = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        MessagesTextArea = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Chat Program");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Icon.png")));
        setMaximumSize(new java.awt.Dimension(350, 360));
        setMinimumSize(new java.awt.Dimension(350, 360));
        setName("ChatClient"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                ClosingWindow(evt);
            }
        });

        ChatClientTitleLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ChatClientTitleLabel.setText("Client Chat");

        HostLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        HostLabel.setText("Host IP:");

        HostIPTextField.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        HostIPTextField.setText("localhost");

        NameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NameLabel.setText("Your Name (unique):");

        NameUniqueTextField.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NameUniqueTextField.setForeground(new java.awt.Color(0, 51, 255));

        jScrollPane2.setViewportView(LIstName);

        WriteMsgTextField.setEnabled(false);

        SendMsgButton.setText("Send");
        SendMsgButton.setEnabled(false);
        SendMsgButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendMsgButtonActionPerformed(evt);
            }
        });

        ConnectButton.setText("Connect");
        ConnectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConnectButtonActionPerformed(evt);
            }
        });

        DisconnectButton.setText("Disconnect");
        DisconnectButton.setEnabled(false);
        DisconnectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisconnectButtonActionPerformed(evt);
            }
        });

        ConversationsLabel.setText("Conversations");

        UsersConnectedLabel.setText("Users");

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        jLabel1.setText("Pedro Tavares - DIT");

        DITIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pedro/ClientServer/DIT_logoFinal.png"))); // NOI18N
        DITIcon.setToolTipText("");

        MessagesTextArea.setEditable(false);
        jScrollPane3.setViewportView(MessagesTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(WriteMsgTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SendMsgButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(HostLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HostIPTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NameUniqueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DITIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94)
                                .addComponent(ChatClientTitleLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ConnectButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DisconnectButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(ConversationsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(UsersConnectedLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ChatClientTitleLabel))
                    .addComponent(DITIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HostLabel)
                    .addComponent(HostIPTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameLabel)
                    .addComponent(NameUniqueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConversationsLabel)
                    .addComponent(UsersConnectedLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WriteMsgTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SendMsgButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DisconnectButton)
                    .addComponent(ConnectButton)
                    .addComponent(jLabel1))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConnectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConnectButtonActionPerformed
        if(validateFields())
        {
            try {
                int result = this.doConnect();
                switch (result){
                    case 1:
                        this.manageGui(1);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Choose another Nickname", 
                        "Nickname already exists", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "There are already too many people in the chat", 
                        "Chatroom is Full", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
            }
            catch(RemoteException | NotBoundException | MalformedURLException ex){
                JOptionPane.showMessageDialog(this, "This Server is not Available", "Check your host", JOptionPane.ERROR_MESSAGE);
            
            }
       }

    }//GEN-LAST:event_ConnectButtonActionPerformed

    private void DisconnectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisconnectButtonActionPerformed
        try 
        {
            this.manageGui(2);
            this.disconnect();
        }
        catch(RemoteException ex)
        {
            JOptionPane.showMessageDialog(null, "A problem has occurred", "Error to disconnect", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_DisconnectButtonActionPerformed

    private void SendMsgButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendMsgButtonActionPerformed
        String st= WriteMsgTextField.getText();
                
        st = "<< "+ client.getClienttName() +" >> "+st; 
        
        WriteMsgTextField.setText("");
        MessagesTextArea.setEditable(true);
        try {
            client.getServer().sendMessage(client.getClienttName(), st);

        }
        catch(RemoteException ex)
        {
            ex.getMessage();
        }
        MessagesTextArea.setEditable(false);
    }//GEN-LAST:event_SendMsgButtonActionPerformed

    
    //If the user not disconnect but only close the window, he will be disconnected
    private void ClosingWindow(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_ClosingWindow
        
        try {
            
            if(!ConnectButton.isEnabled())
            {
                this.manageGui(2);
                this.disconnect();
            }
            else
            {
                this.dispose();
            }
            
        }
        catch(RemoteException ex)
        {
            
        }
    }//GEN-LAST:event_ClosingWindow
    public void WriteMessage(String from, String message)
    {
        Color c;
        StyleContext sc = StyleContext.getDefaultStyleContext();
        AttributeSet aset;
        int len = MessagesTextArea.getDocument().getLength();
        //Make the user vizualize last lines
        DefaultCaret caret = (DefaultCaret) MessagesTextArea.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE); 
        MessagesTextArea.setEditable(true);
        
        
        if(NameUniqueTextField.getText().equals(from))
        {            
            c = Color.BLUE;
            aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, c);
            
        }
     
        else
        {
            c = Color.BLACK;
            aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, c);
            
            
        }
        MessagesTextArea.setCaretPosition(len);
        MessagesTextArea.setCharacterAttributes(aset, false);
        MessagesTextArea.replaceSelection("\n" + message);
        MessagesTextArea.setEditable(false);
        
    }
    
      
    public void updateUsersList(){
        try 
        {
            client.getServer().getConnecions();
            LIstName.setModel(client.listModel);
          
        }
        catch(RemoteException ex)
        {
            JOptionPane.showMessageDialog(null, "A problem has occurred when trying to get the users", 
                    "List Error ", JOptionPane.ERROR_MESSAGE);
        }
       
    }
    /*
    * This is the function that will trigger when the user press the connect button in the Chat
    * This will return a number for validation purpose.
    * 1 = Success, 2 = Nick taken, 3 = Too many people
    */
     public int doConnect() throws RemoteException, NotBoundException, MalformedURLException{
        this.host = HostIPTextField.getText();
        this.nick = NameUniqueTextField.getText();
        client = new Client(this.nick, (ServerInterface) Naming.lookup("rmi://"+this.host+"/mainServer"));
        client.setGUI(this);
        return client.authenticate();
     }
     
     public void disconnect() throws RemoteException
     {
         client.getServer().logout(client);
         updateUsersList();
         client.logout();
     }
     
     private void manageGui(int option)
     {
         switch(option)
         {
            case 1:
                MessagesTextArea.setEditable(true);
                ConnectButton.setEnabled(false);
                DisconnectButton.setEnabled(true);
                SendMsgButton.setEnabled(true);
                WriteMsgTextField.setEnabled(true);
                NameUniqueTextField.setEditable(false);
                HostIPTextField.setEnabled(false);
                break;
            case 2:
                ConnectButton.setEnabled(true);
                DisconnectButton.setEnabled(false);
                SendMsgButton.setEnabled(false);
                WriteMsgTextField.setEnabled(false);
                NameUniqueTextField.setEditable(true);
                HostIPTextField.setEnabled(true);
                MessagesTextArea.setEditable(false);
                break; 
         }
         
     }
     
     private boolean validateFields()
     {
         if(HostIPTextField.getText().length() < 2)
         {
            JOptionPane.showMessageDialog(this, "Host cannot be left blank!", "Information", JOptionPane.INFORMATION_MESSAGE);
            return false;
         }
         else if(NameUniqueTextField.getText().length() < 2)
         {
            JOptionPane.showMessageDialog(this, "Your name cannot be left blank!", "Information", JOptionPane.INFORMATION_MESSAGE);
            return false;
         }

         else
         {
            return true; 
         }
   
     }

    
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
            java.util.logging.Logger.getLogger(ChatClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChatClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChatClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChatClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ChatClient().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ChatClientTitleLabel;
    private javax.swing.JButton ConnectButton;
    private javax.swing.JLabel ConversationsLabel;
    private javax.swing.JLabel DITIcon;
    private javax.swing.JButton DisconnectButton;
    private javax.swing.JTextField HostIPTextField;
    private javax.swing.JLabel HostLabel;
    private javax.swing.JList LIstName;
    private javax.swing.JTextPane MessagesTextArea;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameUniqueTextField;
    private javax.swing.JButton SendMsgButton;
    private javax.swing.JLabel UsersConnectedLabel;
    private javax.swing.JTextField WriteMsgTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
