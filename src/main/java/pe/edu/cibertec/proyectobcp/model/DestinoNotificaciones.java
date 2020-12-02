package pe.edu.cibertec.proyectobcp.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_destino_notificaciones")
@Getter
@Setter
public class DestinoNotificaciones {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cod_destino_notificaciones;
	
	@ManyToMany
	private List<Clientes> clientes;
	
	@ManyToOne
	private Notificaciones codNotif;
	
}