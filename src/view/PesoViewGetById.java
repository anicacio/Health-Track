package view;

import controller.PesoController;
import model.Peso;

public class PesoViewGetById {

	public static void main(String[] args) {
		System.out.println("Exibindo Pesos");
		Peso peso = new PesoController().getById(5);
		System.out.println(peso);
	}

}