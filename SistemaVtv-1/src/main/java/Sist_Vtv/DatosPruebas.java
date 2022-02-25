package Sist_Vtv;

import java.util.Arrays;
import java.util.List;

import Sist_Vtv.Domain.Duenio;
import Sist_Vtv.Domain.TipoDuenio;
import Sist_Vtv.Domain.Vehiculo;

public class DatosPruebas {
	static TipoDuenio tipoDuenio= new TipoDuenio();
	static Vehiculo vehiculo1= new Vehiculo("ASD159","Ford","Fiesta",null,null);
	static Vehiculo vehiculo2= new Vehiculo("ASD184","Ford","Fiesta",null,null);
	static Duenio duenio1=new Duenio("40103904","Facundo Lencioni","Mendoza","424242",tipoDuenio);
	static Duenio duenio2=new Duenio("40103905","Susana Rios","San Luis","424243",tipoDuenio);
	public static List<Duenio> duenios= Arrays.asList(duenio1 , duenio2);
}
