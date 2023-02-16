package br.com.dio.exercicios.arrays;
/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] letras = new String[6];
        int totalConsoantes = 0;

        for (int i = 0; i < letras.length; i++) {
            System.out.println("Digite uma letra:");
            String letra = sc.next();

            boolean eConsoante = !(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o")
                    || letra.equalsIgnoreCase("u"));

            if (eConsoante) {
                totalConsoantes++;
                letras[i] = letra;
            }


        }
        System.out.println("Foram lidas " + totalConsoantes + " consoantes:");
        for (int i = 0; i < letras.length; i++) {
            if (letras[i] != null)
                System.out.println(letras[i]);
        }
    }
}
