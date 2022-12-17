public class Students {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    private String name;
    private double note;

    public Students(String name, double note) {
        this.name = name;
        this.note = note;
    }

    public Students() {
    }
}
