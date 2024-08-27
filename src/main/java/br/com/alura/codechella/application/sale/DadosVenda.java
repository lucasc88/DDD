package br.com.alura.codechella.application.sale;

import br.com.alura.codechella.application.ticket.DadosTipoIngresso;
import br.com.alura.codechella.application.user.DadosUsuario;

import java.util.List;

public record DadosVenda(
        Long id,
        DadosUsuario usuario,
        List<DadosTipoIngresso> ingressos
) {
}
