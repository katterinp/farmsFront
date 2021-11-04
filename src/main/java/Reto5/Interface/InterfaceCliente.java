package Reto5.Interface;

import Reto5.Modelo.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface InterfaceCliente extends CrudRepository<Cliente, Integer> {

}
