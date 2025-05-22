package com.cefet.prova_20233004600.services;

import java.util.List;

import com.cefet.prova_20233004600.dto.ContaDTO;
import com.cefet.prova_20233004600.repositories.ContaRepository;

public class ContaService {

    private ContaRepository contaRepository;

    public List<ContaDTO> findAll(){
        List<Conta> listaConta = ContaRepository.findAll();
        return listaConta.stream().map(ContaDTO::new).toList();
}
    
}
