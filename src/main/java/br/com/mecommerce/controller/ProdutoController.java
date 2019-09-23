package br.com.mecommerce.controller;

import br.com.mecommerce.model.Produto;
import br.com.mecommerce.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping(name = "/", produces = "application/json")
    public Page<Produto> getProdutos(Pageable pageable) {
        return produtoRepository.findAll(pageable);
    }

    @GetMapping(name = "/", produces = "application/json",params = {"nome"})
    public Page<Produto> getClientesPorNome(Pageable pageable,@RequestParam(name = "nome") String nome) {
        return produtoRepository.findByNomeContainingIgnoreCase(pageable,nome);
    }

}
