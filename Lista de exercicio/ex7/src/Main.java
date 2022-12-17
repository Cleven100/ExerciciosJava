import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args)
    {

        List<Students> students = new ArrayList<>();

        students.add(new Students("pedro", 10));
        students.add(new Students("flavio", 7.5));
        students.add(new Students("Maycon", 5));
        students.add(new Students("emanoel", 8));
        students.add(new Students("talit", 4));
        students.add(new Students("marlon", 6));
        students.add(new Students("karol", 9));
        students.add(new Students("eman", 9.5));
        students.add(new Students("enoel", 2));

        students.sort(new NoteComparator());

        students.stream().filter(student -> student.getNote() > 7).forEach(student -> System.out.println("Aprovado " + student.getNote() + " " + student.getName()));
        students.stream().filter(student -> student.getNote() < 7).forEach(student -> System.out.println("Reprovado " + student.getNote() + " " + student.getName()));

    }
}