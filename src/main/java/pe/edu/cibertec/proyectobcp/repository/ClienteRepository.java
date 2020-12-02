package pe.edu.cibertec.proyectobcp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.edu.cibertec.proyectobcp.model.Clientes;

@Repository
public interface ClienteRepository extends CrudRepository<Clientes, Long> {

}
