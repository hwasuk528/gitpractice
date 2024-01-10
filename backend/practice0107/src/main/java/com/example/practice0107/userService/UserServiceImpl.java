package com.example.practice0107.userService;

import com.example.practice0107.domain.User;
import com.example.practice0107.repository.UserRePository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class UserServiceImpl implements UserService {
    private final UserRePository userRepository;
    @Override
    public User insertUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getList() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<User> findUserById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public boolean deleteUserById(Long id) {
        userRepository.deleteById(id);
        return true;
    }
}