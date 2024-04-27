package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Userdto {
    private Long userIdNum;
    private String userName;
    private String email;
    private String password;

    public Long getUserIdNum(){
        return userIdNum;
    }
}
