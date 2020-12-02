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
@Table(name = "tb_usuarios")
@Getter
@Setter
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cod_usu;

	@Column(name = "nombre_usu", length = 45, nullable = false)
	private String nombre_usu;

	@Column(name = "apellido_usu", length = 45, nullable = false)
	private String apellido_usu;

	@Column(name = "username", length = 45, nullable = false)
	private String username;

	@Column(name = "password", length = 45, nullable = false)
	private String password;

}
