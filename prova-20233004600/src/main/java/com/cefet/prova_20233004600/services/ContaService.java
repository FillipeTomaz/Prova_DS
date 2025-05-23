package com.cefet.prova_20233004600.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cefet.prova_20233004600.dto.ContaDTO;
import com.cefet.prova_20233004600.entities.Conta;
import com.cefet.prova_20233004600.repositories.ContaRepository;

@Service
public class ContaService{

    @Autowired
    private ContaRepository contaRepository;

    
    public List<ContaDTO> findAll(){
        List<Conta> listaConta = contaRepository.findAll();
        return listaConta.stream().map(ContaDTO::new).toList();
    }
        
}
