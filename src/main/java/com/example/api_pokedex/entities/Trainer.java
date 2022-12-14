package com.example.api_pokedex.entities;

import com.example.api_pokedex.entities.pivots.TrainersForum;
import com.example.api_pokedex.entities.pivots.TrainersLeague;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "trainers")
@Getter @Setter
public class Trainer {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @PrimaryKeyJoinColumn
    private Long id;

    @Column(unique=true)
    private String name;

    private String password;

    private String age;

    public String email;

    private String image;

    @OneToMany(mappedBy = "trainer")
    private List<TrainersLeague> trainersLeague;

    @OneToMany(mappedBy = "trainer")
    private List<TrainersForum> trainersForum;

    @OneToMany(mappedBy = "trainer")
    private List<Tips> tips;

    @OneToMany(mappedBy = "trainer")
    private List<Comment> comment;
}
