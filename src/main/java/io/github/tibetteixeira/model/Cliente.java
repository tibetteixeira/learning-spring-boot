package io.github.tibetteixeira.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class Cliente {
    private String nome;
    private String cpf;
    private Date dataNascimento;
}
