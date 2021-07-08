package UD6;

import javax.swing.JOptionPane;

public class ejercicio1 {

	public static void main(String[] args) {
		
		String forma=JOptionPane.showInputDialog("Introduce que forma geometrica quieres").toLowerCase();
		
		switch(forma) {
			
		//Genero los casos depende de lo que quiero que pase segun lo que introduzca el usuario
			
			case("cuadrado"):
				
				String ladobeta=JOptionPane.showInputDialog("Introduce cuanto mide cada lado del cuadrado");
				
				double lado=Double.parseDouble(ladobeta);
				
				JOptionPane.showMessageDialog(null, "El area del cuadrado es " + cuadrado(lado));
				
				break;
			
			case("triangulo"):
				
				String alturabeta=JOptionPane.showInputDialog("Introduce cual es la altura del triangulo");
				
				double altura=Double.parseDouble(alturabeta);
				
				String basebeta=JOptionPane.showInputDialog("Introduce cual es la base del triangulo");
				
				double base=Double.parseDouble(basebeta);
				
				JOptionPane.showMessageDialog(null, "El area del triangulo es " + triangulo(altura, base));
				
				break;
			
			case("circulo"):
				
				String radiobeta=JOptionPane.showInputDialog("Introduce el largo del radio");
				
				double radio=Double.parseDouble(radiobeta);
				
				JOptionPane.showMessageDialog(null,"El area del circulo es " + circulo(radio));
				
				break;
		}		
	}
//Aqui se genera el metodo para calcular el area del circulo con las variables creadas previamente en el metodo main
	
	public static double circulo(double radio) {

		final double pi=3.1456;
		
		double areacirculo=(Math.pow(radio, 2)*pi);
		
		return areacirculo;
	}
//Aqui se genera el metodo para calcular el area del triangulo con las variables creadas previamente en el metodo main
	
	public static double triangulo(double altura, double base) {

		double areatriangulo=(altura*base)/2;
		
		return areatriangulo;
	}
//Aqui se genera el metodo para calcular el area del cuadrado con las variables creadas previamente en el metodo main
	
	public static double cuadrado(double lado) {
		double areacuadrado;
		areacuadrado=(lado*lado);
		return areacuadrado;		
		
	}

}
