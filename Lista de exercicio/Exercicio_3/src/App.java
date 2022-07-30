import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        double noteOne, noteTwo, noteThree, average;
        int weightOne, weightTwo, weightThree;
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the first note: ");
        noteOne = sc.nextDouble();
        System.out.println("Write the first weight: ");
        weightOne = sc.nextInt();
        System.out.println("Write the second note: ");
        noteTwo = sc.nextDouble();
        System.out.println("Write the second weight: ");
        weightTwo = sc.nextInt();
        System.out.println("Write the third note: ");
        noteThree = sc.nextDouble();
        System.out.println("Write the third weight: ");
        weightThree = sc.nextInt();

        DecimalFormat df = new DecimalFormat("###.##");

        average = ((noteOne * weightOne) + (noteTwo * weightTwo)+ (noteThree * weightThree)) / (weightOne + weightTwo + weightThree);

        System.out.println("The result: " + df.format(average));
    }
}
