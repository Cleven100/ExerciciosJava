import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int numberOne, numberTwo;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        numberOne = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        numberTwo = sc.nextInt();

        if(numberOne > 0 && numberTwo > 0) {
            System.out.println(Math.pow(numberOne, numberTwo));
            System.out.println(Math.pow(numberTwo, numberOne));
        } else {
            System.out.println("Números menores ou igual a 0");
        }
 
        sc.close();

    }
}
