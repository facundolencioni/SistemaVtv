package Sist_Vtv.Domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name="estadocontrol")
public class EstadoControl implements Serializable {
	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdEstadoControl;
	
	private String nombreEstadoControl;
	
    @OneToMany (mappedBy = "estadoControl")
	private List<Control> control;

	public String getNombreEstadoControl() {
		return nombreEstadoControl;
	}

	public void setNombreEstadoControl(String nombreEstadoControl) {
		this.nombreEstadoControl = nombreEstadoControl;
	}

	public List<Control> getControl() {
		return control;
	}

	public void setControl(Control a) {
		this.control.add(a);
	}

	public Long getIdEstadoControl() {
		return IdEstadoControl;
	}

	public void setIdEstadoControl(Long idEstadoControl) {
		IdEstadoControl = idEstadoControl;
	}

	public void setControl(List<Control> control) {
		this.control = control;
	}

	public EstadoControl(Long idEstadoControl, String nombreEstadoControl, List<Control> control) {
		super();
		IdEstadoControl = idEstadoControl;
		this.nombreEstadoControl = nombreEstadoControl;
		this.control = control;
	}

	public EstadoControl() {
		super();
	}
	
}
