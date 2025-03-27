package co.edu.umanizales.myfistapi.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Seller {

    private String id;
    private String name;
    private String lName;
    private Location location;
    private byte age;
    private String gender;

    public Seller(String id, String name, String lName, Location location, byte age, String gender) {
        this.id = id;
        this.name = name;
        this.lName = lName;
        this.location = location;
        this.age = age;
        this.gender = gender;
    }
}
