package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/
public class Ex2_Nota {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nota;

//RESOLUÇÃO COM WHILE:
        System.out.println("Digite uma nota: ");
        nota = scanner.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida, digite novamente: ");
            nota = scanner.nextInt();
        }


//RESOLUÇÃO COM DO WHILE:

//        boolean notaInvalida = true;
//
//        do {
//            System.out.println("Digite uma nota: ");
//            nota = scanner.nextInt();
//            notaInvalida = (nota > 10) || (nota < 0);
//
//            if (notaInvalida) {
//                System.out.println("Nota inválida!");
//            } else {
//                break;
//            }
//
//        } while (notaInvalida);

        System.out.println("Nota válida.");
    }
}
