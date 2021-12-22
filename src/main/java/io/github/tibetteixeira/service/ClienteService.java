package io.github.tibetteixeira.service;

import io.github.tibetteixeira.model.Cliente;
import io.github.tibetteixeira.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ClienteService {

    private ClienteRepository repository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.repository = clienteRepository;
    }

    public void salvar(Cliente cliente) {
        validarCliente(cliente);
        repository.salvar(cliente);
    }

    public List<Cliente> listarTodos() {
        return repository.listarTodos();
    }

    private void validarCliente(Cliente cliente) {
        if (Objects.isNull(cliente) || Objects.isNull(cliente.getNome()))
            throw new RuntimeException("Cliente inválido");
    }
}
