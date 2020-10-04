package view;

import javax.swing.JOptionPane;

import model.Caminhada;
import model.Usuario;

/**
* Aplica��o solicita nome, peso, e dura��o da atividade para calcular as calorias queimadas.
* Tentei utilizar as demais atividade tentando fazer um switch com cada atividade sendo chamada
* dentro do case correspondente mais o Java n�o gostou muito. Ent�o vai do jeito simples para n�o
* perder o prazo novamente.
*/

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
