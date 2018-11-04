/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import Modelo.HibernateUtil;
import Modelo.Pessoa;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.runtime.Debug.id;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


/**
 *
 * @author Jossefa Tamele
 */
public class Teste {
    
    public static void main(String[] args) {
        
        Pessoa pessoa= new Pessoa();
        pessoa.setNacionalidade("Americano");
        pessoa.setNaturalidade("Dc");
        pessoa.setNome("Bruno Vasco Siueia");
        pessoa.setProfissao("Musico");
        pessoa.setId(7);
        
       SessionFactory sf= new HibernateUtil().getSessionFactory();
       Session sessao= sf.openSession();
       sessao.beginTransaction();
       
       //Salvar
      // sessao.save(pessoa);
       
//       //Deletar
//       sessao.delete(sessao.get(Pessoa.class, pessoa.getId()));
       
//       // Atualizar
//       Pessoa p = (Pessoa)sessao.get(Pessoa.class, pessoa.getId());
//       p.setNome("");
//       p.setProfissao("");
//       sessao.update(p);
       
       
       // Pesquisar
        JOptionPane.showMessageDialog(null,sessao.get(Pessoa.class, pessoa.getId()));
       
       sessao.getTransaction().commit();
       sessao.close();
       sf.close();
        
       

       
    }
    
}
