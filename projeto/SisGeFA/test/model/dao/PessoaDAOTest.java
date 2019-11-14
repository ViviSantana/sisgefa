/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import javax.swing.JOptionPane;
import model.bean.Funcionario;
import model.bean.Municipio;
import model.bean.Pessoa;
import model.bean.TipoLogradouro;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author vivis
 */
public class PessoaDAOTest {
    
    public PessoaDAOTest() {
    }

    @org.junit.Test
    //@Ignore
    public void InserirUsuario() {
        
        PessoaDAO dao = new PessoaDAO();
        TipoLogradouro tipoL = new TipoLogradouro();
        tipoL.setCodigo("Av");
        Municipio munc = new Municipio(dao.RetornaIdMunicipio("Belo Horizonte"), "Belo Horizonte", (dao.RetornaUfMunicipio((dao.RetornaIdMunicipio("Belo Horizonte")))));
        //munc.setId(dao.RetornaIdMunicipio("Belo Horizonte"));
        try {
            Pessoa pessoa = new Pessoa("Viviane Santana", "MG11442168", "06925442670", "vivisant@gmail.com", "(31)99163-7557", tipoL, "Manila", 90, "Apto 602 Bloco 2", "Havai", munc, dao.RetornaUfMunicipio(munc.getId()), "Carta");
            
            if(dao.Insere(pessoa)){
            System.out.println("Salvo com sucesso");
            }         
        } catch (Exception e) {
            System.err.println("Erro: "+e);
        }
    }
    
    @org.junit.Test
    @Ignore
    public void ListarUsuario(){
        FuncionarioDAO dao = new FuncionarioDAO();
        
        for (Funcionario u: dao.Busca()){
            
            JOptionPane.showMessageDialog(null,"Usuário:" + u.getNome());
        }
    }
    
    @org.junit.Test
    @Ignore
    public void AtualizarUsuario() {
        
        Funcionario usua = new Funcionario("Usuario Atualizado", "Fiscal", "Licenciamento", "senha321", "12345678910");
        FuncionarioDAO dao = new FuncionarioDAO();
        
        if(dao.Atualiza(usua)){
            System.out.println("Atualizado com sucesso");
        }else{
            fail("Erro ao Atualizar.");
        }  
    }
    
    @org.junit.Test
    @Ignore
    public void ApagaUsuario() {
        
        Funcionario usua = new Funcionario();
        usua.setCpf("123456789");
        FuncionarioDAO dao = new FuncionarioDAO();
        
        if(dao.Apaga(usua)){
            System.out.println("Apagado com sucesso");
        }else{
            fail("Erro ao Apagar.");
        }  
    }
    
    
            
}
