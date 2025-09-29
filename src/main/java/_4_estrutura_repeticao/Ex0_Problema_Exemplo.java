package _4_estrutura_repeticao;

import java.util.Scanner;

public class Ex0_Problema_Exemplo {
    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        int valorDigitado;
        int soma = 0;

        System.out.println("Digite um valor inteiro:");
        valorDigitado = tc.nextInt();


        while (valorDigitado != 0) {

            soma += valorDigitado;
            System.out.println("Digite o proximo número inteiro, se desejar encerrar digite '0':");
            valorDigitado = tc.nextInt();

        }

        System.out.println("A soma dos valores digitados foi: " + soma);

    }
}
