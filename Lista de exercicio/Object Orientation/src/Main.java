import model.Dog;
import model.Person;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Person tom = new Person("Tom", "Pepsik", LocalDate.of(1984,6,15));
        Person janet = new Person("Janet", "Jamaic", LocalDate.of(1999, 8, 4));


        tom.setSpouse(janet);

        Dog fill = new Dog("Fill", LocalDate.of(2018,1,11));
        tom.setPet(fill);

        System.out.println(tom);
    }
}