package vaulthack.models;

public class Bunker {
	
	//Inicializador do bunker
	
	public Bunker(int password) {
		setPassword(password);
	}
	
	
	//Todo bunker precisa ter um limite de como será a senha, vamos deixar essa como constante
	public static final int MAX_PASSWORD = 9999;
	
	// a senha do bunker, gerada aleatoriamente pela nossa main usando o objeto Random
	private int password;
	
	
	public boolean comparePassword(int value) {
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		
		return (value == getPassword());
	}
	
	// Nossos getters e setters do bunker
	private int getPassword() {
		return password;
	}

	private void setPassword(int password) {
		this.password = password;
	}
}
