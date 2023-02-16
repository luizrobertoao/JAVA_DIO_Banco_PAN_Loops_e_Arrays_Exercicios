package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número para o cálculo de fatorial:");
        numero = sc.nextInt();


// PRIMEIRA SOLUÇÃO:
//        long resultadoFatorial = 0L;
//        for (int i = 1; i < numero; i++) {
//
//            if (resultadoFatorial == 0) {
//                resultadoFatorial = (long) numero * (numero - i);
//            } else {
//                resultadoFatorial = resultadoFatorial * (numero - i);
//            }
//
//        }


// SIMPLIFICANDO A SOLUÇÃO:
        long resultadoFatorial = 1L;

        for (int i = numero; i >= 1; i--) {
            resultadoFatorial = resultadoFatorial * i;
        }
        System.out.println(numero + "! = " + resultadoFatorial);
    }
}
