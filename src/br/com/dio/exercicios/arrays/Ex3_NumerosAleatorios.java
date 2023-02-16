package br.com.dio.exercicios.arrays;

import java.util.Random;
import java.util.Scanner;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/
public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[20];

// DIGITANDO 20 NÚMEROS ALEATÓRIOS:
        int contador = 0;

        do {
            System.out.println("Digite um número:");
            int numero = sc.nextInt();

            if (numero >= 0 && numero <= 100) {
                numeros[contador] = numero;
                contador++;
            } else {
                System.out.println("Número inválido, digite um números entre 0 e 100.");
            }
        } while (contador < (numeros.length));


        System.out.println("Números digitados e seus sucessores:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " sucessor -> " + (numeros[i] + 1));
        }

// USANDO CLASSE Random:
//        Random random = new Random();
//
//        System.out.println("Números aleatórios e seus sucessores:");
//
//        for (int i = 0; i < numeros.length; i++) {
//            int numero = random.nextInt(100);
//            numeros[i] = numero;
//            System.out.println(numeros[i] + " sucessor -> " + (numeros[i] + 1));
//        }

    }
}
