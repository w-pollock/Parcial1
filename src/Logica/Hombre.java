package Logica;

public class Hombre extends TMB {

	public Hombre(double peso, int altura, int edad) {
		super(peso, altura, edad);
	}

	@Override
	public double calcularTMB() {
		return (88.362 + (13.397*this.peso) + (4.799*this.altura) - (5.677*this.edad));
	}

}
