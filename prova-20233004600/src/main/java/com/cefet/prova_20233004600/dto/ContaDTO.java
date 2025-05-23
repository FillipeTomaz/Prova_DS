package com.cefet.prova_20233004600.dto;


import com.cefet.prova_20233004600.entities.Conta;
import com.cefet.prova_20233004600.entities.*;


public class ContaDTO {
    private Long id;
    private String numero;
    private Pessoa pessoa;

    public ContaDTO() {
    }

    public ContaDTO(Conta conta) {
        this.id = conta.getId();
        this.numero = conta.getNumero();
        this.pessoa = conta.getPessoa();
    }

    public Long getId() {
        return id;
    }

    public String getNumero() {
        return numero;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    

    


}
