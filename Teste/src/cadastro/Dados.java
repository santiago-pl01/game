package cadastro;

import java.util.ArrayList;


public class Dados {
	ArrayList<Eleitor> eleitores = new ArrayList<>();

	public void cadastraEleitor(Eleitor eleitor) {
		eleitores.add(eleitor);
	}
	
	public String numerosEdeleitor() {
		return eleitores.size() + "";
	}
}
