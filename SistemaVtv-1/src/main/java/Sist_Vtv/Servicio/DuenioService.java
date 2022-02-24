/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sist_Vtv.Servicio;

import Sist_Vtv.Domain.Duenio;
import java.util.List;

/**
 *
 * @author facu_
 */
public interface DuenioService {
    public List<Duenio> listarDuenio();
    public void guardar(Duenio duenio);
    public void eliminar(Duenio duenio);
    public Duenio encontrarDuenio(Duenio duenio);
    public Duenio encontrarDuenio(String name);
}
