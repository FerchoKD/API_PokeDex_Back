package com.example.api_pokedex.controllers.dtos.request;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class CreateLeagueRequest {
    private String name;

    private String region;
}
