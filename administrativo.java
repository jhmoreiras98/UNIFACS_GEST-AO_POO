
public class administrativo extends funcion�rio{
	private setor setor;
	
	
	
	public administrativo(String dataDeAdm,float sal�rio,String nome, String endere�o, String matricula, String telefone) {
		super(dataDeAdm,sal�rio,nome,telefone,matricula, endere�o);
		
		this.setor = setor;
	}

	public setor getSetor() {
		return setor;
	}

	public void setSetor(setor setor) {
		this.setor = setor;
	}

}
