
public class TesteRecorde {

	public static void main(String[] args) {
		
		int RecordeObtido = 82;
		int RecordeMundial = 80;
		int RecordeOlimpico = 81;
		
		Recorde rec = new Recorde();
		rec.resultadoMundial = RecordeMundial;
		rec.resultadoOlimpico = RecordeOlimpico;
		rec.obterResultado(RecordeObtido);
		
		System.out.println(""+ rec.recorde + " " + rec.recorde2);

	}

}
