package sisgefa;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MontaSubMenu {
	
	String nomeSistema;
	String subMenu;
	String subItemUm;
	String subItemDois;
	String subItemTres;
	String subItemQuatro;
	String subItemCinco;
	String voltar;
	String solicitaOpcao;
	
	public String MontaSubMenu(int itemMenu){
		Scanner solicitaDado = new Scanner(System.in);
	
		if(itemMenu == 1) {
			
			nomeSistema = "\n\nSIGEFA - Sistema de Gerenciamento de Fiscalização Ambiental\n\n\n";
			subMenu = "***MENU VISTORIA***\n\n";
			subItemUm = "Agendar Vistoria\n";
			subItemDois = "Buscar Vistoria\n";
			subItemTres = "Alterar  Vistoria\n";
			subItemQuatro = "Cancelar Vistoria\n";
			subItemCinco = "Imprimir Formulário de Vistoria\n";
			voltar = "Retornar ao menu anterior\n";
			solicitaOpcao = "\n Digite o número da opção desejada: ";	
			
			
			
		}else if(itemMenu == 2) {
			
			nomeSistema = "\n\nSIGEFA - Sistema de Gerenciamento de Fiscalização Ambiental\n\n\n";
			subMenu = "***MENU NOTIFICAÇÃO***\n\n";
			subItemUm = "Incluir Notificação\n";
			subItemDois = "Buscar Notificação\n";
			subItemTres = "";
			subItemQuatro = "";
			subItemCinco = "";
			voltar = "Retornar ao menu anterior\n";
			solicitaOpcao = "\n Digite o número da opção desejada: ";
			
					
		}else if(itemMenu == 3) {
			
			nomeSistema = "\n\nSIGEFA - Sistema de Gerenciamento de Fiscalização Ambiental\n\n\n";
			subMenu = "***MENU DECRETO***\n\n";
			subItemUm = "Buscar Infração\n";
			subItemDois = "Alterar Decreto\n";
			subItemTres = "Imprimir Decreto\n";
			subItemQuatro = "";
			subItemCinco = "";
			voltar = "Retornar ao menu anterior\n";
			solicitaOpcao = "\n Digite o número da opção desejada: ";	
			
					
		}else if(itemMenu == 4) {
			
			nomeSistema = "\n\nSIGEFA - Sistema de Gerenciamento de Fiscalização Ambiental\n\n\n";
			subMenu = "***MENU AUTO DE INFRAÇÃO***\n\n";
			subItemUm = "Incluir Auto de Infração\n";
			subItemDois = "Buscar Auto de Infração\n";
			subItemTres = "Alterar  Auto de Infração\n";
			subItemQuatro = "Cancelar Auto de Infração\n";
			subItemCinco = "Imprimir Auto de Infração\n";
			voltar = "Retornar ao menu anterior\n";
			solicitaOpcao = "\n Digite o número da opção desejada: ";	
		
		}
			
		//MontaMenu menu = new MontaMenu();
		String mostraSubMenu = nomeSistema + subMenu;	
		int cont = 0;
		if(subItemUm != "") {
			cont = cont + 1;
			mostraSubMenu = mostraSubMenu + cont + " - " + subItemUm;
		}
		if(subItemDois != "") {
			cont = cont + 1;
			mostraSubMenu = mostraSubMenu + cont + " - " + subItemDois;
		}
		if(subItemTres != "") {
			cont = cont + 1;
			mostraSubMenu = mostraSubMenu + cont + " - " + subItemTres;
		}
		if(subItemQuatro != "") {
			cont = cont + 1;
			mostraSubMenu = mostraSubMenu + cont + " - " + subItemQuatro;
		}
		if(subItemCinco != "") {
			cont = cont + 1;
			mostraSubMenu = mostraSubMenu + cont + " - " + subItemCinco;
		}
		cont = 0;
		mostraSubMenu = mostraSubMenu + cont + " - " + voltar + solicitaOpcao;
		
		return mostraSubMenu;
	}
}
