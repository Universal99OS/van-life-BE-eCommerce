package org.example.service.custom.impl;

import org.example.dto.Userdto;
import org.example.service.custom.UserService;

import java.util.List;

public class Userserviceimpl implements UserService {
    @Override
    public boolean save(Userdto dto) {
        return false;
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
