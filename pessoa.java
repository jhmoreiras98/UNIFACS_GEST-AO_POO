
public abstract class pessoa {
	protected String nome;
	protected String endere�o;
	protected String matricula;
	protected String telefone;
	
	
	public pessoa() {
		
	}
	
	public pessoa(String nome, String endere�o, String matricula, String telefone) {
		
		this.nome = nome;
		this.endere�o = endere�o;
		this.matricula = matricula;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
	
	
	
	

}
