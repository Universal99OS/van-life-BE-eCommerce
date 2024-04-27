package org.example.service.custom.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.dto.Orderdto;
import org.example.entity.Orders;
import org.example.entity.User;
import org.example.entity.Vehicle;
import org.example.repository.OrderRepository;
import org.example.service.custom.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    ObjectMapper mapper;
    @Override
    public boolean save(Orderdto dto) {

        Orders order = mapper.convertValue(dto, Orders.class);
        User user = mapper.convertValue((dto.getUserdto()), User.class);
        Vehicle vehicle = mapper.convertValue((dto.getVehicledto()), Vehicle.class);

        user.setUserID(dto.getUserdto().getUserIdNum());
        order.setUser(user);

        vehicle.setVehicleID(dto.getVehicledto().getVehicleIDNum());
        order.setVehicle(vehicle);

//        Orders order = new Orders("2024");
//        User piushan = new User("piushan", "piushan@gmail.com", "1234");
//        piushan.setUserID(1L);
//
//        order.setUser(piushan);



        Orders save = orderRepository.save(order);
        System.out.println(save);

        return true;
    }

    @Override
    public boolean update(Orderdto dto) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public List<Orderdto> getAll() {
        return null;
    }
}
