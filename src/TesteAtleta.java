
public class TesteAtleta {

	public static void main(String[] args) {
		
		double altura = 1.74;
		double peso = 68;
		int IMC;
		
		Atleta atle = new Atleta();
		atle.altura = altura;
		atle.peso = peso;
		atle.obterIMC();
		atle.classificar();
		atle.obterRisco();
		
		System.out.println("Altura: "+atle.altura+"\nPeso: "+atle.peso+"\nIMC: "+atle.IMC+"\nClassifica��o: "+atle.classifica��o+"\nRisco: "+atle.risco);
		

	}

}
