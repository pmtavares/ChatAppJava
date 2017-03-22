package com.pedro.ClientServer;

/**
 * Java Chat Application - DT249/4
 * @author Pedro Tavares - D12123176
 */


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class Server extends UnicastRemoteObject implements ServerInterface{
    
    private ArrayList<ClientInterface> chatClients;
 
    public Server() throws RemoteException{
        chatClients = new ArrayList();
  
    }

    /*
    *  This is the Authenticate function on the server. This code is reponsible to add the users
    *   into the chat. Besides, validations as unique nick name and to limite the amount of users
    *   in the chat is also done within this function.
    * 1 = Success, 2 = Nick name taken, 3 = Too many people
    */
    @Override
    public int authenticate(ClientInterface client) throws RemoteException {
           
        if(chatClients.isEmpty())
        {
            sendMessage(" ",client.getClienttName()+ " has connected!");
            chatClients.add(client);
            return 1;
     
        }
        else if(chatClients.size() > 0 && chatClients.size() < 10)
        {
            boolean nickFound = false;
            String testNick = client.getClienttName();
            for (ClientInterface chatClient : chatClients) {
                if (chatClient.getClienttName().equals(testNick)) {
                    nickFound = true;
                    break;
                }
            }
            if(nickFound == false)
            {
                sendMessage(" ", client.getClienttName()+ " has connected!");
                chatClients.add(client);
                return 1;
            }
            else
            {
                return 2;
            }
        }

        else
        {
            return 3;
        }

    }

    @Override
    public void logout(ClientInterface client) throws RemoteException {
        chatClients.remove(client); 
        sendMessage("", client.getClienttName()+ " left the chat!");
  
    }

    @Override
    public void sendMessage(String from, String message) throws RemoteException {
        for (ClientInterface tmp : chatClients) {
            
            tmp.tellMessage(from, message);
        }
  
    }

    @Override
    public void getConnecions() throws RemoteException {
        for (ClientInterface tmp : chatClients) {
            tmp.getClients(chatClients);
        }
        
    }
       
}
