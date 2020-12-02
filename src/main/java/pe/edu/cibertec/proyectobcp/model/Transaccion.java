package pe.edu.cibertec.proyectobcp.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_transacciones")
@Getter
@Setter
public class Transaccion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cod_tran;
	
	@Column(name = "salario", precision = 10, scale = 2)
	private BigDecimal monto;
	
	@Column(name = "cod_destino_cuenta", nullable = false)
	private Long cod_destino_cuenta;
	
	@Column(name = "descripcion", nullable = false, length = 50)
	private String descripcion;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fecha;
	
	@Column(name = "hora", nullable = false, length = 200)
	private String hora;
	
	@ManyToOne
	private CuentasBancarias codCuenta;
	
	@ManyToOne
	private TipoTransaccion cod_tipo;
	
}
