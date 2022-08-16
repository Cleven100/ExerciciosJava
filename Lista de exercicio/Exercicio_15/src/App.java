import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      
        Scanner sc = new Scanner(System.in);
        double precoFabrica, lucro, imposto;


        System.out.println("Digite o preço de fábrica: ");
        precoFabrica = sc.nextDouble();
        System.out.println("Digite o lucro: ");
        lucro = sc.nextDouble();
        System.out.println("Digite o imposto ");
        imposto = sc.nextDouble();

        System.out.println("O lucro do distribuidor é: " + precoFabrica * lucro);
        System.out.println("O imposto é: " + precoFabrica * imposto);
        System.out.println("O Preço final é: " + (precoFabrica + (precoFabrica * lucro) + (precoFabrica * imposto)));



        sc.close();
    }
}
