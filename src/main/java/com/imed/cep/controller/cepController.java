package com.imed.cep.controller;

import com.imed.cep.model.Cep;
import com.imed.cep.repository.cepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class cepController {

    @Autowired
    private cepRepository cepRepository;

    @GetMapping("/cep")
    public List<String> getCep(cepRepository cepRepository) {
        return cepRepository.findByCep();
    }

}
