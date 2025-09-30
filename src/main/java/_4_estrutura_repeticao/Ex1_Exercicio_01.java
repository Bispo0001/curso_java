package _4_estrutura_repeticao;

import java.util.Scanner;

public class Ex1_Exercicio_01 {
    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        int senha;

        System.out.println("Favor, digitar a senha:");
        senha = tc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha inválida, favor digitar senha correta!");
            senha = tc.nextInt();
        }
        System.out.println("Acesso permitido!");

    }
}
