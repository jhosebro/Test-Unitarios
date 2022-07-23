package primerTest;

public class UtilidadesPersonas {
	
	private Persona sebastian;
	private Persona jhoan;
	
	public UtilidadesPersonas() {
		sebastian = new Persona("Sebastian", "Rojas");
		jhoan = new Persona("Jhoan", "Holguin");
	}

	public Persona getSebastian() {
		return sebastian;
	}

	public Persona getJhoan() {
		return jhoan;
	}

	public Persona[] getArrayPersonas() {
		Persona[] personas = {sebastian,jhoan};
		return personas;
		
	}


	
	
}
