package Sist_Vtv.Servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Sist_Vtv.Domain.TipoControl;
import Sist_Vtv.dao.TipoControlDao;

@Service
public class TipoControlServiceImp implements TipoControlService{
	@Autowired
	private TipoControlDao tipocontrolDao;
	
	
	@Override
	@Transactional
	public TipoControl encontrarControl(String nombre) {
		return tipocontrolDao.findByNombreTipoControl(nombre);
	}
	
}
