package sisgefa;


public class Decreto {

	int codInfracao;
	String area;
	String subarea;
	String classificacao;
	String descInfracao;
	String tipoIncidencia;
	String faixaInfracao;
	Double valMinimo;
	Double valMaximo;
	
	
	public Decreto() {
		
		this.codInfracao = 0;
		this.area = "";
		this.subarea = "";
		this.classificacao = "";
		this.descInfracao = "";
		this.tipoIncidencia = "";
		this.faixaInfracao = "";
		this.valMinimo = 0.00;
		this.valMaximo = 0.00;
		
	}

}
