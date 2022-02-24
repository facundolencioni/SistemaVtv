/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sist_Vtv.dao;

import Sist_Vtv.Domain.Duenio;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author facu_
 */
public interface DuenioDao extends JpaRepository<Duenio, String>{
   
	public Duenio findByNombre(String nombre);
}
