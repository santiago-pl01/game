package cadastro;
import java.util.ArrayList;

public class ListaEleitor {
	
	public static void main(String [] args) {
	
	ArrayList<Eleitor> eleitores = new ArrayList<>();	
	
	for (Eleitor e : eleitores) {
		System.out.println(e.getNome());
		
	}
	
	System.out.println("Total de eleitores:" + eleitores.size());
	
	InterfaceCadastro tela = new InterfaceCadastro();
	tela.setVisible(true); 
}

	
}