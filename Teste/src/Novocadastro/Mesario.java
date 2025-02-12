package Novocadastro;

import java.util.ArrayList;

public class Mesario {
	private ArrayList<Eleitor> eleitores = new ArrayList<>();
	
	public Mesario() {}
	//TODO-LIST
	//procurar um eleitor pelo ID
	public Eleitor getEleitorByID(int id) {
		//para cada eleitor na lista de eleitores.....
		for (Eleitor eleitor : eleitores) {
			//se o ID do eleitor da vez for igual ao id requisitado
			if (eleitor.getId() == id) {
				//retorne o eleitor da vez
				return eleitor;
			}
		}
		//senão, retorne nulo
		return null;
	}
	//Procurar um eleitor pelo Nome
	public Eleitor getEleitorByName(String nome) {
		//para cada eleitor na lista de eleitores.....
		for (Eleitor eleitor : eleitores) {
			//se o ID do eleitor da vez for igual ao nome requisitado
			if (eleitor.getNome() == nome) {
				//retorne o eleitor da vez
				return eleitor;
			}
		}
		//senão, retorne nulo
		return null;
	}
	
	//Adicionar um eleitor
	public void addEleitor(String nome, int id) {
		Eleitor e = new Eleitor(nome, id);
		eleitores.add(e);
	}
	//deletar um eleitor
	public void removeEleitor(int id) {
		Eleitor e = getEleitorByID(id);
		eleitores.remove(e);
	}
	
	//contar quantidade de eleitores
	public int contarEleitores() {
		int contador = 0;
		for (Eleitor e : eleitores) {
			contador += 1;
		}
		return contador;
	}
	
	//printar um eleitor 
	public void printEleitor(int id) {
		Eleitor e = getEleitorByID(id);
		if (e != null) {
			System.out.println("Nome eleitor: " + e.getNome() + " | ID eleitor: " + e.getId());
		}
	}
	public void printAll() {
		for (Eleitor e : eleitores) {
			printEleitor(e.getId());
		}
	}
	
}
