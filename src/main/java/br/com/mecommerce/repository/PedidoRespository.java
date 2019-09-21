package br.com.mecommerce.repository;

import br.com.mecommerce.model.Cliente;
import br.com.mecommerce.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRespository extends JpaRepository<Pedido, Integer> {
}
