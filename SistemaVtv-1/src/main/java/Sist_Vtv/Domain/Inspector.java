package Sist_Vtv.Domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


import lombok.Data;


@Data
@Entity
@Table(name= "inspector")
public class Inspector implements Serializable{

    
	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idInspector;
    
	private String nombreInspector;
	private int telefono;
	private String email;  
        @OneToMany(mappedBy = "inspector", cascade = CascadeType.ALL)
        private List<Vtv> vtvs;
        
        public Long getIdInspector() {
			return idInspector;
		}
		public void setIdInspector(Long idInspector) {
			this.idInspector = idInspector;
		}
		public String getNombreInspector() {
			return nombreInspector;
		}
		public void setNombreInspector(String nombreInspector) {
			this.nombreInspector = nombreInspector;
		}
		public int getTelefono() {
			return telefono;
		}
		public void setTelefono(int telefono) {
			this.telefono = telefono;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public List<Vtv> getVtvs() {
			return vtvs;
		}
		public void setVtvs(List<Vtv> vtvs) {
			this.vtvs = vtvs;
		}
		public Inspector(Long idInspector, String nombreInspector, int telefono, String email, List<Vtv> vtvs) {
			super();
			this.idInspector = idInspector;
			this.nombreInspector = nombreInspector;
			this.telefono = telefono;
			this.email = email;
			this.vtvs = vtvs;
		}
		public Inspector() {
			super();
		}

        
}
