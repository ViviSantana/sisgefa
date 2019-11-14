/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import ConexaoBanco.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Funcionario;

/**
 *
 * @author vivis
 */
public class FuncionarioDAO {
    
    private Connection con = null;

    public FuncionarioDAO() {
        con = ConnectionFactory.getConnection();
        
    }
    
    public boolean Insere(Funcionario usuario){
        
        String sql = "INSERT INTO funcionario (CPF, NOME, FUNCAO, SETOR, SENHA) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario.getCpf());
            stmt.setString(2, usuario.getNome());
            stmt.setString(3, usuario.getFuncao());
            stmt.setString(4, usuario.getSetor());
            stmt.setString(5, usuario.getSenha());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            ConnectionFactory.closeConnection(con, stmt);
            return false;
        }        
    }
    
    public List<Funcionario> Busca(){
        
        String sql = "SELECT * FROM usuario";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Funcionario> listaUsuario = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                Funcionario usuario = new Funcionario();
                usuario.setNome(rs.getString("NOME"));
                /*usuario.setNome(rs.getString("NOME"));
                usuario.setFuncao(rs.getString("FUNCAO"));
                usuario.setSetor(rs.getString("SETOR"));*/
                listaUsuario.add(usuario);
            }
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return listaUsuario;
    } 
    
    public boolean Atualiza(Funcionario usuario){

        String sql = "UPDATE usuario SET NOME = ?,FUNCAO = ?,SETOR = ?,SENHA = ? WHERE CPF = ?;";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);

            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getFuncao());
            stmt.setString(3, usuario.getSetor());
            stmt.setString(4, usuario.getSenha());
            stmt.setString(5, usuario.getCpf());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            ConnectionFactory.closeConnection(con, stmt);
            return false;
        }        
    }
    
    public boolean Apaga(Funcionario usuario){

        String sql = "DELETE FROM usuario WHERE CPF = ?;";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);

            stmt.setString(1, usuario.getCpf());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            ConnectionFactory.closeConnection(con, stmt);
            return false;
        }
    }
}
