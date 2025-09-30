package _4_estrutura_repeticao;

import java.util.Scanner;

public class Ex5_Exercicio_01 {
    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        int x = 0;

        System.out.println("Digite um valor inteiro entre 1 e 1000:");
        x = tc.nextInt();

        for (int i = 1; i <= x; i++) {

            if (i % 2 != 0) {
                System.out.println(i);
            }

        }System.out.println("Fim!");
    }
}
