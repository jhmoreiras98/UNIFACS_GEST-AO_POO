
public class disciplinas {
	private String id;
	private String nome_da_disciplina;
	private cursos curso;
	
	
	public disciplinas(String id, String nome_da_disciplina, cursos curso) {
		
		this.id = id;
		this.nome_da_disciplina = nome_da_disciplina;
		this.curso = curso;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome_da_disciplina() {
		return nome_da_disciplina;
	}
	public void setNome_da_disciplina(String nome_da_disciplina) {
		this.nome_da_disciplina = nome_da_disciplina;
	}
	public cursos getCurso() {
		return curso;
	}
	public void setCurso(cursos curso) {
		this.curso = curso;
	}
	
	

}
