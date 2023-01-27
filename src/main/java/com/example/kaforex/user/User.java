package com.example.kaforex.user;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_user")
public class User {
    @Id
    @GeneratedValue()
    private Integer id;
    private String username;
    private String email;
    private String password;
}
