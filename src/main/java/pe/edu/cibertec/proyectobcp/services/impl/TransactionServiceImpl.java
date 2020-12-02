package pe.edu.cibertec.proyectobcp.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.cibertec.proyectobcp.model.CuentasBancarias;
import pe.edu.cibertec.proyectobcp.model.Transaccion;
import pe.edu.cibertec.proyectobcp.repository.TransactionRepository;
import pe.edu.cibertec.proyectobcp.services.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	private TransactionRepository transactionRepository;

	@Override
	public Transaccion registrar(Transaccion transac) {

		return transactionRepository.save(transac);
	}

	@Override
	public Optional<Transaccion> obtenerTransaccion(Long codTran) {

		return transactionRepository.findById(codTran);
	}

	@Override
	public List<Transaccion> obtenerTransaccionesPorCuenta(CuentasBancarias codCuenta) {

		return transactionRepository.findByCodCuenta(codCuenta);
	}

}
