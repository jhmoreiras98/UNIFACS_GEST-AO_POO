
public class alunos extends pessoa {
	private cursos[] curso;

	public alunos(String nome, String endere�o, String matricula, String telefone,cursos[] curso) {
		super(nome,endere�o,matricula,telefone);
		this.curso=curso;
		
	}

	public cursos[] getCurso() {
		return curso;
	}

	public void setCurso(cursos[] curso) {
		this.curso = curso;
	}

	
}
 