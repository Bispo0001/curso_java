package _4_estrutura_repeticao;

import java.util.Scanner;

public class Ex3_Exercicio_03 {
    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        int tipoCombustivel;
        int alcool = 0, gasolina = 0, diesel = 0;

        System.out.println("Olá, selecione uma opção:");
        System.out.println("1.Álcool");
        System.out.println("2.Gasolina");
        System.out.println("3.Diesel");
        System.out.println("4.Fim");
        tipoCombustivel = tc.nextInt();



        while (tipoCombustivel != 4 ) {

            if (tipoCombustivel == 1){
                alcool += 1;


            } else if (tipoCombustivel == 2) {
                gasolina += 1;


            } else if (tipoCombustivel == 3) {
                diesel += 1;



            } System.out.println("Olá, selecione uma opção:");
            System.out.println("1.Álcool");
            System.out.println("2.Gasolina");
            System.out.println("3.Diesel");
            System.out.println("4.Fim");
            tipoCombustivel = tc.nextInt();

        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}
