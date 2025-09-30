package _4_estrutura_repeticao;

import java.util.Scanner;

public class Ex4_Problema_Exemplo2 {
    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        int qtdOperacoes;
        int soma = 0;

        System.out.println("Digite a quantidade de operações de soma desejada:");
        qtdOperacoes = tc.nextInt();

        for (int i=0; i < qtdOperacoes; i++) {
            System.out.println("Digite o proximo núnero da soma");
            soma += tc.nextInt();
        }

        System.out.println("A soma total foi: " + soma);
    }
}
