package controlador;

import modelo.Saludo;

public class Controlador {

	public static void main(String[] args) {
		Saludo saludar=new Saludo();
		saludar.diHola();
		saludar.tablaMultiplicar(7);
		saludar.diAdios();

	}

}
