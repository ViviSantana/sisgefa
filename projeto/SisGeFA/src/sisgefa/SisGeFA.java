package sisgefa;

import ConexaoBanco.ConnectionFactory;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class SisGeFA {

    public static void main(String[] args) {
        
        ConnectionFactory conexao = new ConnectionFactory();
        
		int opcao;
		int opcaoMenu;
		int temp = 0;
		int mostra;
		int repete = 0;
		Scanner solicitaDado = new Scanner(System.in);
		
		MontaMenu menu = new MontaMenu();
		MontaSubMenu subMenu = new MontaSubMenu();
		LimpaConsole cls = new LimpaConsole();
		String vistoria;
		String notificacao;
		
		do{
			opcao = Integer.parseInt(JOptionPane.showInputDialog(menu.MontaMenu()));
			opcaoMenu = opcao;
			if((opcao != 0) && ( opcao <= 4)) {
				opcao = Integer.parseInt(JOptionPane.showInputDialog(subMenu.MontaSubMenu(opcao)));
				if (opcao != 0) {
					if(opcaoMenu == 1) {
						if (opcao == 1) {
							do {	
								vistoria = new Vistoria().ExibeVistoria();
								repete = JOptionPane.showConfirmDialog(null, "Agendar nova vistoria?", null, JOptionPane.YES_NO_OPTION);
							}while (repete == 0);//enquanto resposta for SIM
							JOptionPane.showMessageDialog(null, vistoria);
						}
					}else if (opcaoMenu == 2) {
						if (opcao == 1) {
							do {	
								notificacao = new Notificacao().RecuperaNotificacao();
								repete = JOptionPane.showConfirmDialog(null, "Gerar nova Notificação?", null, JOptionPane.YES_NO_OPTION);
							}while (repete == 0);//enquanto resposta for SIM
							JOptionPane.showMessageDialog(null, notificacao);
						}
					}
				}
					
			}else if(opcao > 4){
				JOptionPane.showMessageDialog(null, "Item de Menu inválido.");
				opcao = 0;
				
			}else{
				JOptionPane.showMessageDialog(null, "Desconectado!");
				opcao = 9;
				}
		}while(opcao == 0);
	}
}
