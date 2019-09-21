package br.com.mecommerce.controller;

import br.com.mecommerce.model.Pedido;
import br.com.mecommerce.repository.PedidoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private PedidoRespository pedidoRespository;

    @GetMapping(name = "/", produces = "application/json")
    public Page<Pedido> getPedidos(Pageable pageable) {
        return pedidoRespository.findAll(pageable);
    }

}
