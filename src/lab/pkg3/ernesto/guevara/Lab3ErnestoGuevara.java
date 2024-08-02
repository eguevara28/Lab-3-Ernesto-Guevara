/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.pkg3.ernesto.guevara;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author ernes
 */
public class Lab3ErnestoGuevara {

    public static void main(String[] args) {

        Scanner lea = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("*** Menu ***");
            System.out.println("1. Piedra, Papel o Tijeras");
            System.out.println("2. Ejercicio Suma");
            System.out.println("3. Media Piramide");
            System.out.println("4. Salir");
            int op = lea.nextInt();

            if (op == 1) {
                while (true) {
                    System.out.println("Elija una opcion: ");
                    System.out.println("1. Piedra");
                    System.out.println("2. Papel");
                    System.out.println("3. Tijera");
                    int decision = lea.nextInt();

                    int aleatorio = random.nextInt(3) + 1;

                    if (decision == 1 && aleatorio == 1) {
                        System.out.println("Elegiste: Piedra");
                        System.out.println("La computadora eligio: Piedra");
                        System.out.println("El resultado es: Empate");
                    }

                    if (decision == 1 && aleatorio == 2) {
                        System.out.println("Elegiste: Piedra");
                        System.out.println("La computadora eligio: Papel");
                        System.out.println("El resultado es: Gano la computadora");
                    }

                    if (decision == 1 && aleatorio == 3) {
                        System.out.println("Elegiste: Piedra");
                        System.out.println("La computadora eligio: Tijera");
                        System.out.println("El resultado es: Gano usted");
                    }

                    if (decision == 2 && aleatorio == 1) {
                        System.out.println("Elegiste: Papel");
                        System.out.println("La computadora eligio: Piedra");
                        System.out.println("El resultado es: Gano usted");
                    }

                    if (decision == 2 && aleatorio == 2) {
                        System.out.println("Elegiste: Papel");
                        System.out.println("La computadora eligio: Papel");
                        System.out.println("El resultado es: Empate");
                    }

                    if (decision == 2 && aleatorio == 3) {
                        System.out.println("Elegiste: Papel");
                        System.out.println("La computadora eligio: Tijera");
                        System.out.println("El resultado es: Gano la computadora");
                    }

                    if (decision == 3 && aleatorio == 1) {
                        System.out.println("Elegiste: Tijera");
                        System.out.println("La computadora eligio: Piedra");
                        System.out.println("El resultado es: Gano la computadora");
                    }

                    if (decision == 3 && aleatorio == 2) {
                        System.out.println("Elegiste: Tijera");
                        System.out.println("La computadora eligio: Papel");
                        System.out.println("Resultado: Gano usted");
                    }

                    if (decision == 3 && aleatorio == 3) {
                        System.out.println("Elegiste: Tijera");
                        System.out.println("La computadora eligio: Tijera");
                        System.out.println("El resultado es: Empate");
                    }

                    System.out.println("Desea volver a jugar? (s/n)");
                    char volver = lea.next().charAt(0);

                    if (volver == 'n') {
                        break;
                    }
                }
            }

            if (op == 2) {
                while (true){
                System.out.println("Ingrese un numero para sumar sus digitos");
                String numeros = lea.next();

                String mostrarsuma = "";
                int sumadigitos = 0;

                for (int i = 0; i < numeros.length(); i++) {
                    mostrarsuma += numeros.charAt(i)+" + ";
                    int digitos = Integer.parseInt(String.valueOf(numeros.charAt(i)));
                    sumadigitos += digitos;
                }

                System.out.println(mostrarsuma + " = " + sumadigitos);
                
                    System.out.println("Desea volver a intentarlo? (s/n)");
                    char volver=lea.next().charAt(0);
                    
                    if(volver=='n'){
                        break;
                    }
                }
            }

            if (op == 3) {
                while (true){
                System.out.println("Ingrese un numero");
                int numero = lea.nextInt();
                for (int i = 0; i < numero; i++) {
                    for (int k = 0; k < i; k++) {
                        System.out.print("  ");
                    }
                    for (int j = numero - i; j >= 1; j--) {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }
                
                    System.out.println("Desea volver a intentarlo? (s/n)");
                    char volver=lea.next().charAt(0);
                    
                    if(volver=='n'){
                        break;
                    }
                }
            }
            
            if(op==4){
                System.out.println("Nos vemos");
                break;
            }
        }
    }
}
