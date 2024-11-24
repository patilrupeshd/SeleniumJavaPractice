package api.pojo;

public class Attributes {
    private String brand;
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public Specifications getSpecifications() {
        return specifications;
    }
    public void setSpecifications(Specifications specifications) {
        this.specifications = specifications;
    }
    private String model;
    private Specifications specifications;
}
