package com.example.api_pokedex.controllers.dtos.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetCommentResponse {
    private Long id;

    private String title;

    private String description;
}
