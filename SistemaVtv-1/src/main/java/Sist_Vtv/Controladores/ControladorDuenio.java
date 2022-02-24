/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sist_Vtv.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Sist_Vtv.Domain.Duenio;
import Sist_Vtv.Domain.Vehiculo;
import Sist_Vtv.Servicio.DuenioService;
import Sist_Vtv.dao.TipoDuenioDao;
import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author facu_
 */

@Controller
@Slf4j
@RequestMapping("/duenio")
public class ControladorDuenio {
	@Autowired
	private DuenioService duenioSimp;
	@Autowired
	private TipoDuenioDao tipoDuenioSimp;
	
	
	@GetMapping("/")
	public String inicioDuenio(Model model) {
		model.addAttribute("duenio", duenioSimp.listarDuenio());
		return "duenio";
	}
	@GetMapping("/agregar")
    public String agregar(Model model, Duenio duenio){
		model.addAttribute("tipoDuenio", tipoDuenioSimp.findAll());
        return "modificarDuenio";
    }
	 @PostMapping("/guardar")
    public String guardar(Duenio duenio, Vehiculo vehiculo){
		 duenioSimp.guardar(duenio);
        return "redirect:/duenio/";
    }
	 @GetMapping("/info/{dniDuenio}")
		public String duenioInfo(Model model, Duenio duenio) {
		 duenio= duenioSimp.encontrarDuenio(duenio);
		 model.addAttribute("duenio", duenio);
		return "duenioParticular";
		}
	@GetMapping("/buscar")
		public String duenioParticular(Model model, Duenio duenio) {
		model.addAttribute("duenio", duenioSimp.encontrarDuenio(duenio.nombre));
		return "duenioParticular";
		}
}
