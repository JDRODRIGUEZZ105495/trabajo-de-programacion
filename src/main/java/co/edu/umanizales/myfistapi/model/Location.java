package co.edu.umanizales.myfistapi.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Location {
    private String id;
    private String name;

    public Location(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
