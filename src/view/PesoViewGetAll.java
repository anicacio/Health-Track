package view;

import controller.PesoController;
import model.Peso;

public class PesoViewGetAll {

	public static void main(String[] args) {
		System.out.println("Exibindo Pesos");
		
		for (Peso peso : new PesoController().getAll()) {
			System.out.println(peso);			
		}
	}

}
