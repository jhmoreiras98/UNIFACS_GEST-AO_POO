
public class administrativo extends funcionário{
	private setor setor;
	
	
	
	public administrativo(String dataDeAdm,float salário,String nome, String endereço, String matricula, String telefone) {
		super(dataDeAdm,salário,nome,telefone,matricula, endereço);
		
		this.setor = setor;
	}

	public setor getSetor() {
		return setor;
	}

	public void setSetor(setor setor) {
		this.setor = setor;
	}

}
