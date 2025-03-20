package com.projeto.itau.controllers;

import com.projeto.itau.dtos.TransacaoDTO;
import com.projeto.itau.services.TransacaoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/transacao")
public class TransacaoController {


    @Autowired
    private TransacaoService service;

    @PostMapping
    public ResponseEntity<TransacaoDTO> insert(@Valid @RequestBody TransacaoDTO dto) {
        dto = service.insert(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(dto);
    }

}
