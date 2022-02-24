package Sist_Vtv.Domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Data
@Table(name= "duenio")
public class Duenio implements Serializable {
	private static final long serialVersionUID=1L;
	@Id
	@Size(min = 7, max = 8,message = "el dni no tiene la cantidad de caracteres adecuada")
	@Pattern(regexp = "[0-9]+", message = "el dni solo puede contener numeros")
	private String dniDuenio;
	@NotEmpty
	public String nombre;
	@NotEmpty
	private String direccion;
	@NotEmpty
	private String telefono;
	
    @ManyToOne
	private TipoDuenio tipoDuenio;
        
    @OneToMany(mappedBy = "duenio", cascade = CascadeType.ALL)
	private List<Vehiculo> vehiculos;

	public String getDniDuenio() {
		return dniDuenio;
	}

	public void setDniDuenio(String idDuenio) {
		this.dniDuenio = idDuenio;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
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

	public Duenio(String DniDuenio, String nombreDuenio, String direccion, @NotEmpty String telefono, TipoDuenio tipoDuenio,
			List<Vehiculo> vehiculos) {
		super();
		this.dniDuenio = DniDuenio;
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
