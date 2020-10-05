package view;

import javax.swing.JOptionPane;

import model.Caminhada;
import model.Usuario;


public class UsuarioView {

	public static void main(String[] args) {
		Usuario usuario = new Usuario();
				
		usuario.setNomeUsuario(JOptionPane.showInputDialog("Inserir nome do usu�rio:"));
		usuario.setPesoUsuario(Double.parseDouble(JOptionPane.showInputDialog("Inserir peso do usu�rio:")));
		
		Caminhada atividade = new Caminhada();
					
		atividade.setDuracaoAtividade(Double.parseDouble(JOptionPane.showInputDialog("Inserir o tempo da atividade em horas:")));
		Double caloriasQueimadas = (double) Math.round(atividade.getMet() * usuario.getPesoUsuario() * atividade.getDuracaoAtividade());
		
		JOptionPane.showMessageDialog(null, "Parabens " + usuario.getNomeUsuario() + "!! Voc� queimou " + caloriasQueimadas + " calorias praticando " + atividade.getDuracaoAtividade() + " horas de "+ atividade.getNomeAtividade() + ".");
	}

}
