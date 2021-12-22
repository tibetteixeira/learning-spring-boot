package io.github.tibetteixeira.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ItemPedido {
    private Integer id;
    private Pedido pedido;
    private Produto produto;
    private Long quantidade;
}
