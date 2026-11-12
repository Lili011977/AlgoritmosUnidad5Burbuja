package com.mycompany.algoritmosunidad5burbuja;

import java.util.Scanner;

public class AlgoritmosUnidad5Burbuja {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Cuantos numeros deseas ingresar? ");
        int cantidad = entrada.nextInt();

        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor que cero.");
            return;
        }

        int[] numeros = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa el numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        // Ordenamiento burbuja
        for (int i = 0; i < cantidad - 1; i++) {
            for (int j = 0; j < cantidad - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int auxiliar = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = auxiliar;
                }
            }
        }

        System.out.println("Numeros ordenados de menor a mayor:");

        for (int i = 0; i < cantidad; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println();
    }
}