package com.gameOfThrones.got.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gameOfThrones.got.entity.DataEntity;

@Repository
public interface SaveDataRepo extends JpaRepository<DataEntity, String> {

}
