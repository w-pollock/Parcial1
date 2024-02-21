package Logica;

public class Mujer extends TMB{

	public Mujer(double peso, int altura, int edad) {
		super(peso, altura, edad);
	}

	@Override
	public double calcularTMB() {
		return (447.593 + (9.247*this.peso) + (3.098*this.altura) - (4.33*this.edad));
	}

}
