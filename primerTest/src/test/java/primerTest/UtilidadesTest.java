package primerTest;

import org.junit.Assert;
import org.junit.Test;

public class UtilidadesTest 
{
	
	@Test
	public void testConcatenar() 
	{
		//Instanciar la clase a probar
		Utilidades utilidades = new Utilidades();
		
		//Ejecutar el metodo a probar
		String resultado = utilidades.concatenar("Hola", " mundo");
		
		
		//Validaciones
		Assert.assertEquals("Las cadenas son diferentes", "Hola mundo", resultado);
	}
	
}
