/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import ConexaoBanco.ConnectionFactory;
import java.sql.Connection;

/**
 *
 * @author btps000328
 */
public class AbreConexao {
    Connection con = ConnectionFactory.getConnection();
}
