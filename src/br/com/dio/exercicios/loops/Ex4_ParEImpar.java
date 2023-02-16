package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadeNumeros;
        int totalPares = 0;
        int totalImpares = 0;

        System.out.println("Quantos números serão digitados?");
        quantidadeNumeros = sc.nextInt();

        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.println("Digite o " + (i + 1) + "º número:");
            int numero = sc.nextInt();
            if ((numero % 2) == 0) {
                totalPares++;
            } else {
                totalImpares++;
            }
        }

        System.out.println("O total de números pares é: " + totalPares);
        System.out.println("O total de números ímpares é: " + totalImpares);
    }
}
