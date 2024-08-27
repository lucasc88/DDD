package br.com.alura.codechella.application.user;

import java.time.LocalDate;

public record DadosUsuario(
        Long id,
        String cpf,
        String nome,
        LocalDate nascimento,
        String email
) {
}
