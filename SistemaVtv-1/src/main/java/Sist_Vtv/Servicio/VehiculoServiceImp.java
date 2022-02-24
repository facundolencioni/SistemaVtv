/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sist_Vtv.Servicio;

import Sist_Vtv.Domain.Vehiculo;
import Sist_Vtv.dao.VehiculoDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author facu_
 */
@Service
public class VehiculoServiceImp implements VehiculoService{
    @Autowired
    private VehiculoDao vehiculoDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Vehiculo> listarVehiculo() {
    return vehiculoDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Vehiculo vehiculo) {
    vehiculoDao.save(vehiculo);
    }

    @Override
    @Transactional
    public void eliminar(Vehiculo vehiculo) {
    vehiculoDao.delete(vehiculo);
    }

    @Override
    @Transactional(readOnly = true)
    public Vehiculo encontrarVehiculo(Vehiculo vehiculo) {
    return vehiculoDao.findById(vehiculo.getDominio()).orElse(null);
    }
    
}
