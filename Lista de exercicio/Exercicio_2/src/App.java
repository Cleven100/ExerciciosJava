import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
       //Grade calculator
       double noteOne, noteTwo, noteThree, average; 
       Scanner sc = new Scanner(System.in);
       System.out.println("Write the first note: ");
       noteOne = sc.nextDouble();
       System.out.println("Write the second note: ");
       noteTwo = sc.nextDouble();
       System.out.println("Write the third note: ");
       noteThree = sc.nextDouble();

       DecimalFormat df = new DecimalFormat("###.##");

       average = ((noteOne + noteTwo + noteThree) / 3);

       System.out.println("The result: " + df.format(average));

    }
}
