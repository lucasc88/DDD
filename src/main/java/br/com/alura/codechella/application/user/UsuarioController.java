package br.com.alura.codechella.application.user;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastroUsuario dadosUsuario, UriComponentsBuilder uriBuilder) {
        DadosUsuario usuarioSalvo = service.cadastrarUsuario(dadosUsuario);
        var uri = uriBuilder.path("/usuarios/{id}").buildAndExpand(usuarioSalvo.id()).toUri();

        return ResponseEntity.created(uri).body(usuarioSalvo);
    }

    @GetMapping
    public ResponseEntity<List<DadosUsuario>> listar() {
        return ResponseEntity.ok(service.listarTodos());
    }

}
