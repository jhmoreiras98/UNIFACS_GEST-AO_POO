
public abstract class professor extends funcionário {
	private escola escola;
	
	
	

	public professor(escola nome_escola,String nome_professor,float salário,String matricula,String endereço,String datadeAdm,String telefone) {
		super(nome_professor,salário,matricula,endereço,datadeAdm,telefone );
		this.escola=nome_escola;
		
		
		
	}

	public escola getEscola() {
		return escola;
	}

	public void setEscola(escola escola) {
		this.escola = escola;
	}
	
	

}
