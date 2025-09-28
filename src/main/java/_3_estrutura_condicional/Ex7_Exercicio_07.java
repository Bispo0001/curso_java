package _3_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex7_Exercicio_07 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        double valor1, valor2;

        System.out.println("Digite o primeiro valor com uma casa decimal:");
        valor1 = tc.nextDouble();
        System.out.println("Digite o segundo valor com uma casa decimal:");
        valor2 = tc.nextDouble();

        if (valor1 > 0 && valor2 > 0) {

            System.out.println("O ponto informado, está no quadrante 'Q1'");

        } else if (valor1 > 0 && valor2 < 0) {

            System.out.println("O ponto informado, está no quadrante 'Q4'");

        } else if (valor1 < 0 && valor2 > 0) {

            System.out.println("O ponto informado, está no quadrante 'Q2'");

        } else if (valor1 < 0 && valor2 < 0) {

            System.out.println("O ponto informado, está no quadrante 'Q3'");
        } else {

            System.out.println("O ponto informado está na 'ORIGEM'");
        }
    }
}
