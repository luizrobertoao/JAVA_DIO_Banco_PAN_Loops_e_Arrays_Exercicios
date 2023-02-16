package br.com.dio.exercicios.arrays;

import java.util.Scanner;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos números terá o vetor?");
        int tamanhoVetor = sc.nextInt();
        int vetor[] = new int[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.println("Digite um número: ");
            int numero = sc.nextInt();
            vetor[i] = numero;
        }

        System.out.println("Números digitados em ordem inversa:");

        for(int i = tamanhoVetor - 1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }


    }
}
