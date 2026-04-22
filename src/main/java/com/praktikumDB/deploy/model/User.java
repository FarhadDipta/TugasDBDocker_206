package com.praktikumDB.deploy.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "20230140206")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String nim;
}