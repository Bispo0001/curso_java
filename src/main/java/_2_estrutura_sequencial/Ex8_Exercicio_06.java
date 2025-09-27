package _2_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex8_Exercicio_06 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);


        double a, b, c;

        System.out.println("Digite o valor de A: ");
        a = tc.nextDouble();
        System.out.println("Digite o valor de B: ");
        b = tc.nextDouble();
        System.out.println("Digite o valor de C: ");
        c = tc.nextDouble();

        double areaTriangulo = ((a * c) / 2);
        double areaCirculo = ((Math.PI * Math.pow(c,2)));
        double areaTrapezio = (((a + b) * c) / 2);
        double areaQuadrado = (Math.pow(b,2));
        double areaRetangulo = (a * b);

        System.out.println("\nA área do triângulo é: " + String.format("%.3f", areaTriangulo));
        System.out.println("A área do circulo é: " + String.format("%.3f", areaCirculo));
        System.out.println("A área do trapézio é: " + String.format("%.3f",areaTrapezio));
        System.out.println("A área do quadrado é: " + String.format("%.3f", areaQuadrado));
        System.out.println("A área do retângulo é: " + String.format("%.3f", areaRetangulo));


    }
}
