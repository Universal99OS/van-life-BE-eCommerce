package org.example.repository;

import org.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepostitory extends JpaRepository<User,Long> {
}
