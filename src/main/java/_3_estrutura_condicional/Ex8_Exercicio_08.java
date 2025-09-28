package _3_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex8_Exercicio_08 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        double valorSalario, imposto, valorSalarioComDesconto, valorTaxado, desconto;

        System.out.println("Informe o salário com duas casas decimais: ");
        valorSalario = tc.nextDouble();

        if (valorSalario <= 2000.00) {

            System.out.println("Você está isento de imposto!");

        } else if (valorSalario >= 2000.01 && valorSalario <= 3000.00) {

            valorTaxado = valorSalario - 2000.00;
            imposto = valorTaxado * 0.08;
            valorSalarioComDesconto = valorSalario - imposto;
            desconto = valorSalario - valorSalarioComDesconto;

            System.out.println("O valor do desconto é R$ " + String.format("%.2f.",desconto));
            System.out.println("Após desconto do imposto de renda seu salário será R$ " + String.format("%.2f.",valorSalarioComDesconto));

        } else if (valorSalario >= 3000.01 && valorSalario <= 4500.00) {

            valorTaxado = valorSalario - 3000.00;
            imposto = valorTaxado * 0.18;
            valorSalarioComDesconto = valorSalario - imposto - (1000.00 * 0.08);
            desconto = valorSalario - valorSalarioComDesconto;
            System.out.println("O valor do desconto é R$ " + String.format("%.2f.",desconto));
            System.out.println("Após desconto do imposto de renda seu salário será R$ " + String.format("%.2f.",valorSalarioComDesconto));

        } else {

            valorTaxado = valorSalario - 4500.00;
            imposto = valorTaxado * 0.28;
            valorSalarioComDesconto = valorSalario - imposto - (1000.00 * 0.08) - (1500.00 * 0.18);
            desconto = valorSalario - valorSalarioComDesconto;
            System.out.println("O valor do desconto é R$ " + String.format("%.2f.",desconto));
            System.out.println("Após desconto do imposto de renda seu salário será R$ " + String.format("%.2f.",valorSalarioComDesconto));
        }
    }
}
