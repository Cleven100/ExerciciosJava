package Model;

public class Customer {




    private String name;
    private String CPF;

    private String level;
    private String address;

    public Customer(String name, String CPF, String level, String address) {
        this.name = name;
        this.CPF = CPF;
        this.level = level;
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
