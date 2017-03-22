package com.pedro.ClientServer;

import java.rmi.Remote;
import java.rmi.RemoteException;


/**
 * Java Chat Application - DT249/4
 * @author Pedro Tavares - D12123176
 * This is the Interface for the Server
 */
public interface ServerInterface extends Remote{
    
    public int authenticate(ClientInterface client) throws RemoteException;
    public void logout(ClientInterface client) throws RemoteException;
    public void getConnecions() throws RemoteException;
    public void sendMessage(String from, String message) throws RemoteException; //BroadCast
    
}
