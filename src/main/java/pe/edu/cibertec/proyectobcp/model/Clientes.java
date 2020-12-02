package pe.edu.cibertec.proyectobcp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_clientes")
@Getter
@Setter
public class Clientes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cod_cli;

	@Column(name = "nom_cli", length = 45, nullable = false)
	private String nom_cli;

	@Column(name = "apepat_cli", length = 45, nullable = false)
	private String apepat_cli;

	@Column(name = "apemat_cli", length = 45, nullable = false)
	private String apemat_cli;

	@Column(name = "dni", length = 45, nullable = false)
	private String dni;
	
	@Column(name = "correo", length = 45, nullable = false)
	private String correo;

}
