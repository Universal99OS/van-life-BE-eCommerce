package org.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long oId;
    private String date;

    @ManyToOne
    @JoinColumn(name = "userID",nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "vehicleID",nullable = false)
    private Vehicle vehicle;

    public Orders(String date){
        this.date=date;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
