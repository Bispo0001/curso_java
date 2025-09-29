package _3_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex9_Problema_Exemplo_01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        int minutosUtilizados, excendente;

        System.out.println("Digite a quantidade de minutos utilizados:");
        minutosUtilizados = tc.nextInt();

        if (minutosUtilizados >= 100) {
            excendente = minutosUtilizados - 100;
            System.out.println("Valor a pagar: " + String.format("%.2f R$: ", excendente * 2.00 + 50.00));
        } else {
            System.out.println("Valor a pagar: R$: 50.00");
        }

    }
}
