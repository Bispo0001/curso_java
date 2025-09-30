package _4_estrutura_repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Ex7_Exercicio_03 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner tc = new Scanner(System.in);

        int qtdCasosTestes;

        System.out.println("Digite a quantidade de casos testes desejado:");
        qtdCasosTestes = tc.nextInt();

        double v1 , v2, v3;
        double peso1 = 2.0, peso2 = 3.0, peso3 = 5.0;
        double mediaPonderada = 0;

        for (int i = 0; i < qtdCasosTestes; i++) {
            System.out.println((i + 1) + "º Caso Teste ");
            System.out.println("Digite o primeiro valor com uma casa decimal:");
            v1 = tc.nextDouble();
            System.out.println("Digite o segundo valor com uma casa decimal:");
            v2 = tc.nextDouble();
            System.out.println("Digite o terceiro valor com uma casa decimal:");
            v3 = tc.nextDouble();

            mediaPonderada = ((v1 * peso1) + (v2 * peso2) + (v3 * peso3)) / (peso1 + peso2 + peso3);

            System.out.println(String.format("%.1f", mediaPonderada));

        }

    }

}
