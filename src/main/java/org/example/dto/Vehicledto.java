package org.example.dto;

import lombok.*;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Vehicledto {
    private Long vehicleIDNum;
    private String vehicleName;
    private Double rentalPricePerDay;

    public Long getVehicleIDNum() {
        return vehicleIDNum;
    }
}
