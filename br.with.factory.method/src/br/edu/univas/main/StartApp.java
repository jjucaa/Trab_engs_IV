package br.edu.univas.main;

import java.util.Scanner;

import br.edu.univas.FactoryMethod.Plataforma;
import br.edu.univas.FactoryMethod.PlataformaFactory;

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
							Plataforma Triangulo = PlataformaFactory.createPolygon(3);
							Triangulo.getDescription();
							break;
					
						case 2:
							Plataforma Quadrado = PlataformaFactory.createPolygon(4);
							Quadrado.getDescription();
							
							break;
						
						case 3:
							Plataforma Pentagono = PlataformaFactory.createPolygon(5);
							Pentagono.getDescription();
							break;
						
						case 4:
							Plataforma Hexagono = PlataformaFactory.createPolygon(6);
							Hexagono.getDescription();
							break;
					
				    }
			
			 } while(opcao != 0);
			System.out.println("\necho off shutdown -s");
			scanner.close();
	}
}
