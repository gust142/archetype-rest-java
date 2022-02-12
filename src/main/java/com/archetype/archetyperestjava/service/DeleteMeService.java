package com.archetype.archetyperestjava.service;

import com.archetype.archetyperestjava.mapper.DeleteMeMapper;
import com.archetype.archetyperestjava.model.DeleteMe;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DeleteMeService {

    private final DeleteMeMapper deleteMeMapper;

    public List<DeleteMe> listarItens(){
        return deleteMeMapper.testeList();
    }

}