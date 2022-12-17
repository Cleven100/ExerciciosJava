package Model;

public class Product {

    private String name;
    private Double value;
    private String id;

    public Product() {
    }

    public Product(String name, Double value, String id) {
        this.name = name;
        this.value = value;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
