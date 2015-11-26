package server;

import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;
import rmi.Ejercicio57;
import rmi.RMI;


public class RMIServer extends UnicastRemoteObject implements RMI{

    Ejercicio57 cantante = new Ejercicio57();
    
    public RMIServer() throws RemoteException{
        super();
    } 
    @Override 
    public String getData(String text) throws RemoteException {
        text = "Hi" +text;
        return text;
    }
   
    public static void main(String args[]){
        try{
            Registry reg = LocateRegistry.createRegistry(22);//puerto para comunicacion
            reg.rebind("server", new RMIServer());
            System.out.println("server started");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    @Override
    public String getCantante(String text) throws RemoteException {
        cantante.setCantante(text);
        return "Cantante creado";
    }

    @Override
    public String showCantante() throws RemoteException {
        return cantante.printCantantes();
    }

   
}
    