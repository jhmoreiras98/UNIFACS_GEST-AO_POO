
public abstract class pessoa {
	protected String nome;
	protected String endereço;
	protected String matricula;
	protected String telefone;
	
	
	public pessoa() {
		
	}
	
	public pessoa(String nome, String endereço, String matricula, String telefone) {
		
		this.nome = nome;
		this.endereço = endereço;
		this.matricula = matricula;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
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
