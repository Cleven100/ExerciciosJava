import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
    double height, width, triangle;


    System.out.println("Write the height: ");
    height = sc.nextDouble();
    System.out.println("Write the width: ");
    width = sc.nextDouble();

    triangle = (height * width) / 2;

    System.out.println(triangle);


    }
}
