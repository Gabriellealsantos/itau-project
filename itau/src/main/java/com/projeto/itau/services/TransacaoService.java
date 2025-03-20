package com.projeto.itau.services;

import com.projeto.itau.dtos.TransacaoDTO;
import com.projeto.itau.entities.Transacao;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransacaoService {

    private List<Transacao> transacoes = new ArrayList<>();

    public TransacaoDTO insert(TransacaoDTO dto) {
        Transacao transacao = new Transacao();
        copyDtoToEntity(dto, transacao);
        transacoes.add(transacao);
        return new TransacaoDTO(transacao);
    }

    private void copyDtoToEntity(TransacaoDTO dto, Transacao entity) {
        entity.setValor(dto.getValor());
        entity.setDataHora(dto.getDataHora());
    }

}
