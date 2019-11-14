/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisgefa;

/**
 *
 * @author vivis
 */
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Endereco {

	private int num;
	private String cep;
	private Object[] tipoLogradouro = {"Selecione", "Rua", "Avenida", "Alameda", "Praça"};
	private Object selectedValue;
	private String logradouro;
	private String complemento;
	private String bairro;
	private String municipio;
	private String uf;
	private String latitude;
	private String longitude;
	
	Endereco(){
		
		//this.tipoLogradouro = JOptionPane.showInputDialog("Informe o Tipo de Logradouro (Rua, Avenida, Praça, ...: ");
		this.selectedValue = JOptionPane.showInputDialog(null,"Selecione o tipo do logradouro: ", "Opçao",JOptionPane.INFORMATION_MESSAGE, null, tipoLogradouro, tipoLogradouro[0]);
		this.logradouro = JOptionPane.showInputDialog("Informe o nome do logradouro: ");
		this.num = Integer.parseInt(JOptionPane.showInputDialog("Informe o número: "));
		this.complemento = JOptionPane.showInputDialog("Informe o complemento (se não houver informar 'N/A'): ");
		this.bairro = JOptionPane.showInputDialog("Informe o bairro: ");
		this.cep = JOptionPane.showInputDialog("Informe o cep no formato '00000000': ");
		this.municipio = JOptionPane.showInputDialog("Informe o Município: ");
		this.uf = JOptionPane.showInputDialog("Informe a Unidade Federativa no formato 'UF':");
		this.latitude = "";
		this.longitude = "";
		
		
	}
	
	String ExibeEndereco() {
		
		String end = getSelectedValue() + " " + getLogradouro() + ", " + getNum() + ", " + getComplemento() + "\n " + getBairro() + " - " + " CEP: " + getCep() + " - " +  getMunicipio() + " / " + getUf();
		
		return end;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public Object getSelectedValue() {
		return selectedValue;
	}

	public void setSelectedValue(Object selectedValue) {
		this.selectedValue = selectedValue;
	}

	public void setTipoLogradouro(Object[] tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}
	

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
}