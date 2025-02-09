package cadastro;

public class Eleitor {
	private String nome;
	private String id;
	
	public Eleitor() {
	}
	
	public Eleitor(String nome, String id) {
		this.setNome(nome);
		this.setId(id); 
	}

	String getId() {
		return id;
	}

	void setId(String id) {
		this.id = id;
	}

	String getNome() {
		return nome;
	}

	void setNome(String nome) {
		this.nome = nome;
	}
}
