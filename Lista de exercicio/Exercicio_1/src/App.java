import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         
        int numberOne, numberTwo, numberThree, numberFour, sum;

        Scanner sc = new Scanner(System.in);

        System.out.println("Write the first number: ");
        numberOne = sc.nextInt();
        System.out.println("Write the second number: ");
        numberTwo = sc.nextInt();
        System.out.println("Write the third number: ");
        numberThree = sc.nextInt();
        System.out.println("Write the fourth number: ");
        numberFour = sc.nextInt();

        sum = numberOne + numberTwo + numberThree + numberFour;

        System.out.println("the result we get: " + sum);




    }
}
