package pe.edu.cibertec.proyectobcp.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import pe.edu.cibertec.proyectobcp.model.Clientes;
import pe.edu.cibertec.proyectobcp.model.CuentasBancarias;
import pe.edu.cibertec.proyectobcp.services.CuentasBancariasService;

@RestController
@RequestMapping("/bcp/cuentas")
public class CuentaBancariaRestController {

	@Autowired
	private CuentasBancariasService cuentasService;

	@GetMapping("{codCli}")
	public List<CuentasBancarias> obtenerCuentas(@PathVariable String codCli) {

		Long id = Long.decode(codCli);
		Clientes cliente = new Clientes();
		cliente.setCod_cli(id);

		return cuentasService.obtenerCuentas(cliente);
	}

	@GetMapping("/numero/{numCuenta}")
	public CuentasBancarias obtenerCuentasPorNumero(@PathVariable String numCuenta) {

		return cuentasService.obtenerPorNumero(numCuenta);
	}

	@PostMapping
	public ResponseEntity<Object> registrar(@RequestBody CuentasBancarias cuentas) {

		CuentasBancarias cuentaGuardada = cuentasService.registrar(cuentas);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(cuentaGuardada.getCod_cuenta()).toUri();

//		return ResponseEntity.ok(empleadoGuardado);
		return ResponseEntity.created(location).build();
	}

	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Long id) {
		cuentasService.eliminar(id);
	}

}
