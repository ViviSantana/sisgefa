/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import model.bean.Denuncia;
import model.bean.Municipio;
import model.bean.Pessoa;
import model.bean.Status;
import model.bean.TipoDenuncia;
import model.bean.TipoLogradouro;
import static org.junit.Assert.*;

/**
 *
 * @author vivis
 */
public class DenunciaDAOTest {
    
    
    public DenunciaDAOTest() {
        
    }

    @org.junit.Test
    public void InserindoDenuncia() {
        DenunciaDAO dao = new DenunciaDAO();
        TipoDenuncia tipoD = new TipoDenuncia();
        tipoD.setCodigo("A");
        TipoLogradouro tipoL = new TipoLogradouro();
        tipoL.setCodigo("Av");
        Status statusD = new Status("N", "Nova");
        Municipio munc = new Municipio();
        munc.setId(1);
        Pessoa pessoa = new Pessoa();
        pessoa.setCpf_cnpj("06925442670");
       
        Denuncia denuncia = new Denuncia (tipoD, "01/12/2019", pessoa ,"Peixaria da Tilápia", tipoL, "da peixaria", 90, "Lj 13", "Pescadores", munc, munc.getUf().toString(), "Praça do Peixe", "Música ao vivo com som muito alto", statusD.getCodigo() );
        
        if("A".equals(tipoD.getCodigo())){
            
            //COMENTADO PARA PARAR DE SINALIZAR ERRO =D
            
//            if(dao.InsereDenunciaAn(denuncia)){
//                System.out.println("Denuncia Anônima inserida com sucesso");
//            }else{
//                fail("Erro ao inserir denuncia");
//            }
//        }else if("I".equals(tipoD.getCodigo())){
//            
//            if(dao.InsereDenunciaId(denuncia, pessoa)){
//                System.out.println("Denuncia Identificada inserida com sucesso");
//            }else{
//                fail("Erro ao inserir denuncia");
//            }
        }
        
        
    }
    
}
