package com.archetype.archetyperestjava.controller;

import com.archetype.archetyperestjava.service.DeleteMeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/deleteMe/")
@RequiredArgsConstructor
public class DeleteMeController {

    private final DeleteMeService deleteMeService;

    @GetMapping("test")
    public ResponseEntity teste(){
        try {
            return ResponseEntity.ok(deleteMeService.listarItens());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }
}
