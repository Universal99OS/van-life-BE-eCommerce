package org.example.service.custom.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.dto.Userdto;
import org.example.entity.User;
import org.example.repository.UserRepostitory;
import org.example.service.custom.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Userserviceimpl implements UserService {
    @Autowired
    UserRepostitory userRepostitory;

    @Autowired
    ObjectMapper mapper;
    @Override
    public boolean save(Userdto dto) {
        User user = mapper.convertValue(dto, User.class);

        User save = userRepostitory.save(user);

        return true;
    }

    @Override
    public boolean update(Userdto dto) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public List<Userdto> getAll() {
        return null;
    }
}
