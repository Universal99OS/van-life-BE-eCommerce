package org.example.controller;

import org.example.dto.Userdto;
import org.example.service.custom.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")

@CrossOrigin
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public boolean save(@RequestBody Userdto dto){
        return userService.save(dto);
    }
}
