import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         double deposit, fees;

        Scanner sc = new Scanner(System.in);       
        System.out.println("Write the deposit of account: ");
        deposit = sc.nextDouble();
        System.out.println("Write the fees of investiment: ");
        fees = sc.nextDouble();

        System.out.println("Total amount: " + (deposit + (deposit * fees)));
    }
}
