package _5_introducao_POO;

import entities.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Ex0_Problema_Com_POO {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();


        System.out.println("Digite as medidas dos lados do triângulo X: ");
        System.out.println("Medida 1:");
        x.a = tc.nextDouble();
        System.out.println("Medida 2:");
        x.b = tc.nextDouble();
        System.out.println("Medida 3:");
        x.c = tc.nextDouble();
        System.out.println("Digite as medidas dos lados do triângulo Y: ");
        System.out.println("Medida 1:");
        y.a = tc.nextDouble();
        System.out.println("Medida 2:");
        y.b = tc.nextDouble();
        System.out.println("Medida 3:");
        y.c = tc.nextDouble();

        System.out.println("Área do Triângulo X é: " + String.format("%.4f", x.area()));
        System.out.println("Área do Triângulo Y é: " + String.format("%.4f", y.area()));

        if (x.area() > y.area()){
            System.out.println("A maior área é a do triângulo X");
        } else {
            System.out.println("A maior área é a do triângulo Y");
        }
    }
}
