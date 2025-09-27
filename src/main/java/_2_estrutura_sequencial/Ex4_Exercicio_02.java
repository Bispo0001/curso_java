package _2_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex4_Exercicio_02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        double raio, area;

        System.out.print("Digite o valor do raio do círculo: ");
        raio = tc.nextDouble();

        area = Math.PI * Math.pow(raio,2);

        System.out.printf("O valor da área do círculo informado é: %.4f", area);
    }
}
