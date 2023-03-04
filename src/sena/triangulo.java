package sena;

public class triangulo {
	
	double altura;
	double base;
		
	public void setAltura(double altura) {
		this.altura = altura;
		
	}
	public void setBase(double base) {
		this.base = base;
		
	}
	public double calcularArea () {
		return (this.altura*this.base)/2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triangulo figura = new triangulo();
		
		System.out.println(figura.altura);
		
		figura.setAltura(10);
		figura.setBase(7);
		System.out.println(figura.altura);
		
		triangulo figura2 = new triangulo();
		System.out.println(figura2.altura);
		
		figura2.setAltura(99);
		
		System.out.println("altura 2: " + figura2.altura);
		System.out.println("altura 1: " + figura.altura);
	}

}
