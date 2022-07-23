package proyectoMaven;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonaTest {

		
	private Persona persona;
	
	@Before
	public void setUp() throws Exception {
		persona = new Persona("Jhoan", "Rojas");
	}

	@Test
	public void testSetNombre() {
		//given
		
		//when
		
		//then
		Assert.assertTrue(persona.getNombre().equals("Jhoan"));
	}

}
