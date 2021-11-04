package Reto5.Repositorio;

import Reto5.Modelo.Cliente;

/**
 *
 * @author Katterin Penaranda
 */
public class contadorClientes {

    private Long total;
    
    private Cliente client;

    public contadorClientes(Long total, Cliente client) {
        this.total = total;
        this.client = client;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }
    
}
