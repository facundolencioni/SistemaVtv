package Sist_Vtv.Domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name= "duenio")
public class Duenio implements Serializable {
	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDuenio;
  
	public String nombre;
	private String direccion;
	private int telefono;
	
    @ManyToOne
	private TipoDuenio tipoDuenio;
        
    @OneToMany(mappedBy = "duenio", cascade = CascadeType.ALL)
	private List<Vehiculo> vehiculos;

	public Long getIdDuenio() {
		return idDuenio;
	}

	public void setIdDuenio(Long idDuenio) {
		this.idDuenio = idDuenio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public TipoDuenio getTipoDuenio() {
		return tipoDuenio;
	}

	public void setTipoDuenio(TipoDuenio tipoDuenio) {
		this.tipoDuenio = tipoDuenio;
	}

	public List<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(List<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	public Duenio(Long idDuenio, String nombreDuenio, String direccion, int telefono, TipoDuenio tipoDuenio,
			List<Vehiculo> vehiculos) {
		super();
		this.idDuenio = idDuenio;
		this.nombre = nombreDuenio;
		this.direccion = direccion;
		this.telefono = telefono;
		this.tipoDuenio = tipoDuenio;
		this.vehiculos = vehiculos;
	}

	public Duenio() {
		super();
	}
	
	
}
