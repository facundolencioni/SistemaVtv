/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sist_Vtv.Servicio;

import Sist_Vtv.Domain.Vehiculo;
import java.util.List;

/**
 *
 * @author facu_
 */
public interface VehiculoService {
    public List<Vehiculo> listarVehiculo();
    public void guardar(Vehiculo vehiculo);
    public void eliminar(Vehiculo vehiculo);
    public Vehiculo encontrarVehiculo(Vehiculo vehiculo);
}
