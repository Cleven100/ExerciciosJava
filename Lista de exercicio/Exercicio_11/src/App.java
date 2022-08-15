import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
       int number;
       Scanner sc = new Scanner(System.in);
       System.out.print("Write the number: ");
       number = sc.nextInt();

       System.out.println(Math.pow(number,2));
       System.out.println(Math.pow(number,3));
       System.out.println(Math.sqrt(number));
       System.out.println(Math.cbrt(number)); 
    
       sc.close();

    }
}
