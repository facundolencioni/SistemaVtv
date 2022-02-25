package Sist_Vtv;

import static org.junit.Assert.assertFalse;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import Sist_Vtv.Domain.Duenio;
import Sist_Vtv.dao.DuenioDao;

@DataJpaTest
public class JpaTest {

	@Autowired
	DuenioDao dueniodao;
	
	
	@Test
	void findByAll() {
		List<Duenio> duenios= dueniodao.findAll();
		assertFalse(duenios.isEmpty());
	}
}
