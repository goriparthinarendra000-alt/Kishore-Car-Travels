package com.kishore.carbooking;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {

    @GetMapping("/api/vehicles")
    public List<Vehicle> getVehicles() {
        return List.of(
            new Vehicle("Suzuki Swift", 5, 10.0),
            new Vehicle("Dzire", 5, 11.0),
            new Vehicle("Ertiga", 7, 14.0)
        );
    }
}