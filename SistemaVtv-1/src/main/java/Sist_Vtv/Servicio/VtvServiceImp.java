/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sist_Vtv.Servicio;

import Sist_Vtv.Domain.EstadoVtv;
import Sist_Vtv.Domain.Inspector;
import Sist_Vtv.Domain.Vtv;
import Sist_Vtv.dao.VtvDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author facu_
 */
@Service
public class VtvServiceImp implements VtvService{
    @Autowired
    private VtvDao vtvDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Vtv> listarVtv() {
        return vtvDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Vtv vtv) {
        vtvDao.save(vtv);
    }

    @Override
    @Transactional
    public void eliminar(Vtv vtv) {
        vtvDao.delete(vtv);
    }

    @Override
    @Transactional(readOnly = true)
    public Vtv encontrarVtv(Vtv vtv) {
        return vtvDao.findById(vtv.getIdVtv()).orElse(null);
    }

	@Override
	@Transactional(readOnly = true)
	public List<Vtv> inspectorVtv(Inspector inspector) {
		
		return vtvDao.findByInspector(inspector);
	}

	@Override
	public List<Vtv> VtvEstados(EstadoVtv estadoVtv) {
		return vtvDao.findByEstadoVtv(estadoVtv);
	}
    
}
