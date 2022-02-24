/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sist_Vtv.Servicio;

import Sist_Vtv.Domain.EstadoVtv;
import Sist_Vtv.Domain.Inspector;
import Sist_Vtv.Domain.Vtv;
import java.util.List;

/**
 *
 * @author facu_
 */
public interface VtvService {
    public List<Vtv> listarVtv();
    public void guardar(Vtv vtv);
    public void eliminar(Vtv vtv);
    public Vtv encontrarVtv(Vtv vtv);
    public List<Vtv> inspectorVtv(Inspector inspector);
    public List<Vtv> VtvEstados(EstadoVtv estadoVtv);

}
