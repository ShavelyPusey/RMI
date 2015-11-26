
import java.io.BufferedReader;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import rmi.RMI;


public class RMIClient {
    public static void main(String args[]){
        RMIClient client = new RMIClient();
        client.connectServer();
    }
    private void connectServer() {
        Scanner sc = new Scanner(System.in);
        try{
            
            Registry reg = LocateRegistry.getRegistry("127.0.0.1",22);
            RMI rmi = (RMI) reg.lookup("server");
            System.out.println("Connected to server");
            while (true){
                System.out.println("Escriba el nombre del Cantante.");
                String cantante = sc.nextLine();
                if (!cantante.isEmpty()){
                    System.out.println(rmi.getCantante(cantante)); 
                }
                else {
                    break; 
                }
            }
            System.out.println(" Cantantes ingresados:  " );
           System.out.println(rmi.showCantante());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
