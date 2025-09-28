package _3_estrutura_condicional;

import java.util.Scanner;

public class Ex2_Exercicio_02 {
    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        int x;

        System.out.println("Digite um valor inteiro:");
        x = tc.nextInt();

        if (x % 2 == 0) {
            System.out.println("O valor digitado é 'PAR'");
        }
        else {
            System.out.println("O valor digitado é 'IMPAR'");
        }
    }
}
