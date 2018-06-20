
public class turmas {
	private String id;
	private String nome_da_turma;
	private disciplinas[] turma;
	private professor[] professor;
	private alunos[] aluno;
	
	
	
	
	
	public turmas() {
		
	}
	
	
	
	
	public turmas(String id, String nome_da_turma, disciplinas[] turma, professor[] professor, alunos[] aluno) {
		
		this.id = id;
		this.nome_da_turma = nome_da_turma;
		this.turma = turma;
		this.professor = professor;
		this.aluno = aluno;
	}




	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome_da_turma() {
		return nome_da_turma;
	}
	public void setNome_da_turma(String nome_da_turma) {
		this.nome_da_turma = nome_da_turma;
	}
	public disciplinas[] getTurma() {
		return turma;
	}
	public void setTurma(disciplinas[] turma) {
		this.turma = turma;
	}
	public professor[] getProfessor() {
		return professor;
	}
	public void setProfessor(professor[] professor) {
		this.professor = professor;
	}
	public alunos[] getAluno() {
		return aluno;
	}
	public void setAluno(alunos[] aluno) {
		this.aluno = aluno;
	}
	
	
	
	
}