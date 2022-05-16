
public class TesteAtleta {

	public static void main(String[] args) {
		
		double altura = 1.74;
		double peso = 68;
		double IMC;
		
		Atleta atle = new Atleta();
		atle.altura = altura;
		atle.peso = peso;
		atle.obterIMC();
		atle.classificar();
		atle.obterRisco();
		

	}

}
