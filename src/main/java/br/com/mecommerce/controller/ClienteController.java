package br.com.mecommerce.controller;

import br.com.mecommerce.model.Cliente;
import br.com.mecommerce.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping(name = "/", produces = "application/json")
    public Page<Cliente> getClientes(Pageable pageable) {
        return clienteRepository.findAll(pageable);
    }

    @GetMapping(name = "/search", produces = "application/json",params = {"nome"})
    public Page<Cliente> getClientesPorNome(Pageable pageable, @RequestParam String nome) {
        return clienteRepository.findByNomeLikeIgnoreCase(pageable,nome);
    }

}
