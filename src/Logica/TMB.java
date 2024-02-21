package Logica;

public abstract class TMB {

	protected double peso;
	protected int altura;
	protected int edad;
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public TMB(double peso, int altura, int edad) {
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
	}
	public abstract double calcularTMB();
}
