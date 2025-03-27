package co.edu.umanizales.myfistapi.controller;

import co.edu.umanizales.myfistapi.model.Location;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/location")

public class LocationController {

    @GetMapping
    public String getLocation(){
        Location pereira = new Location("66001", "Pereira");

        return "hola";
    }

}
