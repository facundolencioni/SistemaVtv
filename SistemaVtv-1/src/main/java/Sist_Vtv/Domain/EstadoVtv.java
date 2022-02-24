package Sist_Vtv.Domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name="estadovtv")
public class EstadoVtv implements Serializable {

  
	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdEstadoVtv;
	private String nombreEstadoVtv;
        
        @OneToMany(mappedBy = "estadoVtv")
        private List<Vtv> vtvs;

		public Long getIdEstadoVtv() {
			return IdEstadoVtv;
		}

		public void setIdEstadoVtv(Long idEstadoVtv) {
			IdEstadoVtv = idEstadoVtv;
		}

		public String getNombreEstadoVtv() {
			return nombreEstadoVtv;
		}

		public void setNombreEstadoVtv(String nombreEstadoVtv) {
			this.nombreEstadoVtv = nombreEstadoVtv;
		}

		public List<Vtv> getVtvs() {
			return vtvs;
		}

		public void setVtvs(List<Vtv> vtvs) {
			this.vtvs = vtvs;
		}

		public EstadoVtv(Long idEstadoVtv, String nombreEstadoVtv, List<Vtv> vtvs) {
			super();
			IdEstadoVtv = idEstadoVtv;
			this.nombreEstadoVtv = nombreEstadoVtv;
			this.vtvs = vtvs;
		}

		public EstadoVtv() {
			super();
		}

    
}
