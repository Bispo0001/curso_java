package _5_introducao_POO;

import java.util.Locale;
import java.util.Scanner;

public class Ex0_Problema_Sem_POO {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        double x1, x2, x3, y1, y2, y3;
        double area1, area2, p;

        System.out.println("Digite as medidas dos lados do triângulo X: ");
        System.out.println("Medida 1:");
        x1 = tc.nextDouble();
        System.out.println("Medida 2:");
        x2 = tc.nextDouble();
        System.out.println("Medida 3:");
        x3 = tc.nextDouble();
        System.out.println("Digite as medidas dos lados do triângulo Y: ");
        System.out.println("Medida 1:");
        y1 = tc.nextDouble();
        System.out.println("Medida 2:");
        y2 = tc.nextDouble();
        System.out.println("Medida 3:");
        y3 = tc.nextDouble();

       p = (x1 + x2 + x3) / 2;
       area1 = Math.sqrt((p*(p-x1)*(p-x2)*(p-x3)));

        p = (y1 + y2 + y3) / 2;
        area2 = Math.sqrt((p*(p-y1)*(p-y2)*(p-y3)));

        System.out.println("Área do Triângulo X é: " + String.format("%.4f", area1));
        System.out.println("Área do Triângulo Y é: " + String.format("%.4f", area2));

        if (area1 > area2){
            System.out.println("A maior área é a do triângulo X");
        } else {
            System.out.println("A maior área é a do triângulo Y");
        }

    }
}
