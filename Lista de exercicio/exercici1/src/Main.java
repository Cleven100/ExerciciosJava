import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
       int c, thisIsAvariable, q;
       String value;

        System.out.print("Digite o valor de c: ");
        c = read.nextInt();
        System.out.print("Digite o valor de thisIsAvariable: ");
        thisIsAvariable = read.nextInt();
        System.out.print("Digite o valor de q: ");
        q = read.nextInt();

        value = "This is a Java program";
       System.out.println(value);

       if(thisIsAvariable != 7) {
           System.out.println("The variable thisIsAvariable is not equal to 7");
       }


    }
}