package _4_estrutura_repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Ex12_Problema_Exemplo3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        double tempC;
        char opcao;



        do {
            System.out.println("Digite a temperatura em Celsius:");
            tempC = tc.nextDouble();

            System.out.println("Equivalente em Fahrenheit: " + String.format("%.1f",(9 * tempC) / 5 + 32));

            System.out.println("\nDeseja repetir (s/n)?");
            opcao = tc.next().charAt(0);

        }while (opcao == 's');




    }
}
