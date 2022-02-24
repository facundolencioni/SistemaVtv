/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sist_Vtv.Controladores;

import Sist_Vtv.Domain.Control;
import Sist_Vtv.Domain.TipoControl;
import Sist_Vtv.Domain.Vtv;
import Sist_Vtv.Servicio.InspectorService;
import Sist_Vtv.Servicio.VehiculoService;
import Sist_Vtv.Servicio.VtvService;
import Sist_Vtv.dao.ControlDao;
import Sist_Vtv.dao.EstadosControlDao;
import Sist_Vtv.dao.EstadosVtvDao;
import Sist_Vtv.dao.TipoControlDao;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/vtv")
public class ControladorVtv {
    @Autowired
    private VehiculoService vehiculoSimp;
    @Autowired
    private VtvService vtvSimp;
    @Autowired 
    private InspectorService inspectorSimp;  
    @Autowired
    private TipoControlDao tipoControlDao;
    @Autowired
    private EstadosControlDao estadosControlSimp;
    @Autowired
    private ControlDao controlSimp;
    @Autowired
    private EstadosVtvDao estadoSimp;
    
    @GetMapping("/")
    public String inicio(Model model, Vtv vtv){
        
        model.addAttribute("inspectores", inspectorSimp.listarInspector());
        model.addAttribute("vehiculo", vehiculoSimp.listarVehiculo());
        model.addAttribute("estadoControl", estadosControlSimp.findAll());
        
        return "vtvNueva";
    }
    @PostMapping("/crearVtv")
    public String crearVtv(Model model, Vtv vtv){
    	vtv.setNroVtv((int)(Math.random()*9999999));
    	List<TipoControl>controles= tipoControlDao.findAll();
    	
    	for (TipoControl r : controles) {
    		Control control= new Control(r,vtv);	
    		vtv.setControles(control);}
    	 model.addAttribute("estadoControl", estadosControlSimp.findAll());
    	 model.addAttribute("vtv", vtv);
    	LocalDate a= LocalDate.now();
     	vtv.setFechaIni(a);
    	if (vtv.getInspector()!= null & vtv.getVehiculo()!= null) {
    	model.addAttribute("estadoControl", estadosControlSimp.findAll());
    	model.addAttribute("vtv", vtv);
    	vtvSimp.guardar(vtv);
    	return "vtvNueva1";
    	}
    	return "redirect:/";
    }
    
    @PostMapping("/finalizarVtv")
    public String finalizarVtv(Vtv vtvform) {
    	var vtv= vtvSimp.encontrarVtv(vtvform);
    	var controles= vtvform.getControles();
    	var controlesBd= controlSimp.findByVtv(vtv);
    	long idestadoVtv= 1 ;
    	for(int i=0 ; i < controles.size(); i++ ) {
    		controlesBd.get(i).setEstadoControl(controles.get(i).getEstadoControl());
    		if(idestadoVtv==1 && controles.get(i).getEstadoControl().getIdEstadoControl()==3) idestadoVtv=3; //condicional
    		if(controles.get(i).getEstadoControl().getIdEstadoControl()==2) idestadoVtv=2; //no aprobado
    	}
    	vtv.setEstadoVtv(estadoSimp.getById(idestadoVtv));
    	if(idestadoVtv==1) {
    		LocalDate fecha= vtv.getFechaIni();
    		vtv.setFechaVen(fecha.plusYears(1));
    	}
    	vtvSimp.guardar(vtv);
    	controlSimp.saveAll(controlesBd);
    	return "redirect:/";
    }
}
