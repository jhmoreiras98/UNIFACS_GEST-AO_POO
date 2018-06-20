
public abstract class funcionário extends pessoa {
	
	private String dataDeAdm;
	private float salário;
	
	
	
	
	public funcionário(String dataDeAdm,float salário,String nome, String endereço, String matricula, String telefone) {
		super(nome,endereço, matricula,telefone);
		
		this.salário=salário;
		
		this.dataDeAdm=dataDeAdm;
		
		
	}



	public String getDataDeAdm() {
		return dataDeAdm;
	}



	public void setDataDeAdm(String dataDeAdm) {
		this.dataDeAdm = dataDeAdm;
	}



	public float getSalário() {
		return salário;
	}



	public void setSalário(float salário) {
		this.salário = salário;
	}
	
	
	
	
}