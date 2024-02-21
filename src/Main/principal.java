package Main;

import Logica.Hombre;
import Logica.TMB;
import Logica.Mujer;

public class principal {

	public static void main(String[] args) {
		TMB tmb;
		tmb = new Hombre(60.5, 175, 20);
		System.out.println(tmb.calcularTMB());
		
		tmb = new Mujer(50.2, 165, 22);
		System.out.println(tmb.calcularTMB());
	}
}
