package pe.edu.cibertec.proyectobcp.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_cuentas_bancarias")
@Getter
@Setter
public class CuentasBancarias {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cod_cuenta;

	@Column(name = "num_cuenta", length = 20, nullable = false)
	private String numCuenta;

	@Column(name = "saldo", precision = 10, scale = 2)
	private BigDecimal saldo;

	@Column(name = "tarjeta", length = 16, nullable = false)
	private String tarjeta;

	@Column(name = "password", length = 6, nullable = false)
	private String password;

	@ManyToOne
	private TipoMoneda cod_tipo;

	@ManyToOne
	private Clientes codCli;

	public CuentasBancarias() {
		super();
	}
	
	

}
