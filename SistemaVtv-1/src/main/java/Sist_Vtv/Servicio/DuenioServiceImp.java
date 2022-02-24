/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sist_Vtv.Servicio;

import Sist_Vtv.Domain.Duenio;
import Sist_Vtv.dao.DuenioDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author facu_
 */
@Service
public class DuenioServiceImp implements DuenioService{
    @Autowired
    private DuenioDao duenioDao;
    @Override
    @Transactional(readOnly = true)
    public List<Duenio> listarDuenio() {
    return duenioDao.findAll();
    }

    @Override
    public void guardar(Duenio duenio) {
        duenioDao.save(duenio);
    }

    @Override
    public void eliminar(Duenio duenio) {
    duenioDao.delete(duenio);
    }

    @Override
    @Transactional(readOnly = true)
    public Duenio encontrarDuenio(Duenio duenio) {
    return duenioDao.findById(duenio.getDniDuenio()).orElse(null);
    }
 
}
