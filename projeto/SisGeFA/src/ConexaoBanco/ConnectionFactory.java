package ConexaoBanco;

//Classes necessárias para uso de Banco de dados //
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



//Início da classe de conexão//
public class ConnectionFactory {

    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/sisgefa?useTimezone=true&serverTimezone=UTC";
    public static final String USER = "aluno";
    public static final String PASSWORD = "123456";
//    public static final String USER = "root";
//    public static final String PASSWORD = "vivi@1234";

    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASSWORD); 
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException(ex);
        }
    } 
    
    public static void closeConnection(Connection con) {
        if(con != null){
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println("Erro ao fechar conexão: "+ ex);
            }
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt) {
        if(stmt != null){
            try {
                stmt.close();
            } catch (SQLException ex) {
               System.err.println("Erro ao fechar conexão: "+ ex);
            }
        }
        closeConnection(con);
    }
        
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException ex) {
                System.err.println("Erro ao fechar conexão: "+ ex);
            }
        }
        closeConnection(con, stmt);
    }
}
        
