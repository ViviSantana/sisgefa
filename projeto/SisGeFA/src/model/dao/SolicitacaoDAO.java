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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bean.Denuncia;
import model.bean.Municipio;
import model.bean.Pessoa;
import model.bean.Solicitacao;
import model.bean.Status;
import model.bean.TipoDenuncia;
import model.bean.TipoLogradouro;
import model.bean.TipoSolicitacao;
import model.bean.UF;
import model.screen.PesqDenuncia;

/**
 *
 * @author btps000328
 */
public class SolicitacaoDAO {
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null;
    PesqDenuncia pesq = new PesqDenuncia();
    Municipio munic = new Municipio();
    UF uf = new UF();
    TipoLogradouro tipoL = new TipoLogradouro();
    Denuncia denuncia = new Denuncia();

    TipoSolicitacao tipoS = new TipoSolicitacao();
    Status status = new Status();

    public SolicitacaoDAO() {
    
        con = ConnectionFactory.getConnection();
    }
    
    public int InsereSolicitacao(Solicitacao sol, Pessoa req) {

        String sql = "INSERT INTO `sisgefa`.`solicitacao` (`data`,`status_codigo`,`logradouro`,`num_logradouro`,`compl_logradouro`,`bairro`,`pto_referencia`,`nomevulgar`,`qtdalvo`,`justificativa`,"
                + "`municipio_id`,`municipio_uf_codigo`,`pessoa_id`,`tipo_logradouro_codigo`,`tipoterreno_codigo`,`motivo_codigo`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        int lastId = 0;
        try {
            stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1,sol.getData());
            stmt.setString(2,sol.getStatusS());
            stmt.setString(3,sol.getLogSol());
            stmt.setInt(4,sol.getNumLogSol());
            stmt.setString(5,sol.getComplLogSol());
            stmt.setString(6,sol.getBairroSol());
            stmt.setString(7,sol.getPtoReferenciaSol());
            stmt.setString(8,sol.getNomeVulgarSol());
            stmt.setString(9,sol.getQtdAlvoSol());
            stmt.setString(10,sol.getMaisInfoJustSolicitacao());
            stmt.setInt(11,sol.getMunicSol().getId());
            stmt.setString(12,sol.getUfSol());
            stmt.setString(13,req.getCpf_cnpj());
            stmt.setString(14,sol.getTipoLogSol().getCodigo());
            stmt.setString(15,sol.getTipoTSol().getCodigo());
            stmt.setString(16,sol.getMotivoS().getCodigo());

            
            stmt.executeUpdate();
            rs = stmt.getGeneratedKeys();

            if (rs.next()) {
                lastId = rs.getInt(1);
            }
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            ConnectionFactory.closeConnection(con, stmt, rs);
        } 
        return lastId;

    }
    
        public int RetornaProtocolo(Denuncia denuncia) {

        String sql = "SELECT d.id FROM denuncia d WHERE tipo_denuncia_codigo = ? and data = ? and denunciado = ? and descricao = ?;";

        int protocoloDenuncia = 0;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, denuncia.getTipoDenuncia().getCodigo());
            stmt.setString(2, denuncia.getData());
            stmt.setString(3, denuncia.getNomeDenunciado());
            stmt.setString(4, denuncia.getDescricaoDenuncia());
            rs = stmt.executeQuery();
            while (rs.next()) {
                denuncia.setId(rs.getInt("ID"));
                protocoloDenuncia = denuncia.getId();
            }
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return protocoloDenuncia;
    }

    public int RetornaIdMunicipio(String descMunicipio) {

        String sql = "SELECT * FROM municipio d WHERE nome = ?;";

        
        int idMunicipio = 0;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, descMunicipio);
            rs = stmt.executeQuery();
            while (rs.next()) {
                munic.setId(rs.getInt("ID"));
                idMunicipio = munic.getId();
            }
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return idMunicipio;
    }
    
    public Municipio RetornaMunicipio(String descMunicipio) {

        String sql = "SELECT * FROM municipio d WHERE id = ?;";

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, descMunicipio);
            rs = stmt.executeQuery();
            while (rs.next()) {
                munic.setId(rs.getInt("id"));
                munic.setNome(rs.getString("nome"));
                munic.setUf(rs.getString("uf_codigo"));
            }
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return munic;
    }

    public String RetornaUfMunicipio(int idMunicipio) {

        String sql = "SELECT * FROM municipio d WHERE id = ?;";

        String ufMunicipio = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, idMunicipio);
            rs = stmt.executeQuery();
            while (rs.next()) {
                munic.setUf(rs.getString("UF_CODIGO"));
                ufMunicipio = munic.getUf();
            }
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return ufMunicipio;
    }
    
    public String RetornaUfMunicipio(String descUfMunicipio) {

        String sql = "SELECT * FROM uf WHERE nome = ?;";
        
        String idUF = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, descUfMunicipio);
            rs = stmt.executeQuery();
            while (rs.next()) {
                uf.setcodigo(rs.getString("codigo"));
                uf.setNome("nome");
                idUF = uf.getcodigo();
            }
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return idUF;
    }

    public String RetornaIdTipoLog(String descTipoLog) {

        String sql = "SELECT codigo FROM tipo_logradouro WHERE descricao = ?;";

        String idTipoLog = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, descTipoLog);
            rs = stmt.executeQuery();
            while (rs.next()) {
                tipoL.setCodigo(rs.getString("codigo"));
                idTipoLog = tipoL.getCodigo();
            }
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return idTipoLog;
    }
    
    public TipoLogradouro RetornaTipoLog(String descTipoLog) {

        String sql = "SELECT * FROM tipo_logradouro WHERE descricao = ?;";

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, descTipoLog);
            rs = stmt.executeQuery();
            while (rs.next()) {
                tipoL.setCodigo(rs.getString("codigo"));
                tipoL.setDescricao("descricao");                
            }
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return tipoL;
    }

    public Pessoa RetornaPessoa(String cpf_cnpj) {

            PreparedStatement stmt = null;
            ResultSet rs = null;
            Pessoa pessoa = new Pessoa();
        String sql = "SELECT * FROM pessoa WHERE cpf_cnpj = ?;";

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, cpf_cnpj);
            rs = stmt.executeQuery();
            if (rs.next()) {
                pessoa.setNome(rs.getString("NOME"));
                pessoa.setRg(rs.getString("RG"));
                pessoa.setEmail(rs.getString("EMAIL"));
                pessoa.setTelefone(rs.getString("TELEFONE"));
                pessoa.setLogradouro(rs.getString("LOGRADOURO"));
                pessoa.setNum_logradouro(rs.getInt("NUM_LOGRADOURO"));
                pessoa.setComp_logradouro(rs.getString("COMP_LOGRADOURO"));
                pessoa.setBairro_logradouro(rs.getString("BAIRRO_LOGRADOURO"));
            }else{
                pessoa = null;
            }
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
        }
        return pessoa;
    }
    
//    public TipoDenuncia RetornaTipoDenuncia(String codTipoD) {
//
//        String sql = "SELECT * FROM tipo_denuncia WHERE codigo = ?;";
//
//        try {
//            stmt = con.prepareStatement(sql);
//            stmt.setString(1, codTipoD);
//            rs = stmt.executeQuery();
//            if (rs != null && rs.next()) {
//                tipoD.setCodigo(rs.getString("codigo"));
//                tipoD.setDescricao(rs.getString("descricao"));
//            }
//        } catch (SQLException ex) {
//            System.err.println("Erro" + ex);
//        }
//        return tipoD;
//    }

    public Status RetornaStatus(String statusD) {

        String sql = "SELECT * FROM status WHERE codigo = ?;";

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, statusD);
            rs = stmt.executeQuery();
            while (rs.next()) {
                status.setCodigo(rs.getString("codigo"));
                status.setDescricao("descricao");

            }
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return status;
    }
    
    public String RetornaIdStatus(String statusD) {

        String sql = "SELECT * FROM status WHERE descricao = ?;";

        String idStatus = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, statusD);
            rs = stmt.executeQuery();
            while (rs.next()) {
                status.setCodigo(rs.getString("codigo"));
                idStatus = status.getCodigo();
            }
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
        }
        return idStatus;
    }

//    public List<TipoDenuncia> RetornaTipoDenuncia(int codTipo) {
//
//        String sql = "SELECT * FROM tipo_denuncia WHERE codigo = ?;";
//
//        List<TipoDenuncia> listaTipoDenuncia = new ArrayList<>();
//
//        try {
//            stmt = con.prepareStatement(sql);
//            stmt.setInt(1, codTipo);
//            rs = stmt.executeQuery();
//            if (rs != null && rs.next()) {
//                tipoD.setCodigo(rs.getString("codigo"));
//                tipoD.setDescricao("descricao");
//
//                listaTipoDenuncia.add(tipoD);
//            }
//        } catch (SQLException ex) {
//            System.err.println("Erro" + ex);
//        }
//        return listaTipoDenuncia;
//    }

//    public List<Denuncia> PesquisaDenuncia(List parametros) {
//
//        String sql = "SELECT * FROM denuncia d, pessoa p "
//                + "WHERE d.pessoa_id = p.cpf_cnpj "
//                + "and d.id = coalesce(?, d.id) "
//                + "and d.tipo_denuncia_codigo = coalesce(?,d.tipo_denuncia_codigo) "
//                + "and d.data = coalesce(?, d.data) "
//                + "and d.status = coalesce(?, d.status) "
//                + "and d.pessoa_id = coalesce(?, d.pessoa_id) "
//                + "and p.municipio_id = coalesce(?, p.municipio_id) "
//                + "and p.municipio_uf_codigo = coalesce(?, p.municipio_uf_codigo) "
//                + "and d.denunciado = coalesce(?, d.denunciado) "
//                + "and d.bairro = coalesce(?, d.bairro) "
//                + "and d.municipio_id = coalesce(?, d.municipio_id) "
//                + "and d.municipio_uf_codigo = coalesce(?, d.municipio_uf_codigo) "
//                + "and d.descricao like coalesce(?, d.descricao)";
//        List<Denuncia> listaParamPesq = new ArrayList();
//
//        try {
//
//            stmt = con.prepareStatement(sql);
//
//            stmt.setObject(1, parametros.get(1));//PROTOCOLO
//            stmt.setObject(2, parametros.get(2));//TIPO DENUNCIA
//            stmt.setObject(3, parametros.get(3));//DATA 
//            stmt.setObject(4, parametros.get(4));//STATUS
//            stmt.setObject(5, parametros.get(0));//CPF DENUNCIANTE
//            stmt.setObject(6, parametros.get(5));//MUNICIPIO DENUNCIANTE
//            stmt.setObject(7, parametros.get(6));//UF DENUNCIANTE
//            stmt.setObject(8, parametros.get(7));//NOME DENUNCIADO
//            stmt.setObject(9, parametros.get(8));//BAIRRO DENUNCIADO
//            stmt.setObject(10, parametros.get(9));//MUNICIPIO DENUNCIADO
//            stmt.setObject(11, parametros.get(10));//UF DENUNCIADO
//            stmt.setObject(12, parametros.get(11));//DESCRICAO DENUNCIA
//
//            rs = stmt.executeQuery();
//           // JOptionPane.showMessageDialog(null, rs);
//            while (rs.next()) {
//
//                denuncia.setId(rs.getInt("id"));
//                denuncia.setTipoDenuncia(RetornaTipoDenuncia(rs.getString("tipo_denuncia_codigo")));
//                denuncia.setData(rs.getString("data"));
//                denuncia.setNomeDenunciado(rs.getString("denunciado"));
//                denuncia.setTipoLogradouro(RetornaTipoLog(rs.getString("tipo_logradouro_codigo")));
//                denuncia.setLogradouro(rs.getString("logradouro"));
//                denuncia.setNumLogradouro(rs.getInt("num_logradouro"));
//                denuncia.setComplLogradouro(rs.getString("compl_logradouro"));
//                denuncia.setBairro(rs.getString("bairro"));
//                denuncia.setMunicipio(RetornaMunicipio(rs.getInt("municipio_id")));
//                denuncia.setUf(RetornaUfMunicipio(rs.getString("municipio_uf_codigo")));
//                denuncia.setPtoReferencia(rs.getString("pto_referencia"));
//                denuncia.setDescricaoDenuncia(rs.getString("descricao"));
//                denuncia.setDenunciante(RetornaPessoa(rs.getString("pessoa_id")));
//                denuncia.setStatusD(RetornaStatus(rs.getString("status")).getDescricao());
//                
//                listaParamPesq.add(denuncia);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(DenunciaDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return listaParamPesq;
//    }
    
//    public Denuncia RetornaDenuncia(List parametros) {
//
//        String sql = "SELECT * FROM denuncia d, pessoa p "
//                + "WHERE d.pessoa_id = p.cpf_cnpj "
//                + "and d.id = coalesce(?, d.id) "
//                + "and d.tipo_denuncia_codigo = coalesce(?,d.tipo_denuncia_codigo) "
//                + "and d.data = coalesce(?, d.data) "
//                + "and d.status = coalesce(?, d.status) "
//                + "and d.pessoa_id = coalesce(?, d.pessoa_id) "
//                + "and p.municipio_id = coalesce(?, p.municipio_id) "
//                + "and p.municipio_uf_codigo = coalesce(?, p.municipio_uf_codigo) "
//                + "and d.denunciado = coalesce(?, d.denunciado) "
//                + "and d.bairro = coalesce(?, d.bairro) "
//                + "and d.municipio_id = coalesce(?, d.municipio_id) "
//                + "and d.municipio_uf_codigo = coalesce(?, d.municipio_uf_codigo) "
//                + "and d.descricao like coalesce(?, d.descricao)";
//        //List<Denuncia> listaParamPesq = new ArrayList();
//
//        try {
//
//            stmt = con.prepareStatement(sql);
//
//            stmt.setObject(1, parametros.get(1));//PROTOCOLO
//            stmt.setObject(2, parametros.get(2));//TIPO DENUNCIA
//            stmt.setObject(3, parametros.get(3));//DATA 
//            stmt.setObject(4, parametros.get(4));//STATUS
//            stmt.setObject(5, parametros.get(0));//CPF DENUNCIANTE
//            stmt.setObject(6, parametros.get(5));//MUNICIPIO DENUNCIANTE
//            stmt.setObject(7, parametros.get(6));//UF DENUNCIANTE
//            stmt.setObject(8, parametros.get(7));//NOME DENUNCIADO
//            stmt.setObject(9, parametros.get(8));//BAIRRO DENUNCIADO
//            stmt.setObject(10, parametros.get(9));//MUNICIPIO DENUNCIADO
//            stmt.setObject(11, parametros.get(10));//UF DENUNCIADO
//            stmt.setObject(12, parametros.get(11));//DESCRICAO DENUNCIA
//
//            rs = stmt.executeQuery();
//           // JOptionPane.showMessageDialog(null, rs);
//            while (rs.next()) {
//
//                denuncia.setId(rs.getInt("id"));
//                denuncia.setTipoDenuncia(RetornaTipoDenuncia(rs.getString("tipo_denuncia_codigo")));
//                denuncia.setData(rs.getString("data"));
//                denuncia.setNomeDenunciado(rs.getString("denunciado"));
//                denuncia.setTipoLogradouro(RetornaTipoLog(rs.getString("tipo_logradouro_codigo")));
//                denuncia.setLogradouro(rs.getString("logradouro"));
//                denuncia.setNumLogradouro(rs.getInt("num_logradouro"));
//                denuncia.setComplLogradouro(rs.getString("compl_logradouro"));
//                denuncia.setBairro(rs.getString("bairro"));
//                denuncia.setMunicipio(RetornaMunicipio(rs.getInt("municipio_id")));
//                denuncia.setUf(RetornaUfMunicipio(rs.getString("municipio_uf_codigo")));
//                denuncia.setPtoReferencia(rs.getString("pto_referencia"));
//                denuncia.setDescricaoDenuncia(rs.getString("descricao"));
//                denuncia.setDenunciante(RetornaPessoa(rs.getString("pessoa_id")));
//                denuncia.setStatusD(RetornaStatus(rs.getString("status")).getDescricao());
//                
//
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(DenunciaDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return denuncia;
//    }
}
