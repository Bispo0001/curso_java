package _3_estrutura_condicional;

import java.util.Scanner;

public class Ex5_Exercicio_05 {
    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        int codigo, qtd;


        System.out.println("Digite o código do produto desejado:");
        codigo = tc.nextInt();
        System.out.println("Digite a quantidade desejada:");
        qtd = tc.nextInt();

        if (codigo == 1) {

            System.out.println("Obrigado pela compra do item: Cachorro Quente, o valor total da sua compra foi R$ " + String.format("%.2f.",qtd * 4.00));

        } else if (codigo == 2) {

            System.out.println("Obrigado pela compra do item: X-Salada, o valor total da sua compra foi R$ " + String.format("%.2f.",qtd * 4.50));

        } else if (codigo == 3) {

            System.out.println("Obrigado pela compra do item: X-Bacon, o valor total da sua compra foi R$ " + String.format("%.2f.",qtd * 5.00));

        } else if (codigo == 4) {

            System.out.println("Obrigado pela compra do item: Torrada Simples, o valor total da sua compra foi R$ " + String.format("%.2f.",qtd * 2.00));

        } else if (codigo == 5) {

            System.out.println("Obrigado pela compra do item: Refrigerante, o valor total da sua compra foi R$ " + String.format("%.2f.",qtd * 1.50));

        } else{

            System.out.println("Código inválido!");
        }
    }
}
