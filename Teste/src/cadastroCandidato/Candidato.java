package cadastroCandidato;

public class Candidato {
	private String nome;
	private int id;
	private int numeroVotação;
	
	public Candidato(String nome, int id, int numeroVotação) {
		this.setNome(nome);
		this.setId(id);
		this.setNumeroVotação(numeroVotação);
	}

	public int getNumeroVotação() {
		return numeroVotação;
	}

	public void setNumeroVotação(int numeroVotação) {
		this.numeroVotação = numeroVotação;
	}

	public  int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public  String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


}
