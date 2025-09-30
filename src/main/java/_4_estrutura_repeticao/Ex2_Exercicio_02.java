package _4_estrutura_repeticao;

import java.util.Scanner;

public class Ex2_Exercicio_02 {
    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        int coordenadaX, coordenadaY;

        System.out.println("Digite a coordenada 'X': ");
        coordenadaX = tc.nextInt();

        System.out.println("Digite a coordenada 'Y': ");
        coordenadaY = tc.nextInt();

        while (coordenadaX != 0 && coordenadaY != 0) {

            if (coordenadaX >= 0 && coordenadaY >= 0){

                System.out.println("Primeiro Quadrante");

            } else if (coordenadaX >= 0 && coordenadaY <= 0) {

                System.out.println("Quarto Quadrante");

            } else if (coordenadaX <= 0 && coordenadaY <= 0) {

                System.out.println("Terceiro Quadrante");

            } else   {

                System.out.println("Segundo Quadrante");

            }
            System.out.println("\nDigite a coordenada 'X': ");
            coordenadaX = tc.nextInt();

            System.out.println("Digite a coordenada 'Y': ");
            coordenadaY = tc.nextInt();
        }

        System.out.println("Uma das coordenadas digitadas é nula!");

    }
}
