package _2_estrutura_sequencial;

import java.util.Scanner;

public class Ex5_Exercicio_03 {
    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        int a, b, c, d;

        System.out.print("Digite o valor da variável A: ");
        a = tc.nextInt();
        System.out.print("Digite o valor da variável B: ");
        b = tc.nextInt();
        System.out.print("Digite o valor da variável C: ");
        c = tc.nextInt();
        System.out.print("Digite o valor da variável D: ");
        d = tc.nextInt();

        System.out.println("\nA diferença do produto (A * B - C * D) é: " + ((a*b)-(c*d)));
    }
}
