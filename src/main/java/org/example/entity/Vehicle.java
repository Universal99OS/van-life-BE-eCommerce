package org.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long vehicleID;
    private String vehicleName;
    private Double rentalPricePerDay;

    @OneToMany(mappedBy = "vehicle",cascade = CascadeType.ALL)
    List<Orders> ordersList;

    public Vehicle(String vehicleName,Double rentalPricePerDay){
        this.vehicleName=vehicleName;
        this.rentalPricePerDay=rentalPricePerDay;
    }

    public void setVehicleID(Long vehicleID) {
        this.vehicleID = vehicleID;
    }
}
