package org.example.dto;

import lombok.*;
import org.example.entity.User;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
public class Orderdto {
    private String date;

    private Userdto userdto;

    private Vehicledto vehicledto;

    public Userdto getUserdto(){
        return userdto;
    }

    public Vehicledto getVehicledto(){
        return vehicledto;
    }
}
