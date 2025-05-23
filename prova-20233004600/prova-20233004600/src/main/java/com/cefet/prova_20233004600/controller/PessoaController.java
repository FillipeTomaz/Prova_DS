package com.cefet.prova_20233004600.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cefet.prova_20233004600.services.PessoaService;

@RestController
@RequestMapping("/Pessoas")
public class PessoaController{

    @Autowired
    private PessoaService pessoaService;

    /*@GetMapping("/{id}")
    public ResponseEntity<PessoaDTO> findById(@PathVariable Long id) {
        PessoaDTO PessoaDTO = pessoaService.findById(id);
        return ResponseEntity.ok(PessoaDTO);
    }*/



}