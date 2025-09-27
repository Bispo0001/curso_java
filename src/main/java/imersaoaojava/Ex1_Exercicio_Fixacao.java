package imersaoaojava;

import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ex1_Exercicio_Fixacao {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        String produto1 = "Computador";
        String produto2 = "Mesa de escritório";

        int idade = 30;
        int codigo = 5290;
        char sexo = 'F';

        double preco1 = 2100.0;
        double preco2 = 650.50;
        double medida = 53.234567;

        System.out.println("Produtos: ");
        System.out.printf( produto1 + ", cujo preço é de R$ %.2f %n", preco1);
        System.out.printf( produto2 + ", cujo preço é de R$ %.2f %n",preco2);
        System.out.println();
        System.out.println("Idade: " + idade);
        System.out.println("Código: " + codigo + " e sexo: " + sexo);
        System.out.println();
        System.out.println("Medida com oito casas decimais: " + medida);
        System.out.printf("Arredondado (três casas decimais): %.3f%n", medida);
        System.out.printf("Ponto decimal americano: %.3f", medida);

    }
}