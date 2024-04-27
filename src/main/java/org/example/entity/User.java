package org.example.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userID;
    private String userName;
    private String email;
    private String password;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    List<Orders> orderList;

    public User(String userName,String email,String password){
        this.userName=userName;
        this.email=email;
        this.password=password;
    }

    public void setUserID(Long userID){
        this.userID=userID;
    }

}
