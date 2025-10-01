package _4_estrutura_repeticao;

import java.util.Scanner;

public class Ex8_Exercicio_04 {
    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        int n;
        double x, y;
        double divisao;

        System.out.println("Digite um valor inteiro:");
        n = tc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o primeiro valor:");
            x = tc.nextInt();
            System.out.println("Digite o segundo valor:");
            y = tc.nextInt();

            if (y == 0) {
                System.out.println("Divisão impossível");
            } else {
                divisao = x / y;
                System.out.println(divisao);
            }




        }
    }
}
