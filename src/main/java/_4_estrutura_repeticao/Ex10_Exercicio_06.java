package _4_estrutura_repeticao;

import java.util.Scanner;

public class Ex10_Exercicio_06 {
    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        int n;

        System.out.println("Digite um valor inteiro:");
        n = tc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

    }
}
