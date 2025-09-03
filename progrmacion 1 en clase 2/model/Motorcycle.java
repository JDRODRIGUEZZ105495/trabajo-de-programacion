package model;

/**
 * Represents a motorcycle with basic properties.
 */
public class Motorcycle {
    private String licensePlate;
    private String color;
    private String brand;

    /**
     * Default constructor.
     */
    public Motorcycle() {
    }

    /**
     * Parameterized constructor.
     * 
     * @param licensePlate the motorcycle's license plate
     * @param color the motorcycle's color
     * @param brand the motorcycle's brand
     */
    public Motorcycle(String licensePlate, String color, String brand) {
        this.licensePlate = licensePlate;
        this.color = color;
        this.brand = brand;
    }

    // Getters and Setters
    
    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "licensePlate='" + licensePlate + '\'' +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
