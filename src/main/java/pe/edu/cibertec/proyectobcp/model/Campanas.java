package pe.edu.cibertec.proyectobcp.model;

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
@Table(name = "tb_campanas")
@Getter
@Setter
public class Campanas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cod_camp;

	@Column(name = "titulo", length = 45, nullable = false)
	private String titulo;

	@Column(name = "descripcion", length = 100, nullable = false)
	private String descripcion;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fecha;

	@Column(name = "hora", nullable = false)
	private String hora;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fech_ini;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fech_fin;

	@ManyToOne
	private Usuario cod_usu;

}
