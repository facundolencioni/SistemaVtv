package Sist_Vtv.dao;

import Sist_Vtv.Domain.EstadoVtv;
import Sist_Vtv.Domain.Inspector;
import Sist_Vtv.Domain.Vtv;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VtvDao extends JpaRepository<Vtv, Long> {

	public List<Vtv> findByInspector(Inspector inspector);
	
	public List<Vtv> findByEstadoVtv(EstadoVtv estadoVtv);
	
}
