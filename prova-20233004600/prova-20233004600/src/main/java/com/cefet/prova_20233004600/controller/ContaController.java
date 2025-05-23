package com.cefet.prova_20233004600.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cefet.prova_20233004600.services.ContaService;

@RestController
@RequestMapping("/contas")
public class ContaController{

    @Autowired
    private ContaService contaService;

    /*@GetMapping("/{id}")
    public ResponseEntity<ContaDTO> findById(@PathVariable Long id) {
        ContaDTO contaDTO = contaService.findById(id);
        return ResponseEntity.ok(contaDTO);
    }*/





}