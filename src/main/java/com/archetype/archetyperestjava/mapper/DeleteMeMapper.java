package com.archetype.archetyperestjava.mapper;

import com.archetype.archetyperestjava.model.DeleteMe;

import org.apache.ibatis.annotations.Mapper;

import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface DeleteMeMapper {

    List<DeleteMe> testeList();

}
