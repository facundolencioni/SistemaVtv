package Sist_Vtv.Domain;
import java.io.Serializable;

import javax.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name="control")
public class Control implements Serializable {

  
	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdControl;
	
	@ManyToOne
	private EstadoControl estadoControl;
	
	@ManyToOne
	private TipoControl tipoControl;
	
	@ManyToOne(cascade = {CascadeType.ALL})
    private Vtv vtv;

	public Long getIdControl() {
		return IdControl;
	}

	public void setIdControl(Long idControl) {
		IdControl = idControl;
	}

	public EstadoControl getEstadoControl() {
		return estadoControl;
	}

	public void setEstadoControl(EstadoControl estadoControl) {
		this.estadoControl = estadoControl;
	}

	public TipoControl getTipoControl() {
		return tipoControl;
	}

	public void setTipoControl(TipoControl tipoControl) {
		this.tipoControl = tipoControl;
	}

	public Vtv getVtv() {
		return vtv;
	}

	public void setVtv(Vtv vtv) {
		this.vtv = vtv;
	}

	public Control(Long idControl, EstadoControl estadoControl, TipoControl tipoControl, Vtv vtv) {
		IdControl = idControl;
		this.estadoControl = estadoControl;
		this.tipoControl = tipoControl;
		this.vtv = vtv;
	}
	public Control(TipoControl a, Vtv vtv) {
		this.tipoControl=a;
		this.vtv=vtv;
		
	}

	public Control() {
		super();
	}
	 
}
