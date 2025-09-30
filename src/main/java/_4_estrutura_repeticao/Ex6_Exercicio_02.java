package _4_estrutura_repeticao;

import java.util.Scanner;

public class Ex6_Exercicio_02 {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        int qtdValores;
        int valor;
        int in = 0;
        int out = 0;

        System.out.println("Digite a quantidade de números desejado:");
        qtdValores = tc.nextInt();

        for (int i = 0; i < qtdValores; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor inteiro: ");
            valor = tc.nextInt();
            if (valor >= 10 && valor <= 20 ){
                in++;
            }else {
                out++;
            }
        }
        System.out.println("\nQuantidade de valores in e out: ");
        System.out.println(in + " in");
        System.out.println(out + " out");


    }
}
