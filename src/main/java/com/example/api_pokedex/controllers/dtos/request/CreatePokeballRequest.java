package com.example.api_pokedex.controllers.dtos.request;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class CreatePokeballRequest {

    private String name;

    private String level;

    private String recommendation;
}
