import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in);
           
        int idade, ano;
     
        System.out.println("Digite a idade da pessoa: ");
        idade = sc.nextInt();
        System.out.println("Digite o ano atual: ");
        ano = sc.nextInt();

        System.out.println("A pessoa terá " + (idade + (2030 - ano)) + " em 2030 " );
        sc.close();


    }
}
