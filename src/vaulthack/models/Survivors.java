package vaulthack.models;

public class Survivors extends Thread{
	//Cada sobrevivente tem uma referência ao bunker
	protected Bunker bunker;
	
	
	//Cada sobrevivente começa com uma tentativa diferente pra ter a geração aleatoria de senhas por cada sobrevivente.
	private int firstAttempt = 0;
	
	//Construtor do sobrevivente 
	public Survivors(Bunker bunker, int firstAttempt) {
		this.bunker = bunker;
		setFirstAttempt(firstAttempt);
		setName(this.getClass().getSimpleName());
		setPriority(Thread.MAX_PRIORITY);
	}
	
	
	
	private int getFirstAttempt() {
		return firstAttempt;
	}
	
	private void setFirstAttempt(int firstAttempt) {
		this.firstAttempt = firstAttempt;
	}
	
	private void guessPassword() {
		//O sobrevivente começa com uma tentativa e aumenta 1 a cada iteração do for
		for(int i = getFirstAttempt(); i < Bunker.MAX_PASSWORD; i++) {
			if(bunker.comparePassword(i)) {
				System.out.println(this.getName() + "Essa Thread adivinhou corretamente a senha: " + i);
				System.out.println("Parabens! Os sobreviventes conseguiram se salvar!");
				System.exit(0);
			}
		}
	}
	
	
	@Override
	public void run() {
		super.run();
		
		guessPassword();
		
	}
	
	
}
