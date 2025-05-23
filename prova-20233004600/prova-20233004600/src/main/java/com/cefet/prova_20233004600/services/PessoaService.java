package com.cefet.prova_20233004600.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.cefet.prova_20233004600.repositories.PessoaRepository;
import com.cefet.prova_20233004600.entities.Pessoa;
import com.cefet.prova_20233004600.dto.PessoaDTO;

@Service
public class PessoaService{

    @Autowired
    private PessoaRepository pessoaRepository;

    
    public List<PessoaDTO> findAll(){
        List<Pessoa> listaPessoa = pessoaRepository.findAll();
        return listaPessoa.stream().map(PessoaDTO::new).toList();
    }
        
}
