/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sist_Vtv.Controladores;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Sist_Vtv.Domain.Duenio;
import Sist_Vtv.Domain.Vehiculo;
import Sist_Vtv.Servicio.DuenioService;
import Sist_Vtv.Servicio.VehiculoService;
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
	@Autowired
	private VehiculoService vehiculoSimp;
	
	@GetMapping("/")
	public String inicioDuenio(Model model) {
		model.addAttribute("duenio", duenioSimp.listarDuenio());
		return "duenio";
	}
	@GetMapping("/agregar")
    public String agregar(Model model, Duenio duenio){
		model.addAttribute("tipoDuenios", tipoDuenioSimp.findAll());
        return "modificarDuenio";
    }
	 @PostMapping("/guardar")
    public String guardar(@Valid Duenio duenioForm, Errors error, Model model, Vehiculo vehiculo){
		 model.addAttribute("tipoDuenios", tipoDuenioSimp.findAll());
		 if(error.hasErrors()) {
			 return "modificarDuenio";
		 }
		 
		 if (duenioSimp.encontrarDuenio(duenioForm)== null) {
			 duenioSimp.guardar(duenioForm);
			 return "redirect:/duenio/";
		 }else {
			 return "redirect:/duenio/";
		 }
    }
	 
	 @GetMapping("/vehiculo/{dniDuenio}")
	 public String altaVehiculo(Vehiculo vehiculoForm, Duenio duenioForm) {
		return "altaVehiculo";
	 }
	 @PostMapping("/vehiculo/alta")
	 public String alta(@Valid Vehiculo vehiculoForm,Errors error, Duenio duenioForm) {
		 System.out.println(duenioForm);
		 if(error.hasErrors()) {
			 return "altaVehiculo";
		 }
		 if(vehiculoSimp.encontrarVehiculo(vehiculoForm)== null) {
			 var a= duenioSimp.encontrarDuenio(duenioForm);
			 vehiculoForm.setDuenio(a);
			 vehiculoSimp.guardar(vehiculoForm);
		 }
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
		model.addAttribute("duenio", duenioSimp.encontrarDuenio(duenio));
		return "duenioParticular";
		}
}
