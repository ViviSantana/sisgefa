package model.dao;

import ConexaoBanco.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Funcionario;
import model.bean.Municipio;
import model.bean.Pessoa;

/**
 *
 * @author vivis
 */
public class PessoaDAO {
    
    private Connection con = null;

    public PessoaDAO() {
        con = ConnectionFactory.getConnection();
    }
    
    public boolean Insere(Pessoa pessoa){
        
        String sql = "INSERT INTO `sisgefa`.`pessoa`(`cpf_cnpj`,`nome`,`rg`,`email`,"
                + "`telefone`,`tipo_logradouro_codigo`,`logradouro`,`num_logradouro`,"
                + "`comp_logradouro`,`bairro_logradouro`,`municipio_id`,`municipio_uf_codigo`,"
                + "`pref_contato`)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?);";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, pessoa.getCpf_cnpj());
            stmt.setString(2, pessoa.getNome());
            stmt.setString(3, pessoa.getRg());
            stmt.setString(4, pessoa.getEmail());
            stmt.setString(5, pessoa.getTelefone());
            stmt.setString(6, pessoa.gettipo_logradouro_cod().getCodigo());
            stmt.setString(7, pessoa.getLogradouro());
            stmt.setInt(8, pessoa.getNum_logradouro());
            stmt.setString(9, pessoa.getComp_logradouro());
            stmt.setString(10, pessoa.getBairro_logradouro());
            stmt.setInt(11, pessoa.getMunicipio_id().getId());
            stmt.setString(12, pessoa.getMunicipio_id().getUf());
            stmt.setString(13, pessoa.getPref_contato());
            stmt.executeUpdate();
            return true;
        } catch (Exception ex) {
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
        }return listaUsuario;
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
    
    public int RetornaIdMunicipio(String descMunicipio){
        
        String sql = "SELECT * FROM municipio d WHERE nome = ?;";
        
        Municipio munic = new Municipio();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int idMunicipio = 0;
        
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, descMunicipio);
            rs = stmt.executeQuery();
            if(rs != null && rs.next()){
                munic.setId(rs.getInt("ID"));
                idMunicipio = munic.getId();
            }
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            ConnectionFactory.closeConnection(con, stmt);
        }
        return idMunicipio;
    } 
    
    public String RetornaUfMunicipio(int idMunicipio){
        
        String sql = "SELECT * FROM municipio d WHERE id = ?;";
        
        Municipio munic = new Municipio();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String ufMunicipio = null;
        
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, idMunicipio);
            rs = stmt.executeQuery();
            if(rs != null && rs.next()){
                munic.setUf(rs.getString("UF_CODIGO"));
                ufMunicipio = munic.getUf();
            }
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            ConnectionFactory.closeConnection(con, stmt);
        }
        return ufMunicipio;
    } 
}
