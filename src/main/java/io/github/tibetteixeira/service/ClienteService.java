package io.github.tibetteixeira.service;

import io.github.tibetteixeira.model.Cliente;
import io.github.tibetteixeira.repository.ClienteRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public void salvarCliente(Cliente cliente) {
        validarCliente(cliente);
        clienteRepository.salvarCliente(cliente);
    }

    private void validarCliente(Cliente cliente) {
        // TODO: TBD
    }
}
