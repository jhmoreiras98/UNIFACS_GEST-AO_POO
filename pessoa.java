
public abstract class pessoa {
	protected String nome;
	protected String enderešo;
	protected String matricula;
	protected String telefone;
	
	
	public pessoa() {
		
	}
	
	public pessoa(String nome, String enderešo, String matricula, String telefone) {
		
		this.nome = nome;
		this.enderešo = enderešo;
		this.matricula = matricula;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
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
