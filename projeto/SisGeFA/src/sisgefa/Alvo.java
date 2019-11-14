package sisgefa;

import javax.swing.JOptionPane;

public class Alvo {

	

	private String cpfCnpj;
	private Object[] pessoa = {"Pessoa Física", "Pessoa Jurídica"};
	private Object pessoaSelected;
	private String nome;
	private Endereco endereco;
	private String alvo;
	
	Alvo(){
		
		this.pessoaSelected = JOptionPane.showInputDialog(null,"Informe o Tipo de Pessoa: ", "Opçao",JOptionPane.INFORMATION_MESSAGE, null, pessoa, pessoa[0]);
		if(pessoaSelected.equals("Pessoa Física")) {
			cpfCnpj = JOptionPane.showInputDialog("Informe o CPF (somente números): ");
			nome = JOptionPane.showInputDialog("Informe o Nome: ");
		}else {
			cpfCnpj = JOptionPane.showInputDialog("Informe o CNPJ (somente números): ");
			nome = JOptionPane.showInputDialog("Informe a Razão Social: ");;
		}
	}
	
	void InsereAlvo(){
		
		this.pessoaSelected = JOptionPane.showInputDialog(null,"Informe o Tipo de Pessoa: ", "Opçao",JOptionPane.INFORMATION_MESSAGE, null, pessoa, pessoa[0]);
		if(pessoaSelected.equals("Pessoa Física")) {
			cpfCnpj = JOptionPane.showInputDialog("Informe o CPF (somente números): ");
			nome = JOptionPane.showInputDialog("Informe o Nome: ");
		}else {
			cpfCnpj = JOptionPane.showInputDialog("Informe o CNPJ (somente números): ");
			nome = JOptionPane.showInputDialog("Informe a Razão Social: ");;
		}
		endereco = new Endereco();
		
	}
	
	public String RecuperaAlvo() {
		
		alvo = this.getCpfCnpj() + " - " + this.nome;
		
		return alvo;
	}
	
	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public Object[] getPessoa() {
		return pessoa;
	}

	public void setPessoa(Object[] pessoa) {
		this.pessoa = pessoa;
	}

	public Object getSelectedValue() {
		return pessoaSelected;
	}

	public void setSelectedValue(Object selectedValue) {
		this.pessoaSelected = selectedValue;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getAlvo() {
		return alvo;
	}

	public void setAlvo(String alvo) {
		this.alvo = alvo;
	}
	
}

