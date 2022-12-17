import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        List<Integer> clone = new ArrayList<>();
        int test  = 0;


        while (test < 5){
            int number = inputReader.nextInt();
            numbers.add(number);
            test++;
        }




        Integer result = 0;

        // TODO: Implement your logic to check which number has only one occurrence in List "numbers".
        for (Integer number : numbers) {
            int count = 0;
            int numero = number;


            if(numero == number) {
                count++;
                System.out.println("Entrei 1");
                if(count == 2) {
                    System.out.println("Entrei 2");
                    continue;

                } else {
                    result = number;
                }
            }

        }

    }


    }



