package com.projeto.itau.entities;

import java.time.OffsetDateTime;
import java.util.UUID;

public class Transacao extends AbstractModel<UUID> {

    private Double valor;
    private OffsetDateTime dataHora;

    public Transacao() {
    }

    public Transacao(Double valor, OffsetDateTime dataHora) {
        this.valor = valor;
        this.dataHora = dataHora;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(OffsetDateTime dataHora) {
        this.dataHora = dataHora;
    }
}
