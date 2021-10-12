package br.edu.univas.FactoryMethod;

import br.edu.univas.FactoryMethod.Plataformas.Nintendo;
import br.edu.univas.FactoryMethod.Plataformas.Pc;
import br.edu.univas.FactoryMethod.Plataformas.Ps;
import br.edu.univas.FactoryMethod.Plataformas.Xbox;

public class PlataformaFactory {

	public static Plataforma createPolygon(int numberOfSides) {
		
		if(numberOfSides == 3) {
			return new Pc();
		} else if(numberOfSides == 4) {
			return new Ps();
		} else if(numberOfSides == 5) {
			return new Xbox();
		} else if(numberOfSides == 6) {
				return new Nintendo();
		}else {
			return null;
		}
		
	}
}
