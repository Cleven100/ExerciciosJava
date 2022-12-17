import java.util.Comparator;

public class NoteComparator implements Comparator<Students> {
    @Override
    public int compare(Students studentsOne, Students studentsTwo) {
        return Double.compare(studentsTwo.getNote(), studentsOne.getNote());
    }

}
