package _3_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex6_Exercicio_06 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);



        double valor;

        System.out.println("Digite um valor qualquer: ");
        valor = tc.nextDouble();

        if (valor >= 0 && valor <= 25) {

            System.out.println("O valor digitado está no intervalo [0,25]");

        } else if (valor >= 25.01 && valor <= 50) {

            System.out.println("O valor digitado está no intervalo [25,50]");

        } else if (valor >= 50.01 && valor <= 75) {

            System.out.println("O valor digitado está no intervalo [50,75]");

        } else if (valor >= 75.01 && valor <= 100) {

            System.out.println("O valor digitado está no intervalo [75,100]");

        } else {

            System.out.println("O valor digitado está fora de intervalo!");
        }
    }
}
