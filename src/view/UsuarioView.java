package view;

import javax.swing.JOptionPane;

import model.Caminhada;
import model.Usuario;

/**
* Aplicação solicita nome, peso, e duração da atividade para calcular as calorias queimadas.
* Tentei utilizar as demais atividade tentando fazer um switch com cada atividade sendo chamada
* dentro do case correspondente mais o Java não gostou muito. Então vai do jeito simples para não
* perder o prazo novamente.
*/

public class UsuarioView {

	public static void main(String[] args) {
		Usuario usuario = new Usuario();
				
		usuario.setNomeUsuario(JOptionPane.showInputDialog("Inserir nome do usuário:"));
		usuario.setPesoUsuario(Double.parseDouble(JOptionPane.showInputDialog("Inserir peso do usuário:")));
		
		Caminhada atividade = new Caminhada();
					
		atividade.setDuracaoAtividade(Double.parseDouble(JOptionPane.showInputDialog("Inserir o tempo da atividade em horas:")));
		Double caloriasQueimadas = (double) Math.round(atividade.getMet() * usuario.getPesoUsuario() * atividade.getDuracaoAtividade());
		
		JOptionPane.showMessageDialog(null, "Parabens " + usuario.getNomeUsuario() + "!! Você queimou " + caloriasQueimadas + " calorias praticando " + atividade.getDuracaoAtividade() + " horas de "+ atividade.getNomeAtividade() + ".");
	}

}
