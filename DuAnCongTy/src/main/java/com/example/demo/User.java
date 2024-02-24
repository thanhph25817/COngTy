package com.example.demo;

import jakarta.persistence.*;
import lombok.*;



@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "User_Login")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_use")
    private long userId;
    @Column(name = "email_user")
    private String email;
    @Column(name = "pass_user")
    private String passWord;
}
