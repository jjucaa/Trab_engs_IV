package br.edu.univas.FactoryMethod.Plataformas;

import br.edu.univas.FactoryMethod.Plataforma;

public class Xbox implements Plataforma {

	@Override
	public void getDescription() {
		System.out.println(" __   __ \n"
						+ "|  |_|  |\n"
						+ "|       |\n"
						+ "|       |\n"
						+ " |     | \n"
						+ "|   _   |\n"
						+ "|__| |__|\n"
						+ "Voce escolheu o XBOX");
	}
}