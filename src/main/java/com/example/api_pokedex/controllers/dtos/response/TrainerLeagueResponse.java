package com.example.api_pokedex.controllers.dtos.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TrainerLeagueResponse {
    private Long id;

    private String name;

    private String age;

    private String category;

    private String email;

    private String image;

    private String leaguesName;

    private String leaguesId;
}
