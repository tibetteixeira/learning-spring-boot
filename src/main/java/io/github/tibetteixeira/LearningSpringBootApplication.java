package io.github.tibetteixeira;

import io.github.tibetteixeira.model.Cliente;
import io.github.tibetteixeira.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class LearningSpringBootApplication {

    @Autowired
    private ClienteService clienteService;

    @Value("${application.name}")
    private String applicationName;

    @Value("${spring.profiles.active}")
    private String profile;

    @GetMapping("/hello")
    public String hello() {
        return applicationName;
    }

    @GetMapping("/salvarCliente")
    public String salvarCliente() {
        try {
            clienteService.salvar(new Cliente("Gal"));
            clienteService.salvar(new Cliente("Gil"));
            clienteService.salvar(new Cliente());
            
            return "Clientes salvos com sucesso.";
        } catch (Exception e) {
            return "Erro ao salvar cliente inválido.";
        }
    }

    @GetMapping("/listarTodosClientes")
    public List<Cliente> listarTodosClientes() {
        return clienteService.listarTodos();
    }

    public static void main(String[] args) {
        SpringApplication.run(LearningSpringBootApplication.class, args);
    }
}
