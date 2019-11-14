package sisgefa;

import java.util.Scanner;

public class MontaMenu {

	
	String nomeSistema;
	String menu;
	String itemUm;
	String itemDois;
	String itemTres;
	String itemQuatro;
	String itemCinco;
	String sair;
	String solicitaOpcao;

	public String MontaMenu(){
		Scanner solicitaDado = new Scanner(System.in);
		
		nomeSistema = "\n\nSisGeFA - SISTEMA DE GERENCIAMENTO DE FISCALIZAÇÃO AMBIENTAL\n\n\n";
		menu = "***MENU***\n\n";
		itemUm = "Vistoria\n";
		itemDois = "Notificação\n";
		itemTres = "Decreto\n";
		itemQuatro = "Auto Infração\n";
		itemCinco = "";
		sair = "Sair\n";
		solicitaOpcao = "\n Digite o número da opção desejada: ";

		String mostraMenu = nomeSistema + menu;	
		int cont = 0;
		if(itemUm != "") {
			cont = cont + 1;
			mostraMenu = mostraMenu + cont + " - " + itemUm;
		}
		if(itemDois != "") {
			cont = cont + 1;
			mostraMenu = mostraMenu + cont + " - " + itemDois;
		}
		if(itemTres != "") {
			cont = cont + 1;
			mostraMenu = mostraMenu + cont + " - " + itemTres;
		}
		if(itemQuatro != "") {
			cont = cont + 1;
			mostraMenu = mostraMenu + cont + " - " + itemQuatro;
		}
		if(itemCinco != "") {
			cont = cont + 1;
			mostraMenu = mostraMenu + cont + " - " + itemCinco;
		}
		cont = 0;
		mostraMenu = mostraMenu + cont + " - " + sair + solicitaOpcao;
		
		return mostraMenu;
	}
		
}
