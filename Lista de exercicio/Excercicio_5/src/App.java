import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        double salary, percent;
        Scanner sc = new Scanner(System.in);
        System.out.print("Write the salary of employee: ");
        salary = sc.nextDouble();
        System.out.print("Write the percentage increase: ");
        percent = sc.nextDouble();
        
        System.out.println("The salary of employee is: " + salary * (1 + percent));

    }
}
