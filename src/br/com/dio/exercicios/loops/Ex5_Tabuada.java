package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/
public class Ex5_Tabuada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 0;

        do {
            System.out.println("Digite um número para visualizar sua tabuada:");
            numero = sc.nextInt();
            if (!(numero <= 10 && numero >= 0)) {
                System.out.println("Número inválido, digite um número entre 10 e 0.");
            } else {
                System.out.println("Tabuada de " + numero);
                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero + " X " + i + " = " + (numero * i));
                }
            }
        } while (!(numero <= 10 && numero >= 0));
    }
}
