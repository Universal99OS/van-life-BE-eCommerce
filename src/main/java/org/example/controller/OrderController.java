package org.example.controller;

import org.example.dto.Orderdto;
import org.example.service.custom.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("/save")
    public Orderdto save(@RequestBody Orderdto orderdto){
//        System.out.println(orderdto);
        orderService.save(orderdto);
        return orderdto;
    }

}
