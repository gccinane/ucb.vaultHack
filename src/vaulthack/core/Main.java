package vaulthack.core;


import vaulthack.models.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// Criar gerador de senhas aleatórias.
		
		Random passwordGenerator = new Random();
		
		
		//Instanciar o Bunker subterrâneo, tendo um valor como senha passado pro constructor
		
		Bunker bunker = new Bunker(passwordGenerator.nextInt(Bunker.MAX_PASSWORD));
		
		//Criar os sobreviventes e colocar-los em uma coleção
		
		ArrayList<Thread> threads = new ArrayList<Thread>();
		for(int i = 0; i < 10; i++) {
			threads.add(new Survivor(bunker, passwordGenerator.nextInt(Bunker.MAX_PASSWORD)));
		}
		
		
		
		//Criar os zumbis, eles tem um temporizador
		
		threads.add(new Zombie());
		
		//Startar as threads
		
		for (Thread thread : threads) {
			thread.start();
		}
		//Finaliza o programa

	}

}
