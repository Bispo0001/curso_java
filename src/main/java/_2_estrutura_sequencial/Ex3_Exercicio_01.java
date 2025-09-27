package _2_estrutura_sequencial;

import com.sun.source.tree.NewArrayTree;

import java.util.Scanner;

public class Ex3_Exercicio_01 {
    public static void main(String[] args) {

        Scanner tc = new  Scanner(System.in);

        int variavel1, variavel2, soma;

        System.out.print("Olá, digite um valor inteiro para a primeira variável: ");
        variavel1 = tc.nextInt();
        System.out.print("Digite um valor inteiro para a segunda variável: ");
        variavel2 = tc.nextInt();
        soma = variavel1 + variavel2;
        System.out.println("O valor da soma das variáveis digitadas é: " + soma);

    }
}
