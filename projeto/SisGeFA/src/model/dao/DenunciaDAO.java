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
import javax.swing.JOptionPane;
import model.bean.Denuncia;
import model.bean.Pessoa;
import model.bean.Municipio;
import model.bean.Status;
import model.bean.TipoDenuncia;
import model.bean.TipoLogradouro;
import model.bean.UF;
import model.screen.PesqDenuncia;

public class DenunciaDAO {

    Connection con = ConnectionFactory.getConnection();

    public DenunciaDAO() {

        con = ConnectionFactory.getConnection();
    }

    public int InsereDenunciaId(Denuncia denuncia, Pessoa denunciante) {

        PreparedStatement stmt = null;
        ResultSet rs = null;

                   
        String sql = "INSERT INTO `sisgefa`.`denuncia`(`tipo_denuncia_codigo`,`data`, `denunciado`,`tipo_logradouro_codigo`,`logradouro`,`num_logradouro`,`compl_logradouro`,`bairro`,`municipio_id`,`municipio_uf_codigo`,`pto_referencia`,`descricao`,`pessoa_id`, `status`)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        int lastId = 0;
        try {
            stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, denuncia.getTipoDenuncia().getCodigo());//incluir metodo para recuperar
            stmt.setString(2, denuncia.getData());
            stmt.setString(3, denuncia.getNomeDenunciado());
            stmt.setString(4, denuncia.getTipoLogradouro().getCodigo());
            stmt.setString(5, denuncia.getLogradouro());
            stmt.setInt(6, denuncia.getNumLogradouro());
            stmt.setString(7, denuncia.getComplLogradouro());
            stmt.setString(8, denuncia.getBairro());
            stmt.setInt(9, denuncia.getMunicipio().getId());//incluir metodo para recuperar 
            stmt.setString(10, denuncia.getMunicipio().getUf());//incluir metodo para recuperar 
            stmt.setString(11, denuncia.getPtoReferencia());
            stmt.setString(12, denuncia.getDescricaoDenuncia());
            stmt.setString(13, denuncia.getDenunciante().getCpf_cnpj());//incluir metodo para recuperar denunciante
            stmt.setString(14, denuncia.getStatusD());
            stmt.executeUpdate();
//            return true;
            rs = stmt.getGeneratedKeys();

            if (rs.next()) {
                lastId = rs.getInt(1);
            }
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            ConnectionFactory.closeConnection(con, stmt);
        } 
        return lastId;
    }

    public int InsereDenunciaAn(Denuncia denuncia) {

            PreparedStatement stmt = null;
            ResultSet rs = null;

        String sql = "INSERT INTO `sisgefa`.`denuncia`(`tipo_denuncia_codigo`,`data`, `denunciado`,`tipo_logradouro_codigo`,`logradouro`,`num_logradouro`,`compl_logradouro`,`bairro`,`municipio_id`,`municipio_uf_codigo`,`pto_referencia`,`descricao`, `status`)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?);";
        int lastId = 0;
        try {
            stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, denuncia.getTipoDenuncia().getCodigo());//incluir metodo para recuperar   
            stmt.setString(2, denuncia.getData());
            stmt.setString(3, denuncia.getNomeDenunciado());
            stmt.setString(4, denuncia.getTipoLogradouro().getCodigo());
            stmt.setString(5, denuncia.getLogradouro());
            stmt.setInt(6, denuncia.getNumLogradouro());
            stmt.setString(7, denuncia.getComplLogradouro());
            stmt.setString(8, denuncia.getBairro());
            stmt.setInt(9, denuncia.getMunicipio().getId());//incluir metodo para recuperar 
            stmt.setString(10, denuncia.getMunicipio().getUf());//incluir metodo para recuperar 
            stmt.setString(11, denuncia.getPtoReferencia());
            stmt.setString(12, denuncia.getDescricaoDenuncia());
            stmt.setString(13, denuncia.getStatusD());
            stmt.executeUpdate();
            
            rs = stmt.getGeneratedKeys();

            if (rs.next()) {
                lastId = rs.getInt(1);
            }
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            ConnectionFactory.closeConnection(con, stmt);
        }

        return lastId;
    }

    public int RetornaProtocolo(Denuncia denuncia) {

            PreparedStatement stmt = null;
            ResultSet rs = null;
                
        String sql = "SELECT d.id FROM denuncia d WHERE tipo_denuncia_codigo = ? and data = ? and denunciado = ? and descricao = ?;";

        int protocoloDenuncia = 0;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, denuncia.getTipoDenuncia().getCodigo());
            stmt.setString(2, denuncia.getData());
            stmt.setString(3, denuncia.getNomeDenunciado());
            stmt.setString(4, denuncia.getDescricaoDenuncia());
            rs = stmt.executeQuery();
            if (rs != null && rs.next()) {
                denuncia.setId(rs.getInt("ID"));
                protocoloDenuncia = denuncia.getId();
            }
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
        }
        return protocoloDenuncia;
    }

    public int RetornaIdMunicipio(String descMunicipio) {

        PreparedStatement stmt = null;
        ResultSet rs = null;
        Denuncia denuncia = new Denuncia(); 
        Municipio munic = new Municipio();
        String sql = "SELECT * FROM municipio d WHERE nome = ?;";

        
        int idMunicipio = 0;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, descMunicipio);
            rs = stmt.executeQuery();
            if (rs != null && rs.next()) {
                munic.setId(rs.getInt("ID"));
                idMunicipio = munic.getId();
            }
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
        }
        return idMunicipio;
    }
    
    public Municipio RetornaMunicipio(int idMunicipio) {

        PreparedStatement stmt = null;
        ResultSet rs = null;
        Denuncia denuncia = new Denuncia();    
        Municipio munic = new Municipio();
        String sql = "SELECT * FROM municipio d WHERE id = ?;";

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, idMunicipio);
            rs = stmt.executeQuery();
            if (rs != null && rs.next()) {
                munic.setId(rs.getInt("id"));
                munic.setNome(rs.getString("nome"));
                munic.setUf(rs.getString("uf_codigo"));
            }
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
        }
        return munic;
    }

    public String RetornaUfMunicipio(int idMunicipio) {

        PreparedStatement stmt = null;
        ResultSet rs = null;
        Denuncia denuncia = new Denuncia(); 
        Municipio munic = new Municipio();
        String sql = "SELECT * FROM municipio d WHERE id = ?;";

        String ufMunicipio = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, idMunicipio);
            rs = stmt.executeQuery();
            if (rs != null && rs.next()) {
                munic.setUf(rs.getString("UF_CODIGO"));
                ufMunicipio = munic.getUf();
            }
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
        }
        return ufMunicipio;
    }
    
    public String RetornaUfMunicipio(String descUfMunicipio) {

        String sql = "SELECT * FROM uf WHERE nome = ?;";

        PreparedStatement stmt = null;
        ResultSet rs = null;
        Denuncia denuncia = new Denuncia(); 
        UF uf = new UF();
        String idUF = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, descUfMunicipio);
            rs = stmt.executeQuery();
            if (rs != null && rs.next()) {
                uf.setcodigo(rs.getString("codigo"));
                uf.setNome("nome");
                idUF = uf.getcodigo();
            }
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
        }
        return idUF;
    }

    public String RetornaIdTipoLog(String descTipoLog) {

        String sql = "SELECT codigo FROM tipo_logradouro WHERE descricao = ?;";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Denuncia denuncia = new Denuncia();
        TipoLogradouro tipoL = new TipoLogradouro();
        String idTipoLog = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, descTipoLog);
            rs = stmt.executeQuery();
            if (rs != null && rs.next()) {
                tipoL.setCodigo(rs.getString("codigo"));
                idTipoLog = tipoL.getCodigo();
            }
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
        }
        return idTipoLog;
    }
    
    public TipoLogradouro RetornaTipoLog(String descTipoLog) {

        String sql = "SELECT * FROM tipo_logradouro WHERE descricao = ?;";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Denuncia denuncia = new Denuncia(); 
        TipoLogradouro tipoL = new TipoLogradouro();
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, descTipoLog);
            rs = stmt.executeQuery();
            if (rs != null && rs.next()) {
                tipoL.setCodigo(rs.getString("codigo"));
                tipoL.setDescricao("descricao");                
            }
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
        }
        return tipoL;
    }

//    public Pessoa RetornaPessoa(String cpf_cnpj) {
//
//        String sql = "SELECT * FROM pessoa WHERE cpf_cnpj = ?;";
//
//        PreparedStatement stmt = null;
//        ResultSet rs = null;
//
//        Pessoa pessoa = new Pessoa();
//        try {
//            stmt = con.prepareStatement(sql);
//            stmt.setString(1, cpf_cnpj);
//            rs = stmt.executeQuery();
//            
//            if (rs != null){
//                while (rs.next()) {
//                    pessoa.setNome(rs.getString("NOME"));
//                    pessoa.setRg(rs.getString("RG"));
//                    pessoa.setEmail(rs.getString("EMAIL"));
//                    pessoa.setTelefone(rs.getString("TELEFONE"));
//                    pessoa.setLogradouro(rs.getString("LOGRADOURO"));
//                    pessoa.setNum_logradouro(rs.getInt("NUM_LOGRADOURO"));
//                    pessoa.setComp_logradouro(rs.getString("COMP_LOGRADOURO"));
//                    pessoa.setBairro_logradouro(rs.getString("BAIRRO_LOGRADOURO"));
//                }
//            }else{
//                 pessoa = null;
//            }
//        } catch (SQLException ex) {
//            System.err.println("Erro" + ex);
//        }
//        return pessoa;
//    }
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
    
    public TipoDenuncia RetornaTipoDenuncia(String codTipoD) {

        String sql = "SELECT * FROM tipo_denuncia WHERE codigo = ?;";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        TipoDenuncia tipoD = new TipoDenuncia();

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, codTipoD);
            rs = stmt.executeQuery();
            if (rs != null && rs.next()) {
                tipoD.setCodigo(rs.getString("codigo"));
                tipoD.setDescricao(rs.getString("descricao"));
            }
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
        }
        return tipoD;
    }

    public Status RetornaStatus(String statusD) {

        String sql = "SELECT * FROM status WHERE descricao = ?;";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Status status = new Status();
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
        }
        return status;
    }
    
    public String RetornaIdStatus(String statusD) {

        String sql = "SELECT * FROM status WHERE descricao = ?;";

        String idStatus = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Status status = new Status();
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, statusD);
            rs = stmt.executeQuery();
            if (rs != null && rs.next()) {
                status.setCodigo(rs.getString("codigo"));
                idStatus = status.getCodigo();
            }
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
        }
        return idStatus;
    }

    public List<TipoDenuncia> RetornaTipoDenuncia(int codTipo) {

        String sql = "SELECT * FROM tipo_denuncia WHERE codigo = ?;";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        TipoDenuncia tipoD = new TipoDenuncia();

        List<TipoDenuncia> listaTipoDenuncia = new ArrayList<>();

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, codTipo);
            rs = stmt.executeQuery();
            if (rs != null && rs.next()) {
                tipoD.setCodigo(rs.getString("codigo"));
                tipoD.setDescricao("descricao");

                listaTipoDenuncia.add(tipoD);
            }
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
        }
        return listaTipoDenuncia;
    }

    public List<Denuncia> PesquisaDenuncia(List parametros) {

        String sql = "SELECT * FROM denuncia d, pessoa p "
                + "WHERE d.pessoa_id = p.cpf_cnpj "
                + "and d.id = coalesce(?, d.id) "
                + "and d.tipo_denuncia_codigo = coalesce(?,d.tipo_denuncia_codigo) "
                + "and d.data = coalesce(?, d.data) "
                + "and d.status = coalesce(?, d.status) "
                + "and d.pessoa_id = coalesce(?, d.pessoa_id) "
                + "and p.municipio_id = coalesce(?, p.municipio_id) "
                + "and p.municipio_uf_codigo = coalesce(?, p.municipio_uf_codigo) "
                + "and d.denunciado = coalesce(?, d.denunciado) "
                + "and d.bairro = coalesce(?, d.bairro) "
                + "and d.municipio_id = coalesce(?, d.municipio_id) "
                + "and d.municipio_uf_codigo = coalesce(?, d.municipio_uf_codigo) ";
               // + "and d.descricao like coalesce(?, d.descricao)";

        PreparedStatement stmt = null;
        ResultSet rs = null;
        Denuncia denuncia = new Denuncia();                  
        List<Denuncia> listaParamPesq = new ArrayList();
        try {
            stmt = con.prepareStatement(sql);
            stmt.setObject(1, parametros.get(1));//PROTOCOLO
            stmt.setObject(2, parametros.get(2));//TIPO DENUNCIA
            stmt.setObject(3, parametros.get(3));//DATA 
            stmt.setObject(4, parametros.get(4));//STATUS
            stmt.setObject(5, parametros.get(0));//CPF DENUNCIANTE
            stmt.setObject(6, parametros.get(5));//MUNICIPIO DENUNCIANTE
            stmt.setObject(7, parametros.get(6));//UF DENUNCIANTE
            stmt.setObject(8, parametros.get(7));//NOME DENUNCIADO
            stmt.setObject(9, parametros.get(8));//BAIRRO DENUNCIADO
            stmt.setObject(10, parametros.get(9));//MUNICIPIO DENUNCIADO
            stmt.setObject(11, parametros.get(10));//UF DENUNCIADO
            //stmt.setObject(12, parametros.get(11));//DESCRICAO DENUNCIA
            rs = stmt.executeQuery();
           // JOptionPane.showMessageDialog(null, rs);
            while (rs.next()) {
                denuncia.setId(rs.getInt("id"));
                denuncia.setTipoDenuncia(RetornaTipoDenuncia(rs.getString("tipo_denuncia_codigo")));
                denuncia.setData(rs.getString("data"));
                denuncia.setNomeDenunciado(rs.getString("denunciado"));
                denuncia.setTipoLogradouro(RetornaTipoLog(rs.getString("tipo_logradouro_codigo")));
                denuncia.setLogradouro(rs.getString("logradouro"));
                denuncia.setNumLogradouro(rs.getInt("num_logradouro"));
                denuncia.setComplLogradouro(rs.getString("compl_logradouro"));
                denuncia.setBairro(rs.getString("bairro"));
                denuncia.setMunicipio(RetornaMunicipio(rs.getInt("municipio_id")));
                denuncia.setUf(RetornaUfMunicipio(rs.getString("municipio_uf_codigo")));
                denuncia.setPtoReferencia(rs.getString("pto_referencia"));
                //denuncia.setDescricaoDenuncia(rs.getString("descricao"));
                denuncia.setDenunciante(RetornaPessoa(rs.getString("pessoa_id")));
                denuncia.setStatusD(rs.getString("status"));
                listaParamPesq.add(denuncia);
            }
        } catch (SQLException ex) {
            System.err.println("Erro: "+ex);
        }
        return listaParamPesq;
    }
    
    public Denuncia RetornaDenuncia(List parametros) {

        String sql = "SELECT * FROM denuncia d, pessoa p "
                + "WHERE d.pessoa_id = p.cpf_cnpj "
                + "and d.id = coalesce(?, d.id) "
                + "and d.tipo_denuncia_codigo = coalesce(?,d.tipo_denuncia_codigo) "
                + "and d.data = coalesce(?, d.data) "
                + "and d.status = coalesce(?, d.status) "
                + "and d.pessoa_id = coalesce(?, d.pessoa_id) "
                + "and p.municipio_id = coalesce(?, p.municipio_id) "
                + "and p.municipio_uf_codigo = coalesce(?, p.municipio_uf_codigo) "
                + "and d.denunciado = coalesce(?, d.denunciado) "
                + "and d.bairro = coalesce(?, d.bairro) "
                + "and d.municipio_id = coalesce(?, d.municipio_id) "
                + "and d.municipio_uf_codigo = coalesce(?, d.municipio_uf_codigo) "
                + "and d.descricao like coalesce(?, d.descricao)";
        //List<Denuncia> listaParamPesq = new ArrayList();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Denuncia denuncia = new Denuncia();   
        try {

            stmt = con.prepareStatement(sql);

            stmt.setObject(1, parametros.get(1));//PROTOCOLO
            stmt.setObject(2, parametros.get(2));//TIPO DENUNCIA
            stmt.setObject(3, parametros.get(3));//DATA 
            stmt.setObject(4, parametros.get(4));//STATUS
            stmt.setObject(5, parametros.get(0));//CPF DENUNCIANTE
            stmt.setObject(6, parametros.get(5));//MUNICIPIO DENUNCIANTE
            stmt.setObject(7, parametros.get(6));//UF DENUNCIANTE
            stmt.setObject(8, parametros.get(7));//NOME DENUNCIADO
            stmt.setObject(9, parametros.get(8));//BAIRRO DENUNCIADO
            stmt.setObject(10, parametros.get(9));//MUNICIPIO DENUNCIADO
            stmt.setObject(11, parametros.get(10));//UF DENUNCIADO
            stmt.setObject(12, parametros.get(11));//DESCRICAO DENUNCIA

            rs = stmt.executeQuery();
           // JOptionPane.showMessageDialog(null, rs);
            while (rs.next()) {

                denuncia.setId(rs.getInt("id"));
                denuncia.setTipoDenuncia(RetornaTipoDenuncia(rs.getString("tipo_denuncia_codigo")));
                denuncia.setData(rs.getString("data"));
                denuncia.setNomeDenunciado(rs.getString("denunciado"));
                denuncia.setTipoLogradouro(RetornaTipoLog(rs.getString("tipo_logradouro_codigo")));
                denuncia.setLogradouro(rs.getString("logradouro"));
                denuncia.setNumLogradouro(rs.getInt("num_logradouro"));
                denuncia.setComplLogradouro(rs.getString("compl_logradouro"));
                denuncia.setBairro(rs.getString("bairro"));
                denuncia.setMunicipio(RetornaMunicipio(rs.getInt("municipio_id")));
                denuncia.setUf(RetornaUfMunicipio(rs.getString("municipio_uf_codigo")));
                denuncia.setPtoReferencia(rs.getString("pto_referencia"));
                denuncia.setDescricaoDenuncia(rs.getString("descricao"));
                denuncia.setDenunciante(RetornaPessoa(rs.getString("pessoa_id")));
                denuncia.setStatusD(RetornaStatus(rs.getString("status")).getDescricao());
                

            }
        } catch (SQLException ex) {
            Logger.getLogger(DenunciaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return denuncia;
    }
}
