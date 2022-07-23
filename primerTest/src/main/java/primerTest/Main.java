package primerTest;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		int b = 20;
		
		System.out.println("Primitivos -> " + (a == b));
		
		Persona personaA = new Persona("Jhoan", "Holguin");
		Persona personaB = new Persona("Jhoan", "Holguin");
		
		System.out.println("Objetos -> " + personaA.equals(personaB));

	}

}
