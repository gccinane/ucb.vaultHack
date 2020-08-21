package vaulthack.models;

public class Zombie extends Thread{
	//Criamos o construtor para inicar o nosso Zumbi
	
	
	public Zombie() {
		this.setName(this.getClass().getSimpleName());
	}
	
	
	@Override
	public synchronized void start() {
		
		super.start();
		System.out.println("Thread iniciando: " + this.getName());
	}
	
	@Override
	public void run() {
		
		super.run();
		for(int i = 10; i > 0; i--) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			
			System.out.println("Segundos faltando para chegar aos sobreviventes: " + i);
		}
		
		System.out.println("Game Over *-*");
		System.out.println("Sobreviventes foram pegos pelos zumbis");
		
		System.exit(0);
	}
	
}
