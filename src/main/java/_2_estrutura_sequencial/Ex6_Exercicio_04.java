package _2_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex6_Exercicio_04 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        String nomeFuncionario;
        int matriculaFuncionario;
        double horasTrabalhadas, valorHora, salarioTotal;

        System.out.print("Digite o nome do colaborador: ");
        nomeFuncionario = tc.nextLine();
        System.out.print("Digite a matrícula do colaborador " + nomeFuncionario + ": ");
        matriculaFuncionario = tc.nextInt();
        System.out.print("Digite a quantidade de horas trabalhadas: ");
        horasTrabalhadas = tc.nextDouble();
        System.out.print("Digite o valor por hora trabalhada: ");
        valorHora = tc.nextDouble();
        salarioTotal = horasTrabalhadas * valorHora;
        System.out.println("Colaborador " + nomeFuncionario + ", matrícula: " + matriculaFuncionario);
        System.out.printf("O valor total a receber do salário: R$ %.2f", salarioTotal);
    }
}
