package _3_estrutura_condicional;

import java.util.Scanner;

public class Ex4_Exercicio_04 {
    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        int horaInicial;
        int horaFinal;
        int duracao;

        System.out.println("Digite o valor da hora inicial:");
        horaInicial = tc.nextInt();
        System.out.println("Digite o valor da hora final:");
        horaFinal = tc.nextInt();

        if (horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;
            System.out.println("O jogo durou " + duracao + " hr(s).");
        }
        else { duracao = 24 - horaInicial + horaFinal;
            System.out.println("O jogo durou " + duracao + " hr(s).");

        }
    }
}
