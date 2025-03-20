package com.projeto.itau.entities;

import java.util.UUID;

public class IdGenerator {
    public static <T> T gerarNovoId(Class<T> tipoIdClass) {
        if (tipoIdClass.equals(UUID.class)) {
            return tipoIdClass.cast(UUID.randomUUID());
        }
        throw new IllegalArgumentException("Tipo de ID não suportado.");
    }
}
