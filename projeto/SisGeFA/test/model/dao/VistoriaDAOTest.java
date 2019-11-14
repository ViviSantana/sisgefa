package model.dao;

import javax.swing.JOptionPane;
import model.bean.Vistoria;
import static org.junit.Assert.fail;
import org.junit.Ignore;

public class VistoriaDAOTest {

    public VistoriaDAOTest() {
    }    
    
    @org.junit.Test
    //@Ignore
    public void InsereVistoria(){
        
        
        Vistoria vistoria = new Vistoria("01/11/2019", "Centro", true, "12345678910", "");
        VistoriaDAO dao = new VistoriaDAO();
        
        if(dao.Insere(vistoria)){
            System.out.println("Vistoria inserida com sucesso.");
        }else{
            fail("Erro ao inserir vistoria.");
        }
    }
    
    @org.junit.Test
    @Ignore
    public void BuscaVistoria(){
        
        //Vistoria vistoria = new Vistoria();
        VistoriaDAO dao = new VistoriaDAO();
        
        for(Vistoria v: dao.BuscaVistoria()){
            JOptionPane.showMessageDialog(null, "Vistoria: " + v.getData() + "\nLocal: " + v.getLocal() + "\nResponsável: " + v.getResponsavel());
        }
    }
    
    
    @org.junit.Test
    @Ignore
    public void BuscaVistoriaPorData(){
        
        //Vistoria vistoria = new Vistoria();
        VistoriaDAO dao = new VistoriaDAO();
        String data = JOptionPane.showInputDialog("Informe a Data: ", "Pesquisar");
        
        for(Vistoria v: dao.BuscaVistoriaPorData(data)){
            JOptionPane.showMessageDialog(null, "Vistoria: " + v.getData() + "\nLocal: " + v.getLocal() + "\nResponsável: " + v.getResponsavel());
        }
    }
}
