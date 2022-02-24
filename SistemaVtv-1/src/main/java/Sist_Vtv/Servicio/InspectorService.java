/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sist_Vtv.Servicio;

import Sist_Vtv.Domain.Inspector;
import java.util.List;

/**
 *
 * @author facu_
 */
public interface InspectorService {
    public List<Inspector> listarInspector();
    public void guardar(Inspector inspector);
    public void eliminar(Inspector inspector);
    public Inspector encontrarInspector(Inspector inspector);
}
