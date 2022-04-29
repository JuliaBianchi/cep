package com.imed.cep.repository;

import com.imed.cep.model.Cep;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface cepRepository extends JpaRepository<Cep, String> {
    List<String> findByCep();
}
