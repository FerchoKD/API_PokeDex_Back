package com.example.api_pokedex.controllers;

import com.example.api_pokedex.controllers.dtos.request.CreateTrainerRequest;
import com.example.api_pokedex.controllers.dtos.request.UpdateTrainerRequest;
import com.example.api_pokedex.controllers.dtos.response.BaseResponse;
import com.example.api_pokedex.controllers.dtos.response.GetTrainerResponse;
import com.example.api_pokedex.controllers.dtos.response.UpdateTrainerResponse;
import com.example.api_pokedex.entities.projections.TrainerProjections;
import com.example.api_pokedex.services.TrainerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("trainer")
public class TrainerController {
    @Autowired
    private TrainerServiceImpl service;
    @GetMapping("{id}")
    public GetTrainerResponse get(@PathVariable Long id){
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<BaseResponse> Create(@RequestBody CreateTrainerRequest request, TrainerProjections projections){
        BaseResponse baseResponse = service.create(request,projections);
        return new ResponseEntity<>(baseResponse,baseResponse.getHttpStatus());
    }

    @PutMapping("{id}")
    public UpdateTrainerResponse update(@RequestBody UpdateTrainerRequest request, @PathVariable Long id){
        return service.update(request, id);
    }

    @GetMapping("search/{nameTrainer}")
    public ResponseEntity<BaseResponse> Trainer(@PathVariable String nameTrainer){
        BaseResponse baseResponse = service.Trainer(nameTrainer);
        return new ResponseEntity<>(baseResponse,baseResponse.getHttpStatus());
    }

    @GetMapping
    public List<GetTrainerResponse> list(){
        return service.list();
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

}
