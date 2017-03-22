package com.pedro.ClientServer;


import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 * Java Chat Application - DT249/4
 * @author Pedro Tavares - D12123176
 * This is the Interface for the Client
 */
public interface ClientInterface extends Remote {
    public void tellMessage(String from, String message) throws RemoteException;
    public String getClienttName() throws RemoteException;
    public int authenticate() throws RemoteException;
    public void logout() throws RemoteException;
    public DefaultListModel getClients(ArrayList<ClientInterface> ClientList) throws RemoteException;
    public ServerInterface getServer() throws RemoteException;
    
}
