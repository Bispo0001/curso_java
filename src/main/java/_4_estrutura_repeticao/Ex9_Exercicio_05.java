package _4_estrutura_repeticao;

import java.util.Scanner;

public class Ex9_Exercicio_05 {
    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        int n;
        int fatorial = 1;


        System.out.println("Digite um valor inteiro maior ou igual a 0:");
        n = tc.nextInt();
        if (n == 0){
            fatorial = 1;
            System.out.println(fatorial);
        }else {
            for (int i = 1; i <= n; i++){
                fatorial *= i;
            }
            System.out.println(fatorial);
        }


    }
}
