package model;

public class Airplane {
    private String id;
    private String model;
    private int capacity;
    private boolean isAvailable;

    public Airplane(String id, String model, int capacity) {
        this.id = id;
        this.model = model;
        this.capacity = capacity;
        this.isAvailable = true;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "id='" + id + '\'' +
                ", model='" + model + '\'' +
                ", capacity=" + capacity +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
