package Sist_Vtv.Domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name= "tipocontrol")
public class TipoControl implements Serializable{
	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdTipoControl;
	private String nombreTipoControl;
	
    
    @OneToMany(mappedBy = "tipoControl")
    private List<Control> control;
    
	public String getNombreTipoControl() {
		return nombreTipoControl;
	}

	public void setNombreTipoControl(String nombreTipoControl) {
		this.nombreTipoControl = nombreTipoControl;
	}

	public List<Control> getControl() {
		return control;
	}

	public void setControl(List<Control> control) {
		this.control = control;
	}

	public Long getIdTipoControl() {
		return IdTipoControl;
	}

	public void setIdTipoControl(Long idTipoControl) {
		IdTipoControl = idTipoControl;
	}

	public TipoControl(Long idTipoControl, String nombreTipoControl,List<Control> control) {
		super();
		IdTipoControl = idTipoControl;
		this.nombreTipoControl = nombreTipoControl;
		
		this.control = control;
	}

	public TipoControl() {
		super();
	}
	
}
