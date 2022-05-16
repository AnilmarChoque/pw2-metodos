
public class Atleta {
	
	public double peso;
	public double altura;
	public double IMC;
	public String classificação;
	public String risco;
	
	public void obterIMC()
	{
		IMC = this.peso/(this.altura*this.altura);
	}
	
	public void classificar()
	{
		if(IMC < 18.5)
		{
			this.classificação = "Abaixo do peso";
		}
		else if(IMC >= 18.5 || IMC <=24.9)
		{
			this.classificação = "Peso normal";
		}
		else if(IMC >= 25 || IMC <=29.9) 
		{
			this.classificação = "Pré-obesidade";
		}
		else if(IMC >=30 || IMC <= 34.9)
		{
			this.classificação = "Obesidade Grau I";
		}
		else if(IMC >=35 || IMC <= 39.9)
		{
			this.classificação = "Obesidade Grau II";
		}
		else if(IMC > 40)
		{
			this.classificação = "Obesidade Grau III";
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
			this.risco = "Média";
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
			this.risco = "Muitíssimo alto";
		}
		
		
	}
}
