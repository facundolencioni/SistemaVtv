package Sist_Vtv.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Sist_Vtv.Domain.TipoControl;

public interface TipoControlDao extends JpaRepository<TipoControl, Long> {

	public TipoControl findByNombreTipoControl(String nombre);
	
}
