package pe.edu.cibertec.proyectobcp.services;

import java.util.List;
import java.util.Optional;

import pe.edu.cibertec.proyectobcp.model.CuentasBancarias;
import pe.edu.cibertec.proyectobcp.model.Transaccion;

public interface TransactionService {

	Transaccion registrar(Transaccion transac);
	
	Optional<Transaccion> obtenerTransaccion(Long codTran);
	
	List<Transaccion> obtenerTransaccionesPorCuenta(CuentasBancarias codCuenta);
	
}
