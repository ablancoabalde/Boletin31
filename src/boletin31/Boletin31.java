package boletin31;

import java.util.ArrayList;

public class Boletin31 {

    public static void main(String[] args) {
        //String matricula, String marca, String modelo
        Coche coche1 = new Coche("A1234","Audi","A4");
        Coche coche2 = new Coche("A2345",",Mercedes","S1");
        //String nombreDespacho
        Despacho despacho1= new Despacho("Despacho 1");
        Despacho despacho2= new Despacho("Despacho 2");
        //String nombre, String dni
        Cliente cliente1 = new Cliente("Paco","12345678B");
        Cliente cliente2 = new Cliente("Pepa","23456789C");
        //Despacho des, Coche coche, String nome, String apelidos, String dni,
        //String direcc, int antiguedad, String telf, double salario
        Empregados xefe1= new XZona(despacho1,coche1,"Lurdes","Abel","45678912D","Camino",5,"986475566",1457);
        //String fax, Despacho des, String nome, String apelidos,
        //String dni, String direcc, int antiguedad, String telf, double salario
        Empregados secre1 = new Secretario("034986475214",despacho2,"Lolo","Caballero","89456123J","Rua",3,"986225533",1000);
        //Coche coche, String telfMovil, String area, String nome,
        //String apelidos, String dni, String direcc, int antiguedad, String telf, double salario      
        Empregados vendedor1= new Vendedor(coche2,"655474434","Vigo","María","Gil","45612378G","Silo",2,"986475512",954);  
                
        System.out.println(xefe1);
         System.out.println(secre1);
          System.out.println(vendedor1);
          
          secre1.cmSupervisor(xefe1);
          System.out.println(secre1);
          
        
    }
}
