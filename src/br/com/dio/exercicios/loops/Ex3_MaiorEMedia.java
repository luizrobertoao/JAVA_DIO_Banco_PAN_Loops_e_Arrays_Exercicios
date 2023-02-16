package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroMaior = 0;
        int soma = 0;
        int media = 0;

        for (int i = 1; i < 6; i++) {
            System.out.println("Digite um número: ");
            int numero = sc.nextInt();
            soma = (soma + numero);
            if (numero > numeroMaior) numeroMaior = numero;
            media = (soma / i);
        }


        System.out.println("O maior número digitado foi: " + numeroMaior);
        System.out.println("A média dos números digitados é: " + media);
    }
}
