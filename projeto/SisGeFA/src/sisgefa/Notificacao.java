package sisgefa;

import java.util.*;

import javax.swing.JOptionPane;

public class Notificacao {
	


	private int numNotificacao;
	private String alvoNotificacao;
	private String dataNotificacao;
	private String endNotificacao;
	private String denuncia;
	private String notificacao;
	private String objNotificacao;
	



	Notificacao() {

		numNotificacao = Integer.parseInt(JOptionPane.showInputDialog("Informe o Número da Notificação: "));
		dataNotificacao = JOptionPane.showInputDialog("Informe a Data da Notificação no formato DDMMAAAA:");
		alvoNotificacao = new Alvo().RecuperaAlvo();
		objNotificacao = JOptionPane.showInputDialog("Informe o Objeto da Notificação: ");
		this.endNotificacao = new Endereco().ExibeEndereco();
		do {
			
			this.denuncia = JOptionPane.showInputDialog("Notificação gerada a partir de Denúncia? (Responda 'S' para Sim e 'N' para Não)");
			
		}while ((!denuncia.toLowerCase().equals("s"))&&(!denuncia.toLowerCase().equals("n")));
	}
	
	public String RecuperaNotificacao() {
		
		notificacao = "Nº Notificação: " + this.getNumNotificacao() + "\nData Notificação: " + this.getDataNotificacao() + "\n\nNotificado: " +  this.alvoNotificacao + "\n\nObjeto Notificação: " + this.getObjNotificacao();
		
		return notificacao;
	}
		

	public String getObjNotificacao() {
		return objNotificacao;
	}
	
	public void setObjNotificacao(String objNotificacao) {
		this.objNotificacao = objNotificacao;
	}
	public int getNumNotificacao() {
		return numNotificacao;
	}
	
	public void setNumNotificacao(int numNotificacao) {
		this.numNotificacao = numNotificacao;
	}
	
	public String getAlvoNotificacao() {
		return alvoNotificacao;
	}
	
	public void setAlvoNotificacao(String alvoNotificacao) {
		this.alvoNotificacao = alvoNotificacao;
	}
	
	public String getDataNotificacao() {
		return dataNotificacao;
	}
	
	public void setDataNotificacao(String dataNotificacao) {
		this.dataNotificacao = dataNotificacao;
	}
	
	public String getEndNotificacao() {
		return endNotificacao;
	}
	
	public void setEndNotificacao(String endNotificacao) {
		this.endNotificacao = endNotificacao;
	}
	
	public String getDenuncia() {
		return denuncia;
	}
	
	public void setDenuncia(String denuncia) {
		this.denuncia = denuncia;
	}
	
	public String getNotificacao() {
		return notificacao;
	}
	
	public void setNotificacao(String notificacao) {
		this.notificacao = notificacao;
	}
}
