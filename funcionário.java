
public abstract class funcion�rio extends pessoa {
	
	private String dataDeAdm;
	private float sal�rio;
	
	
	
	
	public funcion�rio(String dataDeAdm,float sal�rio,String nome, String endere�o, String matricula, String telefone) {
		super(nome,endere�o, matricula,telefone);
		
		this.sal�rio=sal�rio;
		
		this.dataDeAdm=dataDeAdm;
		
		
	}



	public String getDataDeAdm() {
		return dataDeAdm;
	}



	public void setDataDeAdm(String dataDeAdm) {
		this.dataDeAdm = dataDeAdm;
	}



	public float getSal�rio() {
		return sal�rio;
	}



	public void setSal�rio(float sal�rio) {
		this.sal�rio = sal�rio;
	}
	
	
	
	
}