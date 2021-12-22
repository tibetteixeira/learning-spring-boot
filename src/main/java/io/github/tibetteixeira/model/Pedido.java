package io.github.tibetteixeira.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {
    private Integer id;
    private Cliente cliente;
    private Date dataPedido;
}
