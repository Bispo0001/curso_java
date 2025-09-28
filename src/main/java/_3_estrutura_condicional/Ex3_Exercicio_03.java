package _3_estrutura_condicional;

import java.util.Scanner;

public class Ex3_Exercicio_03 {
    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        int valor1, valor2;

        System.out.println("Digite o primeiro valor:");
        valor1 = tc.nextInt();
        System.out.println("Digite o segundo valor:");
        valor2 = tc.nextInt();

        if (valor1 % valor2 == 0 || valor2 % valor1 == 0) {
            System.out.println("Os valores " + valor1 + " e " + valor2 + " são múltiplos");
        }
        else {
            System.out.println("Os valores " + valor1 + " e " + valor2 + " não são múltiplos");
        }
    }
}
