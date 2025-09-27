package _3_estrutura_condicional;

import java.util.Scanner;

public class Ex1_Exercicio_01 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int valordigitado;

        System.out.println("Digite um valor inteiro qualquer, podendo ser positivo ou não: ");
        valordigitado = tc.nextInt();

        if (valordigitado >= 0){
            System.out.println("Valor digitado é 'POSITIVO'");
        }else {
            System.out.println("Valor digitado é 'NEGATIVO'");
        }
    }
}
