package pe.edu.cibertec.proyectobcp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.edu.cibertec.proyectobcp.model.CuentasBancarias;
import pe.edu.cibertec.proyectobcp.model.Transaccion;

@Repository
public interface TransactionRepository extends CrudRepository<Transaccion, Long> {

	List<Transaccion> findByCodCuenta(CuentasBancarias id);
}
