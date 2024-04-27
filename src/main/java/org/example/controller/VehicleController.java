package org.example.controller;

import org.example.dto.Vehicledto;
import org.example.service.custom.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vehicle")
@CrossOrigin
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Vehicledto save(@RequestBody Vehicledto vehicledto){
        vehicleService.save(vehicledto);
        return vehicledto;
    }
}
