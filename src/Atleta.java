
public class Atleta {
	
	public double peso;
	public double altura;
	public double IMC;
	public String classifica��o;
	public String risco;
	
	public void obterIMC()
	{
		IMC = this.peso/(this.altura*this.altura);
	}
	
	public void classificar()
	{
		if(IMC < 18.5)
		{
			this.classifica��o = "Abaixo do peso";
		}
		else if(IMC >= 18.5 || IMC <=24.9)
		{
			this.classifica��o = "Peso normal";
		}
		else if(IMC >= 25 || IMC <=29.9) 
		{
			this.classifica��o = "Pr�-obesidade";
		}
		else if(IMC >=30 || IMC <= 34.9)
		{
			this.classifica��o = "Obesidade Grau I";
		}
		else if(IMC >=35 || IMC <= 39.9)
		{
			this.classifica��o = "Obesidade Grau II";
		}
		else if(IMC > 40)
		{
			this.classifica��o = "Obesidade Grau III";
		}
		
	}
	
	public void obterRisco()
	{
		if(IMC < 18.5)
		{
			this.risco = "Muito alto";
		}
		else if(IMC >= 18.5 || IMC <=24.9)
		{
			this.risco = "Baixo";
		}
		else if(IMC >= 25 || IMC <=29.9) 
		{
			this.risco = "M�dia";
		}
		else if(IMC >=30 || IMC <= 34.9)
		{
			this.risco = "Alto";
		}
		else if(IMC >=35 || IMC <= 39.9)
		{
			this.risco = "Muito alto";
		}
		else if(IMC > 40)
		{
			this.risco = "Muit�ssimo alto";
		}
		
		
	}
}
