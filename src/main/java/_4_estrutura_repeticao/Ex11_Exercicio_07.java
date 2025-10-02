package _4_estrutura_repeticao;

import java.util.Scanner;

public class Ex11_Exercicio_07 {
    public  static void main (String[] args){

        Scanner tc = new Scanner(System.in);

        int n;

        System.out.println("Digite um valor inteiro positivo:");
        n = tc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println(i +" " + (String.format("%.0f",Math.pow(i,2)) + " " + (String.format("%.0f",Math.pow(i,3))) ));
        }
    }
}
