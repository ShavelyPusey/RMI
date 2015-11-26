package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;



public interface RMI extends Remote{
    public String getData(String text) throws RemoteException;
    public String getCantante(String text) throws RemoteException;
    public String showCantante() throws RemoteException;
}
