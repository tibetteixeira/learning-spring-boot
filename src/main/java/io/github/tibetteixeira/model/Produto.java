package io.github.tibetteixeira.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Produto {
    private Integer id;
    private String descricao;
    private BigDecimal preco;
}
