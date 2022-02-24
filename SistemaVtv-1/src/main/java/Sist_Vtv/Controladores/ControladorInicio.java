/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sist_Vtv.Controladores;

import Sist_Vtv.Domain.Duenio;
import Sist_Vtv.Servicio.DuenioService;
import Sist_Vtv.Servicio.VtvService;
import Sist_Vtv.dao.EstadosVtvDao;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author facu_
 */
@Controller
@Slf4j
public class ControladorInicio {
    @Autowired
    private VtvService vtvSimp;
    @Autowired
    private DuenioService duenioSimp;
    @Autowired
    private EstadosVtvDao estadoSimp;
    
    @GetMapping("/")
    public String Inicio(Model model, Duenio duenio){
    var a= vtvSimp.listarVtv();
    model.addAttribute("vtv", a);
    return "index";
    }
    @GetMapping("/buscar")
    public String inicio(Model model, Duenio duenio) {
    	
		model.addAttribute("duenio", duenioSimp.encontrarDuenio(duenio));
    	
    	return "duenio";
    }
    @GetMapping("/aptas")
    public String aptas(Model model) {
    	var estadoVtv= estadoSimp.findById((long) 1).orElse(null);
    	model.addAttribute("vtv", vtvSimp.VtvEstados(estadoVtv));
    return "muestraVtv";
    }
    @GetMapping("/noAptas")
    public String noAptas(Model model) {
    	var estadoVtv= estadoSimp.findById((long) 2).orElse(null);
    	model.addAttribute("vtv", vtvSimp.VtvEstados(estadoVtv));
    	
    return "muestraVtv";
    }
    
    @GetMapping("/condicionales")
    public String condicional(Model model) {
    	var estadoVtv= estadoSimp.findById((long) 3).orElse(null);
    	model.addAttribute("vtv", vtvSimp.VtvEstados(estadoVtv));
    return "muestraVtv";
    }



}

