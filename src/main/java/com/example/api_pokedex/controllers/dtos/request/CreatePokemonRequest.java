package com.example.api_pokedex.controllers.dtos.request;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreatePokemonRequest {
    private String name;

    private String species;

    private String type;

    private String image;
}
