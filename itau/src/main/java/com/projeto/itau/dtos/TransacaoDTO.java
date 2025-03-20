package com.projeto.itau.dtos;

import com.projeto.itau.entities.Transacao;
import jakarta.validation.constraints.*;

import java.time.OffsetDateTime;
import java.util.UUID;

public class TransacaoDTO {

    @NotNull(message = "O valor não pode ser nulo.")
    @PositiveOrZero(message = "O valor da transação deve ser maior ou igual a zero.")
    private Double valor;

    @NotNull(message = "O valor não pode ser nulo.")
    @PastOrPresent(message = "A data e hora da transação não pode ser no futuro.")
    private OffsetDateTime dataHora;

    public TransacaoDTO() {
    }

    public TransacaoDTO(Double valor, OffsetDateTime dataHora) {
        this.valor = valor;
        this.dataHora = dataHora;
    }

    public TransacaoDTO(Transacao entity) {
        valor = entity.getValor();
        dataHora = entity.getDataHora();
    }

    public Double getValor() {
        return valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }

}
