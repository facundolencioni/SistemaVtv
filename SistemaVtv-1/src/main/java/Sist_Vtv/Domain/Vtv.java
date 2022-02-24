package Sist_Vtv.Domain;

import java.io.Serializable;
import java.time.*;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "vtv")
public class Vtv implements Serializable{
	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVtv;
	private LocalDate fechaIni;
	private LocalDate fechaVen;
        
   
    @ManyToOne(cascade = CascadeType.ALL)
	private Inspector inspector;
    
    @ManyToOne(cascade = CascadeType.ALL)
	private Vehiculo vehiculo;
    
    @ManyToOne
	private EstadoVtv estadoVtv;
        
        
    @OneToMany(mappedBy = "vtv", cascade = {CascadeType.ALL})
    private List<Control> controles= new ArrayList<Control>();


	public Long getIdVtv() {
		return idVtv;
	}


	public void setIdVtv(Long idVtv) {
		this.idVtv = idVtv;
	}

	public LocalDate getFechaIni() {
		return fechaIni;
	}


	public void setFechaIni(LocalDate fechaIni) {
		this.fechaIni = fechaIni;
	}


	public LocalDate getFechaVen() {
		return fechaVen;
	}


	public void setFechaVen(LocalDate fechaVen) {
		this.fechaVen = fechaVen;
	}


	public Inspector getInspector() {
		return inspector;
	}


	public void setInspector(Inspector inspector) {
		this.inspector = inspector;
	}


	public Vehiculo getVehiculo() {
		return vehiculo;
	}


	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}


	public EstadoVtv getEstadoVtv() {
		return estadoVtv;
	}


	public void setEstadoVtv(EstadoVtv estado_Vtv) {
		this.estadoVtv = estado_Vtv;
	}

	public Control obtenerControl(int b) {
	List<Control> auxiliar = getControles();
	
	Control a=auxiliar.get(b);
	return a;
	}


	public List<Control> getControles() {
		return controles;
	}


	public void setControles(Control controles) {
		this.controles.add(controles);
	}


	public Vtv(Long idVtv, LocalDate fechaIni, LocalDate fechaVen, Inspector inspector, Vehiculo vehiculo,
			EstadoVtv estado_Vtv) {
		super();
		this.idVtv = idVtv;
		this.fechaIni = fechaIni;
		this.fechaVen = fechaVen;
		this.inspector = inspector;
		this.vehiculo = vehiculo;
		this.estadoVtv = estado_Vtv;
	}


	public Vtv() {
		super();
	}
	
    
    
}

