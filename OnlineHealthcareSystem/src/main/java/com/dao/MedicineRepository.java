package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Medicalstore;


public interface MedicineRepository extends JpaRepository<Medicalstore,Integer>{

}
