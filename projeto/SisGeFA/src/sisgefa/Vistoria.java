package sisgefa;

import java.util.*;

import javax.swing.JOptionPane;

public  class Vistoria {

	private String data;
	private String endereco;
	private String denuncia;


	Vistoria(){
				
		this.data = JOptionPane.showInputDialog("Informe a Data da Vistoria no formato DDMMAAAA:");
		this.endereco = new Endereco().ExibeEndereco();
		do {
		
			this.denuncia = JOptionPane.showInputDialog("Vistoria motivada por Denúncia? (Responda 'S' para Sim e 'N' para Não)");
			
		}while ((!denuncia.toLowerCase().equals("s"))&&(!denuncia.toLowerCase().equals("n")));
		
		setDenuncia(denuncia);
	}

	public String getData() {
		return data;
	}


	public void setData(String data) {{
		
	}
		this.data = data;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getDenuncia() {
		return denuncia;
	}

	public void setDenuncia(String denuncia) {
		if(denuncia.toLowerCase().equals("s"))	{	
			this.denuncia = "Sim";
		}else if (denuncia.toLowerCase().equals("n"))	{	
			this.denuncia = "Não";
		}
	}

	
	public String ExibeVistoria() {
		
		String imprime = "Data da Vistoria: " +  getData() + "\n\n Endereço: " + getEndereco() + "\n\n Vistoria motivada por Denúncia? " + getDenuncia();
		
		return imprime;
	}
		
}
