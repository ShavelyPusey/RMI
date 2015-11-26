package rmi;

import java.util.ArrayList;
import java.util.Scanner;


public class Ejercicio57 {
    String cantante;
    ArrayList<String> Singers  = new ArrayList<String>();

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
        addCantantes(cantante);
    }

    public Ejercicio57() {
    }
    
    public Ejercicio57(String cantante) {
        this.cantante = cantante;
        addCantantes(cantante);
    }

     public String addCantantes(String cantante) { 
        String resultado = "";
        if (!cantante.isEmpty()){
            Singers.add(cantante); 
            resultado = "Cantante ingresado";
        }   
        else{
            resultado="Cantante No Ingresado";
        }
        return resultado;
    }
    
     public String printCantantes(){
         String listaCantantes ="";
         System.out.println(" Cantantes ingresados:  " );
        for (int i=0; i<Singers.size(); i++){
                listaCantantes = listaCantantes + i + " => " + Singers.get(i)+"\n"; // guardado en el arraylist
        }
        return listaCantantes;
     }
}

    


