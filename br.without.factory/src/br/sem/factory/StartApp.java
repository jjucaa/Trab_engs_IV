package br.sem.factory;

import java.util.Scanner;

public class StartApp {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao;
		
		do {
			System.out.println("\nEscolha uma plataforma: ");
			System.out.println("1 - PC");
			System.out.println("2 - Playstation");
			System.out.println("3 - XBOX");
			System.out.println("4 - Nintendo");
			System.out.println("0 - Para sair");
			
			opcao = scanner.nextInt();
							
				while(opcao < 0 || opcao > 4) {
					System.out.println("Opcao invalida!!!");
					opcao = scanner.nextInt();
				}
				
				switch(opcao) {
				
					case 1:
						System.out.println("???????????    ????????? \n"
										 + "?????????????  ???????????\n"
										 + " ????    ???? ???     ??? \n"
										 + " ??????????? ????         \n"
										 + " ??????????  ????         \n"
										 + " ????        ?????     ???\n"
										 + " ?????        ??????????? \n"
										 + "?????          ????????? "
										 + "Voce escolheu o PC");
						break;
				
					case 2:
						System.out.println("???????????   ????????? \n"
										+ "????????????? ???????????\n"
										+ " ????    ???? ????       \n"
										+ " ??????????? ??????????? \n"
										+ " ??????????   ???????????\n"
										+ " ????                ????\n"
										+ " ?????       ??????????? \n"
										+ "?????         ????????? "
										+ "Voce escolheu o Playstation");
						
						break;
					
					case 3:
						System.out.println(" __   __ \n"
										+ "|  |_|  |\n"
										+ "|       |\n"
										+ "|       |\n"
										+ " |     | \n"
										+ "|   _   |\n"
										+ "|__| |__|\n"
										+ "Voce escolheu o XBOX");
						break;
					
					case 4:
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
						break;
				
			    }
		
		 } while(opcao != 0);
		System.out.println("\necho off shutdown -s");
		scanner.close();
	}
}