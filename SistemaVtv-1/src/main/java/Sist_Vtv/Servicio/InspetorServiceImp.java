/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sist_Vtv.Servicio;

import Sist_Vtv.Domain.Inspector;
import Sist_Vtv.dao.InspectorDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author facu_
 */
@Service
public class InspetorServiceImp implements InspectorService{
    @Autowired
    private InspectorDao inspectorDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Inspector> listarInspector() {
    return inspectorDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Inspector inspector) {
    inspectorDao.save(inspector);
    }

    @Override
    @Transactional
    public void eliminar(Inspector inspector) {
    inspectorDao.delete(inspector);
    }

    @Override
    @Transactional(readOnly = true)
    public Inspector encontrarInspector(Inspector inspector) {
    return inspectorDao.findById(inspector.getIdInspector()).orElse(null);
    }
    
}
