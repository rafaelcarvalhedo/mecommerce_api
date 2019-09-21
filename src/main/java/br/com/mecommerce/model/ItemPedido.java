package br.com.mecommerce.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class ItemPedido implements Serializable {
    @Id
    @GeneratedValue
    private Integer codigo;
    private Produto produto;
    private Integer qty;

    @ManyToOne(fetch = FetchType.LAZY)
    private Pedido pedido;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
