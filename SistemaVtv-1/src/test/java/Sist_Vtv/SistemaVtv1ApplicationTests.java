package Sist_Vtv;

import static org.mockito.Mockito.*;
import static org.testng.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import Sist_Vtv.Domain.Duenio;
import Sist_Vtv.Servicio.DuenioServiceImp;
import Sist_Vtv.dao.DuenioDao;

@SpringBootTest
class SistemaVtv1ApplicationTests {
	@Test
	void testGetandSet() {
		Duenio duenioTest= new Duenio();
		duenioTest.setNombre("Franco");
		String esperado= "Franco";
		String real= duenioTest.getNombre();
		
		assertEquals(esperado, real);
		}
	
	@MockBean
	DuenioDao dueniDao;
	@Autowired
	DuenioServiceImp duenioService;
	@Test
	void contextLoads() {
	when(duenioService.encontrarPorNombre("Facundo Lencioni")).thenReturn(DatosPruebas.duenio1);
	when(duenioService.encontrarPorNombre("Susana Rios")).thenReturn(DatosPruebas.duenio2);
	
	Duenio duenio1= duenioService.encontrarPorNombre("Facundo Lencioni");	
	assertEquals(duenio1, DatosPruebas.duenio1);
	Duenio duenio2= duenioService.encontrarPorNombre("Susana Rios");	
	assertEquals(duenio2, DatosPruebas.duenio2);
	}
	
	

}
