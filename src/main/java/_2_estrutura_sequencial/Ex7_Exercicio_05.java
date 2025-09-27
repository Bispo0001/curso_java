package _2_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex7_Exercicio_05 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        int codigoPeca1, qtdPecas1, codigoPeca2, qtdPecas2;
        double valorPeca1, valorPeca2, valorTotalPagar;

        System.out.print("Digite o código da Peça 1: ");
        codigoPeca1 = tc.nextInt();
        System.out.print("Digite a quantidade de Peças 1: ");
        qtdPecas1 = tc.nextInt();
        System.out.print("Digite o valor da Peça 1: ");
        valorPeca1 = tc.nextDouble();

        System.out.print("\nDigite o código da Peça 2: ");
        codigoPeca2 = tc.nextInt();
        System.out.print("Digite a quantidade de Peças 2: ");
        qtdPecas2 = tc.nextInt();
        System.out.print("Digite o valor da Peça 2: ");
        valorPeca2 = tc.nextDouble();

        valorTotalPagar = (qtdPecas1 * valorPeca1) + (qtdPecas2 * valorPeca2);

        System.out.printf("\nO valor total a pagar é R$: %.2f", valorTotalPagar );


    }
}
