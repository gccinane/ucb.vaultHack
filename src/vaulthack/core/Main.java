package vaulthack.core;


import vaulthack.models.*;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// Criar gerador de senhas aleatórias.
		
		Random passwordGenerator = new Random();
		
		//Criar o cofre
		
		//Instanciar o Bunker subterrâneo, tendo um valor como senha passado pro constructor
		
		Bunker bunker = new Bunker(passwordGenerator.nextInt(Bunker.MAX_PASSWORD));
		
		//Criar os sobreviventes e colocar-los em uma coleção
		
		//Criar os zumbis, eles tem um temporizador
		
		//Startar as threads
		
		//Finaliza o programa

	}

}
