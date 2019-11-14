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
import model.bean.Vistoria;

/**
 *
 * @author vivis
 */
public class VistoriaDAO {
    
    private Connection con = null;

    public VistoriaDAO() {
        con = ConnectionFactory.getConnection();
        
    }
    
    public boolean Insere(Vistoria vistoria){
        
        String sql = "INSERT INTO vistoria (DATA, LOCAL, DENUNCIA, funcionario_cpf, RELATORIO) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, vistoria.getData());
            stmt.setString(2, vistoria.getLocal());
            stmt.setBoolean(3, vistoria.isDenuncia());
            stmt.setString(4, vistoria.getResponsavel());
            stmt.setString(5,vistoria.getRelatorio());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            ConnectionFactory.closeConnection(con, stmt);
            return false;
        }
    }
    
     public List<Vistoria> BuscaVistoria(){
        
        String sql = "SELECT * FROM vistoria";
        VistoriaDAO vistDAO = new VistoriaDAO();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String responsavel = null;
        
        List<Vistoria> listaVistoria = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                Vistoria vistoria = new Vistoria();
                vistoria.setData(rs.getString("DATA"));
                vistoria.setLocal(rs.getString("LOCAL"));
                responsavel = BuscaResponsavel(rs.getString("funcionario_cpf"));
                vistoria.setResponsavel(responsavel);
                listaVistoria.add(vistoria);
            }
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return listaVistoria;
    } 
     
     public String BuscaResponsavel(String cpf){
        
        String sql = "SELECT nome FROM funcionario WHERE cpf = ? ";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        Funcionario respVistoria = new Funcionario();
//        respVistoria.setCpf(cpf);
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, cpf);
            rs = stmt.executeQuery();
            if(rs != null && rs.next()){
                respVistoria.setNome(rs.getString("NOME"));
            }
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return respVistoria.getNome();
    } 
     

    public List<Vistoria> BuscaVistoriaPorData(String data){
        
        String sql = "SELECT * FROM vistoria WHERE data = ?";
        VistoriaDAO vistDAO = new VistoriaDAO();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String responsavel = null;
        
        List<Vistoria> listaVistoria = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, data);
            rs = stmt.executeQuery();
            while(rs.next()){
                Vistoria vistoria = new Vistoria();
                vistoria.setData(rs.getString("DATA"));
                vistoria.setLocal(rs.getString("LOCAL"));
                responsavel = BuscaResponsavel(rs.getString("funcionario_cpf"));
                vistoria.setResponsavel(responsavel);
                listaVistoria.add(vistoria);
            }
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return listaVistoria;
    } 
}
    
//    public List<Vistoria> BuscaPorData(){
//        
//        String sql = "SELECT * FROM vistoria";
//
//        
//        PreparedStatement stmt = null;
//        ResultSet rs = null;
//
//        List<Vistoria> listaVistoria = new ArrayList<>();
//        Vistoria vistoria = new Vistoria();
//        try {
//            stmt = con.prepareStatement(sql);
//            rs = stmt.executeQuery();
//            
//            while(rs.next()){
//                vistoria.setData(rs.getString("DATA"));
//                vistoria.setLocal(rs.getString("LOCAL"));
//                vistoria.setResponsavel(rs.getString("USUARIO_CPF"));
//                listaVistoria.add(vistoria); 
//            }
//            
//        } catch (SQLException ex) {
//            System.err.println("Erro" + ex);
//        }finally{
//            ConnectionFactory.closeConnection(con, stmt, rs);
//        }
//        return listaVistoria;
//    } 
//}
     /*
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
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
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
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }*/


