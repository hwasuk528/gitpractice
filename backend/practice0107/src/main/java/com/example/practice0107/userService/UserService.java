package com.example.practice0107.userService;

import com.example.practice0107.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User insertUser(User user);
    List<User> getList();

    User updateUser(User user);

    Optional<User> findUserById(Long id);


    boolean deleteUserById(Long id);


}