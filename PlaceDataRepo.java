package com.gameOfThrones.got.services;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gameOfThrones.got.entity.DataEntity;

public interface PlaceDataRepo extends JpaRepository<DataEntity, BigInteger> {

}
