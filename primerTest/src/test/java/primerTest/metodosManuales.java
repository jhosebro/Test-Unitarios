package primerTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class metodosManuales {
	
	@Before
	public void setUp() {
		System.out.println("Antes de cada test");
	}
	
	@After
	public void tearDown() {
		System.out.println("Despues de cada test \n");
	}
	
	@BeforeClass
	public static void setUpClass() {
		System.out.println("Antes de todos los test\n");
	}
	
	@AfterClass
	public static void tearDownClass() {
		System.out.println("Despues de todos los test \n");
	}
	
	
	
	@Test
	public void primerTest() {
		System.out.println("Primer test");
	}
	
	@Test
	public void segundoTest() {
		System.out.println("Segundo test");
	}
	

}
