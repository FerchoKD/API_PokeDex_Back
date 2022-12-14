package com.example.api_pokedex.controllers;

import com.example.api_pokedex.controllers.dtos.request.CreateForumRequest;
import com.example.api_pokedex.controllers.dtos.request.UpdateForumRequest;
import com.example.api_pokedex.controllers.dtos.response.BaseResponse;
import com.example.api_pokedex.controllers.dtos.response.GetForumResponse;
import com.example.api_pokedex.controllers.dtos.response.UpdateForumResponse;
import com.example.api_pokedex.services.interfaces.IForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("forum")
public class ForumController {
    @Autowired
    private IForumService service;

    @GetMapping("{id}")
    public GetForumResponse get(@PathVariable Long id){
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<BaseResponse> Create(@RequestBody CreateForumRequest request){
        BaseResponse baseResponse = service.create(request);
        return new ResponseEntity<>(baseResponse,baseResponse.getHttpStatus());
    }

    @PutMapping("{id}")
    public UpdateForumResponse update(@RequestBody UpdateForumRequest request, @PathVariable Long id){
        return service.update(request, id);
    }

    @GetMapping
    public List<GetForumResponse> list(){
        return service.list();
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

}
