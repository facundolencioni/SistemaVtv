package Sist_Vtv.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Sist_Vtv.Domain.Control;
import Sist_Vtv.Domain.Vtv;

public interface ControlDao extends JpaRepository<Control, Long>{

	
	public List<Control> findByVtv(Vtv vtv);
}
