
public class cursos {
	private String id;
	private String nome_do_curso;
	private escola escola;
	
	
	
	
	
	public cursos(String id, String nome_do_curso, escola escola) {
		
		this.id = id;
		this.nome_do_curso = nome_do_curso;
		this.escola = escola;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome_do_curso() {
		return nome_do_curso;
	}
	public void setNome_do_curso(String nome_do_curso) {
		this.nome_do_curso = nome_do_curso;
	}
	public escola getEscola() {
		return escola;
	}
	public void setEscola(escola escola) {
		this.escola = escola;
	}
	
	
	
	
}
