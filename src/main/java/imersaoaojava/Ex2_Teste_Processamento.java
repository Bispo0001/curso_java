package imersaoaojava;

import java.util.Scanner;

public class Ex2_Teste_Processamento {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        double altura;
        char sexo;


        System.out.print("Digite seu nome: ");
        nome = sc.next();
        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();
        System.out.print("Digite sua altura: ");
        altura = sc.nextDouble();
        System.out.print("Digite o seu sexo: ");
        sexo = sc.next().charAt(0);



        System.out.println("\nObrigado " + nome + "!");
        System.out.println("Idade: " + idade + " anos");
        System.out.printf("Altura: %.2f metros%n", altura);
        System.out.println("Sexo: " + sexo);




    }
}
