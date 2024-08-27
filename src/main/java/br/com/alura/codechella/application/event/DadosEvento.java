package br.com.alura.codechella.application.event;

import br.com.alura.codechella.application.ticket.DadosCadastroTipoIngresso;
import br.com.alura.codechella.domain.evento.Categoria;

import java.time.LocalDateTime;
import java.util.List;

public record DadosEvento(
        Long id,
        Categoria categoria,
        String descricao,
        DadosEndereco endereco,
        LocalDateTime data,
        List<DadosCadastroTipoIngresso> tipoIngressos
) {
}
