package com.example.practice0107.repository;

import com.example.practice0107.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRePository extends JpaRepository<User, Long> {
}
