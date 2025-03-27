package co.edu.umanizales.myfistapi.controller;

import co.edu.umanizales.myfistapi.model.Seller;
import co.edu.umanizales.myfistapi.model.Location;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class SellerController {
    @GetMapping
    public String getSeller(){

        Location pereira = new Location("66001", "Pereira");

        Seller seller1 = new Seller("123442432", "Pepita", "Sanchez", pereira, (byte)32, "M" );
        Seller seller2 = new Seller("123442432", "Pepita", "Sanchez", pereira, (byte)32, "M" );
        Seller seller3 = new Seller("123442432", "Pepita", "Sanchez", pereira, (byte)32, "M" );
        Seller seller4 = new Seller("123442432", "Pepita", "Sanchez", pereira, (byte)32, "M" );
        Seller seller5 = new Seller("123442432", "Pepita", "Sanchez", pereira, (byte)32, "M" );


        return "Manizales";
    }

}
