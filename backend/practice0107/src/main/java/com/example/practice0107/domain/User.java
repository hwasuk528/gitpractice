package com.example.practice0107.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "User")
public class User{
    @Id
    @Column(nullable = false, name="user_id")
    private Long id;

    @Column(nullable = false, length = 40, name="user_nickname")
    private String nickname;

    @Column(nullable = false, length = 40, name="user_mode")
    private String mode;

    @Column(nullable = false, length = 40, name="user_result")
    private boolean result;

}