
public class Recorde {
	public int valor;
	public TipoRecordeEnum tipo;
	public int resultadoMundial;
	public String recorde;
	public String recorde2;
	public int resultadoOlimpico;
	
	public void RecordeT(TipoRecordeEnum tipo)
	{
		this.tipo = tipo;
	}
	
	public void obterResultado(int resultadoObtido)
	{
		if(resultadoObtido > resultadoMundial)
		{
			recorde = ""+TipoRecordeEnum.Mundial;
		}
		else
		{
			recorde = "*";
		}
		
		if(resultadoObtido > resultadoOlimpico)
		{
			recorde2 = ""+TipoRecordeEnum.Olimpico;
		}
		else
		{
			recorde2 = "*";
		}
	}
}
