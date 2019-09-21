package br.com.mecommerce.model;

import javax.persistence.*;
import javax.validation.Valid;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table
public class Pedido implements Serializable {
    @Id
    @GeneratedValue(generator = "pedido_generator")
    @SequenceGenerator(
            name = "pedido_generator",
            sequenceName = "pedido_sequence",
            initialValue = 10000000
    )
    private Integer codigo;
    private Cliente cliente;

    @OneToMany(mappedBy = "pedido",fetch = FetchType.LAZY)
    @Valid
    private List<ItemPedido> itens;

    private BigDecimal valorFrete;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public BigDecimal getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(BigDecimal valorFrete) {
        this.valorFrete = valorFrete;
    }
}
