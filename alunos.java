
public class alunos extends pessoa {
	private cursos[] curso;

	public alunos(String nome, String endereço, String matricula, String telefone,cursos[] curso) {
		super(nome,endereço,matricula,telefone);
		this.curso=curso;
		
	}

	public cursos[] getCurso() {
		return curso;
	}

	public void setCurso(cursos[] curso) {
		this.curso = curso;
	}

	
}
 