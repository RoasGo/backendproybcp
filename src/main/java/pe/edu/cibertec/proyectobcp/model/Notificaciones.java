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
@Table(name = "tb_notificaciones")
@Getter
@Setter
public class Notificaciones {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cod_notif;

	@Column(name = "titulo", length = 45, nullable = false)
	private String titulo;

	@Column(name = "estado", nullable = false)
	private int estado;

	@Column(name = "descripcion", length = 55, nullable = false)
	private String descripcion;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fecha;

	@Column(name = "hora", nullable = false)
	private String hora;

	@ManyToOne
	private TipoNotificaciones cod_tipo;

}
