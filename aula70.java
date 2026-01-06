/*
    Problema SEM POO:

    Ler as medidas dos lados de 2 triangulos (X e Y).
    
    Em seguida, mostrar o valor das áreas dos 2 triangulos
    e dizer qual tem a maior área.

*/

import java.util.Scanner;

public class aula70 {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.println("Digite o lado A do trinagulo X: ");
        a = sc.nextDouble();
        System.out.println("Digite o lado B do trinagulo X: ");
        b = sc.nextDouble();
        System.out.println("Digite o lado C do trinagulo X: ");
        c = sc.nextDouble();

        double pX = (a + b + c) / 2.0;
        double areaX = Math.sqrt(pX * ((pX - a) * (pX - b) * (pX - c)));

        sc.next();
        
        System.out.println("Digite o lado A do triangulo Y: ");
        a = sc.nextDouble();
        System.out.println("Digite o lado B do triangulo Y: ");
        b = sc.nextDouble();
        System.out.println("Digite o lado C do triangulo Y: ");
        c = sc.nextDouble();

        double pY = (a + b + c) / 2.0;
        double areaY = Math.sqrt(pY * ((pY - a) * (pY - b) * (pY - c)));

        System.out.printf("Area do triangulo X: %.2f%n", areaX);
        System.out.printf("Area do triangulo Y: %.2f%n", areaY);

        if (areaX > areaY) {
            System.out.println("A area do trinagulo X EH MAIOR!");
        } else if (areaY > areaX) {
            System.out.println("A area do triangulo Y EH MAIOR!");
        }

        sc.close();

    }

}
