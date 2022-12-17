import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Students> students = new ArrayList<Students>();
        Scanner receive = new Scanner(System.in);



        students.add(new Students("Pedro", 10));
        students.add(new Students("Fer", 30));
        students.add(new Students("ando", 35));
        students.add(new Students("Fo", 60));
        students.add(new Students("Fendo", 10));
        students.add(new Students("nando", 50));
        students.add(new Students("Feando", 1000));
        students.add(new Students("Fernao", 36));
        students.add(new Students("Fedo", 32));
        students.add(new Students("Fernndo", 90));
        double menor = 9999;

        for(Students student : students) {


            if(menor > student.getNote()) {
                menor = student.getNote();
            }

        }
        System.out.println("O maior entre os dois é: " + menor);

    }
}