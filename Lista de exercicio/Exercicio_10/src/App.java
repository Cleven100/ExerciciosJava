import java.util.Scanner;

// Faça um programa que calcule e mostre a área de um círculo

public class App {
    public static void main(String[] args) throws Exception {

        double radius, circle;
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o Raio do programa");
        radius = sc.nextDouble();

        circle = Math.PI * (Math.pow(radius, 2));

        System.out.println(circle);

    }
}

