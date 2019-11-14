/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import javax.swing.JOptionPane;
import model.bean.Funcionario;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author vivis
 */
public class UsuarioDAOTest {
    
    public UsuarioDAOTest() {
    }

    @org.junit.Test
    //@Ignore
    public void InserirUsuario() {
        
        Funcionario usua = new Funcionario("12345678913", "Viviane Santana", "Fiscal", "Fiscalização", "senha123");
        FuncionarioDAO dao = new FuncionarioDAO();
        
        if(dao.Insere(usua)){
            System.out.println("Salvo com sucesso");
        }else{
            fail("Erro ao Inserir.");
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
