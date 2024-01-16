package org.example;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner leerDato = new Scanner(System.in);

        int litros = 100;
        int precioCombustible = 50000;
        int kmRecorridos;
        int litrosKm;
        int litrosViaje;
        int totalCombustible;
        String nombreConductor;
        String marcaCarro;

        System.out.println("Ingresa tu nombre: ");
        nombreConductor = leerDato.nextLine();

        System.out.println("Ingrese la marca del carro: ");
        marcaCarro = leerDato.nextLine();

        System.out.print("Ingrese los kilometros que va a recorrer: ");
        kmRecorridos = leerDato.nextInt();

        System.out.print("Ingrese los litros de gasolina del viaje: ");
        litrosViaje = leerDato.nextInt();

        litrosKm = kmRecorridos * litrosViaje / litros;
        totalCombustible = litrosKm * precioCombustible;



        System.out.println("\nBuenas tardes Sr@ "+ nombreConductor + " su recorrido es de "+
                kmRecorridos + " Km y el total de combustible es $"+ totalCombustible +
                " con un consumo de combustible de " + litrosKm +
                " litros en su carro marca "+ marcaCarro);



    }
}