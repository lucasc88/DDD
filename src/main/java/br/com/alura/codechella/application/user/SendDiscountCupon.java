package br.com.alura.codechella.application.user;

import br.com.alura.codechella.infra.user.Usuario;

public interface SendDiscountCupon {
    void sendTo(Usuario user);
}
