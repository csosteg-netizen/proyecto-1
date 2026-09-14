/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto1;
import java.util.Scanner;

/**
 *
 * @author csost
 */
public class mantenimiento_vehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner entrada = new
                Scanner(System.in);
      //Definir variables (datos vehiculo)
         
        String marca =  entrada.nextLine();
               
       String modelo =  entrada.nextLine();
                 
        String tipo = entrada.nextLine();
                
         int año = entrada.nextInt();
         
         int kilometraje_Actual  = entrada.nextInt();
                 
      //Ingresar datos vehiculo
                 System.out.println("Ingrese la marca del vehiculo:");
                 System.out.println("Ingrese el modelo del vehiculo:");
                 System.out.println("Ingrese el tipo del vehiculo:");
                 System.out.println("Ingrese el año del vehiculo:");
                 System.out.println("Ingrese el kilometraje Actual del vehiculo:");
         
        System.out.println("La marca es:" + marca);
        System.out.println("El modelo es:" + modelo);
        System.out.println("El tipo es :" + tipo);
        System.out.println("El año es:" + año);
        System.out.println("El kilometraje es:" + kilometraje_Actual);
    
    }
    
}
