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

    // Funcion para calcular los kilometros recorridos
    public static int calcularKilometraje(int actual, int anterior) {
        return actual - anterior;
    }

    // Funcion para verificar si necesita mantenimiento
    public static boolean necesitaMantenimiento(int recorrido, int intervalo, int meses) {
        return recorrido >= intervalo || meses >= 12;
    }

    // Funcion para determinar el tipo de mantenimiento
    public static String determinarTipo(int meses) {
        if (meses >= 12) {
            return "Mantenimiento completo";
        } else {
            return "Mantenimiento preventivo";
        }
    }

    // Funcion para determinar la prioridad
    public static String determinarPrioridad(int meses) {
        if (meses >= 12) {
            return "Alta";
        } else {
            return "Media";
        }
    }

    // Funcion para calcular el costo estimado
    public static double calcularCosto(int meses) {
        if (meses >= 12) {
            return 300000;
        } else {
            return 180000;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Definir variables
        String marca;
        String modelo;
        String tipo;
        String tipoMantenimiento;
        String prioridad;

        int año;
        int kilometrajeActual;
        int intervaloMantenimiento = 5000;
        int KilometrajeUltimoMantenimiento;
        int kilometrajeRecorrido;
        int mesesTranscurridos;

        double costoEstimado;

        // Ingresar datos del vehiculo
        System.out.println("Ingrese la marca del vehiculo:");
        marca = entrada.nextLine();

        System.out.println("Ingrese el modelo del vehiculo:");
        modelo = entrada.nextLine();

        System.out.println("Ingrese el tipo del vehiculo:");
        tipo = entrada.nextLine();

        System.out.println("Ingrese el año del vehiculo:");
        año = entrada.nextInt();

        System.out.println("Ingrese el kilometraje actual del vehiculo:");
        kilometrajeActual = entrada.nextInt();

        System.out.println("Ingrese el kilometraje del ultimo mantenimiento:");
        KilometrajeUltimoMantenimiento = entrada.nextInt();

        System.out.println("Ingrese los meses transcurridos desde el ultimo mantenimiento:");
        mesesTranscurridos = entrada.nextInt();

        // Validar kilometraje
        if (kilometrajeActual < KilometrajeUltimoMantenimiento) {

            System.out.println("Error: el kilometraje actual no puede ser menor que el kilometraje anterior.");

        } else {

            // Calcular kilometraje recorrido
            kilometrajeRecorrido = calcularKilometraje(
                    kilometrajeActual, KilometrajeUltimoMantenimiento);

            System.out.println();
            System.out.println("----- INFORMACION DEL VEHICULO -----");
            System.out.println("La marca es: " + marca);
            System.out.println("El modelo es: " + modelo);
            System.out.println("El tipo es: " + tipo);
            System.out.println("El año es: " + año);
            System.out.println("El kilometraje actual es: " + kilometrajeActual + " km");
            System.out.println("El kilometraje anterior es: "
                    + KilometrajeUltimoMantenimiento + " km");
            System.out.println("El intervalo recomendado de mantenimiento es cada: "
                    + intervaloMantenimiento + " km");
            System.out.println("El kilometraje recorrido desde el ultimo mantenimiento es: "
                    + kilometrajeRecorrido + " km");
            System.out.println("Los meses transcurridos son: "
                    + mesesTranscurridos);

            // Verificar si necesita mantenimiento
            if (necesitaMantenimiento(
                    kilometrajeRecorrido,
                    intervaloMantenimiento,
                    mesesTranscurridos)) {

                System.out.println();
                System.out.println("El vehiculo necesita mantenimiento.");

                tipoMantenimiento = determinarTipo(mesesTranscurridos);
                prioridad = determinarPrioridad(mesesTranscurridos);
                costoEstimado = calcularCosto(mesesTranscurridos);

                System.out.println("Tipo de mantenimiento: "
                        + tipoMantenimiento);
                System.out.println("Prioridad: " + prioridad);
                System.out.println("Costo estimado: $" + costoEstimado);

            } else {

                tipoMantenimiento = "No requiere mantenimiento";
                prioridad = "Baja";
                costoEstimado = 0;

                System.out.println();
                System.out.println("El vehiculo no necesita mantenimiento por el momento.");
                System.out.println("Tipo de mantenimiento: "
                        + tipoMantenimiento);
                System.out.println("Prioridad: " + prioridad);
                System.out.println("Costo estimado: $" + costoEstimado);
             }
        }

        entrada.close();
    }
}
