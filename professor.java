
public abstract class professor extends funcion�rio {
	private escola escola;
	
	
	

	public professor(escola nome_escola,String nome_professor,float sal�rio,String matricula,String endere�o,String datadeAdm,String telefone) {
		super(nome_professor,sal�rio,matricula,endere�o,datadeAdm,telefone );
		this.escola=nome_escola;
		
		
		
	}

	public escola getEscola() {
		return escola;
	}

	public void setEscola(escola escola) {
		this.escola = escola;
	}
	
	

}
