package primerTest;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UtilidadesPersonasTest {
	
	private UtilidadesPersonas utils;
	
	@Before
	public void setUp() throws Exception 
	{
		 utils = new UtilidadesPersonas();
	}

	@Test
	public void testGetSebastian() 
	{
		//given
		
		
		//when
		Persona jhoan = utils.getJhoan();
		
		//then
		assertEquals("Jhoan", jhoan.getNombre());
		assertEquals("Holguin", jhoan.getApellido());
	}

	@Test
	public void testGetJhoan() 
	{
		//given
		
		//when
		Persona sebastian = utils.getSebastian();
		
		//then
		assertEquals("Sebastian", sebastian.getNombre());
		assertEquals("Rojas", sebastian.getApellido());
	}

}
