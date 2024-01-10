package com.example.practice0107.controller;

import com.example.practice0107.domain.User;
import com.example.practice0107.userService.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {
    private final UserService userService;
    @GetMapping("/user/{id}")
    public ResponseEntity<User> detail(@PathVariable Long id) {
        return userService.findUserById(id)
                .map(user -> new ResponseEntity<>(user, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @GetMapping("/user")
    public ResponseEntity<List<User>> getListAll() {
        return new ResponseEntity<>(userService.getList(), HttpStatus.OK);
    }
    @PostMapping("/user")
    public ResponseEntity<?> write(@RequestBody User user) {
        ResponseEntity<?> userResponseEntity = Optional.ofNullable(userService.insertUser(user))
                .map(createList -> new ResponseEntity<>(createList, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE));

        return userResponseEntity;
    }


}
