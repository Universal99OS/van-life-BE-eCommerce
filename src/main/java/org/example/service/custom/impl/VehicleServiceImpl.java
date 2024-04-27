package org.example.service.custom.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.dto.Vehicledto;
import org.example.entity.Vehicle;
import org.example.repository.VehicleRepository;
import org.example.service.custom.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Primary
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;

    @Autowired
    ObjectMapper mapper;
    @Override
    public boolean save(Vehicledto dto) {
        Vehicle vehicle = mapper.convertValue(dto, Vehicle.class);
        Vehicle save = vehicleRepository.save(vehicle);
        return true;
    }

    @Override
    public boolean update(Vehicledto dto) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public List<Vehicledto> getAll() {
        return null;
    }
}
