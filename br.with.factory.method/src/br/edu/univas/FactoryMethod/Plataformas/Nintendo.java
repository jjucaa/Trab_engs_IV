package br.edu.univas.FactoryMethod.Plataformas;

import br.edu.univas.FactoryMethod.Plataforma;

public class Nintendo implements Plataforma{

	@Override
	public void getDescription() {
		System.out.println("                  .-\"-.\n"
				+ "               .-\"     \"-.\n"
				+ "              /\"-.     .-|\n"
				+ "             /    \"-.-\"  |\n"
				+ "            /      /     |\n"
				+ "   .-\"-.   /      /      |       .-\"-.\n"
				+ ".-\"     \"-/      /       |    .-\"     \"-.\n"
				+ "|-.     .-\"\\    /        |   /\"-.     .-|\n"
				+ "|  '-.-\"    \\  /         | /'    \"-.-\"  |\n"
				+ "|     \\      \\/   .-\"-.  /'        |    |\n"
				+ "|      \\      \\.-\"     \"-.         |    |\n"
				+ "|       \\      |-.     .-\"\\        |    |\n"
				+ "|        \\     |  \"-.-\"    '\\      |    |\n"
				+ "|         \\    |    |        '\\    |    |\n"
				+ "|    |\\    \\   |    |          '\\  |    |\n"
				+ "|    | \\    \\  |    |            '\\|    |\n"
				+ "|    |  \\    \\ |    |    :\\.            |\n"
				+ "|    |   \\    \\|    |    |  \\.          |\n"
				+ "|    |    \\         |    |    \\.        |\n"
				+ "'-.  |  .-\"\\        |    |    '.\\.    .-'\n"
				+ "   \"-|-\"    \\       |    |      \"-\\.-\"\n"
				+ "             \\      |    |\n"
				+ "              \\     |    |\n"
				+ "               \"-.  |  .-'\n"
				+ "                  \"-|-\" "
			    + "\nVoce escolheu a Nintendo");
	}
}