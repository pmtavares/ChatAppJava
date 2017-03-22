/**
 * Java Chat Application - DT249/4
 * @author Pedro Tavares - D12123176
 */
package com.pedro.ClientServer;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class Client extends UnicastRemoteObject implements ClientInterface{
    public DefaultListModel listModel = new DefaultListModel(); 
    private final String NAME;
    private ChatClient ui;
    private final ServerInterface SERVER;

    public Client (String name,ServerInterface server  ) throws RemoteException
    {
        this.NAME = name;
        this.SERVER = server;
    }
    
    @Override
    public void tellMessage(String from, String message) throws RemoteException {
        ui.WriteMessage(from, message);
             
        
    }

    @Override
    public String getClienttName() {
        return this.NAME;
    }

    @Override
    public int authenticate() throws RemoteException {
        if(this.getServer().authenticate(this) == 1)
        {
            this.authenticate();
            ui.updateUsersList();
            tellMessage(null,"You are connected");
            return 1;
        }
        if(this.getServer().authenticate(this) == 2){
            return 2;
        }
        else
        {
            return 3;
        }
        
    
    }
    
    @Override
    public void logout() throws RemoteException {
        tellMessage(null,"You left the chat");
    }
    
    
    //Every Client will have a list of the connecions of others clients
    @Override
    public DefaultListModel getClients(ArrayList<ClientInterface> users)
    {
      if(users!=null)
      {
        listModel.removeAllElements();
        String tmp = null;
          for (ClientInterface user : users) {
              try 
              {
                  tmp = user.getClienttName();
                  listModel.addElement(tmp);
              }catch(RemoteException e){
                  e.getMessage();
              }
          }
       
       ui.listModel = this.listModel; 
       return ui.listModel;
      }
      else
      {
          return null;
      }
      
    }
    
    @Override
    public ServerInterface getServer()
    {
        return this.SERVER;
    }
    
    
    //This is the GUI that every Client will have
    public void setGUI(ChatClient t){ 
        this.ui = t ; 
    } 

}
