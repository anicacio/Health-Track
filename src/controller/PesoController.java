package controller;

import java.util.ArrayList;
import java.util.List;
import model.Peso;

public class PesoController {

	// SELECT
	public List<Peso> getAll() {
		List<Peso> listaPeso = new ArrayList<Peso>();
		
		listaPeso.add(new Peso(0,"2020-04-15", 170.0));
		listaPeso.add(new Peso(1,"2020-04-30", 165.0));
		listaPeso.add(new Peso(2,"2020-05-15", 160.0));
		listaPeso.add(new Peso(3,"2020-05-30", 155.0));
		listaPeso.add(new Peso(4,"2020-06-15", 150.0));
		listaPeso.add(new Peso(5,"2020-06-30", 145.0));
		listaPeso.add(new Peso(6,"2020-07-15", 140.0));
		listaPeso.add(new Peso(7,"2020-07-30", 135.0));
		listaPeso.add(new Peso(8,"2020-08-15", 130.0));
		listaPeso.add(new Peso(9,"2020-08-30", 125.0));
		listaPeso.add(new Peso(10,"2020-09-15", 120.0));
		listaPeso.add(new Peso(11,"2020-09-30", 115.0));
		
		return listaPeso;
	}
	
	public Peso getById(int id) {
		
		return getAll().get(id);
	}
	// INSERT
		
	// UPDATE
		
	// DELETE
}
