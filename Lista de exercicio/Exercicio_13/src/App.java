import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         
        double pes;
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Digite a quantidade de pes: ");
        pes = sc.nextDouble();

        System.out.println("A quantidade de pes em polegadas e: " + pes * 12);
        System.out.println("A quantidade de pes em jardas e: " + pes / 3 );
        System.out.println("A quantidade de pes em milhas e: " + pes / (1760 * 3));

     sc.close();

    }
}
