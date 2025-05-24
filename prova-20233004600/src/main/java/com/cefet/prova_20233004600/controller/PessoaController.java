package com.cefet.prova_20233004600.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import com.cefet.prova_20233004600.dto.*;
import com.cefet.prova_20233004600.services.PessoaService;
import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    
    @GetMapping
    public ResponseEntity<List<PessoaDTO>> findAll() {
        return ResponseEntity.ok(pessoaService.findAll());
    }

    
    @GetMapping("/{id}")
    public ResponseEntity<PessoaDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(pessoaService.findById(id));
    }

    
    @PostMapping
    public ResponseEntity<PessoaDTO> insert(@RequestBody PessoaDTO pessoaDTO) {
        PessoaDTO novaPessoa = pessoaService.insert(pessoaDTO);
        return ResponseEntity.status(201).body(novaPessoa);
    }

    
    @PutMapping("/{id}")
    public ResponseEntity<PessoaDTO> update(
        @PathVariable Long id, 
        @RequestBody PessoaDTO pessoaDTO
    ) {
        return ResponseEntity.ok(pessoaService.update(id, pessoaDTO));
    }

    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        pessoaService.delete(id);
        return ResponseEntity.noContent().build();
    }

    
    @GetMapping("/{id}/contas")
    public ResponseEntity<List<ContaDTO>> findContasByPessoa(@PathVariable Long id) {
        return ResponseEntity.ok(pessoaService.findContasByPessoaId(id));
    }
}