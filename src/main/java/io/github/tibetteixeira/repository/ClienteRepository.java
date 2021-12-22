package io.github.tibetteixeira.repository;

import io.github.tibetteixeira.model.Cliente;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClienteRepository {

    private static final String INSERT = "INSERT INTO cliente (nome) VALUES (?)";
    private static final String SELECT_ALL = "SELECT * FROM cliente";

    private final JdbcTemplate jdbcTemplate;

    public ClienteRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void salvar(Cliente cliente) {
        jdbcTemplate.update(INSERT, cliente.getNome());
    }

    public List<Cliente> listarTodos() {
        return jdbcTemplate.query(SELECT_ALL, (resultSet, i) -> {
            Integer id = resultSet.getInt("id");
            String nome = resultSet.getString("nome");
            return new Cliente(id, nome);
        });
    }
}
