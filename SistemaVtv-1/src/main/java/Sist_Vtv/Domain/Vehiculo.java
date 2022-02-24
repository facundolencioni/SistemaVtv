package Sist_Vtv.Domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Data;


@Entity
@Data
@Table(name= "vehiculo")
public class Vehiculo implements Serializable{
	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVehiculo;
	@NotEmpty
	private String Dominio;
	@NotEmpty
	private String Marca;
	@NotEmpty
	private String Modelo;
	
    @ManyToOne(cascade = CascadeType.ALL)
	private Duenio duenio;
    @OneToMany(mappedBy = "vehiculo", cascade = CascadeType.ALL)
        private List<Vtv> vtv;
	public Long getIdVehiculo() {
		return idVehiculo;
	}
	public void setIdVehiculo(Long idVehiculo) {
		this.idVehiculo = idVehiculo;
	}
	public String getDominio() {
		return Dominio;
	}
	public void setDominio(String dominio) {
		Dominio = dominio;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public Duenio getDuenio() {
		return duenio;
	}
	public void setDuenio(Duenio duenio) {
		this.duenio = duenio;
	}
	public List<Vtv> getVtv() {
		return vtv;
	}
	public void setVtv(List<Vtv> vtv) {
		this.vtv = vtv;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Vehiculo(Long idVehiculo, String dominio, String marca, String modelo, Duenio duenio, List<Vtv> vtv) {
		super();
		this.idVehiculo = idVehiculo;
		Dominio = dominio;
		Marca = marca;
		Modelo = modelo;
		this.duenio = duenio;
		this.vtv = vtv;
	}
	public Vehiculo() {
		super();
	}

	
}
